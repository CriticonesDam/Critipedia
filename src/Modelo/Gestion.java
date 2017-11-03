
package Modelo;

import java.util.ArrayList;

public class Gestion {
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<Contenido> contenidos;
    private ArrayList<Critica> criticas;

    public Gestion(){	
    }
    
    public Gestion(ArrayList<Usuario> usuarios, ArrayList<Contenido> contenidos, ArrayList<Critica> criticas) 
    {
	this.usuarios = usuarios;
	this.contenidos = contenidos;
	this.criticas = criticas;
    }
    
    public Usuario añadirUsuario(Usuario u)
    {
	if(usuarios.add(u)) return u;
	else return null;
    }
    
    public boolean eliminarUsuario(Usuario u)
    {
	return usuarios.remove(u);
    }
    
    private Critica añadirCritica(Critica c)
    {
	if(criticas.add(c)) return c;
	else return null;
    }
    
    private Critica eliminarCritica(Critica c)
    {
	if(criticas.remove(c)) return c;
	else return null;
    }
    
    private Critica añadirRespuesta(Respuesta r)
    {
	if(criticas.add(r)) return r;
	else return null;
    }
    
    private Critica eliminarRespuesta(Respuesta r)
    {
	if(criticas.remove(r)) return r;
	else return null;
    }
            
    public void filtrarContenido(String categoria, String nombre, boolean vista, int valoracion)
    {
	ArrayList<Contenido> busqueda = new ArrayList<Contenido>();	
	for(Contenido c : contenidos)
	{	
	    //Vemos que categoria es
	    if(c.getCategoria().equalsIgnoreCase(categoria))
	    {
		//Filtro por nombre, si coinciden
		if(c.getNombre().equalsIgnoreCase(nombre) && !nombre.isEmpty()) busqueda.add(c);		
		//Filtro de vista, añade todas las vistas y las no vistas de esa categoria
		else if(c.isVista()==vista) busqueda.add(c);
		//Filtra según la puntuación, si es igual.
		else if(c.getPuntuacion()==valoracion) busqueda.add(c);
	    }
	}
    }
    
    public ArrayList<Usuario> getUsuarios() {
	return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
	this.usuarios = usuarios;
    }

    public ArrayList<Contenido> getContenidos() {
	return contenidos;
    }

    public void setContenidos(ArrayList<Contenido> contenidos) {
	this.contenidos = contenidos;
    }

    public ArrayList<Critica> getCriticas() {
	return criticas;
    }

    public void setCriticas(ArrayList<Critica> criticas) {
	this.criticas = criticas;
    }
}

