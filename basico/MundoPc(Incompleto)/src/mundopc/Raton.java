package mundopc;

public class Raton extends DispositivosDeEntrada {
    private int idRaton;
    private static int contadorDeRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        contadorDeRatones++;
        idRaton = contadorDeRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public static int getContadorDeRatones() {
        return contadorDeRatones;
    }

    @Override
    public String toString() {
        return super.toString() + "Raton{" + "idRaton = " + idRaton + '}';
    }
    
}
