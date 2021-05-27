package ciclodowhile;

public class CicloDoWhile {
    
    public static void main(String[] args) {
        int contador = 1;
        int limite = 10;
        
        do{
            System.out.println("el contador vale: " + contador);
            contador++;
        }while(contador <= limite);
    }
    
}
