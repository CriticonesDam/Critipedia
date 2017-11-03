/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.TreeMap;
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
public class SerieTest {
    
    public SerieTest() {
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
     * Test of getCadenaEmisora method, of class Serie.
     */
    @Test
    public void testGetCadenaEmisora() {
	System.out.println("getCadenaEmisora");
	Serie instance = null;
	String expResult = "";
	String result = instance.getCadenaEmisora();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getTemporadas method, of class Serie.
     */
    @Test
    public void testGetTemporadas() {
	System.out.println("getTemporadas");
	Serie instance = null;
	TreeMap<Integer, Integer> expResult = null;
	TreeMap<Integer, Integer> result = instance.getTemporadas();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setCadenaEmisora method, of class Serie.
     */
    @Test
    public void testSetCadenaEmisora() {
	System.out.println("setCadenaEmisora");
	String cadenaEmisora = "";
	Serie instance = null;
	instance.setCadenaEmisora(cadenaEmisora);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setTemporadas method, of class Serie.
     */
    @Test
    public void testSetTemporadas() {
	System.out.println("setTemporadas");
	TreeMap<Integer, Integer> temporadas = null;
	Serie instance = null;
	instance.setTemporadas(temporadas);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
