/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class SQLdb {
    
    String driver="com.mysql.jdbc.Driver";
    String ruta="jdbc:mysql://172.16.12.6:3306/critipedia";
    String usuario="root";
    String contraseña="segundoDam";
    String rutaFTP="";
    Connection con;
    Statement s;
    PreparedStatement a;
    
    public SQLdb() throws ClassNotFoundException, SQLException{
        
        
            Class.forName(driver);
            con=DriverManager.getConnection(ruta, usuario,contraseña);
            s=con.createStatement();
            
            
           
  
        
        
    }
    
        //Funciona
    private TreeMap<Integer,Integer> getTemporadas(int id,String serie) throws SQLException{
        
        ResultSet rs=s.executeQuery("SELECT * FROM temporadas WHERE id_serie="+id+" AND nombre_serie='"+serie+"'");
        TreeMap<Integer,Integer> a=new TreeMap<>();
        while(rs.next()){
            
            a.put(rs.getInt(3),rs.getInt(4));
        }
            
        rs.close();
        return a;
        
        
    }
    
    //Funciona
    public ArrayList<Serie> getSeries() throws SQLException{
        
        ResultSet rs=s.executeQuery("SELECT id,nombre FROM series");
        ArrayList<Serie> a=new ArrayList<>();
        ArrayList<Integer> iden=new ArrayList<>();
        ArrayList<String> nom=new ArrayList<>();
        
        
        if (!rs.next()){
            System.out.println("No hay Series");
        }
        else{
            do{
                iden.add(rs.getInt(1));
                nom.add(rs.getString(2));
                
                
            }while(rs.next());
            for (int cont=0;cont<iden.size();cont++){
                a.add(getSeries (iden.get(cont),nom.get(cont)));
            }
        }
        rs.close();
            return a;
        }
        
    
    
    //Fuciona
    public Serie getSeries(int id, String nombre) throws SQLException{ //Devuelve una serie en concreto
        
        ResultSet rs=s.executeQuery("SELECT * FROM series WHERE id="+id+" AND nombre='"+nombre+"'");
        Serie a=new Serie(0,null,null,null,null,false,0,null,null);
        if (!rs.next()){
               System.out.println("Error, no hay columnas en esta serie");
               return a;
           }
        else{
        
           a.setId(rs.getInt(1));
           a.setNombre(rs.getString(2));
           a.setCategoria(rs.getString(3));
           a.setGenero(rs.getString(4));
           a.setRutaImagen(rs.getString(5));
           a.setVista(rs.getBoolean(6));
           a.setPuntuacion(rs.getInt(7));
           a.setCadenaEmisora(rs.getString(8));
           a.setTemporadas(getTemporadas(a.getId(),a.getNombre()));
     
           rs.close();
           return a;
        }
    }
   
  
    //Funciona
     public ArrayList<Serie> getSeries(String nombreUsu) throws SQLException{
       
       ArrayList<Serie> a=new ArrayList<>();
       ArrayList<Integer> ids=new ArrayList<>();
       ArrayList<String> noms=new ArrayList<>();
       
       ResultSet rs=s.executeQuery("SELECT id_serie,suscritoa FROM subscripciones_series WHERE nombreusu='"+nombreUsu+"'");
       
       if (!rs.next()){
           System.out.println("Error, no hay series del usuario "+nombreUsu);
       }
       else{
           do{
               
               ids.add(rs.getInt(1));
               noms.add(rs.getString(2));
               
           }while(rs.next());
           for (int cont=0;cont<ids.size();cont++){
               a.add(getSeries(ids.get(cont),noms.get(cont)));
           }
       }
       rs.close();
       return a;
       
        
    }
     
     //Funciona
     public String[] getActores(int id,String peli) throws SQLException{
        
        ResultSet rs=s.executeQuery("SELECT nombre_actor FROM actores WHERE id_pelicula="+id+" AND nombre_pelicula='"+peli+"'");
        String cad="";
        while(rs.next())
        {
            cad+=rs.getString(1)+",";
        }
        rs.close();
        return cad.split(",");
    }
     //Funciona
     public Pelicula getPeliculas(int id, String nombre) throws SQLException{
         
          ResultSet rs=s.executeQuery("SELECT * FROM peliculas WHERE id="+id+" AND nombre='"+nombre+"'");
        Pelicula a=new Pelicula(0,null,null,null,null,false,0,null,0,null);
        if (!rs.next()){
               System.out.println("Error, no hay columnas en la pelicula");
               return a;
           }
        else{
        
           a.setId(rs.getInt(1));
           a.setNombre(rs.getString(2));
           a.setCategoria(rs.getString(3));
           a.setGenero(rs.getString(4));
           a.setImagen(new ImageIcon(rs.getString(5)));
           a.setVista(rs.getBoolean(6));
           a.setPuntuacion(rs.getInt(7));
           a.setDirector(rs.getString(8));
           a.setAño(rs.getInt(9));
           a.setActores(getActores(a.getId(),a.getNombre()));
     
           rs.close();
           return a;
        }
     }
     
     //Funciona
     public ArrayList<Pelicula> getPeliculas() throws SQLException{
         
         ResultSet rs=s.executeQuery("SELECT id,nombre FROM peliculas");
        ArrayList<Pelicula> a=new ArrayList<>();
        ArrayList<Integer> iden=new ArrayList<>();
        ArrayList<String> nom=new ArrayList<>();
        
        
        if (!rs.next()){
            System.out.println("No hay Peliculas");
        }
        else{
            do{
                iden.add(rs.getInt(1));
                nom.add(rs.getString(2));
                
                
            }while(rs.next());
            for (int cont=0;cont<iden.size();cont++){
                a.add(getPeliculas (iden.get(cont),nom.get(cont)));
            }
        }
        rs.close();
            return a;
         
     }
    
     //Funciona
    public ArrayList<Pelicula> getPeliculas(String nombreUsu) throws SQLException{
        
        ArrayList<Pelicula> a=new ArrayList<>();
       ArrayList<Integer> ids=new ArrayList<>();
       ArrayList<String> noms=new ArrayList<>();
       
       ResultSet rs=s.executeQuery("SELECT id_pelicula,nombre_pelicula FROM subscripciones_peliculas WHERE nombreusu='"+nombreUsu+"'");
       
       if (!rs.next()){
           System.out.println("Error, no hay columnas del usuario "+nombreUsu);
       }
       else{
           do{
               
               ids.add(rs.getInt(1));
               noms.add(rs.getString(2));
               
           }while(rs.next());
           for (int cont=0;cont<ids.size();cont++){
               a.add(getPeliculas(ids.get(cont),noms.get(cont)));
           }
       }
       rs.close();
       return a;
        
    }
    
    //Funciona
    public ArrayList<Contenido> getContenido(String nombreUsu) throws SQLException{
        
        ArrayList<Contenido> a=new ArrayList<>();
       ArrayList<Serie> s=getSeries(nombreUsu);
       ArrayList<Pelicula> p=getPeliculas(nombreUsu);
       
       for (Serie e: s){
           a.add(e);
       }
       for (Pelicula e:p){
           a.add(e);
       }
       
        return a;
    }
    //Funciona
    public ArrayList<Usuario> getSeguidos(String nombreUsuario) throws SQLException{
        
        ArrayList<Usuario> a=new ArrayList<>();
        ArrayList<String> sus=new ArrayList<>();
        
        ResultSet rs=s.executeQuery("SELECT siguea FROM seguidos WHERE nombreusu='"+nombreUsuario+"'");
        
        while(rs.next()){
            sus.add(rs.getString(1));
        }
        for (String c:sus){
            a.add(getUsuarioBD(c));
        }
        rs.close();
        return a;
    }
    //Funciona
    public ArrayList<Usuario> getSeguidores(String nombreUsuario) throws SQLException{
        
        ArrayList<Usuario> a=new ArrayList<>();
        ArrayList<String> sus=new ArrayList<>();
        
        ResultSet rs=s.executeQuery("SELECT seguidor FROM seguidores WHERE nombreusu='"+nombreUsuario+"'");
        
        while(rs.next()){
            sus.add(rs.getString(1));
        }
        for (String c:sus){
            a.add(getUsuarioBD(c));
        }
        rs.close();
        return a;
    }
    
    
    //Funciona
    private Usuario getUsuarioBD(String nombre) throws SQLException{
        
        Usuario a=new Usuario(0,null,null,null,null,null,null,null,null,null);
        
        ResultSet rs=s.executeQuery("SELECT * FROM usuarios WHERE nombre='"+nombre+"'");
        
        if (!rs.next()){
            System.out.println("No existe el usuario");
        }
        else{
           
                
                a.setId(rs.getInt(1));
                a.setNombre(rs.getString(2));
                a.setContraseña(rs.getString(3));
                a.setEmail(rs.getString(4));
                a.setAvatar(new ImageIcon(rs.getString(5)));
                a.setFechaRegistro(rs.getDate(6));
                a.setFechaNacimiento(rs.getDate(7));
                a.setSeguidores(new ArrayList<>());
                a.setSeguidos(new ArrayList<>());
                a.setSubscripciones(getContenido(a.getNombre()));
 
        }
        rs.close();
        return a;
        
    }
    
    public Usuario getUsuarios(String nombre) throws SQLException{
        Usuario a;
        a=getUsuarioBD(nombre);
        a.setSeguidores(getSeguidores(nombre));
        a.setSeguidos(getSeguidos(nombre));
        a.setSubscripciones(getContenido(nombre));
        return a;
        
    }
    
    //Funciona
    public ArrayList<Usuario> getUsuarios() throws SQLException{
        
        ArrayList<Usuario> a= new ArrayList<>();
        ArrayList<String> n=new ArrayList<>();int con=0;
        ResultSet rs=s.executeQuery("SELECT nombre FROM usuarios");

        while(rs.next()){
            n.add(rs.getString(1));
        }
        rs.close();
        for (String c: n){
            Usuario u=getUsuarioBD(c);
            u.setSeguidores(getSeguidores(u.getNombre()));
            u.setSeguidos(getSeguidos(u.getNombre()));
            a.add(u);
            
        }
        return a;
    }
    
    //Setters
    
    
    //Funciona
    private boolean setTemporadas(Serie s) throws SQLException{
        
        TreeMap<Integer,Integer> cps=s.getTemporadas();
        int cont=0;
        PreparedStatement p;
        
         Collection c = cps.values();   
        Iterator itr = c.iterator();
        while(itr.hasNext()){
            
            p = con.prepareStatement("INSERT INTO temporadas VALUES (?,?,?,?)");
            p.setInt(1,s.getId());
            p.setString(2,s.getNombre());
            cont++;
            p.setInt(3,cont);
            p.setInt(4, (int)itr.next());
            p.executeUpdate();
            
        }
        return true;
   }
    
    public String getImagen(String nombre){
        return rutaFTP+"\\"+nombre;
    }
    
    
    public void setSerie(Serie e,String rutaImagen) throws SQLException{
        
        PreparedStatement p=con.prepareStatement("INSERT INTO series VALUES (?,?,?,?,?,?,?,?)");
        int cont=1;
        p.setInt(cont, e.getId());
        cont++;
        p.setString(cont, e.getNombre());
        cont++;
        p.setString(cont, e.getCategoria());
        cont++;
        p.setString(cont, e.getGenero());
        cont++;
        p.setString(cont, rutaImagen);
        cont++;
        p.setBoolean(cont,e.isVista());
        cont++;
        p.setInt(cont, e.getPuntuacion());
        cont++;
        p.setString(cont, e.getCadenaEmisora());
        cont++;
        p.executeUpdate();
        
        setTemporadas(e);
        
    }
    
    public void setActores(Pelicula p) throws SQLException{
        
        String[] act=p.getActores();
        PreparedStatement ps;
        
        for (String c: act){
            ps=con.prepareStatement("INSERT INTO actores (id_pelicula,nombre_pelicula,nombre_actor) VALUES (?,?,?)");
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNombre());
            ps.setString(3,c);
            ps.executeUpdate();
        }
        
    }
    //Funciona
    public void setPelicula(Pelicula e,String rutaImagen) throws SQLException{
        
        PreparedStatement p=con.prepareStatement("INSERT INTO peliculas VALUES (?,?,?,?,?,?,?,?,?)");
        int cont=1;
        p.setInt(cont, e.getId());
        cont++;
        p.setString(cont, e.getNombre());
        cont++;
        p.setString(cont, e.getCategoria());
        cont++;
        p.setString(cont, e.getGenero());
        cont++;
        p.setString(cont, rutaImagen);
        cont++;
        p.setBoolean(cont,e.isVista());
        cont++;
        p.setInt(cont, e.getPuntuacion());
        cont++;
        p.setString(cont, e.getDirector());
        cont++;
        p.setInt(cont, e.getAño());
        cont++;
        
        p.executeUpdate();
        
        setActores(e);
    }
    
  //Funciona
    public void setSeguidores(Usuario u) throws SQLException{
        
        PreparedStatement p;
        
        ArrayList<Usuario> seg=u.getSeguidores();
        
        for (Usuario e: seg){
            p=con.prepareStatement("INSERT INTO seguidores VALUES (?,?)");
            
            p.setString(1, u.getNombre());
            p.setString(2, e.getNombre());
            p.executeUpdate();
            
            p=con.prepareStatement("INSERT INTO seguidos VALUES (?,?)");
            
            p.setString(1, e.getNombre());
            p.setString(2, u.getNombre());
            p.executeUpdate();
        }
        
                
    }
    //Funciona
    public void setSeguidos(Usuario u) throws SQLException{
        
        PreparedStatement p;
        
        ArrayList<Usuario> seg=u.getSeguidos();
        
        for (Usuario e: seg){
            p=con.prepareStatement("INSERT INTO seguidos VALUES (?,?)");
            
            p.setString(1, u.getNombre());
            p.setString(2, e.getNombre());
            p.executeUpdate();
            
            p=con.prepareStatement("INSERT INTO seguidores VALUES (?,?)");
            
            p.setString(1, e.getNombre());
            p.setString(2, u.getNombre());
            p.executeUpdate();
        }
        
                
    }
    
    
    //Funciona
    public void setContenido(Usuario u) throws SQLException{
        
        PreparedStatement p,p2;
        
        ArrayList<Contenido> ser=u.getSubscripciones();
        
        for (Contenido c: ser){
            
            if (c instanceof Serie){
                p=con.prepareStatement("INSERT INTO subscripciones_series VALUES (?,?,?)");
                p.setString(1,u.getNombre());
                p.setInt(2,c.getId());
                p.setString(3,c.getNombre());
        
                p.executeUpdate();
            }
            else if (c instanceof Pelicula){
                p2=con.prepareStatement("INSERT INTO subscripciones_peliculas VALUES (?,?,?)");
                p2.setString(1,u.getNombre());
                p2.setInt(2,c.getId());
                p2.setString(3,c.getNombre());
        
                p2.executeUpdate();
            }
            
        }
    }
    
   
    
    
    
    //Funciona
    public void setUsuario(Usuario u) throws SQLException{
        
        PreparedStatement p=con.prepareStatement("INSERT INTO usuarios (nombre,pass,email,imagen,fechReg,fechNac,nombre_xml_criticas) VALUES (?,?,?,?,?,?,?)");
        
        int cont=1;
        
        p.setString(cont,u.getNombre());
        cont++;
        p.setString(cont,u.getContraseña());
        cont++;
        p.setString(cont,u.getEmail());
        cont++;
        p.setString(cont,u.getRutaImagen());
        cont++;
        p.setDate(cont,u.getFechaRegistro());
        cont++;
        p.setDate(cont,u.getFechaNacimiento());
        cont++;
        p.setString(cont,"");
        
        p.executeUpdate();
        
        setSeguidores(u);
        setSeguidos(u);
        setContenido(u);
    }
            
}
