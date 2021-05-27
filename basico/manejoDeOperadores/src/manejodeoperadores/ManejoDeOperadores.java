package manejodeoperadores;

public class ManejoDeOperadores {

    public static void main(String[] args) {
        
        int x = 3;
        int y = 5;
        int z = 9; 
        
        System.out.println("Operaciones matematicas Basicas:\n");
        
        int a = x + y;
        int b = y - x;
        int c = y * z;
        int d = z / x;
        int d2 = z % y;
        int e = -z;
        
     
        
        System.out.println("Suma a = " + a);
        System.out.println("Resta b = " + b);
        System.out.println("Multiplicacion c = " + c);
        System.out.println("Division d = " + d);
        System.out.println("Residuo de la division d2 = " + d2);
        
        System.out.println("Numero negativo e = " + e);
        
        System.out.println("\nOperadores Compuestos: ");
           
        int f = x += z;
        int g = z -= x;
        int h = y *= a;
        int j = x /= b;
        int k = x %= b;
        
        System.out.println("Suma " + f);
        System.out.println("Resta " + g);
        System.out.println("multiplicacion " + h);
        System.out.println("Division " + j);
        System.out.println("Residuo de la division " + k);
        
        System.out.println("\nOperadores de Incremento o Decremento:");
       
        int l = a++;
        int m = b--;
        
        System.out.println("suma (Incremento +1) " + l);
        System.out.println("resta (Decremento -1) " + m);
        
        System.out.println("\nOperadores de PRE-Incremento o PRE-Decremento:");
        
        int n = ++a;
        int ñ = --b;
        
        System.out.println("suma (PRE-Incremento +1) " + l);
        System.out.println("resta (PRE-Decremento -1) " + m);

    }
    
}
