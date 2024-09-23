package Atelier1java;
public class ManipRob{
   public static void main(String[] args){
   Robot Toto= new Robot("Toto",10,20,2);
   Robot Titi= new Robot("Titi",0,0,1);
   //Deplacement pour Toto
   Toto.setDeplacement();
   Toto.setOrientation(1);
   Toto.setDeplacement();
   //Deplacement pour Titi
   Titi.setDeplacement();
   Titi.setOrientation(2); 
   Titi.setDeplacement();
   //Affichage du description
   System.out.println("Toto: ");
   Toto.setAfficherToi();
   System.out.println("Titi: ");
   Titi.setAfficherToi();
   System.out.println(Toto);
   
   
   
   }
}
