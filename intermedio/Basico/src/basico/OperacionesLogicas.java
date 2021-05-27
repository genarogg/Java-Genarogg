package basico;

/**
 *
 * @author genarogg
 */
public class OperacionesLogicas {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        
        boolean mayorQue = a > b;
        boolean menorQue = a < b;
        boolean mayorOIgualQue = a >= b;
        boolean menorOIgualQue = a <= b;

        boolean and = mayorQue && menorQue;
        boolean or = mayorQue || menorQue;
        boolean not = !and;
        boolean diferente = mayorOIgualQue != menorOIgualQue;
        boolean xOrd = not ^ diferente;
        
        System.out.println(menorQue);
        System.out.println(mayorQue);
        System.out.println(menorOIgualQue);
        System.out.println(mayorOIgualQue);

        System.out.println(and);
        System.out.println(or);
        System.out.println(not);
        System.out.println(diferente);
        System.out.println(xOrd);
    }
}
