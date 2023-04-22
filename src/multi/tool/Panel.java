/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi.tool;

import java.io.IOException;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author JoseFabioAL
 */
public class Panel {
  static int horas;
  static int minutos;

  public int[] getTimePanel() throws IOException {
    JTextField horass = new JTextField(5);
    JTextField minutoss = new JTextField(5);

    JPanel myPanel = new JPanel();
    myPanel.add(new JLabel("Horas"));
    myPanel.add(horass);
    myPanel.add(Box.createHorizontalStrut(15)); // a spacer
    myPanel.add(new JLabel("Minutos"));
    myPanel.add(minutoss);

    int result = JOptionPane.showConfirmDialog(null, myPanel,
        "Edit timer", JOptionPane.OK_CANCEL_OPTION);
    if (result == JOptionPane.OK_OPTION) {
      int horas = Integer.parseInt(horass.getText());
      int minutos = Integer.parseInt(minutoss.getText());
      if (horas > 60) {
        horas = 60;
      }
      if (minutos > 60) {
        minutos = 60;
      }
      int[] array = { horas, minutos };
      return array;

    }
    return null;

  }
}
