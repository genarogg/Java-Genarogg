package aritmetica;

public class Aritmetica {
    
    int n1;
    int n2;
    
    public Aritmetica(){
        
    }
    public int suma(int n1, int n2){
        return n1 + n2;
    }
    public int resta(int n1, int n2){
        return n1 - n2;
    }
    public int multiplicacion(int n1, int n2){
        return n1 * n2;
    }
    public double division(double n1, double n2){
        return n1 / n2;
    }
    public double residuo(double n1, double n2){
        return n1 % n2;
    }  

    public static void main(String[] args) {
        Aritmetica math = new Aritmetica();
        
        System.out.println("el resultado de la suma " + math.suma(4, 3));
        System.out.println("el resultado de la resta " + math.resta(4, 3));
        System.out.println("el resultado de la multiplicacion " + math.multiplicacion(4, 3));
        System.out.println("el resultado de la division " + math.division(4, 3));
        System.out.println("el resultado de la residuo " + math.residuo(4, 3));
        

    }
    
}
