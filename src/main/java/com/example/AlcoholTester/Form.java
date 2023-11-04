package com.example.AlcoholTester;


import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class Form {

    private @PositiveOrZero(message = "Das  muss größer als 0 sein") int gewicht;
    private String geschlecht;
    private @PositiveOrZero(message = "Das  muss größer als 0 sein") int bier;
    private @PositiveOrZero(message = "Das  muss größer als 0 sein") int wein;
    private @PositiveOrZero(message = "Das  muss größer als 0 sein") int korn;
    private @PositiveOrZero(message = "Das  muss größer als 0 sein") int vodka;
    private @PositiveOrZero(message = "Das  muss größer als 0 sein") int whiskey;

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public int getBier() {
        return bier;
    }

    public void setBier(int bier) {
        this.bier = bier;
    }

    public int getWein() {
        return wein;
    }

    public void setWein(int wein) {
        this.wein = wein;
    }

    public int getKorn() {
        return korn;
    }

    public void setKorn(int korn) {
        this.korn = korn;
    }

    public int getVodka() {
        return vodka;
    }

    public void setVodka(int vodka) {
        this.vodka = vodka;
    }

    public int getWhiskey() {
        return whiskey;
    }

    public void setWhiskey(int whiskey) {
        this.whiskey = whiskey;
    }


}
