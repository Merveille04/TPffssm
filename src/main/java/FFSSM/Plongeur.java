package FFSSM;

import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mkamdom
 */
public class Plongeur extends Personne {
    private int niveau;
    private List<Licence> ListLicence;

    public Plongeur(int niveau, String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau = niveau;
        this.ListLicence = new LinkedList<>();
    }

   
    public int getNiveau() {
        return niveau;
    }

    
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void ajouteLicence (Licence l){
        ListLicence.add(l);
    }
    /**
     * @return the ListLicence
     */
    public List<Licence> getListLicence() {
        return ListLicence;
    }
	
}
