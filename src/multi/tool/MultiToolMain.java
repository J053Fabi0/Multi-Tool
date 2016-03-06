
package multi.tool;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author JoseFabioAL
 */
public class MultiToolMain extends JPanel implements ActionListener{

    
    JFrame frame = new JFrame();
    static int segun2 = 0;
    static int horas = 1;
    static int minutos = 0;
    static int[] tiempoPanel =null;
    JLabel holder = new JLabel();
    javax.swing.Timer clock = new javax.swing.Timer(1000, this);
    String ii = "";
    
    
    public static void main(String[] args) throws InterruptedException, IOException {
        MultiToolMain Pruebas22 = new MultiToolMain();
        Panel panel = new Panel();
        
        tiempoPanel = panel.getTimePanel();
        horas = tiempoPanel[0];
        minutos = tiempoPanel[1]; 
        Pruebas22.Window();
        
    }
    public void Window(){
        clock.start();
        add(holder);
        frame.setSize(290, 100);
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (segun2 >= 0 && horas >= 0 &&  minutos >= 0){
            if(segun2 <= 0){
                segun2 = 60;
                minutos = minutos - 1;
            }
            if(minutos <= 0 && horas != 0){
                minutos = 59;
                horas = horas - 1;
            }
            segun2 = segun2 - 1;
            this.remove(holder);
            holder = new JLabel(String.valueOf(horas+ " : "+minutos + " : "+segun2));
            holder.setFont(new Font("sans-serif", Font.BOLD, 30));
            add(holder);
            revalidate();
        }else{
            this.remove(holder);
            holder = new JLabel(String.valueOf("El tiempo se ha acabado"));
            holder.setFont(new Font("sans-serif", Font.BOLD, 30));
            add(holder);
            revalidate();
        }
    }
    
}
