package Atelier1java;

import javax.sound.midi.SysexMessage;

public class testAPI {
    public static void main(String[] args) {
        //Affichage du nombre PI
        System.out.println("Le nombre PI= "+Math.PI); 
        //Affichage du nombre reel aleatoire compris entre 0 et 1 exclu  
        System.out.println("Le nombre aleatoire: "+Math.random());
        //Affichage du nombre entier aleatoire compris entre 1 et 3
        int randomInt=(int) (Math.random()*3)+1;
        System.out.println("Le nombre aleatoire: "+randomInt);
        //Affichage des deux variables x1et x2
        int x1=7;
        int x2=3;
        System.out.println("Le nombre maximal est: "+Math.max(x1, x2));
        String n1="zineb";
        String n2="farah";   
        if (n1.compareTo(n2)<0){
            System.out.println("La premiere valeur selon l'orde alphabetique est: "+n1);
        }
        else{
            System.out.println("La premiere valeur selon l'orde alphabetique est: "+n2);
        }
   
    }

    
}
