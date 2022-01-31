/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroleri;

import db.DBBroker;
import domenski.objekat.entiteti.GeneralniIzvodjac;
import form.FrmGeneralniIzvodjac;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.table.TableModel;
import table.model.view.TableModelGeneralniIzvodjac;

/**
 *
 * @author Nadja
 */
public class GeneralniIzvodjacController {
    private FrmGeneralniIzvodjac frmGeneralniIzvodjac;
    DBBroker broker=null;
    List<GeneralniIzvodjac> izvodjaci;

    public GeneralniIzvodjacController(FrmGeneralniIzvodjac frm) {
        this.frmGeneralniIzvodjac=frm;
        broker = new DBBroker();
    }
    
    public void openForm() {
        prepareForm();
        frmGeneralniIzvodjac.setVisible(true);
    }

    public void prepareForm() {
        GeneralniIzvodjac g=new GeneralniIzvodjac();
        try {
            izvodjaci=broker.getAll(g).stream().map(GeneralniIzvodjac.class::cast).collect(Collectors.toList());
            frmGeneralniIzvodjac.getTblIzvodjaci().setModel(new TableModelGeneralniIzvodjac((ArrayList<GeneralniIzvodjac>) izvodjaci));
            
        } catch (SQLException ex) {
            Logger.getLogger(GeneralniIzvodjacController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
}
