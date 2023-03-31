package com.uniquedevelopr.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email-login");
		String haslo = request.getParameter("haslo-login");
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logowanie","root","P@ssw0rd");
			PreparedStatement pst = con.prepareStatement("select * from users where email = ? and haslo = ? ");
			pst.setString(1, email);
			pst.setString(2, haslo);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				session.setAttribute("email-login", rs.getString("email"));
				dispatcher = request.getRequestDispatcher("A_strona-gl.jsp");
			}else {
				request.setAttribute("status", "failed");
				dispatcher = request.getRequestDispatcher("G_login.jsp");
			}
			dispatcher.forward(request, response);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}

}
