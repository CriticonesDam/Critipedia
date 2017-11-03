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
//Cambio lo del abtrasct por que en verdad si queremos que se pueda instanciar, para luego tener una lista de Contenidos
//Sin tener que especificar si es serie o pelicula
public class Contenido {
    
    
    private int id;
    private String nombre;
    private String categoria;
    private String genero;
    private ImageIcon imagen;
    private boolean vista;
    private int puntuacion;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getGenero() {
        return genero;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public boolean isVista() {
        return vista;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Contenido(int id, String nombre, String categoria,String genero, ImageIcon imagen, boolean vista, int puntuacion) {
        this.id = id;
        this.nombre = nombre;
        this.categoria=categoria;
        this.genero = genero;
        this.imagen = imagen;
        this.vista = vista;
        this.puntuacion = puntuacion;
    }
    
    
    
    
    
    
}
