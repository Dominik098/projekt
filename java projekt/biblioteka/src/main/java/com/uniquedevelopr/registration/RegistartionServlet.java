package com.uniquedevelopr.registration;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistationServlet
 */
@WebServlet("/register")
public class RegistartionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String imie = request.getParameter("Aimie");
		String nazwisko = request.getParameter("Anazwisko");
		String email = request.getParameter("Aemail");
		String haslo = request.getParameter("Ahaslo1");
		RequestDispatcher dispatcher = null;
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logowanie","root","P@ssw0rd");
			PreparedStatement pst = con.prepareStatement("insert into users (imie,nazwisko,email,haslo) values(?,?,?,?)");
			pst.setString(1, imie);
			pst.setString(2, nazwisko);
			pst.setString(3, email);
			pst.setString(4, haslo);
			
			int rowCount = pst.executeUpdate();
			dispatcher = request.getRequestDispatcher("G_login.jsp");
			if(rowCount > 0) {
				request.setAttribute("status", "success");
				
				
			}
			else {
				request.setAttribute("status", "failed");
			}
			dispatcher.forward(request, response);
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
			
	}
		
		finally {
			
			
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
}
