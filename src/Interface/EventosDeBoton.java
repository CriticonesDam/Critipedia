/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Lebron
 */
public class EventosDeBoton {

    private static PantallaPrincipal pp;
    private static PantallaMiperfil pmp;
    private static PantallaNotificaciones pn;
    private static PantallaContenido pc;
    private static PantallaDescubre pd;
    private static PantallaInicio login;

    public static void llamaPantallaPrincipal(CuadroBase cuadro) {
        pp = new PantallaPrincipal(cuadro);
        pp.setVisible(true);
        cuadro.add(pp);
        cuadro.validate();
    }
    
     public static void llamaPantallaMiPerfil(CuadroBase cuadro) {
        pmp = new PantallaMiperfil(cuadro);
        pmp.setVisible(true);
        cuadro.add(pmp);
        cuadro.validate();
    }
     
     public static void llamaPantallaNotificaciones(CuadroBase cuadro) {
        pn = new PantallaNotificaciones(cuadro);
        pn.setVisible(true);
        cuadro.add(pn);
        cuadro.validate();
    }
     
     public static void llamaPantallaContenido(CuadroBase cuadro) {
        pc = new PantallaContenido(cuadro);
        pc.setVisible(true);
        cuadro.add(pc);
        cuadro.validate();
    }
     
     public static void llamaPantallaDescubre(CuadroBase cuadro) {
        pd = new PantallaDescubre(cuadro);
        pd.setVisible(true);
        cuadro.add(pd);
        cuadro.validate();
    }
     
     public static void volver(CuadroBase cuadro){
        cuadro.setSize(680, 420);
        cuadro.setResizable(false);
         
        login = new PantallaInicio(cuadro);
        login.setVisible(true);
        cuadro.add(login);
        cuadro.validate();
     }


}
