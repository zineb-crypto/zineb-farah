package Atelier1java;

public class TestUniversite {
    
        public static void main(String[] args) {
            Universite universite = new Universite("Pascal Paoli");
    
            Titulaire pierre = new Titulaire("Pierre", 1500.0);
            Titulaire laurent = new Titulaire("Laurent", 2500.0);
            Vacataire michel = new Vacataire("Michel", 15);
            Vacataire marie = new Vacataire("Marie", 60);
    
            universite.embaucher(pierre);
            universite.embaucher(laurent);
            universite.embaucher(michel);
            universite.embaucher(marie);
    
            universite.afficherSalaire();
        }
    
    
}
