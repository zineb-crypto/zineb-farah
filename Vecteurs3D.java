package Atelier1java;
import java.lang.Math;
public class Vecteurs3D {
    private double x;
    private double y;
    private double z;
    public  Vecteurs3D(double x,double y,double z){
       this.x=x;
       this.y=y; 
       this.z=z;
    }
    public Vecteurs3D() {
        this(0,0,0);
    }
    public void setAffichage(){
        System.out.println("<"+x+","+y+","+z+">");
    }
    public double setNorme() {
        return Math.sqrt(x*x+y*y+z*z);
    }
    //une méthode d’instance
    public double setProduitScalaire(Vecteurs3D autre){
        //u ⋅ v → = u x v x + u y v y + u z v z
        return x * autre.x + y * autre.y + z * autre.z;
    }
    //une méthode statique
    public static double ProduitScalaire(Vecteurs3D V1,Vecteurs3D V2) {
        //u ⋅ v → = u x v x + u y v y + u z v z
        return V1.x*V2.x + V1.y*V2.y + V1.z*V2.z;
    }
    public Vecteurs3D somme(Vecteurs3D autre) {
        return new Vecteurs3D(x+autre.x, y+autre.y, z+autre.z);
    }
    public static Vecteurs3D setSomme(Vecteurs3D V1, Vecteurs3D V2){
         return new Vecteurs3D(V1.x+V2.x,V1.y+V2.y,V1.z+V2.z);
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    
}



