/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
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
public class GestionTest {
    
    public GestionTest() {
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
     * Test of añadirUsuario method, of class Gestion.
     */
    @Test
    public void testAñadirUsuario() {
	System.out.println("a\u00f1adirUsuario");
	Usuario u = null;
	Gestion instance = new Gestion();
	Usuario expResult = null;
	Usuario result = instance.añadirUsuario(u);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarUsuario method, of class Gestion.
     */
    @Test
    public void testEliminarUsuario() {
	System.out.println("eliminarUsuario");
	Usuario u = null;
	Gestion instance = new Gestion();
	boolean expResult = false;
	boolean result = instance.eliminarUsuario(u);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarContenido method, of class Gestion.
     */
    @Test
    public void testFiltrarContenido() {
	System.out.println("filtrarContenido");
	String categoria = "";
	String nombre = "";
	boolean vista = false;
	int valoracion = 0;
	Gestion instance = new Gestion();
	instance.filtrarContenido(categoria, nombre, vista, valoracion);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarios method, of class Gestion.
     */
    @Test
    public void testGetUsuarios() {
	System.out.println("getUsuarios");
	Gestion instance = new Gestion();
	ArrayList<Usuario> expResult = null;
	ArrayList<Usuario> result = instance.getUsuarios();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuarios method, of class Gestion.
     */
    @Test
    public void testSetUsuarios() {
	System.out.println("setUsuarios");
	ArrayList<Usuario> usuarios = null;
	Gestion instance = new Gestion();
	instance.setUsuarios(usuarios);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getContenidos method, of class Gestion.
     */
    @Test
    public void testGetContenidos() {
	System.out.println("getContenidos");
	Gestion instance = new Gestion();
	ArrayList<Contenido> expResult = null;
	ArrayList<Contenido> result = instance.getContenidos();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setContenidos method, of class Gestion.
     */
    @Test
    public void testSetContenidos() {
	System.out.println("setContenidos");
	ArrayList<Contenido> contenidos = null;
	Gestion instance = new Gestion();
	instance.setContenidos(contenidos);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getCriticas method, of class Gestion.
     */
    @Test
    public void testGetCriticas() {
	System.out.println("getCriticas");
	Gestion instance = new Gestion();
	ArrayList<Critica> expResult = null;
	ArrayList<Critica> result = instance.getCriticas();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setCriticas method, of class Gestion.
     */
    @Test
    public void testSetCriticas() {
	System.out.println("setCriticas");
	ArrayList<Critica> criticas = null;
	Gestion instance = new Gestion();
	instance.setCriticas(criticas);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
