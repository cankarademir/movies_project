package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import movies.film;
import movies.database;
import java.sql.*;
import java.io.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;  charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"hata.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");


    database db = new database();
    List<film> filmlist2 = db.random_film();



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"tr\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <!-- CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap-reboot.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-grid.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("                <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\n");
      out.write("                    <link rel=\"stylesheet\" href=\"css/nouislider.min.css\">\n");
      out.write("                        <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n");
      out.write("                            <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("                                <link rel=\"stylesheet\" href=\"css/plyr.css\">\n");
      out.write("                                    <link rel=\"stylesheet\" href=\"css/photoswipe.css\">\n");
      out.write("                                        <link rel=\"stylesheet\" href=\"css/default-skin.css\">\n");
      out.write("                                            <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("\n");
      out.write("                                                <!-- Favicons -->\n");
      out.write("                                                <link rel=\"icon\" type=\"image/png\" href=\"\" sizes=\"32x32\">\n");
      out.write("                                                    <link rel=\"apple-touch-icon\" href=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <title>Film</title>\n");
      out.write("                                                        </head>\n");
      out.write("\n");
      out.write("                                                        <body class=\"body\">\n");
      out.write("                                                            <!-- header -->\n");
      out.write("                                                            <header class=\"header\">\n");
      out.write("                                                                <div class=\"container\">\n");
      out.write("                                                                    <div class=\"row\">\n");
      out.write("                                                                        <div class=\"col-12\">\n");
      out.write("                                                                            <div class=\"header__content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                <!-- header logo -->\n");
      out.write("                                                                                <a href=\"index.jsp\" class=\"header__logo\">\n");
      out.write("                                                                                    <img src=\"img/ck.png\" alt=\"\">\n");
      out.write("                                                                                </a>\n");
      out.write("                                                                                <!-- end header logo -->\n");
      out.write("\n");
      out.write("                                                                                <!-- header nav -->\n");
      out.write("                                                                                <ul class=\"header__nav\">\n");
      out.write("                                                                                    <!-- dropdown -->\n");
      out.write("\n");
      out.write("                                                                                    <li class=\"header__nav-item\">\n");
      out.write("                                                                                        <a href=\"index.jsp\"class=\"header__nav-link\">Home</a>\n");
      out.write("                                                                                    </li>\n");
      out.write("\n");
      out.write("                                                                                    <!-- end dropdown -->\n");
      out.write("\n");
      out.write("                                                                                    <!-- dropdown -->\n");
      out.write("\n");
      out.write("                                                                                    <li class=\"header__nav-item\">\n");
      out.write("                                                                                        <a class=\"dropdown-toggle header__nav-link\" href=\"#\" role=\"button\" id=\"dropdownMenuCatalog\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Catalog</a>\n");
      out.write("\n");
      out.write("                                                                                        <ul class=\"dropdown-menu header__dropdown-menu\" aria-labelledby=\"dropdownMenuCatalog\">\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=action\">action</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=adventure\">adventure</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=animation\">animation</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=biography\">biography</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=comedy\">comedy</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=crime\">crime</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=drama\">drama</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=family\">family</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=fantasy\">fantasy</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=film-noir\">film-noir</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=history\">history</a></li> \n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=horror\">horror</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=music\">music</a></li> \n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=mystery\">mystery</a></li> \n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=romance\">romance</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=sci-fi\">sci-fi</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=sport\">sport</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=thriller\">thriller</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=war\">war</a></li>\n");
      out.write("                                                                                            <li><a href=\"kategori.jsp?tur=western\">western</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                        </ul>\n");
      out.write("                                                                                    </li>\n");
      out.write("\n");
      out.write("                                                                                    <!-- end dropdown -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                    <li class=\"header__nav-item\">\n");
      out.write("                                                                                        <a href=\"404.jsp\"class=\"header__nav-link\">404 Page</a>\n");
      out.write("                                                                                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                </ul>\n");
      out.write("                                                                                <!-- end header nav -->\n");
      out.write("\n");
      out.write("                                                                                <!-- header menu btn -->\n");
      out.write("                                                                                <button class=\"header__btn\" type=\"button\">\n");
      out.write("                                                                                    <span></span>\n");
      out.write("                                                                                    <span></span>\n");
      out.write("                                                                                    <span></span>\n");
      out.write("                                                                                </button>\n");
      out.write("                                                                                <!-- end header menu btn -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                <button class=\"header__btn\" type=\"button\">\n");
      out.write("                                                                                    <span></span>\n");
      out.write("                                                                                    <span></span>\n");
      out.write("                                                                                    <span></span>\n");
      out.write("                                                                                </button>\n");
      out.write("                                                                                <!-- end header menu btn -->\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </header>\n");
      out.write("                                                            <!-- end header -->\n");
      out.write("\n");
      out.write("                                                        <section class=\"home\">\n");
      out.write("                                                            <!-- home bg -->\n");
      out.write("                                                            <div class=\"owl-carousel home__bg\">\n");
      out.write("                                                                <div class=\"item home__cover\" data-bg=\"img/home/home__bg.jpg\"></div>\n");
      out.write("                                                                <div class=\"item home__cover\" data-bg=\"img/home/home__bg2.jpg\"></div>\n");
      out.write("                                                                <div class=\"item home__cover\" data-bg=\"img/home/home__bg3.jpg\"></div>\n");
      out.write("                                                                <div class=\"item home__cover\" data-bg=\"img/home/home__bg4.jpg\"></div>\n");
      out.write("                                                                <div class=\"item home__cover\" data-bg=\"img/home/home__bg5.jpg\"></div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <!-- end home bg -->\n");
      out.write("\n");
      out.write("                                                            <div class=\"container\">\n");
      out.write("                                                                <div class=\"row\">\n");
      out.write("                                                                    <div class=\"col-12\">\n");
      out.write("                                                                        <h1 class=\"home__title\">RECOMMENDED MOVİES</h1>\n");
      out.write("\n");
      out.write("                                                                        <button class=\"home__nav home__nav--prev\" type=\"button\">\n");
      out.write("                                                                            <i class=\"icon ion-ios-arrow-round-back\"></i>\n");
      out.write("                                                                        </button>\n");
      out.write("                                                                        <button class=\"home__nav home__nav--next\" type=\"button\">\n");
      out.write("                                                                            <i class=\"icon ion-ios-arrow-round-forward\"></i>\n");
      out.write("                                                                        </button>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                    <div class=\"col-12\">\n");
      out.write("                                                                        <div class=\"owl-carousel home__carousel home__carousel--bg\">\n");
      out.write("                                                                            ");
for (int i = 0; i < filmlist2.size(); i++) {
      out.write("\n");
      out.write("                                                                            <div class=\"card card--big\">\n");
      out.write("                                                                                <div class=\"card__cover\">\n");
      out.write("                                                                                    <img src=\"img/filmler_fotograf/");
      out.print(filmlist2.get(i).getFilm_img());
      out.write("\" alt=\"\">\n");
      out.write("                                                                                        <a href=\"details.jsp?id=");
      out.print(filmlist2.get(i).getFilm_id());
      out.write("\" class=\"card__play\">\n");
      out.write("                                                                                            <i class=\"icon ion-ios-play\"></i>\n");
      out.write("                                                                                        </a>\n");
      out.write("                                                                                        <span class=\"card__rate card__rate--green\">");
      out.print(filmlist2.get(i).getPuan());
      out.write("</span>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                                <div class=\"card__content\">\n");
      out.write("                                                                                    <h3 class=\"card__title\"><a href=\"details.jsp?id=");
      out.print(filmlist2.get(i).getFilm_id());
      out.write('"');
      out.write('>');
      out.print(filmlist2.get(i).getFilm_adi());
      out.write("</a></h3>\n");
      out.write("                                                                                    <span class=\"card__category\">\n");
      out.write("                                                                                        <a href=\"#\">");
      out.print(filmlist2.get(i).getFilm_tur());
      out.write("</a>\n");
      out.write("                                                                                    </span>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            ");
  }
                                                                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                            </section>\n");
      out.write("                                                                            <!-- end home -->\n");
      out.write("\n");
      out.write("                                                                            <!-- end section -->\n");
      out.write("\n");
      out.write("                                                                            <!-- footer -->\n");
      out.write("                                                                            <footer class=\"footer\">\n");
      out.write("                                                                                <div class=\"container\">\n");
      out.write("                                                                                    <div class=\"row\">\n");
      out.write("                                                                                        <div class=\"col-12\">\n");
      out.write("                                                                                            <\n");
      out.write("                                                                                            <ul class=\"footer__social\">\n");
      out.write("                                                                                                <li class=\"linkedin\"><a href=\"https://www.linkedin.com/in/cankarademir/\"><i class=\"icon ion-logo-linkedin\"></i></a></li>\t\t\t\t\t\t\n");
      out.write("                                                                                                <li class=\"facebook\"><a href=\"https://www.facebook.com/cimbomcan23/\"><i class=\"icon ion-logo-facebook\"></i></a></li>\n");
      out.write("                                                                                                <li class=\"instagram\"><a href=\"https://www.instagram.com/krdmr_cn/\"><i class=\"icon ion-logo-instagram\"></i></a></li>\n");
      out.write("                                                                                                <li class=\"twitter\"><a href=\"https://twitter.com/krdmr_can/\"><i class=\"icon ion-logo-twitter\"></i></a></li>\n");
      out.write("                                                                                                <li class=\"github\"><a href=\"https://github.com/CANkrdmr\"><i class=\"icon ion-logo-github\"></i></a></li>\n");
      out.write("                                                                                                <button class=\"footer__back\" type=\"button\">\n");
      out.write("                                                                                                    <i class=\"icon ion-ios-arrow-round-up\"></i>\n");
      out.write("                                                                                                </button>\n");
      out.write("                                                                                                <span class=\"footer__copyright\">© CAN KARADEMİR - 190260012 , 2021 <br></span>\n");
      out.write("                                                                                            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                        </div>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                            </footer>\n");
      out.write("                                                                            <!-- end footer -->\n");
      out.write("\n");
      out.write("                                                                            <!-- JS -->\n");
      out.write("                                                                            <script src=\"js/jquery-3.5.1.min.js\"></script>\n");
      out.write("                                                                            <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("                                                                            <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("                                                                            <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("                                                                            <script src=\"js/jquery.mousewheel.min.js\"></script>\n");
      out.write("                                                                            <script src=\"js/jquery.mCustomScrollbar.min.js\"></script>\n");
      out.write("                                                                            <script src=\"js/wNumb.js\"></script>\n");
      out.write("                                                                            <script src=\"js/nouislider.min.js\"></script>\n");
      out.write("                                                                            <script src=\"js/plyr.min.js\"></script>\n");
      out.write("                                                                            <script src=\"js/photoswipe.min.js\"></script>\n");
      out.write("                                                                            <script src=\"js/photoswipe-ui-default.min.js\"></script>\n");
      out.write("                                                                            <script src=\"js/main.js\"></script>\n");
      out.write("                                                                            </body>\n");
      out.write("\n");
      out.write("                                                                            </html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
