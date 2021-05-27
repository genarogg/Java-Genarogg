package persona;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(){
    
    }
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "su nombre es " + this.nombre + " ,su apellido es " + this.apellido + " su edad es " + this.edad;
    }
    public static void main(String[] args) {
        Persona persona1 = new Persona("genaro", "gonzalez", 21);
        
        System.out.println(persona1);
        
        Persona persona2 = new Persona();
        persona2.setNombre("Gabriel");
        persona2.setApellido("Gonzalez");
        persona2.setEdad(20);
        
        System.out.println(persona2);
    }
}
