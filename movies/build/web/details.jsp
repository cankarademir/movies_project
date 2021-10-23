<%@page import="movies.film"%>
<%@page import="java.util.List"%>


<%@page import="movies.database"%>
<%@page  language = "java" contentType="text/html;  charset=UTF-8"  pageEncoding="UTF-8"%>
<%@page errorPage="hata.jsp" %> 
<%@page import ="java.sql.*" %>
<%@page import="java.io.*" %>
<!DOCTYPE html>

<!DOCTYPE html>
<%
    if (request.getParameter("id") != null) {
        int id = Integer.parseInt(request.getParameter("id"));
        database db = new database();
        film filmlist = db.details(id);

        List<film> filmlist2 = db.oyuncu(id);

%>
<html lang="tr">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- CSS -->
    <link rel="stylesheet" href="css/bootstrap-reboot.min.css">
        <link rel="stylesheet" href="css/bootstrap-grid.min.css">
            <link rel="stylesheet" href="css/owl.carousel.min.css">
                <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
                    <link rel="stylesheet" href="css/nouislider.min.css">
                        <link rel="stylesheet" href="css/ionicons.min.css">
                            <link rel="stylesheet" href="css/magnific-popup.css">
                                <link rel="stylesheet" href="css/plyr.css">
                                    <link rel="stylesheet" href="css/photoswipe.css">
                                        <link rel="stylesheet" href="css/default-skin.css">
                                            <link rel="stylesheet" href="css/main.css">

                                                <!-- Favicons -->
                                                <link rel="icon" type="image/png" href="icon/favicon-32x32.png" sizes="32x32">
                                                    <link rel="apple-touch-icon" href="icon/favicon-32x32.png">

                                                        <meta name="description" content="">
                                                        <meta name="keywords" content="">
                                                        <meta name="author" content="Dmitry Volkov">
                                                        <title>Film Fragman</title>
                                                        </head>

                                                        <body class="body">
                                                            <!-- header -->
                                                            <header class="header">
                                                                <div class="container">
                                                                    <div class="row">
                                                                        <div class="col-12">
                                                                            <div class="header__content">
                                                                                <!-- header logo -->
                                                                                <a href="index.jsp" class="header__logo">
                                                                                    <img src="img/ck.png" alt="">
                                                                                </a>
                                                                                <!-- end header logo -->

                                                                                <!-- header nav -->
                                                                                <ul class="header__nav">
                                                                                    <!-- dropdown -->

                                                                                    <li class="header__nav-item">
                                                                                        <a href="index.jsp"class="header__nav-link">Home</a>
                                                                                    </li>

                                                                                    <!-- end dropdown -->

                                                                                    <!-- dropdown -->

                                                                                    <li class="header__nav-item">
                                                                                        <a class="dropdown-toggle header__nav-link" href="#" role="button" id="dropdownMenuCatalog" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Catalog</a>

                                                                                        <ul class="dropdown-menu header__dropdown-menu" aria-labelledby="dropdownMenuCatalog">
                                                                                            <li><a href="kategori.jsp?tur=action">action</a></li>
                                                                                            <li><a href="kategori.jsp?tur=adventure">adventure</a></li>
                                                                                            <li><a href="kategori.jsp?tur=animation">animation</a></li>
                                                                                            <li><a href="kategori.jsp?tur=biography">biography</a></li>
                                                                                            <li><a href="kategori.jsp?tur=comedy">comedy</a></li>
                                                                                            <li><a href="kategori.jsp?tur=crime">crime</a></li>
                                                                                            <li><a href="kategori.jsp?tur=drama">drama</a></li>
                                                                                            <li><a href="kategori.jsp?tur=family">family</a></li>
                                                                                            <li><a href="kategori.jsp?tur=fantasy">fantasy</a></li>
                                                                                            <li><a href="kategori.jsp?tur=film-noir">film-noir</a></li>
                                                                                            <li><a href="kategori.jsp?tur=history">history</a></li> 
                                                                                            <li><a href="kategori.jsp?tur=horror">horror</a></li>
                                                                                            <li><a href="kategori.jsp?tur=music">music</a></li> 
                                                                                            <li><a href="kategori.jsp?tur=mystery">mystery</a></li> 
                                                                                            <li><a href="kategori.jsp?tur=romance">romance</a></li>
                                                                                            <li><a href="kategori.jsp?tur=sci-fi">sci-fi</a></li>
                                                                                            <li><a href="kategori.jsp?tur=sport">sport</a></li>
                                                                                            <li><a href="kategori.jsp?tur=thriller">thriller</a></li>
                                                                                            <li><a href="kategori.jsp?tur=war">war</a></li>
                                                                                            <li><a href="kategori.jsp?tur=western">western</a></li>



                                                                                        </ul>
                                                                                    </li>

                                                                                    <!-- end dropdown -->


                                                                                    <li class="header__nav-item">
                                                                                        <a href="404.jsp"class="header__nav-link">404 Page</a>
                                                                                    </li>


                                                                                </ul>
                                                                                <!-- end header nav -->

                                                                                <!-- header menu btn -->
                                                                                <button class="header__btn" type="button">
                                                                                    <span></span>
                                                                                    <span></span>
                                                                                    <span></span>
                                                                                </button>
                                                                                <!-- end header menu btn -->
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </header>


                                                            <!-- end header -->

                                                            <!-- details -->
                                                        <section class="section section--details section--bg" data-bg="img/filmler_fotograf/<%=filmlist.getFilm_img()%>">
                                                            <!-- details content -->
                                                            <div class="container">
                                                                <div class="row">
                                                                    <!-- title -->
                                                                    <div class="col-12">
                                                                        <h1 class="section__title section__title--mb"><%=filmlist.getFilm_adi()%></h1>
                                                                    </div>
                                                                    <!-- end title -->

                                                                    <!-- content -->
                                                                    <div class="col-12 col-xl-6">
                                                                        <div class="card card--details">
                                                                            <div class="row">
                                                                                <!-- card cover -->
                                                                                <div class="col-12 col-sm-5 col-md-4 col-lg-3 col-xl-5">
                                                                                    <div class="card__cover">
                                                                                        <img src="img/filmler_fotograf/<%=filmlist.getFilm_img()%>" alt="">
                                                                                            <span class="card__rate card__rate--yellow"><%=filmlist.getPuan()%></span>
                                                                                    </div>

                                                                                </div>
                                                                                <!-- end card cover -->

                                                                                <!-- card content -->
                                                                                <div class="col-12 col-md-8 col-lg-9 col-xl-7">
                                                                                    <div class="card__content">
                                                                                        <table>
                                                                                            <tbody style="color: white;">
                                                                                                <tr>
                                                                                                    <td>Genre:</td>
                                                                                                    <td style="white-space: nowrap;"><%=filmlist.getFilm_tur()%></td>
                                                                                                </tr>
                                                                                                <tr>
                                                                                                    <td style="white-space: nowrap;">Release year:</td>
                                                                                                    <td style="white-space: nowrap;"><%=filmlist.getFilm_yil()%></td>
                                                                                                </tr>
                                                                                                <tr>
                                                                                                    <td>Director:</td>
                                                                                                    <td style="white-space: nowrap;"><%=filmlist.getFilm_yonetmen()%></td>
                                                                                                </tr>
                                                                                                <tr>
                                                                                                    <td style="white-space: nowrap;">Movie Description:    </td>
                                                                                                    <td><%=filmlist.getFilm_konu()%></td>
                                                                                                </tr>
                                                                                                <tr>
                                                                                                    <td style="white-space: nowrap;">Cast:    </td> 
                                                                                                    <td>  <%for (int i = 0; i < filmlist2.size(); i++) {%><%=filmlist2.get(i).getOyuncu_adi() + ","%><%}%></td>
                                                                                                </tr>
                                                                                            </tbody>
                                                                                        </table>

                                                                                    </div>
                                                                                </div>
                                                                                <!-- end card content -->
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                    <!-- end content -->
                                                                </div>
                                                            </div>
                                                            <!-- end details content -->
                                                        </section>
                                                        <!-- end details -->

                                                        <!-- footer -->
                                                        <footer class="footer">
                                                            <div class="container">
                                                                <div class="row">
                                                                    <div class="col-12">
                                                                        <
                                                                        <ul class="footer__social">
                                                                            <li class="linkedin"><a href="https://www.linkedin.com/in/cankarademir/"><i class="icon ion-logo-linkedin"></i></a></li>						
                                                                            <li class="facebook"><a href="https://www.facebook.com/cimbomcan23/"><i class="icon ion-logo-facebook"></i></a></li>
                                                                            <li class="instagram"><a href="https://www.instagram.com/krdmr_cn/"><i class="icon ion-logo-instagram"></i></a></li>
                                                                            <li class="twitter"><a href="https://twitter.com/krdmr_can/"><i class="icon ion-logo-twitter"></i></a></li>
                                                                            <li class="github"><a href="https://github.com/CANkrdmr"><i class="icon ion-logo-github"></i></a></li>
                                                                            <button class="footer__back" type="button">
                                                                                <i class="icon ion-ios-arrow-round-up"></i>
                                                                            </button>
                                                                            <span class="footer__copyright">© CAN KARADEMİR - 190260012 , 2021 <br></span>
                                                                        </ul>


                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </footer>
                                                        <!-- end footer -->





                                                        <!-- Root element of PhotoSwipe. Must have class pswp. -->
                                                        <div class="pswp" tabindex="-1" role="dialog" aria-hidden="true">

                                                            <!-- Background of PhotoSwipe. 
                                                                    It's a separate element, as animating opacity is faster than rgba(). -->
                                                            <div class="pswp__bg"></div>

                                                            <!-- Slides wrapper with overflow:hidden. -->
                                                            <div class="pswp__scroll-wrap">

                                                                <!-- Container that holds slides. PhotoSwipe keeps only 3 slides in DOM to save memory. -->
                                                                <!-- don't modify these 3 pswp__item elements, data is added later on. -->
                                                                <div class="pswp__container">
                                                                    <div class="pswp__item"></div>
                                                                    <div class="pswp__item"></div>
                                                                    <div class="pswp__item"></div>
                                                                </div>

                                                                <!-- Default (PhotoSwipeUI_Default) interface on top of sliding area. Can be changed. -->
                                                                <div class="pswp__ui pswp__ui--hidden">

                                                                    <div class="pswp__top-bar">

                                                                        <!--  Controls are self-explanatory. Order can be changed. -->

                                                                        <div class="pswp__counter"></div>

                                                                        <button class="pswp__button pswp__button--close" title="Close (Esc)"></button>

                                                                        <button class="pswp__button pswp__button--fs" title="Toggle fullscreen"></button>

                                                                        <!-- Preloader -->
                                                                        <div class="pswp__preloader">
                                                                            <div class="pswp__preloader__icn">
                                                                                <div class="pswp__preloader__cut">
                                                                                    <div class="pswp__preloader__donut"></div>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>

                                                                    <button class="pswp__button pswp__button--arrow--left" title="Previous (arrow left)"></button>

                                                                    <button class="pswp__button pswp__button--arrow--right" title="Next (arrow right)"></button>

                                                                    <div class="pswp__caption">
                                                                        <div class="pswp__caption__center"></div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <!-- JS -->
                                                        <script src="js/jquery-3.5.1.min.js"></script>
                                                        <script src="js/bootstrap.bundle.min.js"></script>
                                                        <script src="js/owl.carousel.min.js"></script>
                                                        <script src="js/jquery.magnific-popup.min.js"></script>
                                                        <script src="js/jquery.mousewheel.min.js"></script>
                                                        <script src="js/jquery.mCustomScrollbar.min.js"></script>
                                                        <script src="js/wNumb.js"></script>
                                                        <script src="js/nouislider.min.js"></script>
                                                        <script src="js/plyr.min.js"></script>
                                                        <script src="js/photoswipe.min.js"></script>
                                                        <script src="js/photoswipe-ui-default.min.js"></script>
                                                        <script src="js/main.js"></script>
                                                        </body>

                                                        </html>

                                                        <%} else {
                                                                response.sendRedirect("404.jsp");

                                                            }%>





