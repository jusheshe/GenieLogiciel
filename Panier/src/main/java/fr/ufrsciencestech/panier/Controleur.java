/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jg625300
 */
public class Controleur implements ActionListener
{
    private Panier p;
    private VueGraphique vg;
    
    public void actionPerformed(ActionEvent e)
    {
        if(vg.getValeur(e) == 1)
            p.AjoutOrange(new Orange());
        else
            p.RetireOrange();
    }
    
    public void setPanier(Panier p){
        this.p = p;
    }
    public void setVue(VueGraphique vg){
        this.vg = vg;
    }
}
