package Modelo;

public class Critica {
    
    private Usuario usuario;
    private Contenido contenido;
    String comentario;
    int valoracion;

    public Critica()
    {
	//Constructor vacío que nos servirá para heredar más comodamente
    }
    
    public Critica(Usuario usuario, Contenido contenido, String comentario, int valoracion) {
	this.usuario = usuario;
	this.contenido = contenido;
	this.comentario = comentario;
	this.valoracion = valoracion;
    }

    public Usuario getUsuario() {
	return usuario;
    }

    public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
    }

    public Contenido getContenido() {
	return contenido;
    }

    public void setContenido(Contenido contenido) {
	this.contenido = contenido;
    }

    public String getComentario() {
	return comentario;
    }

    public void editarComentario(String antiguo, String comentario) throws ExceptionString
    {	 
	if (antiguo.equals(comentario)) throw new ExceptionString("No se han producido cambios en el comentario");
	else if (comentario.isEmpty()) throw new ExceptionString("Error, introduzca un comentario más largo");
	else this.comentario=comentario;
    }

    public int getValoracion() {
	return valoracion;
    }

    public void setValoracion(int valoracion) {
	this.valoracion = valoracion;
    }
    
    
}
