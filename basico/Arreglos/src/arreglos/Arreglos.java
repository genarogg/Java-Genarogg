package arreglos;
 
public class Arreglos {

    public static void main(String[] args) {
        String [] nombres = new String [5];
        nombres[0] = "Genaro";
        nombres[1] = "Gabriel";
        nombres[2] = "Erika";
        nombres[3] = "Hilce";
        nombres[4] = "anaili";
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("el nombre de la pocicion: " + i + " " + nombres[i]);
            
        }
    }
    
}
