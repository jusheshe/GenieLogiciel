package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Panier courant
        Panier p = new Panier(10);
        
        // Vue console + l'ajoute au panier
        VueConsole vc = new VueConsole();
        p.addObserver(vc);
        
        // Vue graphique + l'ajoute au panier
        VueGraphique vg = new VueGraphique();
        p.addObserver(vg);
        
        // Controleur
        Controleur cs = new Controleur();
        cs.setPanier(p);
        cs.setVue(vg);
        
        // Ajoute le controleur à la vue graphique
        vg.addControleur(cs);
        
        vg.setVisible(true);
        vg.pack();
    }
}
