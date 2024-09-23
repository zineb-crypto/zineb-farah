package Atelier1java;

import Atelier1java.Vecteurs3D;
public class Vecterur3Dtest {
        public static void main(String[] args){
            //Creer vecteur
            Vecteurs3D V1=new Vecteurs3D(3,2,5);
            Vecteurs3D V2=new Vecteurs3D(1,2,3);
            //Affichage des coordonnees
            System.out.println("V1= <"+V1.getX()+", "+V1.getY()+", "+V1.getZ()+">");
            System.out.println("V1= <"+V2.getX()+", "+V2.getY()+", "+V2.getZ()+">");
            //Affichage des normes
            System.out.println("La norme de V1= "+ V1.setNorme());
            System.out.println("La norme V2= "+ V2.setNorme());
            //Affichage du produit scalaire
            double ProduitScalaire=V1.setProduitScalaire(V2);
            System.out.println("Le produit scalaire V1.V2= "+ProduitScalaire);
            Vecteurs3D somme = V1.somme(V2);
            System.out.println("v1 + v2 = < " + somme.getX() + ", " + somme.getY() + ", " + somme.getZ() + " >");

        }
}

    
