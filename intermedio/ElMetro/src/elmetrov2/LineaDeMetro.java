package elmetrov2;

public class LineaDeMetro {
    Tren [] trenes;
    
    public void informacionDeTrenes(){
        throw new UnsupportedOperationException();
        
    }
    public void asignarPlaza(){
        throw new UnsupportedOperationException();
    }
    
    public Tren[] getTrenes(Tren[] trenes){
        return trenes;
    }
    
    public void setTrenes(Tren[] trenes){
        this.trenes = trenes;
    }
    
    
    public boolean comprobarPlaza(int tren, int nVagon, int plaza){
        if(trenes[tren].getVagones()[nVagon].getPlazas()[plaza].isEstado() == false){
            return true;
        }
        else{
            return false;
        }
    }
    public void asignarPlaza(int tren, int nVagon, int plaza){
        trenes[tren].getVagones()[nVagon].getPlazas()[plaza].setEstado(true);
    }
    
}
