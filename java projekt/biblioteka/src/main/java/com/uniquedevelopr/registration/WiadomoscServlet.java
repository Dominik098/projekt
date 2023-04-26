package com.uniquedevelopr.registration;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/wiadomosc")
public class WiadomoscServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
   
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/Dane";
    private final String USER = "root";
    private final String PASS = "P@ssw0rd";
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        
        String email = request.getParameter("email");
        String opis = request.getParameter("opis");
   
        
       
        
       
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "INSERT INTO wiadomosc ( email, opis) VALUES (?, ?)";
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, email);
            stmt.setString(2, opis);
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
      
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Twoja twoja wiadomoć została przesłana.</h2>");
        
        out.println("<p>Adres e-mail: " + email + "</p>");
        out.println("<p>Opis: " + opis + "</p>");
        out.println("</body></html>");
        
    }

}