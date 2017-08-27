package com.axxes.persistence.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public final class ConnectionManager
{
    @Value("${db.user}")
    private String user;

    @Value("${db.password}")
    private String password = "root";

    @Value("${db.url}")
    private String url;

    private Connection connection;

    public Connection openConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void closeConnection() {
        try {
            if(!connection.isClosed()) {
                connection.close();
                connection = null;
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}