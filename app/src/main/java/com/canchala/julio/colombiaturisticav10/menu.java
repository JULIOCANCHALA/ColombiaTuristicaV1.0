package com.canchala.julio.colombiaturisticav10;

/**
 * Created by Julio on 04/10/2015.
 */
public class menu {
    private int idimagen;
    private String titulo;
    private String subtitulo;
    private  int idcolor;



    public menu(int idimagen, String titulo, String subtitulo, int idcolor) {
        this.idimagen = idimagen;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.idcolor=idcolor;
    }



    public int getIdimagen() {
        return idimagen;
    }

    public String getTitulo() {

        return titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public int getIdcolor() {
        return idcolor;
    }
}

