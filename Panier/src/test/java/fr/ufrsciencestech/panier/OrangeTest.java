/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import junit.framework.TestCase;

/**
 *
 * @author jg625300
 */
public class OrangeTest extends TestCase {
    
    Orange o1;
    Orange o2;
    Orange o3;
    
    public OrangeTest(String testName) {
        super(testName);
        o1 = new Orange(0.5,"France");
        o2 = new Orange(0.5,"France");
        o3 = new Orange(0.5,"Espagne");
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getPrix method, of class Orange.
     */
    public void testGetPrix() {
        System.out.println("getPrix");
        double expResult = 0.5;
        double result = o1.getPrix();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    public void testGetOrigine() {
        System.out.println("getOrigine");
        String expResult = "France";
        String result = o1.getOrigine();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Orange.
     */
    public void testToString() {
        System.out.println("toString");
        String expResult = "Prix de l'orange: 0.5€\nOrigine: France";
        String result = o1.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Orange.
     */
    public void testEquals() {
        System.out.println("equals");
        boolean expResult = true;
        boolean result = o1.equals(o2);
        assertEquals(expResult, result);
    }
    
    public void testNotEquals() {
        System.out.println("equals");
        boolean expResult = false;
        boolean result = o1.equals(o3);
        assertEquals(expResult, result);
    }
    
    public void testNullEquals() {
        System.out.println("equals");
        boolean expResult = false;
        boolean result = o1.equals(null);
        assertEquals(expResult, result);
    }
    
}
