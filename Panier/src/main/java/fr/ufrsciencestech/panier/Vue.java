/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;
import java.util.Observable;

/**
 *
 * @author jg625300
 */
public interface Vue
{      
    // Classe observatrice d'une autre classe observée
    // Appel de la méthode update au changement de la classe observée
    
    public void update(Observable o, Object cpt);
}
