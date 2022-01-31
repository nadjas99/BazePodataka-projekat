/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import db.DbConnection;
import java.sql.Connection;

/**
 *
 * @author Nadja
 */
public class Projekat_bazepodataka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = DbConnection.getConnection();
    }
    
}
