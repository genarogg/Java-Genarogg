/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasalida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author freya
 */
public class EntradasDelTeclado {
    public static void main(String[] args) throws IOException{
        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(teclado);
        
        String tem;
        tem = br.readLine();
        System.out.println("Ha leido: " + tem);
    }
            
}
