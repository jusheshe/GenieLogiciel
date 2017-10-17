/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author jg625300
 */
public class Panier extends Observable {
    
    // Classe observée par d'autre classe (méthodes setChanged...)
    
    private ArrayList<Orange> liste;
    private int capacite;
    
    public Panier(int capa)
    {
        if(capa>0)
        {
            capacite = capa;
            liste = new ArrayList<Orange>();
        }
    }
    
    public boolean estPlein()
    {
        return (capacite==getSize());
    }
    
    public boolean estVide()
    {
        return (liste.isEmpty());
    }
    
    public boolean AjoutOrange(Orange o)
    {
        if(!estPlein())
        {
            liste.add(o);
            // méthodes de la classe Observable
            setChanged();
            // appelle les méthodes update des classes Observatrices
            notifyObservers(this);
            return true;
        }
        else
            return false;
    }
    
    public void RetireOrange()
    {
        if(getSize()>0)
        {
            liste.remove(getSize()-1);
            // méthodes de la classe Observable qui mettent à jour
            setChanged();
            // appelle les méthodes update des classes Observatrices
            notifyObservers(this);
        }
    }
    
    public boolean RetireOrange(Orange o)
    {
        if(o!=null)
        {
            for(int i=0; i<getSize(); i++)
            {
                if(liste.get(i).equals(o))
                {
                    liste.remove(liste.get(i));
                    // méthodes de la classe Observable qui mettent à jour
                    setChanged();
                    // appelle les méthodes update des classes Observatrices
                    notifyObservers(this);
                    return true;
                }
            }
        }
        return false;
    }
    
    public float getPrix()
    {
        float total=0;
        for(int i=0; i<getSize(); i++)
        {
            total += liste.get(i).getPrix();
        }
        return total;
    }
    
    public int getSize()
    {
        return liste.size();
    }
    
    public void boycotteOrigine(String pays)
    {
        for(int i=0; i<getSize(); i++)
        {
            if(liste.get(i).getOrigine()==pays)
            {
                liste.remove(liste.get(i));
                i--;
            }
        }
    }
    
    @Override
    public String toString()
    {
        String s = "Panier: ";
        for (int i=0; i<getSize(); i++)
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
            for(int i=0; i<getSize(); i++)
                if(p.liste.get(i)!=this.liste.get(i))
                    return false;
            return true;
        }
    }
}
