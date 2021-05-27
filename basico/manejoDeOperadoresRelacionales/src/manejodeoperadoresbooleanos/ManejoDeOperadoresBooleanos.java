package manejodeoperadoresbooleanos;

public class ManejoDeOperadoresBooleanos {
    public static void main(String[] args) {
        System.out.println("Operadores booleanos");
        
        boolean a = true;
        boolean b = false;
        
        int c = 4;
        int d = 7;
        
        boolean e = c < d;
        boolean f = c > d;
        boolean g = c <= d;
        boolean h = c >= d;
        boolean j = c == d;
        boolean x = c != d;
        
        System.out.println("el valor de c = " + c);
        System.out.println("el valor de d = " + d + "\n");
        
        System.out.println("el valor de e es: " + e);
        System.out.println("el valor de f es: " + f);
        System.out.println("el valor de g es: " + g);
        System.out.println("el valor de h es: " + h);
        System.out.println("el valor de j es: " + j);
        System.out.println("el valor de x es: " + x);
        
        boolean k = a & b;
        boolean l = a && b;
        boolean m = a | b;
        boolean n = a || b;
        boolean ñ = !a;
        boolean o = a ^ b;
        
        System.out.println("\nel valor de a es: " + a);
        System.out.println("el valor de b es: " + b + "\n");
        
        System.out.println("el valor de k es: " + k);
        System.out.println("el valor de l es: " + l);
        System.out.println("el valor de m es: " + m);
        System.out.println("el valor de n es: " + n);
        System.out.println("el valor de ñ es: " + ñ);
        System.out.println("el valor de o es: " + o);
        
        

        
    }
    
}
