package Atelier1java;

import java.util.ArrayList;

public class Universite {
    public String nom;
    public ArrayList<Enseignantabs> listeEnseignants;

    public Universite(String nom){
        this.nom=nom;
        this.listeEnseignants=new ArrayList<>();
    }
    public void afficherSalaire(){
        System.out.println("LISTE DES ENSEIGNANTS DE l'UNIVERSITE Pascal Paoli");
        System.out.println("Effectif: "+listeEnseignants.size()+" enseignants");
        double totalSalaires=0.0;
        for (Enseignantabs enseignantabs:listeEnseignants){
            System.out.println(enseignantabs.toString());
            totalSalaires+=enseignantabs.salaire();
        }
        System.out.println("Total des salaires = " + totalSalaires + " euros");
    }
    public void embaucher(Enseignantabs e) {
        listeEnseignants.add(e);
    }
}
