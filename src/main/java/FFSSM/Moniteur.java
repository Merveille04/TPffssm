/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Moniteur extends Personne {

    public int numeroDiplome;
    public LinkedList <Embauche> ListEmb;

    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance, int numeroDiplome) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.numeroDiplome = numeroDiplome;
        this.ListEmb = new LinkedList<>();
    }

    public Club employeur() {
         for (Embauche e:ListEmb){
             if (e.estTerminee() == false){
                 return e.getEmployeur();
             } 
         }
        return null; 
    }
    
    public void nouvelleEmbauche(Club employeur, Calendar debutNouvelle) {  
        Embauche e = new Embauche(debutNouvelle, this, employeur);
        ListEmb.add(e);
    }

    public List<Embauche> emplois() {
         return ListEmb;
    }

}
