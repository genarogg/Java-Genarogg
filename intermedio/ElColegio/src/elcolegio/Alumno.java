package elcolegio;

/**
 *
 * @author freya
 */
public class Alumno extends Persona {
    private String curso;
    private double notaMedia;

    public Alumno() {
    }

    public Alumno(String curso, double notaMedia) {
        this.curso = curso;
        this.notaMedia = notaMedia;
    }
    
    public Alumno(String nombre, String apellido, double DNI){
        super(nombre, apellido, DNI);
        
    }
    
    public Alumno(String nombre, String apellido, double DNI, String curso, double notaMedia){
        super(nombre, apellido, DNI);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + ", Curso: " + curso + " ,notaMedia: " + notaMedia;
    }
    public void imprimirAlumno(){
        super.imprime();
        System.out.println("Curso: " + curso + " ,notaMedia: " + notaMedia + "\n");
    }
}
