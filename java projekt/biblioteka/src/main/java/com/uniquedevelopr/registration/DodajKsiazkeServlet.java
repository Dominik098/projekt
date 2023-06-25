package com.uniquedevelopr.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DodajKsiazkeServlet")
public class DodajKsiazkeServlet extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost/Biblioteka";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "P@ssw0rd";
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        String tytul = request.getParameter("tytul");
        String autor = request.getParameter("autor");
        String wydawnictwo = request.getParameter("wydawnictwo");
        String dataPublikacji = request.getParameter("dataPublikacji");
        String pdf = request.getParameter("pdf");
        
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            // Sprawdź istnienie książki przed dodaniem
            String checkQuery = "SELECT COUNT(*) FROM Książki WHERE tytuł = ? OR pdf = ?";
            PreparedStatement checkStatement = connection.prepareStatement(checkQuery);
            checkStatement.setString(1, tytul);
            checkStatement.setString(2, pdf);
            ResultSet resultSet = checkStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            if (count > 0) {
                response.getWriter().println("Książka o podanym tytule lub linku PDF już istnieje.");
                return; // Zatrzymaj proces dodawania książki
            }
            
            // Dodaj książkę do bazy danych
            String sql = "INSERT INTO Książki (tytuł, autor, wydawnictwo, data_publikacji, pdf) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, tytul);
            statement.setString(2, autor);
            statement.setString(3, wydawnictwo);
            statement.setString(4, dataPublikacji);
            statement.setString(5, pdf);
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
            	 String alertScript = "<script>alert('Książka została dodana pomyślnie.'); window.location='C_Kategorie-książek.jsp';</script>";
            	    response.setContentType("text/html; charset=UTF-8");
            	    response.setCharacterEncoding("UTF-8");
            	    response.getWriter().println(alertScript);
            } else {
                response.getWriter().println("Błąd podczas dodawania książki do bazy danych.");
            }
            
            statement.close();
            connection.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            response.getWriter().println("Błąd podczas dodawania książki do bazy danych: " + ex.getMessage());
        }
    }
}
