package movies;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class database {

    private Connection connection;
    private Statement statement;

    public void connection_open() {
        try {
            if (connection == null) {
                Class.forName("com.mysql.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/staj_database_imdb?zeroDateTimeBehavior=convertToNull", "root", "");
                statement = connection.createStatement();
                System.out.println("Bağlantı Sağlandı");
            } else {
                System.out.println("Bağlantı Zaten Açık");
            }
        } catch (Exception e) {
            System.out.println("Open Connection Error" + e.toString());
        }
    }

    public void conneciton_close() {

        try {
            if (statement != null) {
                statement.close();
                statement = null;
            }
            if (connection != null) {
                connection.close();
                connection = null;
            }

        } catch (Exception e) {
            System.out.println("Exception closeConnection" + e.toString());
        }
    }

    public void insert_film(int film_id, String film_adi, String yil, String tur, String puan, String konu, String yönetmen, String film_url, String film_foto_url, String film_foto) {
        try {
            connection_open();
            String selectquery = ("insert into film_bilgiler(film_id,film_ad,film_yili,film_turu,film_puani,film_aciklama,film_yonetmeni,film_url,film_foto_url,film_foto) VALUES (?,?,?,?,?,?,?,?,?,?)");

            PreparedStatement gir = (PreparedStatement) connection.prepareStatement(selectquery);
            gir.setInt(1, film_id);
            gir.setString(2, film_adi);
            gir.setString(3, yil);
            gir.setString(4, tur);
            gir.setString(5, puan);
            gir.setString(6, konu);
            gir.setString(7, yönetmen);
            gir.setString(8, film_url);
            gir.setString(9, film_foto_url);
            gir.setString(10, film_foto);

            gir.executeUpdate();
            conneciton_close();
            System.out.println("kayıt eklendi.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("kayıt yapılamadı.");
        }
    }

    public void insert_oyuncular(int oyuncu_id, String oyuncu_adi, int film_id) {
        try {
            connection_open();
            String selectquery = ("insert into film_oyuncular(oyuncu_id,oyuncu_adi,film_id) VALUES (?,?,?)");

            PreparedStatement gir = (PreparedStatement) connection.prepareStatement(selectquery);
            gir.setInt(1, oyuncu_id);
            gir.setString(2, oyuncu_adi);
            gir.setInt(3, film_id);

            gir.executeUpdate();
            conneciton_close();
            System.out.println("kayıt eklendi.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("kayıt yapılamadı.");
        }
    }

    
    public List<film> random_film() { // her çalıştığında farklı fimleri göstricek
        List<film> filmlist2 = new ArrayList<>();
        try {

            connection_open();
            String selectquery = "SELECT * FROM `film_bilgiler`  ORDER BY RAND() DESC LIMIT 0,10";

            ResultSet rs = statement.executeQuery(selectquery);

            while (rs.next()) {
                film film = new film();
                int film_id = rs.getInt("film_id");
                String film_adi = rs.getString("film_ad");
                String tur = rs.getString("film_turu");
                String puan = rs.getString("film_puani");
                String img = rs.getString("film_foto");

                film.setFilm_adi(film_adi);
                film.setFilm_id(film_id);
                film.setFilm_tur(tur);
                film.setPuan(puan);
                film.setFilm_img(img);
                filmlist2.add(film);

            }

            //  PreparedStatement gir = connection.prepareStatement(selectquery);
            //    gir.executeUpdate();  
        } catch (Exception e) {
            e.printStackTrace();
        }
        conneciton_close();
        return filmlist2;

    }
  
     public List<film> katagori(String kategori) {
        List<film> filmlist = new ArrayList<>();

        try {

            connection_open();
            String selectquery = "SELECT * FROM `film_bilgiler` WHERE `film_turu`  LIKE '%" + kategori.trim() + "%'";

            ResultSet rs = statement.executeQuery(selectquery);

            while (rs.next()) {
                film film = new film();
                int film_id = rs.getInt("film_id");
                String film_adi = rs.getString("film_ad");
                String tur = rs.getString("film_turu");
                String puan = rs.getString("film_puani");
                String img = rs.getString("film_foto");

                film.setFilm_adi(film_adi);
                film.setFilm_id(film_id);
                film.setFilm_tur(tur);
                film.setPuan(puan);
                film.setFilm_img(img);
                filmlist.add(film);
                System.out.println(film);
            }

            //  PreparedStatement gir = connection.prepareStatement(selectquery);
            //    gir.executeUpdate();  
        } catch (Exception e) {
            e.printStackTrace();
        }
        conneciton_close();
        return filmlist;
    }

    public static void main(String[] args) throws SQLException {
    }

    public film details(int id) { // details.jsp içerik 
        film film = new film();
        try {

            connection_open();
            String selectquery = "select * from `film_bilgiler` where   film_id=" + id;
            ResultSet rs = statement.executeQuery(selectquery);

            while (rs.next()) {
                int film_id = rs.getInt("film_id");
                String film_adi = rs.getString("film_ad");
                System.out.println("film_adi = " + film_adi);
                String tur = rs.getString("film_turu");
                String puan = rs.getString("film_puani");
                String img = rs.getString("film_foto");
                String film_yil = rs.getString("film_yili");
                String yonetmen = rs.getString("film_yonetmeni");
                String konu = rs.getString("film_aciklama");

                film.setFilm_adi(film_adi);
                film.setFilm_id(film_id);
                film.setFilm_tur(tur);
                film.setPuan(puan);
                film.setFilm_img(img);
                film.setFilm_yil(film_yil);
                film.setFilm_yonetmen(yonetmen);
                film.setFilm_konu(konu);
                System.out.println(film);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        conneciton_close();
        return film;
    }

    public List<film> oyuncu(int id) {
        List<film> filmlist = new ArrayList<>();
        try {

            connection_open();
            String selectquery = "select * from `film_oyuncular` where   film_id=" + id;
            ResultSet rs = statement.executeQuery(selectquery);

            while (rs.next()) {
                film film = new film();
                int film_id = rs.getInt("film_id");
                int oyuncu_id = rs.getInt("oyuncu_id");
                String film_oyuncu = rs.getString("oyuncu_adi");

                film.setOyuncu_adi(film_oyuncu);
                film.setFilm_id(film_id);
                film.setOyuncu_id(oyuncu_id);
                filmlist.add(film);
                System.out.println(film);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        conneciton_close();
        return filmlist;
    }

}
