/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-02 16:35:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class A_005fstrona_002dgl_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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

      out.write('\r');
      out.write('\n');

	if(session.getAttribute("email-login")==null){
		
		response.sendRedirect("G_login.jsp");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Bibioteka</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"A_styl.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"3.png\" sizes=\"96x96\" >\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <img src=\"logo.jpg\" alt=\"ksiazka\" align=\"left\" weight=\"90px\" height=\"50px\">\r\n");
      out.write("    <h1>\r\n");
      out.write("        <center><u> Biblioteka Naukowa </u></center>\r\n");
      out.write("    </h1>\r\n");
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"A_strona-gl.jsp\">Strona główna</a></li>\r\n");
      out.write("                <li><a href=\"B_O bibiotece.jsp\">O bibliotece</a></li>\r\n");
      out.write("                <li><a href=\"C_Kategorie książek.jsp\">Kategorie książek </a></li>\r\n");
      out.write("                <li><a href=\"D_Wypożyczalnia.jsp\">Wypożyczane </a></li>\r\n");
      out.write("                <li><a href=\"E_Słownik pojęć.jsp\">Słownik pojęć bibliotecznych</a></li>\r\n");
      out.write("                <li><a href=\"F_personel.jsp\">Prersonel</a></li>\r\n");
      out.write("               <!-- <li><a href=\"G_login.jsp\">Logowanie</a></li>\r\n");
      out.write("                <li><a href=\"H_rejestracja.jsp\">Rejestracja</a></li>-->\r\n");
      out.write("                <li><a href= \"logout\">Wyloguj się</a></li>\r\n");
      out.write("                <li><a > ");
      out.print(session.getAttribute("email-login") );
      out.write(" </a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <!-- tÅo strony gÅÃ³wnej-->\r\n");
      out.write("        <td><img src=\"https://cdn.pixabay.com/photo/2015/10/10/13/03/prague-980732__340.jpg\" style=\"width:100%;\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    <!-- tÅo strony gÅÃ³wnej-->\r\n");
      out.write("\r\n");
      out.write("    <h1 id=\"cytat\">Książka to najlepszy przyjaciel człowieka, a biblioteka to świątynia jego myśli.- Cyceron</h1>\r\n");
      out.write("    <h1>Gatunki książek </h1>\r\n");
      out.write("\r\n");
      out.write("    <table>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td colspan=\"6\" style=\"padding:20px 10px;\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://cdn.pixabay.com/photo/2017/09/15/16/51/fantasy-2752798__340.jpg\" alt=\"ksiÄÅ¼ka\"\r\n");
      out.write("                    height=\"200px;\" width=\"100%\" title=\"Fantastyka\">\r\n");
      out.write("                <h4>Fantastyka</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://cdn.pixabay.com/photo/2023/02/23/18/42/space-7809436__340.jpg\" alt=\"ksiÄÅ¼ka\"\r\n");
      out.write("                    height=\"200px;\" width=\"100%\" title=\"Science fiction\">\r\n");
      out.write("                <h4>Science fiction</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://cdn.pixabay.com/photo/2020/01/17/13/46/museum-4773011__340.jpg\" alt=\"ksiÄÅ¼ka\"\r\n");
      out.write("                    height=\"200px;\" width=\"100%\" title=\"PowieÅÄ historyczna\">\r\n");
      out.write("                <h4>Powieść historyczna</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://cdn.pixabay.com/photo/2018/01/05/22/48/couple-3064048__340.jpg\" alt=\"ksiÄÅ¼ka\"\r\n");
      out.write("                    height=\"200px;\" width=\"100%\" title=\"Romans\">\r\n");
      out.write("                <h4>Romans</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://cdn.pixabay.com/photo/2014/04/05/11/40/knife-316655__340.jpg\" alt=\"ksiÄÅ¼ka\"\r\n");
      out.write("                    height=\"200px;\" width=\"100%\" title=\"KryminaÅ i thriller\">\r\n");
      out.write("                <h4>Kryminał i thriller</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://cdn.pixabay.com/photo/2018/10/21/10/02/social-media-3762538__340.jpg\" alt=\"ksiÄÅ¼ka\"\r\n");
      out.write("                    height=\"200px;\" width=\"100%\" title=\"PowieÅÄ mÅodzieÅ¼owa\">\r\n");
      out.write("                <h4>Powieść młodzieżowa</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://cdn.pixabay.com/photo/2020/06/16/14/39/mouse-5305880__340.jpg\" alt=\"ksiÄÅ¼ka\"\r\n");
      out.write("                    height=\"200px;\" width=\"100%\" title=\"Literatura dzieciÄca\">\r\n");
      out.write("                <h4>Literatura dziecięca</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://cdn.pixabay.com/photo/2012/11/20/06/08/black-66675__340.jpg\" alt=\"ksiÄÅ¼ka\"\r\n");
      out.write("                    height=\"200px;\" width=\"100%\" title=\"Biografia i reportaÅ¼\">\r\n");
      out.write("                <h4>Biografia i reportaż</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://cdn.pixabay.com/photo/2016/05/28/07/05/book-1421097__340.jpg\" alt=\"ksiÄÅ¼ka\"\r\n");
      out.write("                    height=\"200px;\" width=\"100%\" title=\"Literatura obyczajowa\">\r\n");
      out.write("                <h4>Literatura obyczajowa</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://cdn.pixabay.com/photo/2017/10/13/14/15/fantasy-2847724__340.jpg\" alt=\"ksiÄÅ¼ka\"\r\n");
      out.write("                    height=\"200px;\" width=\"100%\" title=\"Horror\">\r\n");
      out.write("                <h4>Horror</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <!-------------NOWOÅCI-------------------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <h1>Nowości w naszej bibliotece</h1>\r\n");
      out.write("    <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td colspan=\"6\" style=\"padding:20px 10px;\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr id=\"nowosci\">\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://files.legimi.com/images/e2fcee1ef2ef6dd22abc5eb50f441961/w200_u90.jpg\" alt=\"ksiÄÅ¼ka\"\r\n");
      out.write("                    height=\"50%\" width=\"100%\" title=\"PiÄÄdziesiÄt Twarzy Forkisa\">\r\n");
      out.write("                <h4>Piędziesiąt Twarzy Forkisa</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://files.legimi.com/images/2fde278bc3238eb9ca41b6baf1be6094/w200_u90.jpg\" height=\"50%\"\r\n");
      out.write("                    width=\"100%\" title=\"Nawia - W Åwiecie Dusz\">\r\n");
      out.write("                <h4>Nawia - W Świecie Dusz</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://files.legimi.com/images/cbc4e702240d4c0869c5a0a73c7fd7ec/w200_u90.jpg\" height=\"200px;\"\r\n");
      out.write("                    width=\"100%\" title=\"Mieszkanie przy ulicy Ryden i inne opowiadania\">\r\n");
      out.write("                <h4>Mieszkanie przy ulicy Ryden i inne opowiadania</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://files.legimi.com/images/9d234106e9877f2136161e18dd2ad2c5/w200_u90.jpg\" height=\"50%;\"\r\n");
      out.write("                    width=\"100%\" title=\"Tajemnica, filozofia, egzystencja\">\r\n");
      out.write("                <h4>Tajemnica, filozofia, egzystencja </h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://files.legimi.com/images/7bcdfb0db2110b25c569f78d91af3a31/w200_u90.jpg\" height=\"200;\"\r\n");
      out.write("                    width=\"100%\" title=\"Katrusia. OpowieÅÄ o dziewczynce, ktÃ³rej moc pÅynÄÅa prosto z serca\">\r\n");
      out.write("                <h4>Katrusia. Opowieść o dziewczynce, której moc płyneła prosto z serca</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://files.legimi.com/images/4bcabc6b74b59ac663a2e0e7da240c32/w200_u90.jpg\" height=\"50%;\"\r\n");
      out.write("                    width=\"100%\" title=\"Gabriel Caballero\">\r\n");
      out.write("                <h4>Gabriel Caballero</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"padding:5px 5px;\">\r\n");
      out.write("                <img src=\"https://files.legimi.com/images/88eebf78f981b6d28573f5ffcbc6d34c/w200_u90.jpg\" height=\"50%;\"\r\n");
      out.write("                    width=\"100%\" title=\"Mediare. Mediacje rÃ³wieÅnicze\">\r\n");
      out.write("                <h4>Mediare. Mediacje rówjeśnicze</h4>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("    <div>\r\n");
      out.write("        <h2>Godziny otwarcia biblioteki</h2>\r\n");
      out.write("        <center>\r\n");
      out.write("            <table id=\"Godziny\">\r\n");
      out.write("                <tr id=\"dni\">\r\n");
      out.write("                    <td>PoniedziaÅek</td>\r\n");
      out.write("                    <td>Wtorek</td>\r\n");
      out.write("                    <td>Środa</td>\r\n");
      out.write("                    <td>Czwartek</td>\r\n");
      out.write("                    <td>PiÄtek</td>\r\n");
      out.write("                    <td>Sobota</td>\r\n");
      out.write("                    <td>Niedziela</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr id=\"dni_godz\">\r\n");
      out.write("                    <td>8:00 - 20:00</td>\r\n");
      out.write("                    <td>8:00 - 20:00</td>\r\n");
      out.write("                    <td>8:00 - 20:00</td>\r\n");
      out.write("                    <td>10:00 - 20:30</td>\r\n");
      out.write("                    <td>8:00 - 20:00</td>\r\n");
      out.write("                    <td>8:00 - 19:00</td>\r\n");
      out.write("                    <td style=\"color:red\">Nieczynne</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("        <p>(c) 2023 Biblioteka Naukowa. Wszelkie prawa zastrzeeżone.</p>\r\n");
      out.write("        <p>Adres: ul. Biblioteczna 1, 00-217 Warszawa Telefon: +48 123 456 789  E-mail: kontakt@bibliotekamiejska.pl.</p>\r\n");
      out.write("\r\n");
      out.write("    </footer>\r\n");
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
