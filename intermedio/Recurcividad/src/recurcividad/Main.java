/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurcividad;

import java.util.Scanner;

/**
 *
 * @author freya
 */
public class Main {
    public static void main(String[] args) {
        Recurcividad re = new Recurcividad();
        Scanner sc = new Scanner(System.in);
        //int tem = sc.nextInt();
        
        //double nFactorial = re.factorial(tem);

		//System.out.println("El factorial de " + tem + " es: " + nFactorial);
		//System.out.println("la suma lenta es " + re.sumaLenta(50, 20) );
        //System.out.println("la secuencia fibonnaci es: " + re.secuenciaFibonnaci(4));
        System.out.println("Factorial por for " + re.factorialFor(3));
    }
            
}
