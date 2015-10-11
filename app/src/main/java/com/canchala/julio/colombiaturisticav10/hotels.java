package com.canchala.julio.colombiaturisticav10;

/**
 * Created by Julio on 05/10/2015.
 */
public class hotels {
    private int nombrehotel;
    private String estrellas;
    private int direcc;
    private int rango;
    private int idfoto;

    public hotels(int nombrehotel, String estrellas, int direcc, int rango, int idfoto) {
        this.nombrehotel = nombrehotel;
        this.estrellas = estrellas;
        this.direcc = direcc;
        this.rango = rango;
        this.idfoto = idfoto;
    }

    public int getNombrehotel() {
        return nombrehotel;
    }

    public String getEstrellas() {
        return estrellas;
    }

    public int getDirecc() {
        return direcc;
    }

    public int getRango() {
        return rango;
    }

    public int getIdfoto() {
        return idfoto;
    }
}
