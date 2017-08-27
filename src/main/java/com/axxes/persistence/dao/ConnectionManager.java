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

    public Connection openConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}