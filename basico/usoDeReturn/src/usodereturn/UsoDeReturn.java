package usodereturn;

public class UsoDeReturn {
    
    private int valor;
    
    public UsoDeReturn(){
        
    }
    public void setValorReturn(int valor){
        this.valor = valor;
    }
    public int getValorReturn(){
        return this.valor;
    }
    
    public String retorno(){
        if(valor <= 9){
            return "el vol introducido tiene un digito " + valor;
        }
        if(valor <= 99){
            return "el vol introducido tiene dos digito " + valor;
        }
        if(valor <= 999){
            return "el vol introducido tiene tres digito " + valor;
        }
        if(valor <= 9999){
            return "el vol introducido tiene cuatro digito " + valor;
        }
        else{
            return "valor fuera de rango " + valor;
        }
    }
            
    public static void main(String[] args) {
        UsoDeReturn R = new UsoDeReturn();
        
        R.setValorReturn(833);
        System.out.println(R.retorno());
        System.out.println("el valor es " + R.getValorReturn());
    }
    
}
