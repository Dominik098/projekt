

package com.uniquedevelopr.registration;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
        
        int numerId = Integer.parseInt(request.getParameter("numerId"));
        String tytul = request.getParameter("tytul");
        String autor = request.getParameter("autor");
        String wydawnictwo = request.getParameter("wydawnictwo");
        String dataPublikacji = request.getParameter("dataPublikacji");
        String pdf = request.getParameter("pdf");
        
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String sql = "INSERT INTO Książki (numer_ID, tytuł, autor, wydawnictwo, data_publikacji, pdf) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, numerId);
            statement.setString(2, tytul);
            statement.setString(3, autor);
            statement.setString(4, wydawnictwo);
            statement.setString(5, dataPublikacji);
            statement.setString(6, pdf);
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                
                response.sendRedirect("A_strona-gl.jsp");
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
