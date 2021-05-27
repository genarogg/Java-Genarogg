package mundopc;

public class DispositivosDeEntrada {
    private String tipoEntrada;
    private String marca;

    public DispositivosDeEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }
    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String toString() {
        return "DispositivosDeEntrada{" + "tipoEntrada = " + tipoEntrada + ", marca = " + marca + '}';
    }
}
