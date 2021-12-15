package Empire;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class test {
    public static void main ( String[] args )
    {
        JButton jbutton = new JButton();
        JLabel jlabel = new JLabel("meow");
        JPanel jpanel = new JPanel();
        JFrame jframe = new JFrame();
        jframe.setLayout(null);
        jframe.getContentPane().setBackground(Color.blue);
        jframe.setSize(500, 500);


        jbutton.setBackground(Color.green);
        jbutton.setBounds(0,0,125,125);
        jlabel.setBackground(Color.orange);
        jlabel.setBounds(0,0,125,125);
        jlabel.setLayout(null);
        jlabel.add(jbutton);
        jpanel.setBackground(Color.white);
        jpanel.setBounds(0,0,250,250);
        jpanel.setLayout(null);
        jpanel.add(jlabel);
        jframe.add(jpanel);
        jframe.setVisible(true);
    }
}
