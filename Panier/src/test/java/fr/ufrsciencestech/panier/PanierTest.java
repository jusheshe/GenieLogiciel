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
public class PanierTest extends TestCase {
    
    Panier p1;
    Panier p2;
    Panier p3;
    Panier p4;
    Panier p5;
    Orange o1;
    Orange o2;
    Orange o3;
    
    public PanierTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        p1 = new Panier(5);
        p2 = new Panier(5);
        p3 = new Panier(3);
        p4 = new Panier(3);
        p5 = new Panier(5);
        o1 = new Orange(0.5,"France");
        o2 = new Orange(0.5,"France");
        o3 = new Orange(0.5,"Espagne");
        p1.AjoutOrange(o1);
        p1.AjoutOrange(o2);
        p1.AjoutOrange(o3);
        p2.AjoutOrange(o1);
        p2.AjoutOrange(o2);
        p2.AjoutOrange(o3);
        p3.AjoutOrange(o1);
        p3.AjoutOrange(o1);
        p3.AjoutOrange(o3);
        p5.AjoutOrange(o3);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    public void testEstPlein() {
        System.out.println("estPlein");
        boolean expResult = true;
        boolean result = p3.estPlein();
        assertEquals(expResult, result);
    }

    /**
     * Test of estVide method, of class Panier.
     */
    public void testEstVide() {
        System.out.println("estVide");
        boolean expResult = true;
        boolean result = p4.estVide();
        assertEquals(expResult, result);
    }

    /**
     * Test of AjoutOrange method, of class Panier.
     */
    public void testAjoutOrange() {
        System.out.println("AjoutOrange");
        boolean expResult = true;
        boolean result = p1.AjoutOrange(o1);
        assertEquals(expResult, result);
    }
    
    public void testAjoutPanierPlein()
    {
        System.out.println("AjoutOrangePanierPlein");
        boolean expResult = false;
        boolean result = p3.AjoutOrange(o1);
        assertEquals(expResult, result);
    }
    
    public void testAjoutPanierVide()
    {
        System.out.println("AjoutOrangePanierPlein");
        assertEquals(0, p4.getSize());
        boolean b = p4.AjoutOrange(o1);
        int result = p4.getSize();
        assertEquals(1, result);
    }

    /**
     * Test of RetireOrange method, of class Panier.
     */
    public void testRetireOrange() {
        System.out.println("RetireOrange");
        boolean expResult = true;
        boolean result = p1.RetireOrange(o1);
        assertEquals(expResult, result);
    }
    
    public void testRetireOrangeNull() {
        System.out.println("RetireOrange");
        boolean expResult = false;
        boolean result = p1.RetireOrange(null);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrix method, of class Panier.
     */
    public void testGetPrix() {
        System.out.println("getPrix");
        float expResult = 1.5F;
        float result = p1.getPrix();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of boycotteOrigine method, of class Panier.
     */
    public void testBoycotteOrigine() {
        System.out.println("boycotteOrigine");
        p1.boycotteOrigine("France");
    }

    /**
     * Test of toString method, of class Panier.
     */
    public void testToStringPanierVide() {
        System.out.println("toString");
        String expResult = "Panier: ";
        String result = p4.toString();
        assertEquals(expResult, result);
    }
    
    public void testToString() {
        System.out.println("toString");
        String expResult = "Panier: \n\nPrix de l'orange: 0.5€\nOrigine: Espagne";
        String result = p5.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Panier.
     */
    public void testEquals() {
        System.out.println("equals1");
        boolean expResult = true;
        boolean result = p1.equals(p2);
        assertEquals(expResult, result);
    }
    
    public void testEqualsCapaDiff() {
        System.out.println("equals2");
        boolean expResult = false;
        boolean result = p1.equals(p3);
        assertEquals(expResult, result);
    }
    
    public void testNotEquals() {
        System.out.println("equals3");
        boolean expResult = false;
        boolean result = p1.equals(p5);
        assertEquals(expResult, result);
    }
    
    public void testEqualsNull() {
        System.out.println("equals4");
        boolean expResult = false;
        boolean result = p1.equals(null);
        assertEquals(expResult, result);
    }
    
}
