/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-04 07:50:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class C_005fKategorie_0020książek_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"C_kategorie.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"3.png\" sizes=\"96x96\" />\r\n");
      out.write("    <title>Kategorie książek </title>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"center\"><img src=\"logo.jpg\" name=\"ksiazka\" align=\"left\" weight=\"90px\" height=\"50px\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <h1>\r\n");
      out.write("        <center><u>Kategorie książek</u></center>\r\n");
      out.write("    </h1>\r\n");
      out.write("    <header>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li class=\"znacznik\" ><a href=\"A_strona-gl.jsp\">Strona główna</a></li>\r\n");
      out.write("                <li class=\"znacznik\" ><a href=\"B_O bibiotece.jsp\">O bibliotece</a></li>\r\n");
      out.write("                <li  class=\"znacznik\"><a href=\"C_Kategorie książek.jsp\">Kategorie książek </a></li>\r\n");
      out.write("                <!--   <li><a href=\"D_Wypożyczenia.jsp\">Wypożyczane </a></li>-->\r\n");
      out.write("                <li class=\"znacznik\"><a href=\"E_Słownik pojęć.jsp\">Słownik pojęć bibliotecznych</a></li>\r\n");
      out.write("                <li class=\"znacznik\"><a href=\"F_personel.jsp\">Personel</a></li>\r\n");
      out.write("               <!-- <li class=\"znacznik\"><a href=\"G_login.jsp\">Logowanie</a></li>\r\n");
      out.write("                <li class=\"znacznik\"><a href=\"H_rejestracja.jsp\">Rejestracja</a></li>-->\r\n");
      out.write("                \r\n");
      out.write("                <li ><a > ");
      out.print(session.getAttribute("email-login") );
      out.write(" </a></li>\r\n");
      out.write("                <li  ><a href= \"logout\"><button class=\"wyloguj\" >Wyloguj się</button></a></li>\r\n");
      out.write("                 ");
 // sprawdzenie czy użytkownik jest adminem
                String userRole = (String) session.getAttribute("userRole");
                if (userRole != null && userRole.equals("admin")) { 
      out.write("\r\n");
      out.write("                    <li><a href=Dodaj_ksiazke.jsp><button class=\"dodanie\">Przejdź do formularza<br> aby dodać książkę </button></a></li>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("	    <h1>Książki </h1>\r\n");
      out.write("	    \r\n");
      out.write("<a href=Dodaj_ksiazke.jsp><button class=\"dodanie\">Przejdź do formularza<br> aby dodać książkę </button></a>\r\n");
      out.write("    <h3>Oto lista wszystkich książek dostępnych do wypożyczenia w bibliotece </h3>\r\n");
      out.write("    \r\n");
      out.write("<table>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th>Lp.</th>\r\n");
      out.write("        <th>Tytuł</th>\r\n");
      out.write("        <th>Autor</th>\r\n");
      out.write("        <th>Wydawnictwo</th>\r\n");
      out.write("        <th>Data_publikacj</th>\r\n");
      out.write("        <th>Książki w formacie PDF</th>\r\n");
      out.write("       \r\n");
      out.write("     \r\n");
      out.write("    </tr>\r\n");
      out.write("    ");
 
        try {
            // Połączenie z bazą danych
            String url = "jdbc:mysql://localhost:3306/Biblioteka";
            String user = "root";
            String password = "P@ssw0rd";
            Connection conn = DriverManager.getConnection(url, user, password);

            // Zapytanie SQL
            String sql = "SELECT * FROM Książki";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            // Wyświetlenie wyników zapytania
            int i=0;
            while (rs.next()) { i++;
                String tytuł = rs.getString("tytuł");
                String autor = rs.getString("autor");
                String wydawnictwo = rs.getString("wydawnictwo");
                String data_publikacji = rs.getString("data_publikacji");
                String pdf_link = rs.getString("pdf");
              
                
                
    
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>");
      out.print( i );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print( tytuł );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print( autor );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print( wydawnictwo );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print( data_publikacji );
      out.write("</td>\r\n");
      out.write("            <td>\r\n");
      out.write("    <a href=\"");
      out.print( request.getContextPath() + pdf_link );
      out.write("\" target=\"_blank\" download><button class=\"pobierz\">Pobierz książkę </button></a>\r\n");
      out.write("</td>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("    ");
 
            }
            // Zamykanie połączenia z bazą danych
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    // Funkcja pobierająca plik PDF\r\n");
      out.write("    function pobierzPDF(link) {\r\n");
      out.write("        window.location.href = link;\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("        <p>(c) 2023 Biblioteka Naukowa. Wszelkie prawa zastrzeżone.</p>\r\n");
      out.write("        <p>Telefon: +48 123 456 789  E-mail: kontakt@bibliotekamiejska.pl.</p>\r\n");
      out.write("\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
