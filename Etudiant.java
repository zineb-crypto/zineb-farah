package Atelier1java;
//classe Etudiant une sous-classe de la classe Personne
public class Etudiant extends Personne{
    private String numEtu;
    public Etudiant(String nom, int age, String numEtu){
        super(nom, age);
        this.numEtu=numEtu;
    }
    public void setNumEtu(String numEtu){
        this.numEtu=numEtu;
    }
    public String getNumEtu() {
        return numEtu;
    }
    public void Affichageetu() {
        super.afficher();
        System.out.println("*******Etudiant*******");
        System.out.println("Numero etudiant: "+getNumEtu());
    }
    public String toString() {
        return super.toString() + ", Numero etudiant : " + numEtu;
    }
    
}
