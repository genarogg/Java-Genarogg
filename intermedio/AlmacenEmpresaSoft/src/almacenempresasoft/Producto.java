 package almacenempresasoft;

import java.text.DecimalFormat;

/**
 *
 * @author freya
 */
public class Producto {
    private double peso;
    private double valor;
    private String IDproducto;
    private boolean asignado;
    private String clase;

    public Producto(){
        
    }
    
    
    public Producto(double peso, double valor, String IDproducto, boolean asignado, String clase) {
        this.peso = peso;
        this.valor = valor;
        this.IDproducto = IDproducto;
        this.asignado = asignado;
        this.clase = clase;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIDproducto() {
        return IDproducto;
    }

    public void setIDproducto(String IDproducto) {
        this.IDproducto = IDproducto;
    }

    public boolean isAsignado() {
        return asignado;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        DecimalFormat decimales = new DecimalFormat("00.00");
        DecimalFormat decimales2 = new DecimalFormat("00.0");
        return "IDproducto:" + this.IDproducto + ", valor:" + decimales.format(this.valor) + ", Clase: " +this.clase + ", peso:" + decimales.format(peso) + ", asignado: " + this.asignado;
    }
    public void imprime(){
        DecimalFormat decimales=new DecimalFormat("00.00");
        DecimalFormat decimales2=new DecimalFormat("00.0");
        System.out.println("IDproducto:" + this.IDproducto + ", valor:" + decimales.format(this.valor) + ", Clase: " +this.clase + ", peso:" + decimales.format(peso) + ", asignado: " + this.asignado);
    }
    
}
