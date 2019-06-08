package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DBUtility;
import com.google.gson.Gson;

import entities.Entity;
import model.Mdel;

public class Sorting extends HttpServlet {
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
    throws ServletException, IOException {
    	String sql;
        System.out.println("Hello");
        PrintWriter out = response.getWriter();
        Gson gson = new Gson();
        String name = request.getParameter("name");
        
        if (name.toLowerCase().trim().equals("rating")) {
        	System.out.println("inside rating"+name.toLowerCase().trim());
            sql = "select * from network order by rating desc";
        } else {
        	System.out.println("inside price"+name.toLowerCase().trim());
            sql = "select * from network order by price desc";
        }

        ResultSet rs;
        response.setContentType("application/json;charset=utf-8");
        try {

            Statement s = DBUtility.getConnection().createStatement();
            s.executeQuery(sql);
            rs = s.getResultSet();
            Mdel m = new Mdel();
            List < Entity > ls = m.findAll(rs);
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
