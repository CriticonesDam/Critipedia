/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ardark
 */
public class CriticaTest {
    
    public CriticaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUsuario method, of class Critica.
     */
    @Test
    public void testGetUsuario() {
	System.out.println("getUsuario");
	Critica instance = new Critica();
	Usuario expResult = null;
	Usuario result = instance.getUsuario();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Critica.
     */
    @Test
    public void testSetUsuario() {
	System.out.println("setUsuario");
	Usuario usuario = null;
	Critica instance = new Critica();
	instance.setUsuario(usuario);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getContenido method, of class Critica.
     */
    @Test
    public void testGetContenido() {
	System.out.println("getContenido");
	Critica instance = new Critica();
	Contenido expResult = null;
	Contenido result = instance.getContenido();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setContenido method, of class Critica.
     */
    @Test
    public void testSetContenido() {
	System.out.println("setContenido");
	Contenido contenido = null;
	Critica instance = new Critica();
	instance.setContenido(contenido);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getComentario method, of class Critica.
     */
    @Test
    public void testGetComentario() {
	System.out.println("getComentario");
	Critica instance = new Critica();
	String expResult = "";
	String result = instance.getComentario();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of editarComentario method, of class Critica.
     */
    @Test
    public void testEditarComentario() throws Exception {
	System.out.println("editarComentario");
	String antiguo = "";
	String comentario = "";
	Critica instance = new Critica();
	instance.editarComentario(antiguo, comentario);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getValoracion method, of class Critica.
     */
    @Test
    public void testGetValoracion() {
	System.out.println("getValoracion");
	Critica instance = new Critica();
	int expResult = 0;
	int result = instance.getValoracion();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setValoracion method, of class Critica.
     */
    @Test
    public void testSetValoracion() {
	System.out.println("setValoracion");
	int valoracion = 0;
	Critica instance = new Critica();
	instance.setValoracion(valoracion);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
