package entradasalida;
import java.io.*;
/**
 *
 * @author freya
 */
public class LecturaYEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreArchivo = "salidaDeFichero.txt";
        FileWriter writer;
        
        try{
           writer = new FileWriter(nombreArchivo);
           writer.write("Hola Estoy escribiendo en este archivo\n");
           writer.write("Esta es la segunda linea\n");
           writer.close();
        }
        catch(IOException e){
            System.out.println("No se ha padido leer/Escribir el archivo");
        }
        
        FileReader reader;
        
        try {
            reader = new FileReader(nombreArchivo);
            int caracter;
            caracter = reader.read();
            while(caracter != -1){
                System.out.print((char) caracter);
                caracter = reader.read();
               
            }
            reader.close();
        } 
        catch (IOException e) {
            System.out.println("no se ha podido Leer o Escribir el archivo");
        }
    }
    
}
