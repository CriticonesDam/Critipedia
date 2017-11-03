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
public class RespuestaTest {
    
    public RespuestaTest() {
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
     * Test of citarComentario method, of class Respuesta.
     */
    @Test
    public void testCitarComentario() {
	System.out.println("citarComentario");
	String cita = "";
	String comentario = "";
	Respuesta instance = null;
	String expResult = "";
	String result = instance.citarComentario(cita, comentario);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getRespuesta method, of class Respuesta.
     */
    @Test
    public void testGetRespuesta() {
	System.out.println("getRespuesta");
	Respuesta instance = null;
	String expResult = "";
	String result = instance.getRespuesta();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setRespuesta method, of class Respuesta.
     */
    @Test
    public void testSetRespuesta() {
	System.out.println("setRespuesta");
	String respuesta = "";
	Respuesta instance = null;
	instance.setRespuesta(respuesta);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getC method, of class Respuesta.
     */
    @Test
    public void testGetC() {
	System.out.println("getC");
	Respuesta instance = null;
	Critica expResult = null;
	Critica result = instance.getC();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setC method, of class Respuesta.
     */
    @Test
    public void testSetC() {
	System.out.println("setC");
	Critica c = null;
	Respuesta instance = null;
	instance.setC(c);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
