/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.TreeMap;
import javax.swing.ImageIcon;

/**
 *
 * @author AYALA
 */
public class Serie extends Contenido {
    
    String cadenaEmisora;
    TreeMap<Integer,Integer> temporadas;
    String rutaImagen;

    
    public Serie(int id,String nombre,String categoria,String genero,ImageIcon imagen,boolean vista,int puntuacion,String cadenaEmisora, TreeMap<Integer, Integer> temporadas) {
        super(id,nombre,categoria,genero,imagen,vista,puntuacion);
        this.cadenaEmisora = cadenaEmisora;
        this.temporadas = temporadas;
    }
    
    
    public String getCadenaEmisora() {
        return cadenaEmisora;
    }
    public String getRutaImagen() {
        return rutaImagen;
    }

    public TreeMap<Integer, Integer> getTemporadas() {
        return temporadas;
    }

    public void setCadenaEmisora(String cadenaEmisora) {
        this.cadenaEmisora = cadenaEmisora;
    }
    public void setRutaImagen(String i) {
        this.rutaImagen = i;
    }

    public void setTemporadas(TreeMap<Integer, Integer> temporadas) {
        this.temporadas = temporadas;
    }

    
    
    
        
    
    
    
}
