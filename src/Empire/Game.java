package Empire;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.net.URL;

public class Game {
    JFrame window;
    JPanel topPanel, bottomPanel, bottomLeftPanelScrollTextBox;
    JLabel JLabelButton;
    JButton jButton1;

    JPanel panelCitizens, panelFarms, panelMining, panelWoodcutting, panelBuilders, panelScholars;
    JPanel[] jPanels = {panelCitizens, panelFarms, panelMining, panelWoodcutting, panelBuilders, panelScholars};

    JLabel labelCitizens, labelFarms, labelMining, labelWoodcutting, labelBuilders, labelScholars;
    JLabel[] jLabels = {labelCitizens, labelFarms, labelMining, labelWoodcutting, labelBuilders, labelScholars};

    JButton buttonCitizens, buttonFarms, buttonMining, buttonWoodcutting, buttonBuilders, buttonScholars;
    JButton[] jButtons = {buttonCitizens, buttonFarms, buttonMining, buttonWoodcutting, buttonBuilders, buttonScholars};

    Color colorTorquese = new Color(46, 115, 128);
    Color colorLightTorquese = new Color(63, 149, 164);
    Color colorDarkTorquese = new Color(21, 49, 54);
    Color colorDarkTintedTorquese = new Color(29, 67, 73);
    Font font = new Font("Times New Roman", Font.PLAIN,50);

    JTextArea display;
    JScrollPane scroll;

    public static void main(String[] args) {
        new Game();
    }

    public Game() {
        window = new JFrame();
        window.setSize(1920, 1080);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
//        window.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        window.setLayout(null);
        window.setVisible(true);
        window.setTitle("EmpireGame - GUI Demo");
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        con = window.getContentPane();

        topPanel();
        bottomPanel();

        window.setVisible(true);
    }

    public void createTopPanels() {
        for(int i = 0; i<jLabels.length; i++) {
            jLabels[i] = new JLabel("test");
            jLabels[i].setForeground(Color.black);
            jLabels[i].setFont(font);
            System.out.println("createTopPanels method created jLabel number " + i + " description:" + jLabels[i]);

            jPanels[i] = new JPanel();
            jPanels[i].setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            jPanels[i].setBackground(colorTorquese);
            jPanels[i].setBorder(BorderFactory.createMatteBorder(2, 10, 12, 6, colorDarkTintedTorquese));
            jPanels[i].setPreferredSize(new Dimension(250, 200));
            System.out.println("createTopPanels method created jPanel number " + i + " description:" + jPanels[i]);
            
            c.fill = GridBagConstraints.RELATIVE;
            c.gridx = 1;
            c.gridy = 0;
            jPanels[i].add(jLabels[i], c);

            jButtons[i] = new JButton();
            jButtons[i].setPreferredSize(new Dimension(50,30));
            c.fill = GridBagConstraints.RELATIVE;
            c.gridx = 1;
            c.gridy = 2;
            jPanels[i].add(jButtons[i], c);

            topPanel.add(jPanels[i]);
        }
    }

    public void topPanel() {
        topPanel = new JPanel();
        topPanel.setBounds(0,0,1920,220);
        topPanel.setBackground(colorLightTorquese);
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 60,10));

        createTopPanels();

        window.add(topPanel);
    }

    public void bottomPanel() {
        bottomPanel = new JPanel();
        bottomPanel.setBounds(0,topPanel.getHeight(), 1920, 1080-topPanel.getHeight());
        bottomPanel.setBackground(colorDarkTintedTorquese);
        window.add(bottomPanel);

        bottomLeftPanelScrollTextBox = new JPanel();
        bottomLeftPanelScrollTextBox.setBackground(colorLightTorquese);
        bottomLeftPanelScrollTextBox.setBounds(10,250,600,1080-topPanel.getHeight());

        display = new JTextArea(12,16);
        display.append(":333333333");
        display.setLineWrap(true);
        display.setFont(font);
        display.setBackground(colorLightTorquese);
        display.setEditable(true);

        scroll = new JScrollPane(display);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
//        createTopPanels();

        bottomLeftPanelScrollTextBox.add(scroll);

        window.add(bottomLeftPanelScrollTextBox);
        window.setVisible(true);
//        jLabels[0].setText("wee");
    }





    // change size of image and set label to form
    public void transformImage(URL path, Image image, JLabel tabLabel, int width, int height, int fontSize, int textGap) {
        ImageIcon villagersTab = new ImageIcon(path);
        image = villagersTab.getImage(); // transform it
        Image newimage = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way}
        villagersTab = new ImageIcon(newimage);  // transform it back
        tabLabel.setIcon(villagersTab);
        tabLabel.setFont(new Font("Comic Sans", Font.BOLD, fontSize));
        tabLabel.setForeground(Color.WHITE);
        tabLabel.setIconTextGap(textGap);
        tabLabel.setText(String.valueOf(EmpireGame.Engine.villagersArray.size()));
    }
}
