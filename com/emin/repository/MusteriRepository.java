package com.emin.repository;

import com.emin.repository.entity.Musteri;
import com.emin.utility.ConnectionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MusteriRepository {

    private ConnectionDb Db = new ConnectionDb();
    private PreparedStatement pst;

    public void save(Musteri musteri) {

        String SQL = "insert into tblmusteri(ad,soyad,tckimlik,firmaadi,verginumarasi,\n" +
                "vergidairesi,adres,profilephoto,telefon,\n" +
                " email,borclimiti,musteritipi,state)\n" +
                " values('" + musteri.getAd() +
                "','" + musteri.getSoyad() +
                "','" + musteri.getTckimlik() +
                "','" + musteri.getFirmaadi() +
                "','" + musteri.getVerginumarasi() +
                "','" + musteri.getVergidairesi() +
                "','" + musteri.getAdres() +
                "','" + musteri.getProfilephoto() +
                "','" + musteri.getTelefon() +
                "','" + musteri.getEmail() + "'," + musteri.getBorclimiti() +
                "," + musteri.isMusteritipi() + ",1)";


        try {
            pst = Db.getConnection().prepareCall(SQL);
            pst.execute();
            Db.closeConnection();

        } catch (Exception exception) {
            System.out.printf("Hatta Müşteri kayıt" + exception.toString());
        }


    }


    public void update(Musteri musteri) {
        String SQL = "update tblmusteri set \n" +
                "ad='" + musteri.getAd() +
                "',soyad='" + musteri.getSoyad() +
                "',tckimlik='" + musteri.getTckimlik() +
                "',firmaadi='" + musteri.getFirmaadi() + "'," +
                "verginumarasi='" + musteri.getVerginumarasi() +
                "',vergidairesi='" + musteri.getVergidairesi() +
                "',adres='" + musteri.getAdres() +
                "',profilephoto='" + musteri.getProfilephoto() + "'," +
                "telefon='" + musteri.getTelefon() +
                "',email='" + musteri.getEmail() +
                "',borclimiti=" + musteri.getBorclimiti() +
                ",musteritipi=" + musteri.isMusteritipi() +
                ",state=" + musteri.getState() +
                "where id=" + musteri.getId();

        try {
            pst = Db.getConnection().prepareCall(SQL);
            pst.executeUpdate();
            Db.closeConnection();

        } catch (Exception e) {
            System.out.printf("Müşteri Güncelme hatta  : " + e.toString());
        }


    }


    public void delete(long id) {
        String SQL = "delete from tblmusteri where " +
                "id=" + id;

        try {
            pst = Db.getConnection().prepareCall(SQL);
            pst.executeUpdate();
            Db.closeConnection();

        } catch (Exception e) {

            System.out.printf("Silme işlemi hatsaı " + e.toString());

        }


    }


    public List<Musteri> findAll() {
        List<Musteri> list = new ArrayList<>();
        String SQL = "select * from tblmusteri ";
        try {
            pst = Db.getConnection().prepareCall(SQL);
            pst.executeUpdate();
            Db.closeConnection();
           ResultSet rs= pst.executeQuery();    // Select sonucunda dönen deger ve o degerileri getirir
            rs.next();
           String ad= rs.getString("ad");
            System.out.printf("Müşteri Adı : "+ad);
            Db.closeConnection();


        } catch (Exception e) {

            System.out.printf("Silme işlemi hatsaı " + e.toString());

        }
        return list;
    }

}
