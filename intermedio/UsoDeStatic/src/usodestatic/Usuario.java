package usodestatic;

public class Usuario {
    private String nombre;
    private double dineroDisponible;
    private int idUsuario;
    private static int numeroDeUsuarios;
    
    private Usuario(){
        this.numeroDeUsuarios++;
                
    }
    public Usuario(String nombre, double dineroDisponible){
        this();
        this.idUsuario = numeroDeUsuarios;
        this.dineroDisponible = dineroDisponible;
        
        
    }
        
    public static void getNumeroDeUsuarios() {
        System.out.println("el numero de usuarios es " + numeroDeUsuarios);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }

    private void setDineroDisponible(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void imprimirNumeroDeUsuarios(){
        
    }
    public void donarTodoDinero(){
        PlataformaDeCrow.recogerDinero(this.dineroDisponible);
        this.setDineroDisponible(0.0);
    }
}
