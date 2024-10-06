package com.lobita.refugi;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestMySQLConnection {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "3st3lA44";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión OK!");
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
