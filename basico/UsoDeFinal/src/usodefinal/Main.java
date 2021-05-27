package usodefinal;
import static usodefinal.UsoDeFinal.getN1;
public class Main {
    public static void main(String[] args) {
       UsoDeFinal uF = new UsoDeFinal();
       
       
       uF.persona1.setNombre("Genaro");
       uF.persona1.setApellido("Gonzalez");
       uF.persona1.setEdad(22);
       
        System.out.println(uF.persona1);
        
        System.out.println(getN1());
    }
}
