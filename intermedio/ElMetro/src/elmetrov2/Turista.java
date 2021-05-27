package elmetrov2;

public class Turista extends Billete {
    private double precio;
    
    public Turista(){
        super.setPrecio(6.95);
        this.setPrecio(6.95);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
