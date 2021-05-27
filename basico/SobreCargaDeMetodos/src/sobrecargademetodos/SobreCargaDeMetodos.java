package sobrecargademetodos;

public class SobreCargaDeMetodos {

    public SobreCargaDeMetodos(){
        
    }
    public static int sumar(int n1, int n2){
        System.out.println("valores: int, int");
        return n1 + n2;
    }
    public static float sumar(int n1, float n2){
        System.out.println("valores: int, float");
        return n1 + n2;
    }
    public static long sumar(int n1, long n2){
        System.out.println("valores: int, long");
        return n1 + n2;
    }
    public static double sumar(int n1, double n2){
        System.out.println("valores: int, double");
        return n1 + n2;
    }
    public static double sumar(double n1, double n2){
        System.out.println("valores: double, double");
        return n1 + n2;
    }
     
    public static void main(String[] args) {
       System.out.println(SobreCargaDeMetodos.sumar(5, 3));
       System.out.println(SobreCargaDeMetodos.sumar(5, 3.2));
       System.out.println(SobreCargaDeMetodos.sumar(5, 3L));
       System.out.println(SobreCargaDeMetodos.sumar(5, 3.233));
       System.out.println(SobreCargaDeMetodos.sumar(12, 3.23));
       
    }
    
}
