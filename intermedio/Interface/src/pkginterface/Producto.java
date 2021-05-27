/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.text.DecimalFormat;

/**
 *
 * @author freya
 */
public class Producto implements NewInterface {
    private String Id;
    private double valor;

    public Producto() {
    }

    
    public Producto(String Id, double valor) {
        this.Id = Id;
        this.valor = valor;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public String getID() {
        return Id;
    }

    @Override
    public double valor() {
        return valor;
    }

    @Override
    public double multiplicaPor(int n) {
        return (double)(valor * n);
    }

    @Override
    public void imprime() {
        DecimalFormat decimal = new DecimalFormat("00.0");
        System.out.println("el id:" + this.Id + " y el valor es: " + decimal.format(this.valor));
    }
    
}
