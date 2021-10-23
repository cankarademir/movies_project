<%@page import="java.util.List"%>
<%@page import="movies.film"%>
<%@page import="movies.database"%>
<%@page  language = "java" contentType="text/html;  charset=UTF-8"  pageEncoding="UTF-8"%>
<%@page errorPage="hata.jsp" %> 
<%@page import ="java.sql.*" %>
<%@page import="java.io.*" %>

<!DOCTYPE html>

<%

    database db = new database();
    List<film> filmlist2 = db.random_film();


%>



<html lang="tr">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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
                                                <link rel="icon" type="image/png" href="" sizes="32x32">
                                                    <link rel="apple-touch-icon" href="">


                                                        <title>Film</title>
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

                                                        <section class="home">
                                                            <!-- home bg -->
                                                            <div class="owl-carousel home__bg">
                                                                <div class="item home__cover" data-bg="img/home/home__bg.jpg"></div>
                                                                <div class="item home__cover" data-bg="img/home/home__bg2.jpg"></div>
                                                                <div class="item home__cover" data-bg="img/home/home__bg3.jpg"></div>
                                                                <div class="item home__cover" data-bg="img/home/home__bg4.jpg"></div>
                                                                <div class="item home__cover" data-bg="img/home/home__bg5.jpg"></div>
                                                            </div>
                                                            <!-- end home bg -->

                                                            <div class="container">
                                                                <div class="row">
                                                                    <div class="col-12">
                                                                        <h1 class="home__title">RECOMMENDED MOVİES</h1>

                                                                        <button class="home__nav home__nav--prev" type="button">
                                                                            <i class="icon ion-ios-arrow-round-back"></i>
                                                                        </button>
                                                                        <button class="home__nav home__nav--next" type="button">
                                                                            <i class="icon ion-ios-arrow-round-forward"></i>
                                                                        </button>
                                                                    </div>

                                                                    <div class="col-12">
                                                                        <div class="owl-carousel home__carousel home__carousel--bg">
                                                                            <%for (int i = 0; i < filmlist2.size(); i++) {%>
                                                                            <div class="card card--big">
                                                                                <div class="card__cover">
                                                                                    <img src="img/filmler_fotograf/<%=filmlist2.get(i).getFilm_img()%>" alt="">
                                                                                        <a href="details.jsp?id=<%=filmlist2.get(i).getFilm_id()%>" class="card__play">
                                                                                            <i class="icon ion-ios-play"></i>
                                                                                        </a>
                                                                                        <span class="card__rate card__rate--green"><%=filmlist2.get(i).getPuan()%></span>
                                                                                </div>
                                                                                <div class="card__content">
                                                                                    <h3 class="card__title"><a href="details.jsp?id=<%=filmlist2.get(i).getFilm_id()%>"><%=filmlist2.get(i).getFilm_adi()%></a></h3>
                                                                                    <span class="card__category">
                                                                                        <a href="#"><%=filmlist2.get(i).getFilm_tur()%></a>
                                                                                    </span>
                                                                                </div>
                                                                            </div>
                                                                            <%  }
                                                                            %>


                                                                            </section>
                                                                            <!-- end home -->

                                                                            <!-- end section -->

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

