/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-06-20 18:50:00 UTC
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
      out.write("    <title>Biblioteka</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"A_styl.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"3.png\" sizes=\"96x96\" >\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"> <!-- do ikony użytkownika -->\r\n");
      out.write(" \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <img src=\"logo.jpg\" alt=\"ksiazka\" align=\"left\" weight=\"90px\" height=\"50px\">\r\n");
      out.write("    <h1>\r\n");
      out.write("        <center><u> Biblioteka Publiczna </u></center>\r\n");
      out.write("    </h1>\r\n");
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul>\r\n");
      out.write("               <li class=\"znacznik\" ><a href=\"A_strona-gl.jsp\"><button class=\"pobierz\" >Strona główna</button></a></li>\r\n");
      out.write("                <li class=\"znacznik\" ><a href=\"B_O bibiotece.jsp\"><button class=\"pobierz\" >O bibliotece</button></a></li>\r\n");
      out.write("                <li  class=\"znacznik\"><a href=\"C_Kategorie-książek.jsp\"><button class=\"pobierz\">Kategorie książek</button></a></li>\r\n");
      out.write("                <!--   <li><a href=\"D_Wypożyczenia.jsp\"><button class=\"pobierz\" >Wypożyczane </a></li>-->\r\n");
      out.write("                <li class=\"znacznik\"><a href=\"E_Słownik pojęć.jsp\"><button class=\"pobierz\" >Słownik pojęć bibliotecznych</button></a></li>\r\n");
      out.write("                <li class=\"znacznik\"><a href=\"F_personel.jsp\"><button class=\"pobierz\" >Personel</button></a></li>\r\n");
      out.write("               <!-- <li class=\"znacznik\"><a href=\"G_login.jsp\">Logowanie</a></li>\r\n");
      out.write("                <li class=\"znacznik\"><a href=\"H_rejestracja.jsp\">Rejestracja</a></li>-->\r\n");
      out.write("                \r\n");
      out.write("                 <li> <a > ");
      out.print(session.getAttribute("administrator") );
      out.write("</a><li>\r\n");
      out.write("       \r\n");
      out.write("                 \r\n");
      out.write("                 <li><a href=\"info_o_koncie.jsp\"><i class=\"fa fa-user\"></i> ");
      out.print(session.getAttribute("email-login") );
      out.write("</a></li>\r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("        \r\n");
      out.write("              \r\n");
      out.write("                <li  ><a href=\"#\" onclick=\"confirmLogout()\"><button class=\"pobierz\" >Wyloguj się</button></a></li>\r\n");
      out.write("                \r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        \r\n");
      out.write("        <td><img src=\"tło_log_rej.jpg\" style=\"width:100%;\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <h1 id=\"cytat\">\"Książka to najlepszy przyjaciel człowieka, a biblioteka to świątynia jego myśli.\"- Cyceron</h1>\r\n");
      out.write("    \r\n");
      out.write("<h1>Gatunki książek </h1>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <div class=\"gallery\">\r\n");
      out.write("       \r\n");
      out.write("      <div class=\"image-container\">\r\n");
      out.write("        <h4>Fantastyka</h4>\r\n");
      out.write("        <img src=\"https://cdn.pixabay.com/photo/2017/09/15/16/51/fantasy-2752798__340.jpg\" alt=\"książka\">\r\n");
      out.write("        <div class=\"image-description\">\r\n");
      out.write("          Fantastyka to gatunek, który opowiada o światach i wydarzeniach,<br> których nie ma w rzeczywistości,<br> często łączy elementy magii i mitologii.\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <div class=\"image-container\">\r\n");
      out.write("        <h4>Science Fiction</h4>\r\n");
      out.write("        <img src=\"https://cdn.pixabay.com/photo/2023/02/23/18/42/space-7809436__340.jpg\" alt=\"książka\">\r\n");
      out.write("        <div class=\"image-description\">\r\n");
      out.write("          Science fiction skupia się na opisywaniu alternatywnych wersji rzeczywistości,<br> często w oparciu o naukę i technologię,<br> z wykorzystaniem postaci z przyszłości lub obcych cywilizacji.\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"image-container\">\r\n");
      out.write("        <h4>Powieść historyczna</h4>\r\n");
      out.write("        <img src=\"https://cdn.pixabay.com/photo/2020/01/17/13/46/museum-4773011__340.jpg\" alt=\"książka\">\r\n");
      out.write("        <div class=\"image-description\">\r\n");
      out.write("          Powieść historyczna to gatunek,<br> który opisuje wydarzenia i postaci z przeszłości, <br>starając się przedstawić je w sposób autentyczny,<br> zgodny z faktami historycznymi. \r\n");
      out.write("    \r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"image-container\" >\r\n");
      out.write("    <h4>Romans</h4>\r\n");
      out.write("			<img src=\"https://cdn.pixabay.com/photo/2018/01/05/22/48/couple-3064048__340.jpg\" alt=\"książka\"  >\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("			\r\n");
      out.write("				Romans skupia się na związkach międzyludzkich,<br> a często również na emocjonalnych aspektach miłości,<br> namiętności, zdrady i przebaczenia.\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"image-container\" >\r\n");
      out.write("            <h4>Kryminał i thriller</h4>\r\n");
      out.write("			<img src=\"https://cdn.pixabay.com/photo/2014/04/05/11/40/knife-316655__340.jpg\" alt=\"książka\" >\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("				Kryminał i thriller to gatunki,<br> które skupiają się na śledztwach i intrygach kryminalnych,<br> a także na napięciu i niebezpieczeństwie,<br> które towarzyszą rozwojowi fabuły.\r\n");
      out.write("			</div>\r\n");
      out.write("			 \r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"image-container\" >\r\n");
      out.write("            <h4>Powieść młodzieżowa</h4>\r\n");
      out.write("			<img src=\"https://cdn.pixabay.com/photo/2018/10/21/10/02/social-media-3762538__340.jpg\"  alt=\"książka\"  >\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("				Powieść młodzieżowa opowiada o młodych bohaterach,<br> którzy przeżywają różne przygody i wyzwania,<br> często związane z dojrzewaniem, pierwszą miłością i odkrywaniem swojej tożsamości.\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"image-container\"  >\r\n");
      out.write("            <h4>Literatura dziecięca</h4>\r\n");
      out.write("			<img src=\"https://cdn.pixabay.com/photo/2020/06/16/14/39/mouse-5305880__340.jpg\" alt=\"książka\"  >\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("				Literatura dziecięca skupia się na<br> opowieściach dla najmłodszych czytelników,<br> zwykle z prostymi fabułami i jasnymi morałami.\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"image-container\" >\r\n");
      out.write("            <h4>Biografia i reportaż</h4>\r\n");
      out.write("			<img src=\"https://cdn.pixabay.com/photo/2012/11/20/06/08/black-66675__340.jpg\" alt=\"książka\"  >\r\n");
      out.write("			 \r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("				Biografia i reportaż to gatunki,<br> które opisują rzeczywiste życie i doświadczenia ludzi,<br> często sławnych postaci lub zwykłych ludzi,<br> którzy przeszli przez trudne okresy w swoim życiu.\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("        \r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"image-container\" >\r\n");
      out.write("            <h4>Literatura obyczajowa</h4>\r\n");
      out.write("			<img src=\"https://cdn.pixabay.com/photo/2016/05/28/07/05/book-1421097__340.jpg\" alt=\"książka\" >\r\n");
      out.write("			 \r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("				Literatura obyczajowa skupia się na<br> opisie codziennych spraw i relacji,<br> zwykle koncentrując się na moralności i wartościach.\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"image-container\"  >\r\n");
      out.write("            <h4>Horror</h4>\r\n");
      out.write("			<img src=\"https://cdn.pixabay.com/photo/2017/10/13/14/15/fantasy-2847724__340.jpg\" alt=\"książka\" >\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("				Horror to gatunek,<br> który skupia się na strachu, grozie i przerażeniu, <br>zwykle związanych z nadprzyrodzonymi zjawiskami lub niebezpieczeństwami,<br> które czekają na bohaterów.\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("     </div>  \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-------------NOWOÅCI-------------------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <h1>Nowości w naszej bibliotece</h1>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("       <div class=\"nowosci\">\r\n");
      out.write("            <div class=\"image-container\"  >\r\n");
      out.write("                <h4>Piędziesiąt Twarzy Forkisa</h4>\r\n");
      out.write("			<img src=\"https://files.legimi.com/images/e2fcee1ef2ef6dd22abc5eb50f441961/w200_u90.jpg\" alt=\"książka\" >\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("				Krótkie opowiadanie z podgatunku fantastyki soft vore, powstałe na podstawie zagranicznego komiksu i fan fiction. \r\n");
      out.write("				Alternatywna historia wydarzeń na niebezpiecznej planecie Aj z powieści \"Onkalot\", \r\n");
      out.write("				gdzie Forkis i Anna rozbili się podczas bitwy kosmicznej.\r\n");
      out.write("				 Jak sam współautor wskazuje we wstępie, tekst należy traktować z przymrużeniem oka i jako parodię.\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			</div>\r\n");
      out.write("            \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            <div class=\"image-container\"  >\r\n");
      out.write("                <h4>Nawia - W Świecie Dusz</h4>\r\n");
      out.write("			<img src=\"https://files.legimi.com/images/2fde278bc3238eb9ca41b6baf1be6094/w200_u90.jpg\" alt=\"książka\" >\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("				Motywem przewodnim jest duchowość, podróże astralne i reinkarnacja. Historia poruszająca te kwestie mówi\r\n");
      out.write("				 o wyzwaniach związanych z rozpoczynaniem dorosłego życia, trudnej miłości,\r\n");
      out.write("				 radzeniu sobie ze stratą bliskich, a także o skomplikowanym odnajdywaniu własnej drogi duchowej.\r\n");
      out.write("			</div>\r\n");
      out.write("			 \r\n");
      out.write("			</div>\r\n");
      out.write("            \r\n");
      out.write("  	<div class=\"image-container\"  >\r\n");
      out.write("        <h4>Mieszkanie przy ulicy Ryden i inne opowiadania</h4>\r\n");
      out.write("			<img src=\"https://files.legimi.com/images/cbc4e702240d4c0869c5a0a73c7fd7ec/w200_u90.jpg\" alt=\"książka\" >\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("				Na co dzień spotykamy się z sytuacjami, które nie do końca potrafimy pojąć rozumem. Nazywamy je tajemnicami.\r\n");
      out.write("				 Często skrywamy je tylko dla siebie i po pewnym czasie tracimy rozróżnienie, \r\n");
      out.write("				czy przydarzyły się nam naprawdę, czy też tylko się nam przyśniły.\r\n");
      out.write("			</div>\r\n");
      out.write("			  \r\n");
      out.write("			</div>\r\n");
      out.write("            \r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("            <div class=\"image-container\"  >\r\n");
      out.write("                <h4>Bez planu B </h4>\r\n");
      out.write("			<img src=\"https://s.lubimyczytac.pl/upload/books/5053000/5053027/1055874-352x500.jpg\"  alt=\"książka\" >\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("			Podczas swojej wędrówki przypadkiem dowiaduje się, że w Gerrardsville w Kolorado można obejrzeć wystawę \r\n");
      out.write("			uzbrojenia z okresu wojny secesyjnej.\r\n");
      out.write("			 A że znajduje się niedaleko, postanawia odwiedzić miasteczko. I jak to zwykle u niego bywa, już pierwszego \r\n");
      out.write("			 dnia dzieje się coś, co sprawia, że szybko tego miejsca nie opuści.\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("			  \r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("             <div class=\"image-container\"  >\r\n");
      out.write("                <h4>Katrusia. Opowieść o dziewczynce, <br> której moc płyneła prosto z serca</h4>\r\n");
      out.write("			<img src=\"https://files.legimi.com/images/7bcdfb0db2110b25c569f78d91af3a31/w200_u90.jpg\" alt=\"książka\" >\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("				Najważniejsza w tym wszystkim jest Katrusia. To jej pogodne serce sprawiło, że powstała cała ta historia.\r\n");
      out.write("				 Potem doszły jeszcze pozostałe materiały edukacyjne, które pozwalają pełniej zrozumieć jej losy.\r\n");
      out.write("				  Bohaterką opowieści jest dziewczynka, która musiała opuścić swój rodzinny dom i udać się w\r\n");
      out.write("				   daleką i niebezpieczną podróż w poszukiwaniu swojego nowego miejsca na ziemi.\r\n");
      out.write("			</div>\r\n");
      out.write("			  \r\n");
      out.write("			</div>\r\n");
      out.write("                \r\n");
      out.write("               \r\n");
      out.write("           <div class=\"image-container\"  >\r\n");
      out.write("            <h4>Kult</h4>\r\n");
      out.write("			<img src=\"https://s.lubimyczytac.pl/upload/books/5059000/5059617/1054418-352x500.jpg\" alt=\"książka\" >\r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("				Fabuła „Kultu” opowiada o porwaniu pięcioletniego Ossiana w sztokholmskiej dzielnicy Sodermalm.\r\n");
      out.write("				Lackberg i Fexeus udowadniają ponownie, że są fantastycznym duetem. \r\n");
      out.write("				Oparta na wiedzy i doświadczeniu mentalisty oraz umiejętnościach pisarki opowieść zachwyca złożonością oraz\r\n");
      out.write("				 niesamowitym, zapierającym dech w piersiach klimatem.\r\n");
      out.write("			</div>\r\n");
      out.write("			 \r\n");
      out.write("			</div>\r\n");
      out.write("            \r\n");
      out.write("                 <div class=\"image-container\"  >\r\n");
      out.write("                    <h4>Mediare. Mediacje rówjeśnicze</h4>\r\n");
      out.write("			<img src=\"https://files.legimi.com/images/88eebf78f981b6d28573f5ffcbc6d34c/w200_u90.jpg\"  alt=\"książka\" >\r\n");
      out.write("			<div class=\"image-description\">\r\n");
      out.write("				\"Mediare. Mediacje rówieśnicze\" to książka autorstwa Adama Szeli, która opisuje metodę rozwiązywania \r\n");
      out.write("				konfliktów między rówieśnikami za pomocą mediacji. Mediacje rówieśnicze polegają na tym, że równorzędni \r\n");
      out.write("				uczniowie pomagają innym uczniom w rozwiązaniu problemów i konfliktów między nimi, \r\n");
      out.write("				zamiast polegać wyłącznie na interwencji dorosłych.\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("            </div>\r\n");
      out.write("               \r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    	\r\n");
      out.write("    	function confirmLogout() {\r\n");
      out.write("    		if (confirm(\"Czy na pewno chcesz się wylogować?\")) {\r\n");
      out.write("    			window.location.href = \"logout\";\r\n");
      out.write("    		}\r\n");
      out.write("    	}\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("		const imageContainers = document.querySelectorAll('.image-container');\r\n");
      out.write("\r\n");
      out.write("		imageContainers.forEach((container) => {\r\n");
      out.write("			const image = container.querySelector('img');\r\n");
      out.write("			const description = container.querySelector('.image-description');\r\n");
      out.write("\r\n");
      out.write("			container.addEventListener('mouseover', () => {\r\n");
      out.write("				description.style.display = 'block';\r\n");
      out.write("			});\r\n");
      out.write("\r\n");
      out.write("			container.addEventListener('mouseout', () => {\r\n");
      out.write("				description.style.display = 'none';\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("        <p>(c) 2023 Biblioteka  Publiczna. Wszelkie prawa zastrzeeżone.</p>\r\n");
      out.write("        <p>Telefon: +48 123 456 789  E-mail: kontakt@bibliotekamiejska.pl.</p>\r\n");
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
