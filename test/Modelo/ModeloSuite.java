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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ardark
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Modelo.GestionTest.class, Modelo.SerieTest.class, Modelo.CriticaTest.class, Modelo.UsuarioTest.class, Modelo.PeliculaTest.class, Modelo.ContenidoTest.class, Modelo.ExceptionStringTest.class, Modelo.RespuestaTest.class, Modelo.CritipediaTest.class})
public class ModeloSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
