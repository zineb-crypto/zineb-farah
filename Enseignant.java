package Atelier1java;

public class Enseignant extends Personne{
    private double salaire;
    private int nbheuresCours;
    public Enseignant(String nom, int age,double salaire,int nbheuresCours){
        super(nom, age);//mot-clé super permet de passer les paramètres nom et age à la classe Personne.
        this.salaire=salaire;
        this.nbheuresCours=nbheuresCours;
    }
    public void setSalaire(double salaire){
        this.salaire=salaire;
    }
    public void setHeures(int nbheuresCours){
        this.nbheuresCours=nbheuresCours;
    }
    public double getSalaire() {
        return salaire;
    }

    public int getHeures() {
        return nbheuresCours;
    }
    public void affichage(){
        super.afficher();
        System.out.println("*******Enseignant******");
        System.out.println("Salaire: "+getSalaire()+", Nombre heures de cours: "+getHeures());
    }
    public String toString(){
        return super.toString() + ", Salaire : " + salaire +"euros"+ ", Heures : " + nbheuresCours;
    }

}
