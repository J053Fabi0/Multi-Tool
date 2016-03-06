
package multi.tool;

import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author JoseFabioAL
 */
public class MultiToolMain {

    
    public static void main(String[] args) throws IOException {
//        Object FuncionElejida = ""; 
//        Object [] listaFunciones = {"Timer"}; //object de las funciones posibles
//        ImageIcon image = new ImageIcon("/Users/JoseFabioAL/Desktop/descargas/itunes_logo2 copia.jpg");
//        FuncionElejida = JOptionPane.showInputDialog(null, "Bienvenido a Multi Tool", "Multi Tool",
//        JOptionPane.QUESTION_MESSAGE, image, listaFunciones, "Timer");
//        
//        if(FuncionElejida == "Timer"){
            Timer timer = new Timer();
            timer.Main();
//        }else{
//            System.exit(0);
//        }
        
    }
    
}
