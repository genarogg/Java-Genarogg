package mundopc;

public class Orden {
    private int idOrden;
    private static int contadorDeOrdenes;
    private Computadora computadoras[];
    private int contadorDeComputadoras;
    private int maxNumeroDeComputadoras = 10;
    
    public Orden(){
        contadorDeOrdenes++;
        contadorDeComputadoras++;
        idOrden = contadorDeOrdenes;
    }
    
    public int getIdOrden() {
        return idOrden;
    }
    public int getContadorDeComputadoras() {
        return contadorDeComputadoras;
    }
    public static int getContadorDeOrdenes() {
        return contadorDeOrdenes;
    }

    
    public void agregarComputadora(Computadora computadora){
        if(maxNumeroDeComputadoras < this.computadoras.length){
            computadoras[maxNumeroDeComputadoras++] = computadora;
        }
        else{
            System.out.println("Error, Ya no puedes ordenar mas.");
        }
    }
    public double CalcularTotal(){
        for(int i = 0; i < computadoras.length; i++){
            
        }
      return 4;  
    } 
    public void mostrarOrden(){
        
    }

 }
