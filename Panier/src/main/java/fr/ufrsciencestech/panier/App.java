package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Orange o1 = new Orange(12,"france");
        Orange o2 = new Orange(3,"france");
        Orange o3 = new Orange(12,"france");
        Panier p1 = new Panier(10);
        p1.AjoutOrange(o1);
        p1.AjoutOrange(o2);
        Panier p2 = new Panier(5);
        p2.AjoutOrange(o1);
        p2.AjoutOrange(o2);
        boolean b = p1.equals(p2);
        System.out.println(b);
    }
}
