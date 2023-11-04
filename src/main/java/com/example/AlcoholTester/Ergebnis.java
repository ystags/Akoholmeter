package com.example.AlcoholTester;

public class Ergebnis {

    public static final double BIER_ALKOHOL_VOLUMEN_ANTEIL = 0.05;
    public static final double DICHTE_VON_ALKOHOL = 0.8;
    public static final double WEIN_ALKOHOL_VOLUMEN_ANTEIL = 0.12;
    public static final double KORN_ALKOHOL_VOLUMEN_ANTEIL = 0.32;
    public static final double VODKA_ALKOHOL_VOLUMEN_ANTEIL = 0.4;
    public static final double WHISKEY_ALKOHOL_VOLUMEN_ANTEIL = 0.43;
    private double verteilungsfaktor = 0.0;
    private double blutalkoholwert;

    public double getBlutalkoholwert() {
        return blutalkoholwert;
    }

    public Ergebnis(int gewicht, String geschlecht,int bier,int wein, int korn, int vodka, int whiskey) {
        berechneAlcoholWert(gewicht, geschlecht, bier,wein, korn, vodka, whiskey);
    }

    private double getRound(double number){
        return (double) Math.round(number * 100) / 100;
    }

    private static double getMasseDerAlkohol(int bier,int wein, int korn, int vodka, int whiskey){
        return (bier * BIER_ALKOHOL_VOLUMEN_ANTEIL) * DICHTE_VON_ALKOHOL
               + (wein * WEIN_ALKOHOL_VOLUMEN_ANTEIL) * DICHTE_VON_ALKOHOL
               + (korn * KORN_ALKOHOL_VOLUMEN_ANTEIL) * DICHTE_VON_ALKOHOL
               + (vodka * VODKA_ALKOHOL_VOLUMEN_ANTEIL) * DICHTE_VON_ALKOHOL
               + (whiskey * WHISKEY_ALKOHOL_VOLUMEN_ANTEIL) * DICHTE_VON_ALKOHOL;
   }

    private void getBluttAlkoholWert(int gewicht, double masseAlkohol) {
        blutalkoholwert = getRound( masseAlkohol / (gewicht * verteilungsfaktor));
    }

    public void berechneAlcoholWert(int gewicht, String geschlecht,int bier,int wein, int korn, int vodka, int whiskey ){
       double masseAlkohol = getMasseDerAlkohol(bier, wein, korn, vodka, whiskey);
       if(geschlecht != null){
           if(geschlecht.equals("male")){
               verteilungsfaktor = 0.7;
               getBluttAlkoholWert(gewicht, masseAlkohol);
           }else{
               verteilungsfaktor = 0.6;
               getBluttAlkoholWert(gewicht, masseAlkohol);
           }
       }

    }

}
