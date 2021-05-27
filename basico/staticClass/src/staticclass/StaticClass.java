package staticclass;

public class StaticClass {
    private String nombre;
    private String apellido;
    private String ocupacion;
    private int edad;
    private static int contadorDeInstancias;
    private int  idObjato;

    public StaticClass() {
    }
    
    public StaticClass(String nombre, String apellido, String ocupacion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.contadorDeInstancias++;
        this.idObjato = contadorDeInstancias;
    }
       
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public int getContadorDeInstancias() {
        return contadorDeInstancias;
    }

    public void setContadorDeInstancias(int contadorDeInstancias) {
        this.contadorDeInstancias = contadorDeInstancias;
    }

    
    public int getIdObjato() {
        return idObjato;
    }
    @Override
    public String toString(){
        return "El nombre es " + this.nombre + " " + this.apellido + ", mi edad es " + this.edad  +
               "ocupacion es " + this.ocupacion + " y mi identificacion es " + this.idObjato;
    }

    
    public static void main(String[] args) {
        StaticClass p1 = new StaticClass("Genaro", "Gonzalez", "Programador",22);
        StaticClass p2 = new StaticClass("Gabriel", "Gonzalez", "chet",22);
        StaticClass p3 = new StaticClass("Erika", "Gonzalez", "gallardetera",22);
        StaticClass p4 = new StaticClass("hilce", "Gonzalez", "espiritista",22);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
        p2 = null;
        if(p2 != null){
            System.out.println(p2);
        }
        
        System.out.println(StaticClass.contadorDeInstancias);


    }

}
