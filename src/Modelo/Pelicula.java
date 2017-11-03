/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author AYALA
 */
public class Pelicula extends Contenido {
    
    private String director;
    private String año;
    private String[] actores;
    
    
    public Pelicula(int id, String nombre, String categoria, String genero, ImageIcon imagen, boolean vista, int puntuacion,String director,String año,String[] actores) {
        super(id, nombre, categoria, genero, imagen, vista, puntuacion);
        this.director=director;
        this.año=año;
        this.actores=actores;
    }

    public String getDirector() {
        return director;
    }

    public String getAño() {
        return año;
    }

    public String[] getActores() {
        return actores;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }
    
    
    
}
