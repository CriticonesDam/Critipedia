package Modelo;

//@author ardark

public class ExceptionString extends Exception{

    String mensaje;
    
    public ExceptionString() 
    {
	this.mensaje="Error. No se ha introducido un valor válido";
    }

    public ExceptionString(String mensaje) 
    {
	super(mensaje);
	this.mensaje=mensaje;
    }

    @Override
    public String toString() {
	return mensaje;
    }
        
}
