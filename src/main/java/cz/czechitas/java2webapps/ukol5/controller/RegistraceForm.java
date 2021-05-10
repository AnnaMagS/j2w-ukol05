package cz.czechitas.java2webapps.ukol5.controller;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.EnumSet;

public class RegistraceForm {

    @NotEmpty
    private String jmeno;
    @NotEmpty
    private String prijmeni;
    @NotEmpty
    private String vek;
    @NotNull
    private Pohlavi pohlavi;
    @NotNull
    private Sport sport;
    @NotEmpty
    private String turnus;
    private String email;
    private String telefon;



    private EnumSet<Sport>vyber;


    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }


    public String getVek() {
        return vek;
    }

    public void setVek(String vek) {
        this.vek = vek;
    }

    /*public void setVek(String vek) {
        this.vek = LocalDate.parse(vek);
    }*/

    public Pohlavi getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(Pohlavi pohlavi) {
        this.pohlavi = pohlavi;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public String getTurnus() {
        return turnus;
    }

    public void setTurnus(String turnus) {
        this.turnus = turnus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public EnumSet<Sport> getVyber() {
        return vyber;
    }

    public void setVyber(EnumSet<Sport> vyber) {
        this.vyber = vyber;
    }
}
