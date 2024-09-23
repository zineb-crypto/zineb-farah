package Atelier1java;

public class Titulaire extends Enseignantabs {
    private double salaire;
    public Titulaire(String nom, double salaire){
        super(nom);
        this.salaire=salaire;
    }
    public double salaire(){
        return salaire;
    }
    public String toString(){
        return super.toString()+" Salaire: "+salaire;
    }
    
}
