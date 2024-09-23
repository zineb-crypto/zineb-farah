package Atelier1java;

 public class TestPersonne {
    public static void main(String[] args){
        Personne pers =new Personne("Marie",20);
        System.out.println(pers);
        Etudiant etu=new Etudiant("",0,"");
        System.out.println(etu);
        etu.setNom("Pierre");
        etu.setAge(21);
        etu.setNumEtu("20203456");
        System.out.println(etu);
    }
    
 }
