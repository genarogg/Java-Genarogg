package genericos;

public class Billete {
    private double precio;
    private static int idBillete;
    
    public Billete(){
        idBillete++;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public int getIdBillete(){
        return this.idBillete;
    }
    
    public void imprimirInfoBillete(int tren, int vagon, int plaza, Billete b){
        System.out.println("Billete ID: " + this.getIdBillete());
        System.out.println("Precio: " + b.getPrecio());
        System.out.println("Tren: " + tren);
        System.out.println("Vagon: " +  vagon);
        
        
                
    }    
}
