/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiestest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcC method, of class Main.
     */
    @Test
    public void testCalcC() {
        System.out.println("calcC");
        Cuadrado c = new Cuadrado(6,0);
        Main instance = new Main();
        float expResult = 36.0F;
        float result = instance.calcC(c);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of calcR method, of class Main.
     */
    @Test
    public void testCalcR() {
        System.out.println("calcR");
        Rectangulo r = new Rectangulo(5,4,0);
        Main instance = new Main();
        float expResult = 20.0F;
        float result = instance.calcR(r);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of calcT method, of class Main.
     */
    @Test
    public void testCalcT() {
        System.out.println("calcT");
        Triangulo t = new Triangulo(4,3,0);
        Main instance = new Main();
        float expResult = 6.0F;
        float result = instance.calcT(t);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of calcCir method, of class Main.
     */
    @Test
    public void testCalcCir() {
        System.out.println("calcCir");
        Circulo ci = new Circulo(1,0);
        Main instance = new Main();
        float expResult = 3.14F;
        float result = instance.calcCir(ci);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
