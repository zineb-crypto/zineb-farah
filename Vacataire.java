package Atelier1java;

public class Vacataire extends Enseignantabs {
    private static final double TARIF_HEURE=40;
    private int nbheuresCours;
    public Vacataire(String nom, int nbheuresCours){
        super(nom);
        this.nbheuresCours=nbheuresCours;
    }
    public double salaire(){
        return TARIF_HEURE*nbheuresCours;
    }
    public String toString(){
        return super.toString()+"(Vacataire:"+nbheuresCours+"Heures)"+" Salaire: "+salaire()+"euros";
    }
}
