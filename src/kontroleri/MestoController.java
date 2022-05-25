/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroleri;

import db.DBBroker;
import domenski.objekat.DomenskiObjekat;
import domenski.objekat.entiteti.Adresa;
import domenski.objekat.entiteti.Mesto;
import form.FrmMesto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nadja
 */
public class MestoController {
    
    private FrmMesto frmMesto;
    DBBroker broker;

    public MestoController(FrmMesto frm) {
        frmMesto=frm;
        broker= new DBBroker();
    }
    
    public void openForm(){
        prepareForm();
        prepareFormAdresa();
        frmMesto.setVisible(true);
    }

    public void prepareForm() {
        Mesto m=new Mesto();
        DefaultTableModel tm = (DefaultTableModel) frmMesto.getTblMesta().getModel();
        List<Mesto> mesta = null;
        try {
            mesta = broker.getAll(m).stream().map(Mesto.class::cast).collect(Collectors.toList());;
        } catch (SQLException ex) {
            Logger.getLogger(MestoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        tm.setRowCount(0);
        for (Mesto mesto : mesta) {
            tm.addRow(new Object[]{mesto.getId(),mesto.getNaziv()});
        }
        frmMesto.getCmbMesta().removeAllItems();
        for (Mesto mesto : mesta) {
            frmMesto.getCmbMesta().addItem(mesto);
        }
    }

    public void saveMesto() {
        Mesto m;
        m = new Mesto(Long.parseLong(frmMesto.getTxtID().getText()), frmMesto.getTxtName().getText());
        try {
            broker.insert(m);
            JOptionPane.showMessageDialog(null, "Uspesno ste sacuvali mesto", "Success", JOptionPane.INFORMATION_MESSAGE);
            prepareForm();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(MestoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveAdresa() {
        Adresa adresa=new Adresa();
        adresa.setIdUlica(Long.parseLong(frmMesto.getTxtIDUlica().getText()));
        adresa.setMesto((Mesto)frmMesto.getCmbMesta().getSelectedItem());
        adresa.setNazivUlice(frmMesto.getTxtNazivUlice().getText());
        adresa.setBroj(Integer.parseInt(frmMesto.getTxtBroj().getText()));
        
        try {
            broker.insert(adresa);
            JOptionPane.showMessageDialog(null, "Uspesno ste sacuvali adresu", "Success", JOptionPane.INFORMATION_MESSAGE);            
            prepareFormAdresa();
        } catch (SQLException ex) {
            Logger.getLogger(MestoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private void prepareFormAdresa() {
        DefaultTableModel tbl= (DefaultTableModel) frmMesto.getTblAdresa().getModel();
        List<Adresa> adrese=null;
        try {
            adrese=broker.getAll(new Adresa()).stream().map(Adresa.class::cast).collect(Collectors.toList());
        } catch (SQLException ex) {
            Logger.getLogger(MestoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        tbl.setRowCount(0);
        for (Adresa adresa : adrese) {
            tbl.addRow(new Object[]{adresa.getMesto().getId(),adresa.getNazivUlice(),adresa.getBroj(),adresa.getNazivMesta()});
        }
    }

    public void updateMesto() {
        DefaultTableModel tm = (DefaultTableModel) frmMesto.getTblMesta().getModel();
        List<Mesto> mesta = new ArrayList();
        for (int i = 0; i<tm.getRowCount(); i++) {
            Mesto m = new Mesto(Long.parseLong(String.valueOf(tm.getValueAt(i, 0))), String.valueOf(tm.getValueAt(i, 1)));
            mesta.add(m);
        }
        for (Mesto mesto : mesta) {
            try {
                broker.update(mesto);
                 
            } catch (SQLException ex) {
                Logger.getLogger(MestoController.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Uspesno ste izmenili mesto", "Success", JOptionPane.INFORMATION_MESSAGE); 
        prepareForm();
        prepareFormAdresa();
        
    }

    
    
}
