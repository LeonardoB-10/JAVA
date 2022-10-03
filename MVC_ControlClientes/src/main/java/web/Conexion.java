/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author VINICIO BORJA
 */
public class Conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/almacen?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    private static BasicDataSource dataSourse;

    public static DataSource getDataSource() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        if (dataSourse == null) {
            dataSourse = new BasicDataSource();
            dataSourse.setUrl(JDBC_URL);
            dataSourse.setUsername(JDBC_USER);
            dataSourse.setPassword(JDBC_PASSWORD);
            dataSourse.setInitialSize(50);
        }
        return dataSourse;
    }

//    public static DataSource getDataSource() {
//        BasicDataSource ds = new BasicDataSource();
//        ds.setUrl(JDBC_URL);
//        ds.setUsername(JDBC_USER);
//        ds.setPassword(JDBC_PASSWORD);
//        ds.setInitialSize(50);
//        return ds;
//    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
        
        
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection coon) {
        try {
            coon.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
