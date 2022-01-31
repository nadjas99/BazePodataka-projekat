/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domenski.objekat.entiteti;

import domenski.objekat.DomenskiObjekat;
import java.sql.Date;
;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Nadja
 */
public class PonudaDodatno extends DomenskiObjekat{
    private Long id;
    private GeneralniIzvodjac izvodjac;
    private Podizvodjac podizvodjac;
    private Date rok;
    private Date datum;
    private String ukupnaVrednost;

    public PonudaDodatno() {
    }

    public PonudaDodatno(Long id, GeneralniIzvodjac izvodjac, Podizvodjac podizvodjac, Date rok, Date datum, String ukupnaVrednost) {
        this.id = id;
        this.izvodjac = izvodjac;
        this.podizvodjac = podizvodjac;
        this.rok = rok;
        this.datum = datum;
        this.ukupnaVrednost = ukupnaVrednost;
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

    public Date getRok() {
        return rok;
    }

    public void setRok(Date rok) {
        this.rok = rok;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getUkupnaVrednost() {
        return ukupnaVrednost;
    }

    public void setUkupnaVrednost(String ukupnaVrednost) {
        this.ukupnaVrednost = ukupnaVrednost;
    }
    
}
