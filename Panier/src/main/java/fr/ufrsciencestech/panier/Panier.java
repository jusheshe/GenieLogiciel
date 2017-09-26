/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jg625300
 */
public class Panier {
    
    private List<Orange> liste;
    private int capacite;
    private int nbOranges;
    
    public Panier(int capa)
    {
        capacite = capa;
        nbOranges = 0;
        liste = new ArrayList<Orange>();
    }
    
    public boolean estPlein()
    {
        return (capacite==nbOranges);
    }
    
    public boolean estVide()
    {
        return (nbOranges==0);
    }
    
    public void AjoutOrange(Orange o)
    {
        if(!estPlein())
        {
            liste.add(o);
            nbOranges++;
        }
        else
            System.out.println("Le panier est plein.");
    }
    
    @Override
    public String toString()
    {
        String s = "Panier: ";
        for (int i=0; i<nbOranges; i++)
        {
            s += "\n\n"+liste.get(i).toString();
        }
        return s;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (o==null)
            return false;
        else
        {
            Panier p = (Panier)o;
            if(this.capacite!=p.capacite)
                return false;
            for(int i=0; i<nbOranges; i++)
                if(p.liste.get(i)!=this.liste.get(i))
                    return false;
            return true;
        }
    }
}
