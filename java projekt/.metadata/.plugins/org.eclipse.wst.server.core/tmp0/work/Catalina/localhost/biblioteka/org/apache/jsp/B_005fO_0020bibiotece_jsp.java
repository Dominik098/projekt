/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-13 10:44:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class B_005fO_0020bibiotece_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"3.png\" sizes=\"96x96\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"B_styl_info.css\" type=\"text/css\">\r\n");
      out.write("    <title>O bibliotece</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"center\"><img src=\"logo.jpg\" name=\"ksiazka\" align=\"left\" weight=\"90px\" height=\"50px\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <h1>\r\n");
      out.write("        <center><u>Informacje o bibliotece </u></center>\r\n");
      out.write("    </h1>\r\n");
      out.write("    <header>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"A_strona-gl.jsp\">Strona główna</a></li>\r\n");
      out.write("                <li><a href=\"B_O bibiotece.jsp\">O bibliotece</a></li>\r\n");
      out.write("                <li><a href=\"C_Kategorie książek.jsp\">Kategorie książek </a></li>\r\n");
      out.write("                <li><a href=\"D_Wypożyczenia.jsp\">Wypożyczane </a></li>\r\n");
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
      out.write("    <h2>Witamy w naszej naukowej bibliotece </h2>\r\n");
      out.write("    <h3>\"W bibliotece możemy odnaleźć drogę do mądrości przeszłych wieków i otworzyć drzwi do wiedzy dla przyszłych\r\n");
      out.write("        pokoleń.\"</h3>\r\n");
      out.write("    <img src=\"https://cdn.pixabay.com/photo/2017/07/02/09/03/books-2463779__340.jpg\" slt=\"zdjęcie\" style=\"float:left \"\r\n");
      out.write("        width=\"400px\" height=\"400px\">\r\n");
      out.write("    <p>Biblioteka publiczna to miejsce, w którym dostępne są setki tysięcy książek, czasopism, artykułów\r\n");
      out.write("     i innych publikacji z różnych dziedzin, takich jak literatura piękna, historia, nauki ścisłe, \r\n");
      out.write("     przyrodnicze, techniczne, humanistyczne i wiele innych. W naszej bibliotece znajdziesz bogaty wybór gatunków \r\n");
      out.write("     literackich, takich jak fantastyka, science fiction, powieści historyczne, romanse, kryminały, thrillery,\r\n");
      out.write("      powieści dla młodzieży, literaturę dziecięcą, biografie i reportaże, a także literaturę obyczajową i horrory.</p>\r\n");
      out.write("\r\n");
      out.write("    <p>Nasi użytkownicy mają dostęp do najnowszych publikacji, a także do narzędzi i programów edukacyjnych,\r\n");
      out.write("     które pomagają w rozwoju osobistym i edukacyjnym. Oferujemy również dostęp do baz danych,\r\n");
      out.write("      które pozwalają na bieżąco śledzić najnowsze odkrycia naukowe.</p>\r\n");
      out.write("\r\n");
      out.write("    <p>W naszej bibliotece pracują doświadczeni bibliotekarze,\r\n");
      out.write("     którzy pomagają w znalezieniu potrzebnych zasobów i udzielają porad dotyczących korzystania z naszych zasobów.\r\n");
      out.write("     Zapewniamy również dostęp do wygodnej strefy czytelniczej oraz bezpłatnego Internetu.</p>\r\n");
      out.write("\r\n");
      out.write("    <p>Zapraszamy do naszej biblioteki publicznej, \r\n");
      out.write("    gdzie znajdziesz nie tylko bogate zasoby, ale także przyjazną atmosferę i profesjonalną obsługę.</p>\r\n");
      out.write("\r\n");
      out.write("    <h2>Historia naszej biblioteki</h2>\r\n");
      out.write("\r\n");
      out.write("    <img src=\"https://cdn.pixabay.com/photo/2017/08/07/19/07/books-2606859__340.jpg\" alt=\"zdjęcie \" width=\"600\"\r\n");
      out.write("        height=\"510\" style=\"float: right;\">\r\n");
      out.write("    <p>Nasza biblioteka publiczna została założona w 1950 roku przez grupę pasjonatów z różnych dziedzin.\r\n");
      out.write("     Początkowo mieściła się w niewielkim pomieszczeniu,\r\n");
      out.write("     lecz szybko zaczęła rozwijać się i zyskiwać na popularności wśród mieszkańców miasta.</p>\r\n");
      out.write("\r\n");
      out.write("    <p>W ciągu kolejnych dekad biblioteka rozbudowywała swoje zbiory i zapewniała coraz lepsze warunki pracy \r\n");
      out.write("    dla swoich użytkowników. W latach 80. XX wieku biblioteka przeniosła się do nowoczesnego budynku,\r\n");
      out.write("     który zaprojektowano specjalnie pod kątem potrzeb biblioteki publicznej. Nowy budynek zapewnił\r\n");
      out.write("      większą przestrzeń i nowoczesne rozwiązania technologiczne,\r\n");
      out.write("     które zwiększyły wygodę i efektywność korzystania z zasobów biblioteki.</p>\r\n");
      out.write("\r\n");
      out.write("    <p>W ciągu kolejnych lat biblioteka stała się jednym z wiodących centrów kulturalnych w mieście,\r\n");
      out.write("     z zasobami obejmującymi setki tysięcy książek, czasopism, artykułów i innych publikacji z różnych dziedzin.\r\n");
      out.write("      Biblioteka stała się miejscem organizacji różnorodnych wydarzeń kulturalnych,\r\n");
      out.write("     takich jak spotkania autorskie, prezentacje multimedialne, wystawy i koncerty.</p>\r\n");
      out.write("\r\n");
      out.write("    <p>Obecnie biblioteka jest nie tylko miejscem wypożyczania książek,\r\n");
      out.write(" ale również centrum kultury i edukacji, organizującym liczne spotkania i warsztaty dla dzieci, młodzieży oraz dorosłych.\r\n");
      out.write("      Cieszy się dużym zainteresowaniem mieszkańców miasta oraz okolic,\r\n");
      out.write("     którzy regularnie korzystają z jej zasobów i oferty kulturalnej.</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <h2>Wydarzenia w naszej bibliotece</h2>\r\n");
      out.write("\r\n");
      out.write("    <img src=\"https://cdn.pixabay.com/photo/2017/11/24/10/43/ticket-2974645__340.jpg\" alt=\"zdjęcie \" width=\"500\"\r\n");
      out.write("        height=\"510\" style=\"float: left;\">\r\n");
      out.write("    <p>Nasza biblioteka to nie tylko miejsce, gdzie można wypożyczyć książki, ale także centrum kulturalne,\r\n");
      out.write("     w którym organizowane są różnego rodzaju wydarzenia. Regularnie odbywają się tu spotkania autorskie, \r\n");
      out.write("    dyskusje literackie, prelekcje, czytania, wystawy i wiele innych.</p>\r\n");
      out.write("    <p>W ostatnim czasie mieliśmy wiele ciekawych wydarzeń. Na przykład, gościliśmy znanego pisarza,\r\n");
      out.write("     który opowiadał o swojej najnowszej książce oraz odpowiadał na pytania czytelników.\r\n");
      out.write("      Zorganizowaliśmy także konkurs literacki dla dzieci i młodzieży,\r\n");
      out.write("     w którym uczestniczyło wiele osób i zaprezentowano wiele utalentowanych pisarzy.</p>\r\n");
      out.write("\r\n");
      out.write("    <p>\r\n");
      out.write("\r\n");
      out.write("Konkurs literacki dla dzieci i młodzieży z okazji Międzynarodowego Dnia Książki, w którym uczestnicy mieli za zadanie napisać krótką opowieść na wybrany temat. Zwycięzcy zostali nagrodzeni przez bibliotekę.\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("   <br> Wernisaż wystawy obrazów i rysunków lokalnego artysty, który zaprezentował swoje prace w bibliotece przez cały miesiąc.\r\n");
      out.write("   <br> Warsztaty pisarskie dla młodzieży prowadzone przez znanego autora, podczas których uczestnicy mieli okazję nauczyć się podstaw pisania i pracy nad tekstem.\r\n");
      out.write("    \r\n");
      out.write("   <br> Spotkanie z przedstawicielami lokalnych organizacji charytatywnych, podczas którego omawiane były sposoby wsparcia działań społecznych na rzecz potrzebujących.\r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<p>Te wydarzenia to tylko kilka przykładów z wielu organizowanych przez naszych bibliotekarzy.\r\n");
      out.write(" Wszystkie z nich mają na celu zaoferowanie czytelnikom i mieszkańcom naszej społeczności różnorodnych możliwości\r\n");
      out.write("  edukacyjnych, artystycznych i kulturalnych.</p>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <p>(c) 2023 Biblioteka Naukowa. Wszelkie prawa zastrzeżone.</p>\r\n");
      out.write("            <p>Adres: ul. Biblioteczna 1, 00-217 Warszawa Telefon: +48 123 456 789  E-mail: kontakt@bibliotekamiejska.pl.</p>\r\n");
      out.write("    \r\n");
      out.write("        </footer>\r\n");
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
