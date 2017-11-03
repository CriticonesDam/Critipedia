/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.ImageIcon;
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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getId method, of class Usuario.
     */
    @Test
    public void testGetId() {
	System.out.println("getId");
	Usuario instance = null;
	int expResult = 0;
	int result = instance.getId();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
	System.out.println("getNombre");
	Usuario instance = null;
	String expResult = "";
	String result = instance.getNombre();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getContraseña method, of class Usuario.
     */
    @Test
    public void testGetContraseña() {
	System.out.println("getContrase\u00f1a");
	Usuario instance = null;
	String expResult = "";
	String result = instance.getContraseña();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
	System.out.println("getEmail");
	Usuario instance = null;
	String expResult = "";
	String result = instance.getEmail();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getAvatar method, of class Usuario.
     */
    @Test
    public void testGetAvatar() {
	System.out.println("getAvatar");
	Usuario instance = null;
	ImageIcon expResult = null;
	ImageIcon result = instance.getAvatar();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaRegistro method, of class Usuario.
     */
    @Test
    public void testGetFechaRegistro() {
	System.out.println("getFechaRegistro");
	Usuario instance = null;
	Date expResult = null;
	Date result = instance.getFechaRegistro();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaNacimiento method, of class Usuario.
     */
    @Test
    public void testGetFechaNacimiento() {
	System.out.println("getFechaNacimiento");
	Usuario instance = null;
	Date expResult = null;
	Date result = instance.getFechaNacimiento();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getSeguidos method, of class Usuario.
     */
    @Test
    public void testGetSeguidos() {
	System.out.println("getSeguidos");
	Usuario instance = null;
	ArrayList<Usuario> expResult = null;
	ArrayList<Usuario> result = instance.getSeguidos();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getSeguidores method, of class Usuario.
     */
    @Test
    public void testGetSeguidores() {
	System.out.println("getSeguidores");
	Usuario instance = null;
	ArrayList<Usuario> expResult = null;
	ArrayList<Usuario> result = instance.getSeguidores();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getSubscripciones method, of class Usuario.
     */
    @Test
    public void testGetSubscripciones() {
	System.out.println("getSubscripciones");
	Usuario instance = null;
	ArrayList<Contenido> expResult = null;
	ArrayList<Contenido> result = instance.getSubscripciones();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Usuario.
     */
    @Test
    public void testSetId() {
	System.out.println("setId");
	int id = 0;
	Usuario instance = null;
	instance.setId(id);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
	System.out.println("setNombre");
	String nombre = "";
	Usuario instance = null;
	instance.setNombre(nombre);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setContraseña method, of class Usuario.
     */
    @Test
    public void testSetContraseña() {
	System.out.println("setContrase\u00f1a");
	String contraseña = "";
	Usuario instance = null;
	instance.setContraseña(contraseña);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
	System.out.println("setEmail");
	String email = "";
	Usuario instance = null;
	instance.setEmail(email);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setAvatar method, of class Usuario.
     */
    @Test
    public void testSetAvatar() {
	System.out.println("setAvatar");
	ImageIcon avatar = null;
	Usuario instance = null;
	instance.setAvatar(avatar);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaRegistro method, of class Usuario.
     */
    @Test
    public void testSetFechaRegistro() {
	System.out.println("setFechaRegistro");
	Date fechaRegistro = null;
	Usuario instance = null;
	instance.setFechaRegistro(fechaRegistro);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaNacimiento method, of class Usuario.
     */
    @Test
    public void testSetFechaNacimiento() {
	System.out.println("setFechaNacimiento");
	Date fechaNacimiento = null;
	Usuario instance = null;
	instance.setFechaNacimiento(fechaNacimiento);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setSeguidos method, of class Usuario.
     */
    @Test
    public void testSetSeguidos() {
	System.out.println("setSeguidos");
	ArrayList<Usuario> seguidos = null;
	Usuario instance = null;
	instance.setSeguidos(seguidos);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setSeguidores method, of class Usuario.
     */
    @Test
    public void testSetSeguidores() {
	System.out.println("setSeguidores");
	ArrayList<Usuario> seguidores = null;
	Usuario instance = null;
	instance.setSeguidores(seguidores);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of añadirSubscripcion method, of class Usuario.
     */
    @Test
    public void testAñadirSubscripcion() {
	System.out.println("a\u00f1adirSubscripcion");
	Contenido c = null;
	Usuario instance = null;
	boolean expResult = false;
	boolean result = instance.añadirSubscripcion(c);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarSubscripcion method, of class Usuario.
     */
    @Test
    public void testEliminarSubscripcion() {
	System.out.println("eliminarSubscripcion");
	Contenido c = null;
	Usuario instance = null;
	boolean expResult = false;
	boolean result = instance.eliminarSubscripcion(c);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of seguirUsuario method, of class Usuario.
     */
    @Test
    public void testSeguirUsuario() {
	System.out.println("seguirUsuario");
	Usuario u = null;
	Usuario instance = null;
	boolean expResult = false;
	boolean result = instance.seguirUsuario(u);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of dejarDeSeguir method, of class Usuario.
     */
    @Test
    public void testDejarDeSeguir() {
	System.out.println("dejarDeSeguir");
	Usuario u = null;
	Usuario instance = null;
	boolean expResult = false;
	boolean result = instance.dejarDeSeguir(u);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of añadirSeguidor method, of class Usuario.
     */
    @Test
    public void testAñadirSeguidor() {
	System.out.println("a\u00f1adirSeguidor");
	Usuario u = null;
	Usuario instance = null;
	boolean expResult = false;
	boolean result = instance.añadirSeguidor(u);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of perderSeguidor method, of class Usuario.
     */
    @Test
    public void testPerderSeguidor() {
	System.out.println("perderSeguidor");
	Usuario u = null;
	Usuario instance = null;
	boolean expResult = false;
	boolean result = instance.perderSeguidor(u);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarNombre method, of class Usuario.
     */
    @Test
    public void testCambiarNombre() throws Exception {
	System.out.println("cambiarNombre");
	String nuevoNombre = "";
	Usuario instance = null;
	boolean expResult = false;
	boolean result = instance.cambiarNombre(nuevoNombre);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarContraseña method, of class Usuario.
     */
    @Test
    public void testCambiarContraseña() throws Exception {
	System.out.println("cambiarContrase\u00f1a");
	String contraseña = "";
	Usuario instance = null;
	boolean expResult = false;
	boolean result = instance.cambiarContraseña(contraseña);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarEmail method, of class Usuario.
     */
    @Test
    public void testCambiarEmail() throws Exception {
	System.out.println("cambiarEmail");
	String nuevoEmail = "";
	Usuario instance = null;
	boolean expResult = false;
	boolean result = instance.cambiarEmail(nuevoEmail);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarAvatar method, of class Usuario.
     */
    @Test
    public void testCambiarAvatar() {
	System.out.println("cambiarAvatar");
	ImageIcon nuevoAvatar = null;
	Usuario instance = null;
	ImageIcon expResult = null;
	ImageIcon result = instance.cambiarAvatar(nuevoAvatar);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
