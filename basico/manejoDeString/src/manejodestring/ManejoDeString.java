package manejodestring;

public class ManejoDeString{

    public static void main(String[] args) {
        String nombre = "Genaro";
        String apellido = "Gonzalez";
        
        System.out.println("con concatenacion: " + nombre + " " + apellido);
        System.out.println("con tabulacion: " + nombre + "\t " + apellido);
        System.out.println("con salto de linea: " + nombre + "\n " + apellido);
        System.out.println("con retroceso: " + nombre + "\r " + apellido);
        System.out.println("con comillas simples: " + "\"" + nombre + "\"" + apellido);
        System.out.println("con comillas dobles: " + "\"" + nombre  + " " + apellido + "\"");
        
    }
    
}
