package Empire;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class GUI {

    public static void main(String[] args) {
//        Colors
        Color frameColor = new Color(36, 91, 101);
        Color debugColor1 = new Color(101, 36, 41);

//        Frame and display
        JFrame frame = new JFrame();
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(750,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(frameColor);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:/JavaProject/EmpireGame/out/production/EmpireGame/Images/icon.png");
        frame.setIconImage(icon);
        frame.setTitle("EmpireGame - GUI Demo");

//        Panel for currencies
        JPanel panelCurrencies = new JPanel(new BorderLayout());
        panelCurrencies.setBackground(frameColor);

//        Villagers tab
        ImageIcon villagersTab = new ImageIcon("C:/JavaProject/EmpireGame/src/Images/Raw/image1.png");
        Image image1 = villagersTab.getImage(); // transform it
//        Image newimg1 = image1.getScaledInstance((int) (350/1.5), (int) (200/1.5),  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        Image newimg1 = image1.getScaledInstance((int) (350*2), (int) (200*2),  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        villagersTab = new ImageIcon(newimg1);  // transform it back
        JLabel villagersTabLabel = new JLabel();
        villagersTabLabel.setIcon(villagersTab);
        villagersTabLabel.setFont(new Font("Comic Sans", Font.BOLD, 200));
        villagersTabLabel.setForeground(Color.WHITE);
        villagersTabLabel.setIconTextGap(-550);
        villagersTabLabel.setText(String.valueOf(EmpireGame.Engine.villagersArray.size()));

//        Villagers Button

        JButton villagersButton = new JButton();
        villagersButton.setBounds(475,208,(int) (148*1.5),(int) (131*1.5));
        ImageIcon villagersTabButtonIcon = new ImageIcon("C:/JavaProject/EmpireGame/src/Images/Raw/button.png");
        Image imagevillagersTabButtonIcon = villagersTabButtonIcon.getImage(); // transform it
        Image newimgvillagersTabButtonIcon = imagevillagersTabButtonIcon.getScaledInstance((int) (148*1.5), (int) (131*1.5),  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        villagersTabButtonIcon = new ImageIcon(newimgvillagersTabButtonIcon);  // transform it back
        villagersButton.setIcon(villagersTabButtonIcon);
        villagersButton.setOpaque(false);
        villagersButton.setContentAreaFilled(false);
        villagersButton.setBorderPainted(false);

        villagersButton.addActionListener(e -> {
            System.out.println("A villager was born");

            ImageIcon villagersTabButtonIconPressed = new ImageIcon("C:/JavaProject/EmpireGame/src/Images/Raw/button1.png");
            Image imagevillagersTabButtonIconPressed = villagersTabButtonIconPressed.getImage(); // transform it
            Image newimgvillagersTabButtonIconPressed = imagevillagersTabButtonIconPressed.getScaledInstance((int) (148*1.5), (int) (131*1.5),  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
            villagersTabButtonIconPressed = new ImageIcon(newimgvillagersTabButtonIconPressed);  // transform it back
            villagersButton.setPressedIcon(villagersTabButtonIconPressed);

            CreateActions.createVillager();
            villagersTabLabel.setText(String.valueOf(EmpireGame.Engine.villagersArray.size()));
        });

//        Refresh view
        villagersTabLabel.add(villagersButton, BorderLayout.EAST);
        panelCurrencies.add(villagersTabLabel, BorderLayout.WEST);

        frame.add(panelCurrencies, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}