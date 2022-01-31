/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.model.view;

import domenski.objekat.entiteti.GeneralniIzvodjac;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nadja
 */
public class TableModelGeneralniIzvodjac extends AbstractTableModel{
    private final String[] columnNames = {"MATICNI_BROJ", "Tekuci racun", "PIB", "Ime", "Mesto","Adresa","Direktor"};
    private final Class[] columnClasses = {Long.class, Long.class, String.class, String.class, Integer.class};
    private ArrayList<GeneralniIzvodjac> izvodjaci;

    public TableModelGeneralniIzvodjac(ArrayList<GeneralniIzvodjac> izvodjaci) {
        this.izvodjaci = izvodjaci;
    }
    

    @Override
    public int getRowCount() {
     return izvodjaci.size();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column]; //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GeneralniIzvodjac izvodjac = this.izvodjaci.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return izvodjac.getMaticniBroj();
            case 1:
                return izvodjac.getTekuciRacun();
            case 2:
                return izvodjac.getPib();
            case 3:
                return izvodjac.getIme();
            case 4:
                return izvodjac.getMesto();
            case 5: 
                return izvodjac.getAdresa();
            case 6:
                return izvodjac.getDirektor();
            default:
                return "N/A";
        } //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setIzvodjaci(ArrayList<GeneralniIzvodjac> izvodjaci){
        this.izvodjaci=izvodjaci;
        fireTableDataChanged();}
    
     public GeneralniIzvodjac getIzvodjac(int index){
         return this.izvodjaci.get(index);
     }
         
    
    
    
}
