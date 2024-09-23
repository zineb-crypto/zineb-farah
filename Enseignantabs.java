package Atelier1java;

public abstract class Enseignantabs {
        private String nom;
        public Enseignantabs(String nom){
            this.nom=nom;
        }
        public abstract double salaire();
            
        
        public String getNom(){
              return nom;
        }
        public String toString(){
            return "Nom Enseignant: "+nom;
        }
}
