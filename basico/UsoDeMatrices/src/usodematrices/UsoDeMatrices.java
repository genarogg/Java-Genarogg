package usodematrices;

public class UsoDeMatrices {

    public static void main(String[] args) {
        Integer [][] numeros = new Integer [3][2];
        
        numeros[0][0] = 8;
        numeros[0][1] = 4;
        
        numeros[1][0] = 2;
        numeros[1][1] = 10;
                
        numeros[2][0] = 14;
        numeros[2][1] = 18;
        
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length; j++){
                System.out.println(numeros[i][j]);
            }
        }
        
    }
    
}
