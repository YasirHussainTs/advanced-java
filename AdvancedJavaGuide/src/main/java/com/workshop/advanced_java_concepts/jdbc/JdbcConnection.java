package com.workshop.advanced_java_concepts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/yourdatabase";
        String username = "root";
        String password = "password";

        try {
            // Establishing the connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Creating a statement
            Statement statement = connection.createStatement();

            // Executing a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM your_table");

            // Processing the result set
            while (resultSet.next()) {
                System.out.println("Column1: " + resultSet.getString("column1"));
            }

            // Closing the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
