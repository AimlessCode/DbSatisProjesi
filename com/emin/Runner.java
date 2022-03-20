package com.emin;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Runner {
    public static void main(String[] args) {

        try {

            //1-  Drive 'ı kullan
            Driver.class.forName("org.postgresql.Driver");
            //2- Bağlantı yap
            String URL = "jdbc:postgresql://localhost:5432/SatisDB2";
            String UsName = "postgres";
            String Pasw = "root";
            Connection conn =
                    DriverManager.getConnection(URL, UsName, Pasw);
            //3- Emir ver
            String SQL = "insert into tblmusteri(ad,soyad) Values('Ayşe ','Ün')";
            PreparedStatement pst = conn.prepareCall(SQL);

            //4- emri iste
            pst.executeUpdate();
            //5- baglantı kapat
            conn.close();


        } catch (Exception e) {
            System.out.printf("Hatta : " + e.toString());
        }


    }
}
