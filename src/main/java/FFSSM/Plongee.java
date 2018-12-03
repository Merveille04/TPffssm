/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Plongee {

    public Site lieu;

    public Moniteur chefDePalanquee;

    public Calendar date;

    public int profondeur;

    public int duree;
    
    public HashSet<Plongeur> ListPlongeur;

    public Plongee(Site lieu, Moniteur chefDePalanquee, Calendar date, int profondeur, int duree) {
        this.lieu = lieu;
        this.chefDePalanquee = chefDePalanquee;
        this.date = date;
        this.profondeur = profondeur;
        this.duree = duree;
        this.ListPlongeur = new HashSet<>();
    }

    public void ajouteParticipant(Plongeur participant) {
        ListPlongeur.add(participant);
    }

    public Calendar getDate() {
        return date;
    }

    public boolean estConforme() {
 /*       for (Plongeur p: ListPlongeur ){
           for (Licence l: p.getListLicence()){
               if (l.estValide(date) == false){
                   return false;
               }
           }
        }
        return true;
    }
*/
 
    for (Plongeur p: ListPlongeur ){
        
        if ( !p.getListLicence().get(p.getListLicence().size() -1 ).estValide(date) ) {
            return false;
        }
    }
     return true;
}
}
