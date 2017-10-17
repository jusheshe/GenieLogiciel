/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author jg625300
 */
public class VueConsole implements Observer, Vue
{
    // Classe observatrice d'une autre classe observée
    // Appel de la méthode update au changement de la classe observée
    
    public VueConsole()
    {
        System.out.println("Contenance initiale : " + 0);
    }
    
    public void update(Observable obs, Object o)
    {
        Panier p = (Panier) o;
        System.out.println("Nouvelle contenance : " + Integer.toString(p.getSize()));
    }
}
