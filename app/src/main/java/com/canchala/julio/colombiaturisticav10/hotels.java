package com.canchala.julio.colombiaturisticav10;

/**
 * Created by Julio on 05/10/2015.
 */
public class hotels {
    private String nombrehotel;
    private String estrellas;
    private String direcc;
    private String rango;
    private int idfoto;

    public hotels(String nombrehotel, String estrellas, String direcc, String rango, int idfoto) {
        this.nombrehotel = nombrehotel;
        this.estrellas = estrellas;
        this.direcc = direcc;
        this.rango = rango;
        this.idfoto = idfoto;
    }

    public String getNombrehotel() {
        return nombrehotel;
    }

    public String getEstrellas() {
        return estrellas;
    }

    public String getDirecc() {
        return direcc;
    }

    public String getRango() {
        return rango;
    }

    public int getIdfoto() {
        return idfoto;
    }
}
