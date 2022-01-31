/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import db.DBBroker;
import db.DbConnection;
import domenski.objekat.entiteti.GeneralniIzvodjac;
import form.FrmGeneralniIzvodjac;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.Normalizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import kontroleri.GeneralniIzvodjacController;

/**
 *
 * @author Nadja
 */
public class Projekat_bazepodataka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneralniIzvodjacController con=new GeneralniIzvodjacController(new FrmGeneralniIzvodjac());
        con.openForm();
    }
    
}
