/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feuxtricolores;

/**
 *
 * @author VEK
 */
public class Ordonnanceur extends Thread {
    private PanneauFeu panneau;
    public Ordonnanceur(PanneauFeu pan){
        super();
        panneau=pan;
    }

    @Override
    public void run() {
        while(true){
            try{
                panneau.setCouleur("rouge");
                panneau.repaint();
                this.sleep(5000);
                panneau.setCouleur("orange");
                panneau.repaint();
                this.sleep(5000);
                panneau.setCouleur("vert");
                panneau.repaint();
                this.sleep(5000);
            }
            catch(Exception ex){
                
            }
            
        }
    }
    
}
