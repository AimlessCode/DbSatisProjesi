package com.emin.repository.entity;

public class Musteri {
    long id;
    String ad;
    String soyad;
    String tckimlik;
    String firmaadi;
    String verginumarasi;
    String vergidairesi;
    String adres;
    String profilephoto;
    String telefon;
    String email;
    double borclimiti;
    boolean musteritipi;
    int state;

    public Musteri() {

    }

    public Musteri(long id, String ad, String soyad, String tckimlik, String firmaadi, String verginumarasi, String vergidairesi, String adres, String profilephoto, String telefon, String email, double borclimiti, boolean musteritipi, int state) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tckimlik = tckimlik;
        this.firmaadi = firmaadi;
        this.verginumarasi = verginumarasi;
        this.vergidairesi = vergidairesi;
        this.adres = adres;
        this.profilephoto = profilephoto;
        this.telefon = telefon;
        this.email = email;
        this.borclimiti = borclimiti;
        this.musteritipi = musteritipi;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTckimlik() {
        return tckimlik;
    }

    public void setTckimlik(String tckimlik) {
        this.tckimlik = tckimlik;
    }

    public String getFirmaadi() {
        return firmaadi;
    }

    public void setFirmaadi(String firmaadi) {
        this.firmaadi = firmaadi;
    }

    public String getVerginumarasi() {
        return verginumarasi;
    }

    public void setVerginumarasi(String verginumarasi) {
        this.verginumarasi = verginumarasi;
    }

    public String getVergidairesi() {
        return vergidairesi;
    }

    public void setVergidairesi(String vergidairesi) {
        this.vergidairesi = vergidairesi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getProfilephoto() {
        return profilephoto;
    }

    public void setProfilephoto(String profilephoto) {
        this.profilephoto = profilephoto;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBorclimiti() {
        return borclimiti;
    }

    public void setBorclimiti(double borclimiti) {
        this.borclimiti = borclimiti;
    }

    public boolean isMusteritipi() {
        return musteritipi;
    }

    public void setMusteritipi(boolean musteritipi) {
        this.musteritipi = musteritipi;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tckimlik='" + tckimlik + '\'' +
                ", firmaadi='" + firmaadi + '\'' +
                ", verginumarasi='" + verginumarasi + '\'' +
                ", vergidairesi='" + vergidairesi + '\'' +
                ", adres='" + adres + '\'' +
                ", profilephoto='" + profilephoto + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", borclimiti=" + borclimiti +
                ", musteritipi=" + musteritipi +
                ", state=" + state +
                '}';
    }
}
