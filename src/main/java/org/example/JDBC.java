package org.example;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) throws  SQLException {


        String url = "jdbc:oracle:thin:@//193.226.34.57:1521/oradb";
        String name = "IACOBS_56";
        String password = "stud";

        java.sql.Connection connection = DriverManager.getConnection(url,name,password);
        System.out.println("Conectare cu success!");


        String comanda = "SELECT * FROM AGENTI_PAZA";
        Statement statement = connection.createStatement();
        ResultSet resultSet =  statement.executeQuery(comanda);


        while(resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " ");
        }





    }


}