package elmetrov2;

public class Plaza {
    private int idPlaza;
    private String tipo;
    private boolean estado;

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String conseguirTipo(int nPlaza){
        int contador = 0;
        int i = 0;
        String resultado = "";
        
        while(i <= nPlaza){
            if((contador == 0) || (contador == 3)){
                contador = 0;
                resultado = "Venatanilla";
            }
            else{
                resultado = "Pasillo";
            }
            contador++;
            i++;
        }
        return resultado;
    }
    
}
