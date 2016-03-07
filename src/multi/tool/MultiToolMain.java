
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
    static String tiempoAcabo = "no";
    static int[] tiempoPanel =null;
    JLabel holder = new JLabel();
    javax.swing.Timer clock = new javax.swing.Timer(1000, this);
    
    
    public static void main(String[] args) throws InterruptedException, IOException {
            MultiToolMain Pruebas22 = new MultiToolMain();
            Panel panel = new Panel();

            tiempoPanel = panel.getTimePanel();
            mp3 mp3 = new mp3();
            mp3.setPlayClick();
            horas = tiempoPanel[0];
            minutos = tiempoPanel[1];
            Pruebas22.Window();
    }
    public void Window(){
        if (tiempoAcabo == "no"){
            clock.start();
            add(holder);
            frame.setSize(290, 100);
            frame.add(this);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            if(minutos <= 0 && horas <= 0){
                segun2 = 1;
                this.remove(holder);
                holder = new JLabel(String.valueOf("El tiempo se ha acabado"));
                holder.setFont(new Font("sans-serif", Font.BOLD, 20));
                add(holder);
                revalidate(); 
                clock.stop();
                mp3 mp3 = new mp3();
                mp3.setPlayAlarm();
            }
        }/*else{
        System.out.println("fad");
        mp3 mp3 = new mp3();
        mp3.setPlayAlarm();
        tiempoAcabo = "no";
        }*/
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (segun2 >= 0 && horas >= 0 &&  minutos >= 0){
            
            if(segun2 <= 0 && horas >= 0 && minutos >= 0){
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
            holder.setFont(new Font("sans-serif", Font.BOLD, 20));
            add(holder);
            revalidate(); 
            clock.stop();
            mp3 mp3 = new mp3();
            mp3.setPlayAlarm();
        }
    }
    
}
