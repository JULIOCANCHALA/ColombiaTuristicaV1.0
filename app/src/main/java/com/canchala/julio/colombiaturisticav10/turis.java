package com.canchala.julio.colombiaturisticav10;

/**
 * Created by Julio on 05/10/2015.
 */
public class turis {
    private int lugar;
    private int Subname;
    private int infturis;
    private int idtu1;
    private int idtu2;
    private int idtu3;

    public turis(int lugar, int subname, int infturis, int idtu1, int idtu2, int idtu3) {
        this.lugar = lugar;
        Subname = subname;
        this.infturis = infturis;
        this.idtu1 = idtu1;
        this.idtu2 = idtu2;
        this.idtu3 = idtu3;
    }

    public int getLugar() {
        return lugar;
    }

    public int getSubname() {
        return Subname;
    }

    public int getInfturis() {
        return infturis;
    }

    public int getIdtu1() {
        return idtu1;
    }

    public int getIdtu2() {
        return idtu2;
    }

    public int getIdtu3() {
        return idtu3;
    }
}
