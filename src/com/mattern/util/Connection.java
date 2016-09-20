package com.mattern.util;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author smattern.
 */
public class Connection {

    private java.sql.Connection conn;

    /**
     * Get defined database connection.
     *
     * @return the database connection
     */
    public java.sql.Connection getConection() {
        return conn;
    }

    /**
     * Define and open a database connection.
     */
    public void beginConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            conn = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/SENDatabase?user=dev&password=dev&useSSL=false");
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * Close database connection.
     */
    public void endConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
