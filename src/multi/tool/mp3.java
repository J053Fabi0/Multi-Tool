/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi.tool;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author JoseFabioAL
 */
public class mp3 {
    public void setPlayClick(){
                         try {

                        FileInputStream fis;
                        Player player;
                        fis = new FileInputStream(
                                "../Multi Tool/click.mp3");
                        BufferedInputStream bis = new BufferedInputStream(fis);

                        player = new Player(bis); // Llamada a constructor de la clase Player
                        player.play();          // Llamada al método play
                      }
                       catch (JavaLayerException e) {
                       e.printStackTrace();
                       }catch (FileNotFoundException e) {
                       e.printStackTrace();
                       }
    }
    
    public void setPlayAlarm(){
                         try {

                        FileInputStream fis;
                        Player player;
                        fis = new FileInputStream(
                                "../Multi Tool/alarm.mp3");
                        BufferedInputStream bis = new BufferedInputStream(fis);

                        player = new Player(bis); // Llamada a constructor de la clase Player y bis es BufferedInputStream el cual tiene fis que es FileInputStream
                        player.play();          // Llamada al método play
                      }
                       catch (JavaLayerException e) {
                       e.printStackTrace();
                       }catch (FileNotFoundException e) {
                       e.printStackTrace();
                       }
    }
}
