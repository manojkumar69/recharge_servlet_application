package com.servlet;

import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.dao.DBUtility;
import com.google.gson.Gson;

import entities.Entity;
import model.Mdel;

public class DataServlet extends HttpServlet
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private ServletConfig config;


    public void init(ServletConfig config)
    throws ServletException {
        this.config = config;
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
    	String sql;
        System.out.println("Hello");
        PrintWriter out = response.getWriter();
        Gson gson = new Gson();
        String name = request.getParameter("name");
        if (name == null) {
            System.out.println("name is null");
            sql = "select name,price from network ";
        } else {
        	System.out.println("this is from"+name.length());
            sql = "select name,price from network where name LIKE '" + name + "%'";
        }

        ResultSet rs;
        response.setContentType("application/json;charset=utf-8");
        try {

            Statement s = DBUtility.getConnection().createStatement();
            s.executeQuery(sql);
            rs = s.getResultSet();
            Mdel m = new Mdel();
            List < Entity > ls = m.findPR(rs);
            out.print(gson.toJson(ls));
            out.flush();
            out.close();

            rs.close();
            s.close();
        } catch (Exception e) {
            System.out.println("Exception is ;" + e);
        }

    }
}