package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "MSurendar*001");
			System.out.println("Connected successfully");
			System.out.println("Driver loaded successfully");
			Statement stmt=con.createStatement();
			PrintWriter pw=response.getWriter();
			
			String search=request.getParameter("search");
			if(search.isEmpty()) {
				pw.print("Invalid ID! <br> Please Try again");
				pw.print("<br><a href='index.html'> Go to Home page</a>");
			} else {
				String s="select * from empproduct where ID="+search;
				ResultSet rs=stmt.executeQuery(s);
				if(rs.next()) {
					pw.print("ID is"+rs.getInt(1)+"Product_name is"+rs.getString(2)+"Price is"+rs.getInt(3));
					}else {
						pw.print("Product ID not found:"+search+"<br>Try again");
					}
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
