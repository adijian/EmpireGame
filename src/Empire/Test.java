package Empire;

import javax.swing.*;
import java.awt.*;

public class Test {
    static JFrame jframe;

    public static void main(String[] args) {
        jframe = new JFrame();
        jframe.setSize(500, 500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.getContentPane().setBackground(Color.black);
        jframe.setLayout(null);
        jframe.setTitle("EmpireGame - GUI Demo");
//        jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JPanel jpanel1 = new JPanel();
        jpanel1.setBackground(Color.orange);
        jpanel1.setBounds(0,0,100,100);
        jframe.add(jpanel1);

        JPanel jpanel2 = new JPanel();
        jpanel2.setBounds(100,100,100,100);
        jpanel2.setBackground(Color.blue);

        jframe.add(jpanel2);
        jframe.setVisible(true);
    }

}
