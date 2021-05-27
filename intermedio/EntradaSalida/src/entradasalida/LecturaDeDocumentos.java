/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasalida;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



/**
 *
 * @author freya
 */
public class LecturaDeDocumentos {
    public static void main(String[] args) throws IOException {
        FileReader lector = new FileReader("salida del fichero.txt");
        BufferedReader  br = new BufferedReader(lector);
        
        String cadena = br.readLine();
        System.out.println(cadena);
        while(cadena != null){
            cadena = br.readLine();
            System.out.println(cadena);
        }
    }
}
