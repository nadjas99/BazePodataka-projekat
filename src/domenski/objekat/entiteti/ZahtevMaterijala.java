/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domenski.objekat.entiteti;

import domenski.objekat.DomenskiObjekat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nadja
 */
public class ZahtevMaterijala extends DomenskiObjekat{
    private Long id;
    private GeneralniIzvodjac izvodjac;
    private Podizvodjac podizvodjac;
    private Long brojRevizije;
    private Date datum;
    private Status status;
    private String vrednostStatusa;
    private Long jmbg;

    public ZahtevMaterijala(Long id, GeneralniIzvodjac izvodjac, Podizvodjac podizvodjac, Long brojRevizije, Date datum, Status status, String vrednostStatusa, Long jmbg) {
        this.id = id;
        this.izvodjac = izvodjac;
        this.podizvodjac = podizvodjac;
        this.brojRevizije = brojRevizije;
        this.datum = datum;
        this.status = status;
        this.vrednostStatusa = vrednostStatusa;
        this.jmbg = jmbg;
    }

    public ZahtevMaterijala() {
    }
    
    

    @Override
    public String getTableName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAllColumnNames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInsertColumnNames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUpdateClause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getWhereIdClause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUpdateWhereClause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDeleteWhereClause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DomenskiObjekat> getObjectsFromResultSet(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getOrderByColumn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GeneralniIzvodjac getIzvodjac() {
        return izvodjac;
    }

    public void setIzvodjac(GeneralniIzvodjac izvodjac) {
        this.izvodjac = izvodjac;
    }

    public Podizvodjac getPodizvodjac() {
        return podizvodjac;
    }

    public void setPodizvodjac(Podizvodjac podizvodjac) {
        this.podizvodjac = podizvodjac;
    }

    public Long getBrojRevizije() {
        return brojRevizije;
    }

    public void setBrojRevizije(Long brojRevizije) {
        this.brojRevizije = brojRevizije;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getVrednostStatusa() {
        return vrednostStatusa;
    }

    public void setVrednostStatusa(String vrednostStatusa) {
        this.vrednostStatusa = vrednostStatusa;
    }

    public Long getJmbg() {
        return jmbg;
    }

    public void setJmbg(Long jmbg) {
        this.jmbg = jmbg;
    }
    
}
