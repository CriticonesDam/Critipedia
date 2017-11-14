package Modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;

public class Usuario {

    private int id;
    private String nombre;
    private String contraseña;
    private String email;
    private ImageIcon avatar;
    private Date fechaRegistro;
    private Date fechaNacimiento;
    
    private ArrayList<Usuario> seguidos;
    private ArrayList<Usuario> seguidores;
    private ArrayList<Contenido> subscripciones;        
    
    //CONSTRUCTOR
    
    
    public Usuario(int id, String nombre, String contraseña, String email, ImageIcon avatar, 
	    Date fechaRegistro, Date fechaNacimiento, ArrayList<Usuario> seguidos, 
	    ArrayList<Usuario> seguidores, ArrayList<Contenido>subscripciones) 	    
    {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.email = email;
        this.avatar = avatar;
        this.fechaRegistro = fechaRegistro;
        this.fechaNacimiento = fechaNacimiento;
        this.seguidos = seguidos;
        this.seguidores = seguidores;
        this.subscripciones=subscripciones;
    }

    
    //GETTERS ATRIBUTOS
    
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getEmail() {
        return email;
    }

    public ImageIcon getAvatar() {
        return avatar;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public ArrayList<Usuario> getSeguidos() {
        return seguidos;
    }

    public ArrayList<Usuario> getSeguidores() {
        return seguidores;
    }

    public ArrayList<Contenido> getSubscripciones(){
        return subscripciones;
    }
    
    
    //SETTERS ATRIBUTOS
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvatar(ImageIcon avatar) {
        this.avatar = avatar;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSeguidos(ArrayList<Usuario> seguidos) {
        this.seguidos = seguidos;
    }

    public void setSeguidores(ArrayList<Usuario> seguidores) {
        this.seguidores = seguidores;
    }
    
    public void setSubscripciones(ArrayList<Contenido> subscripciones){
        this.subscripciones=subscripciones;
    }
    
    
    //METODOS PARA LA CLASE USUARIO
            
    public boolean añadirSubscripcion(Contenido c)
    {
        return subscripciones.add(c);        
    }
    
    public boolean eliminarSubscripcion(Contenido c)
    {
	return subscripciones.remove(c);
    }
    
    public boolean seguirUsuario(Usuario u)
    {
	return seguidos.add(u);
    }
    
    public boolean dejarDeSeguir(Usuario u)
    {
	return seguidos.remove(u);
    }
    
    public boolean añadirSeguidor(Usuario u)
    {
	return seguidores.add(u);
    }
    
    public boolean perderSeguidor(Usuario u)
    {
	return seguidores.remove(u);
    }
    
    //METODO PARA CAMBIAR NOMBRE DE USUARIO
    
    public boolean cambiarNombre(String nuevoNombre) throws ExceptionString{
       
        boolean cambiado=false;
                    
            if(nuevoNombre.length()<6 || nuevoNombre.length()>12) throw new ExceptionString();
            else cambiado=true;
	    
        return cambiado;
                
    }
    
    //CAMBIO CONTRASEÑA DE USUARIO
    
    public boolean cambiarContraseña(String contraseña) throws ExceptionString{
        
        boolean cambiado=false;
        

        if(contraseña.length()<6) throw new ExceptionString();
        else cambiado=true;
        
        return cambiado;
    }
    
    //METODO PARA CAMBIAR EMAIL DE USUARIO
    
    public boolean cambiarEmail(String nuevoEmail) throws ExceptionString{
    
        boolean cambiado=false;
        int contadorArrobas=0;
       
            if(nuevoEmail.length()!=0){
                for(int i=0;i<email.length();i++){
                    if(email.charAt(i)=='@'){
                        contadorArrobas++;            
                     }
                }
                if(contadorArrobas>=2)throw new ExceptionString();
                
            }else throw new ExceptionString();
            
           
            if(!email.endsWith("@gmail.com")||!email.endsWith("@gmail.es")||!email.endsWith("@hotmail.es")||!email.endsWith("@hotmail.com")) throw new ExceptionString();
            else cambiado=true;
            
      
            return cambiado;
    
    }

    //METODO PARA CAMBIAR IMAGEN AVATAR
    
    public ImageIcon cambiarAvatar(ImageIcon nuevoAvatar){
        
        
 
           if(nuevoAvatar==null) throw new NullPointerException();
           else return nuevoAvatar;


    } 
}
