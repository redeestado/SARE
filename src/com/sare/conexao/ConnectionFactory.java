package com.sare.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public static Connection getConnection() {
        try {

			Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(
          "jdbc:postgresql://localhost:5432/SARE", "postgres", "rede2016estado");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
