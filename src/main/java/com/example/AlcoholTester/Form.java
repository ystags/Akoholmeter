package com.example.AlcoholTester;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Form {

    private @Min(value = 0, message = "Das  muss größer als 0 sein") @NotNull(message = "Das darf nicht leer sein") int gewicht;
    private @NotBlank String geschlecht;
    private @Min(value = 0, message = "Das  muss größer als 0 sein")  @NotNull(message = "Das darf nicht leer sein") int bier;
    private @Min(value = 0, message = "Das  muss größer als 0 sein")  @NotNull(message = "Das darf nicht leer sein") int wein;
    private @Min(value = 0, message = "Das  muss größer als 0 sein")  @NotNull(message = "Das darf nicht leer sein") int korn;
    private @Min(value = 0, message = "Das  muss größer als 0 sein")  @NotNull(message = "Das darf nicht leer sein") int vodka;
    private @Min(value = 0, message = "Das  muss größer als 0 sein")  @NotNull(message = "Das darf nicht leer sein") int whiskey;

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
