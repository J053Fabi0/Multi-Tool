/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi.tool;

import java.awt.Font;
import java.io.IOException;
import javax.swing.Box;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JoseFabioAL
 */
public class Timer extends JLabel implements ActionListener{
    JFrame frame = new JFrame();
    int segun2 = 1;
    public int minutos = 1;
    public int horas = 1;
    JLabel holder = new JLabel();
    javax.swing.Timer clock = new javax.swing.Timer(1000, this);
    
    public void Main() throws IOException{
        Timer timer = new Timer();
        Panel panel = new Panel();
        int[] array = panel.getTimePanel();
        horas = array[0];
        minutos = array[1];
        System.out.println(horas);
        System.out.println(minutos);
        timer.Window();
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
            System.out.println(horas+ " : "+minutos + " : "+segun2);
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
