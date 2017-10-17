package fr.ufrsciencestech.panier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jg625300
 */
public class Orange {
    
    private double prix;
    private String origine;
    
    public Orange()
    {
        prix = -1;
        origine = "";
    }
    
    public Orange(double p, String o)
    {
        if(p>0)
        {
            prix = p;
            origine = o;
        }
    }
    
    public double getPrix()
    {
        return prix;
    }
    
    public String getOrigine()
    {
        return origine;
    }
    
    @Override
    public String toString()
    {
        String s = "Prix de l'orange: "+prix+"€\nOrigine: "+origine;        
        return s;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (o==null)
            return false;
        else
        {
            Orange ora = (Orange)o;
            return ((this.prix==ora.prix)&&(this.origine==ora.origine));
        }
    }
        
}
