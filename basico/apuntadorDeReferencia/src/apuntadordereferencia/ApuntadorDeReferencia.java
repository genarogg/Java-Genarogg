package apuntadordereferencia;

public class ApuntadorDeReferencia {
    private int valorBruto;
    
    public void setValorBruto(int valorBruto){
        this.valorBruto = valorBruto;
    }
    public int getValorBruto(){
        return this.valorBruto;
    }
    
    public ApuntadorDeReferencia(){
        
    }
    

    public static void main(String[] args) {
        ApuntadorDeReferencia a1 = new ApuntadorDeReferencia();
        ApuntadorDeReferencia a2 = a1;
        
        a2.setValorBruto(4);
        
        System.out.println(a1.getValorBruto());
    }
    
}
