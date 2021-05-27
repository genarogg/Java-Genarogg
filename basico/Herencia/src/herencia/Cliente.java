package herencia;

import java.util.Date;

public class Cliente extends Persona {

    private int idCliente;
    private Date fechaDeRegistro;
    private boolean vip;
    private static int contadorClientes;

    public Cliente(Date fechaDeRegistro, boolean vip) {
        this.fechaDeRegistro = fechaDeRegistro;
        this.vip = vip;
        contadorClientes++;
        idCliente = contadorClientes;
    }
    public static int getContadorClientes() {
        return contadorClientes;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{ " + "idCliente = " + idCliente + ", fechaDeRegistro = " +
                fechaDeRegistro + ", vip = " + vip + '}';
    }
    

}
