package com.canchala.julio.colombiaturisticav10;

/**
 * Created by Julio on 05/10/2015.
 */
public class bar {
    private String nbar;
    private String tbar;
    private String dirc;
    private String tj;
    private int idfotobar1;
    private int idfotobar2;

    public bar(String nbar, String tbar, String dirc, String tj, int idfotobar1, int idfotobar2) {
        this.nbar = nbar;
        this.tbar = tbar;
        this.dirc = dirc;
        this.tj = tj;
        this.idfotobar1 = idfotobar1;
        this.idfotobar2 = idfotobar2;
    }

    public String getNbar() {
        return nbar;
    }

    public String getTbar() {
        return tbar;
    }

    public String getDirc() {
        return dirc;
    }

    public String getTj() {
        return tj;
    }

    public int getIdfotobar1() {
        return idfotobar1;
    }

    public int getIdfotobar2() {
        return idfotobar2;
    }
}
