package elmetrov2;

public class Premium extends Billete{
    private double precio;
    
    public Premium(){
        super.setPrecio(20.0);
        this.setPrecio(20.0);
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
}
