/*
 */
package com.sample.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class DbConnection {

    Logger logger = Logger.getLogger(this.getClass().getName());

    private static final String URL = "jdbc:mysql://localhost:3306/retailshop";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String DRIVERNAME = "com.mysql.cj.jdbc.Driver";

    static Connection con;

    private DbConnection() {
    }

    public static Connection getConnection() {
        try {
            if (con == null) {
                Class.forName(DRIVERNAME);
                con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("getConnection: " + e.toString());
        }
        return con;
    }

}
