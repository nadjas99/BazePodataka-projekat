/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domenski.objekat.entiteti;

import domenski.objekat.DomenskiObjekat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nadja
 */
public class GeneralniIzvodjac extends DomenskiObjekat{
    private Long maticniBroj;
    private String tekuciRacun;
    private Long pib;
    private String ime;
    private Mesto mesto;
    private Adresa adresa;
    private Direktor direktor;

    public GeneralniIzvodjac() {
    }
    

    public GeneralniIzvodjac(Long maticniBroj, String tekuciRacun, Long pib, String ime, Mesto mesto, Adresa adresa, Direktor direktor) {
        this.maticniBroj = maticniBroj;
        this.tekuciRacun = tekuciRacun;
        this.pib = pib;
        this.ime = ime;
        this.mesto = mesto;
        this.adresa = adresa;
        this.direktor = direktor;
    }
    
    
    

    @Override
    public String getTableName() {
        return "generalni_izvodjac g"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAllColumnNames() {
        return"g.maticni_broj_izvodjaca, g.racun_tekuci.get_tekuci(), g.pib_izvodjaca,g.ime_firme_izvodjaca,g.id_mesto,g.id_ulica,g.id_direktor"; //To change body of generated methods, choose Tools | Templates.
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
         List<DomenskiObjekat> izvodjaci = new ArrayList();

        while (rs.next()) {
            long maticni = rs.getLong("maticni_broj_izvodjaca");
            String tekuci = rs.getString("g.racun_tekuci.get_tekuci()");
            long pib = rs.getLong("pib_izvodjaca");
            String ime = rs.getString("ime_firme_izvodjaca");
            
            
            GeneralniIzvodjac izvodjac = new GeneralniIzvodjac(maticni,tekuci, pib, ime, null, null,null);
            izvodjaci.add(izvodjac);
        }

        return izvodjaci;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getOrderByColumn() {
        return "g.maticni_broj_izvodjaca"; //To change body of generated methods, choose Tools | Templates.
    }

    public Long getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(Long maticniBroj) {
        this.maticniBroj = maticniBroj;
    }

    public String getTekuciRacun() {
        return tekuciRacun;
    }

    public void setTekuciRacun(String tekuciRacun) {
        this.tekuciRacun = tekuciRacun;
    }

    public Long getPib() {
        return pib;
    }

    public void setPib(Long pib) {
        this.pib = pib;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public Direktor getDirektor() {
        return direktor;
    }

    public void setDirektor(Direktor direktor) {
        this.direktor = direktor;
    }
    
}
