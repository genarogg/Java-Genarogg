package elmetrov2;

import java.util.Scanner;

public class Taquilla {
    LineaDeMetro lm;
    
    public LineaDeMetro getLm(){
        return lm;
    }
    
    public void setLm(LineaDeMetro lm){
        this.lm = lm;
    }
    
    public void venderBillete(){
        System.out.println("¿En que tren desea viajar?");
        Scanner sc = new Scanner(System.in);
        String tren = sc.nextLine();
        System.out.println("¿En que vagon desea viajar? (0 y 1) son Premium y (3 al 5) turista");
        String nVagon = sc.nextLine();
        System.out.println("¿En que plaza desea viajar?(0 al 39)");
        String  nPlaza = sc.nextLine();
       
        if(lm.comprobarPlaza(Integer.valueOf(tren),Integer.valueOf(nVagon),Integer.valueOf(nPlaza)) == true){
            Billete b;
            if(Integer.valueOf(nVagon) <= 1){
                b = new Premium();
            }
            else{
                b = new Turista();
            }
            
            lm.asignarPlaza(Integer.valueOf(tren),Integer.valueOf(nVagon),Integer.valueOf(nPlaza));
            System.out.println("su plaza ha sido asignada");
            b.imprimirInfoBillete(Integer.valueOf(tren),Integer.valueOf(nVagon), Integer.valueOf(nPlaza),b);
        }
        
        else{
            System.out.println("No se a podido asignar la Plaza");
        }
    
    }
}
