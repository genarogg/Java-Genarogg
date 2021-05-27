package entradasalida;

import java.io.File;

/**
 *
 * @author freya
 */
public class Ficheros {
    public static void main(String[] args) {
        File fichero = new File(".");
    
        File[] directorio = fichero.listFiles();
        
        for(int i = 0; i < directorio.length; i++){
            if(directorio[i].isDirectory()){
                System.out.println("->" + directorio[i].getName());
            }
            if(directorio[i].isDirectory()){
                System.out.print("-" + directorio[i] + " Tamaño: " + directorio[i].length());
                System.out.println();
            }
        }
    }
}
