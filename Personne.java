package Atelier1java;

public class Personne {
	//Attributs ou variables d'instances
	private String nom;
	private int age;
	//Constructeur
	public Personne(String nom,int age) {
		this.nom=nom;
		this.age=age;
	}
	public Personne() {
		this("",0);
	}	
	public  void setNom(String nom) {
		this.nom=nom;
	}
	public  void setAge(int age) {
		this.age=age;
	}
    public String getNom(){
        return nom;
    }
    public int getAge(){
        return age;
    }
	public  void afficher() {
		System.out.println("Nom : "+this.nom + "\nAge : " + this.age );
	}
	public String toString() {
		return "Nom: " +this.nom +"," +  " Age: " + this.age + "ans";
	}
    


    
}
