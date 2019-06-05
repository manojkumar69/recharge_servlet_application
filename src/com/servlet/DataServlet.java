package com.servlet;

import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;


public class DataServlet extends HttpServlet{

	private ServletConfig config;


	public void init(ServletConfig config)
	  throws ServletException{
		 this.config=config;
	   }
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException,IllegalArgumentException{
		String sql;
		String name =request.getParameter("name");
	
		if(name==null)
		{
			System.out.println("name is null");
			sql = "select * from network ";
		}
		else
		{
			sql = "select * from network where name LIKE '"+name+"%'";
		}
		String jsonString="";
		//Establish connection to MySQL database
		String connectionURL = "jdbc:mysql://localhost/data";
		Connection connection=null;
		ResultSet rs;
		response.setContentType("application/json");
		List<String> dataList=new ArrayList<String>(); 
			try {
			 // Load the database driver
			Class.forName("com.mysql.jdbc.Driver");
			// Get a Connection to the database
			connection = DriverManager.getConnection(connectionURL, "root", "1234"); 
			//Select the data from the database
			JSONObject jsonobject = null;
	        JSONArray jsonArray = new JSONArray();
			Statement s = connection.createStatement();
			s.executeQuery (sql);
			rs = s.getResultSet();
			while (rs.next()) {
				 
                ResultSetMetaData metaData = rs.getMetaData();
                jsonobject = new JSONObject();
 
                for (int i = 0; i < metaData.getColumnCount(); i++) {
                	
                    jsonobject.put(metaData.getColumnLabel(i + 1),rs.getObject(i + 1));
 
                }
                
                jsonArray.put(jsonobject);
            }
			
 
            if (jsonArray.length() > 0) {
             
                jsonString= jsonArray.toString();
                 
            }
            
			rs.close ();
			s.close ();
			}catch(Exception e){
			System.out.println("Exception is ;"+e);
			}
			//String searchList = new Gson().toJson(dataList);
			response.getWriter().write(jsonString);
	}
}