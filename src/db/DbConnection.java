/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Folio1040
 */
public class DbConnection {
    private static String url = "jdbc:oracle:thin:@localhost:1521/orcl";    
    private static String driverName = "oracle.jdbc.driver.OracleDriver";   
    private static String username = "c##intro";   
    private static String password = "mypassword";
    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
                con.setAutoCommit(false);
            } catch (SQLException ex) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found."); 
        }
        return con;
    }
    
    public static void commit() throws SQLException{
        con.commit();
    }
    
    public static void rollback() throws SQLException{
        con.rollback();
    }
}
