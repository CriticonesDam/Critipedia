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
public class PeliculaTest {
    
    public PeliculaTest() {
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
     * Test of getDirector method, of class Pelicula.
     */
    @Test
    public void testGetDirector() {
	System.out.println("getDirector");
	Pelicula instance = null;
	String expResult = "";
	String result = instance.getDirector();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getAño method, of class Pelicula.
     */
    @Test
    public void testGetAño() {
	System.out.println("getA\u00f1o");
	Pelicula instance = null;
	String expResult = "";
	int result = instance.getAño();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getActores method, of class Pelicula.
     */
    @Test
    public void testGetActores() {
	System.out.println("getActores");
	Pelicula instance = null;
	String[] expResult = null;
	String[] result = instance.getActores();
	assertArrayEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setDirector method, of class Pelicula.
     */
    @Test
    public void testSetDirector() {
	System.out.println("setDirector");
	String director = "";
	Pelicula instance = null;
	instance.setDirector(director);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setAño method, of class Pelicula.
     */
    @Test
    public void testSetAño() {
	System.out.println("setA\u00f1o");
	int año=0;
	Pelicula instance = null;
	instance.setAño(año);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setActores method, of class Pelicula.
     */
    @Test
    public void testSetActores() {
	System.out.println("setActores");
	String[] actores = null;
	Pelicula instance = null;
	instance.setActores(actores);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
