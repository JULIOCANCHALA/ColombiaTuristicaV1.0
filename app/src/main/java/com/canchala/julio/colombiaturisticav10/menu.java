package com.canchala.julio.colombiaturisticav10;

/**
 * Created by Julio on 04/10/2015.
 */
public class menu {
    private int idimagen;
    private int titulo;
    private int subtitulo;
    private  int idcolor;



    public menu(int idimagen, int titulo, int subtitulo, int idcolor) {
        this.idimagen = idimagen;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.idcolor=idcolor;
    }



    public int getIdimagen() {
        return idimagen;
    }

    public int getTitulo() {

        return titulo;
    }

    public int getSubtitulo() {
        return subtitulo;
    }

    public int getIdcolor() {
        return idcolor;
    }
}

