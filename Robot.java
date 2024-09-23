package Atelier1java;
public class Robot {
    private String reference_robot;
    private String nom;
    private int x;
    private int y;
    private int orientation;
    public static final int NORD=1;
    public static final int SUD=2;
    public static final int EST=3;
    public static final int OUEST=4;
    private static int nb_tot_robot=0;
    
    // Constructeur (avec paramètres)
    public Robot(String nom,int unx,int uny,int uneOrientation){
        this.nom=nom;
        this.x=unx;
        this.y=uny;
        this.orientation=uneOrientation;
        this.reference_robot="ROB"+nb_tot_robot;
        nb_tot_robot+=1;
    }
    public Robot(String nom){
        this(nom,0,0,NORD);
    }
    public void setOrientation(int uneOrientation){
        if ((uneOrientation==NORD) || (uneOrientation==SUD) || (uneOrientation==EST) || (uneOrientation==OUEST))
         this.orientation=uneOrientation;
        else
          this.orientation=NORD;
    }
    public void setDeplacement(){
        switch (orientation) {
            case NORD:
              y+=1;
              break;
            case EST:
              x+=1;
              break;
            case OUEST:
              x-=1;
              break;
            case SUD:
              y-=1;
              break;
        }
        x=Math.max(x,0);
        y=Math.max(y,0);
    
    }
  public void setAfficherToi(){
        System.out.println("Nom: "+nom);
        System.out.println("Reference: "+reference_robot);
        System.out.println("Coordonnees: ("+x+","+y+")");
        System.out.println("Orientation: "+orientation);
        
        
  }  
  public String toString() {
    return "Nom: "+nom+ ", Reference: "+reference_robot+ ",coordonnees:("+x+","+y+")" + ",Direction: "+orientation;
}  
}



