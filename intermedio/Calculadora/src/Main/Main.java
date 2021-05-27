package Main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel");
        }
        catch(UnsupportedLookAndFeelException e){
        }
        catch(ClassNotFoundException e){
        }
        catch(InstantiationException e){
        }
        catch(IllegalAccessException e){
        }
        new InterfasGrafica();
    }
    
}
