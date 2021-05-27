package mundopc;

public class Teclado extends DispositivosDeEntrada{
    private int idTeclado;
    private static int contadorDeTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        contadorDeTeclados++;
        idTeclado = contadorDeTeclados;
    }
    public int getIdTeclado() {
        return idTeclado;
    }
    public static int getContadorDeTeclados() {
        return contadorDeTeclados;
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" + "idTeclado=" + idTeclado + '}';
    }
    
}
