/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurcividad;

/**
 *
 * @author freya
 */
public class Recurcividad {
  
    public double factorial(double n){
        //caso base
        if(n == 0){
            return 1;
        }
        else{
            return n * this.factorial(n - 1);
        }
    }
    public double sumaLenta(int a, int b){
        if(a == 0){
            return b;
        }
        else{
            return sumaLenta(a - 1, b + 1);
        }
    }
    
    public double secuenciaFibonnaci(double n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return secuenciaFibonnaci(n - 2) + secuenciaFibonnaci(n - 1);
        }
    }
    
    public int factorialFor(int n){
        int num = n;
        int f = 1;
        
        while(num > 0){
            f= f * num;
            num--;
        }
        return f;
    }
    
}
