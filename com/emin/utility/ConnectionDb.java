package com.emin.utility;

import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class ConnectionDb {
    private final String URL = "jdbc:postgresql://localhost:5432/SatisDB2";
    private final String UsName = "postgres";
    private final String Pasw = "root";


    //Bağlantı için
    private Connection connection;

    public Connection getConnection() {
        try {

            Driver.class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, UsName, Pasw);

        } catch (Exception e) {
            System.out.printf("Hatta" + e.toString());

        }
        return null;

    }
    public boolean closeConnection() {
        try {
            if (!connection.isClosed()) {
                connection.close();
            }

        } catch (Exception e) {
            System.out.printf("Hatta" + e.toString());


        }
        return false;
    }

}

