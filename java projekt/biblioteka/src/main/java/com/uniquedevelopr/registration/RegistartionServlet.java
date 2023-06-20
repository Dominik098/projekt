package com.uniquedevelopr.registration;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;

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
		String hasloZahaszowane = null;
		RequestDispatcher dispatcher = null;
		Connection con = null;
		
		
		try {
		    MessageDigest digest = MessageDigest.getInstance("SHA-256");
		    byte[] hash = digest.digest(haslo.getBytes(StandardCharsets.UTF_8));
		    hasloZahaszowane = Base64.getEncoder().encodeToString(hash);
		} catch (NoSuchAlgorithmException e) {
		    e.printStackTrace();
		}
		
		

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logowanie?useUnicode=true&characterEncoding=UTF-8","root","P@ssw0rd");
			
			// Sprawdź, czy email już istnieje w bazie danych
            PreparedStatement checkEmailStmt = con.prepareStatement("SELECT email FROM users WHERE email=?");
            checkEmailStmt.setString(1, email);
            if (checkEmailStmt.executeQuery().next()) {
                // Jeśli email już istnieje, zwróć komunikat o błędzie
                dispatcher = request.getRequestDispatcher("H_rejestracja.jsp");
                request.setAttribute("status_rej", "failed_rej");
                dispatcher.forward(request, response);
                return;
            }
			
			
			PreparedStatement pst = con.prepareStatement("insert into users (imie,nazwisko,email,haslo) values(?,?,?,?)");
			pst.setString(1, imie);
			pst.setString(2, nazwisko);
			pst.setString(3, email);
			pst.setString(4, hasloZahaszowane);
			
			int rowCount = pst.executeUpdate();
			dispatcher = request.getRequestDispatcher("G_login.jsp");
			if(rowCount > 0) {
				request.setAttribute("status_rej", "success_rej");
				
				
			}
			else {
				request.setAttribute("status_rej", "failed_rej");
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
