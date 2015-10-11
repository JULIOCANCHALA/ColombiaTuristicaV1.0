package com.canchala.julio.colombiaturisticav10;

/**
 * Created by Julio on 05/10/2015.
 */
public class bar {
    private int nbar;
    private int tbar;
    private int dirc;
    private int tj;
    private int idfotobar1;
    private int idfotobar2;

    public bar(int nbar, int tbar, int dirc, int tj, int idfotobar1, int idfotobar2) {
        this.nbar = nbar;
        this.tbar = tbar;
        this.dirc = dirc;
        this.tj = tj;
        this.idfotobar1 = idfotobar1;
        this.idfotobar2 = idfotobar2;
    }

    public int getNbar() {
        return nbar;
    }

    public int getTbar() {
        return tbar;
    }

    public int getDirc() {
        return dirc;
    }

    public int getTj() {
        return tj;
    }

    public int getIdfotobar1() {
        return idfotobar1;
    }

    public int getIdfotobar2() {
        return idfotobar2;
    }
}
