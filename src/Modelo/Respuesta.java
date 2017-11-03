package Modelo;

//@author ardark

public class Respuesta extends Critica{

    String respuesta;
    Critica c;
    
    //Constructor para instanciar directamente una critica
    public Respuesta(Critica c, String respuesta)
    {
	this.c=c;
	this.respuesta=respuesta;
    }
    
    //Constructor heredado de Critica
    public Respuesta(Usuario usuario, Contenido contenido, String comentario, int valoracion,String respuesta) 
    {
	super(usuario, contenido, comentario, valoracion);
	this.respuesta=respuesta;
    }

    public String citarComentario(String cita, String comentario)
    {
	StringBuilder s = new StringBuilder(cita);
	s.append("\n\n"+comentario);
	
	return s.toString();
    }
    
    public String getRespuesta() {
	return respuesta;
    }

    public void setRespuesta(String respuesta) {
	this.respuesta = respuesta;
    }

    public Critica getC() {
	return c;
    }

    public void setC(Critica c) {
	this.c = c;
    }   
}
