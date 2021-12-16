package Empire;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.net.URL;

public class GUI {
    JFrame window;
    JPanel topPanel, bottomPanel, bottomLeftPanelScrollTextBox;

    JPanel panelCitizens, panelFarms, panelMining, panelWoodcutting, panelBuilders, panelScholars;
    JPanel[] jPanels = {panelCitizens, panelFarms, panelMining, panelWoodcutting, panelBuilders, panelScholars};

    JLabel labelCitizens, labelFarms, labelMining, labelWoodcutting, labelBuilders, labelScholars;
    JLabel[] jLabels = {labelCitizens, labelFarms, labelMining, labelWoodcutting, labelBuilders, labelScholars};

    JButton buttonCitizens, buttonFarms, buttonMining, buttonWoodcutting, buttonBuilders, buttonScholars;
    JButton[] jButtons = {buttonCitizens, buttonFarms, buttonMining, buttonWoodcutting, buttonBuilders, buttonScholars};

    Color colorTorquese = new Color(43, 104, 115);
    Color colorLightTorquese = new Color(63, 149, 164);
    Color colorDarkTorquese = new Color(21, 49, 54);
    Color colorDarkTintedTorquese = new Color(29, 67, 73);
    Font font = new Font("Times New Roman", Font.PLAIN,40);
    Font font1 = new Font("Arial", Font.BOLD,10);
    
    public static JTextArea display;
    JScrollPane scroll;

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        Frame();
        topPanel();
        bottomPanel();
        panelsNaming();
        addActionListenersForButtons();


        window.setVisible(true);
    }

    public void Frame() {
        window = new JFrame();
        window.setSize(1920, 1080);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        window.setTitle("EmpireGame - GUI Demo");
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
            jPanels[i].setBackground(colorLightTorquese);
            jPanels[i].setBorder(BorderFactory.createMatteBorder(2, 10, 12, 6, colorDarkTintedTorquese));
            jPanels[i].setPreferredSize(new Dimension(250, 200));
            System.out.println("createTopPanels method created jPanel number " + i + " description:" + jPanels[i]);

            c.fill = GridBagConstraints.RELATIVE;
            c.gridx = 1;
            c.gridy = 0;
            jPanels[i].add(jLabels[i], c);

            jButtons[i] = new JButton();
            jButtons[i].setPreferredSize(new Dimension(100,30));
            c.fill = GridBagConstraints.RELATIVE;
            c.gridx = 1;
            c.gridy = 2;
            jButtons[i].setFont(font1);
            jButtons[i].setText("Transform");
            jPanels[i].add(jButtons[i], c);

            topPanel.add(jPanels[i]);
        }
    }

    public void panelsNaming() {
        jLabels[0].setText("Citizens");
        jLabels[1].setText("Farms");
        jLabels[2].setText("Mining");
        jLabels[3].setText("Woodcutting");
        jLabels[4].setText("Builders");
        jLabels[5].setText("Scholars");
    }

    public void addActionListenersForButtons() {
        jButtons[0].addActionListener(e -> {
            CreateActions.createVillagerGui();
        });
    }

    public void topPanel() {
        topPanel = new JPanel();
        topPanel.setBounds(0,0,1920,220);
        topPanel.setBackground(colorTorquese);
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 60,10));

        createTopPanels();

        window.add(topPanel);
    }

    public void bottomPanel() {
        bottomPanel = new JPanel();
        bottomPanel.setBounds(0,topPanel.getHeight(), 1920, 1080-topPanel.getHeight());
        bottomPanel.setBackground(colorDarkTorquese);
        window.add(bottomPanel);

        bottomLeftPanelScrollTextBox = new JPanel();
        bottomLeftPanelScrollTextBox.setBackground(colorLightTorquese);
        bottomLeftPanelScrollTextBox.setBounds(10,250,600,1080-topPanel.getHeight());

        display = new JTextArea(15,19);
        DefaultCaret caret = (DefaultCaret)display.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        display.append("~ Game started ~");
        display.setLineWrap(true);
        display.setFont(font);
        display.setBackground(colorLightTorquese);
        display.setEditable(true);

        scroll = new JScrollPane(display);

        bottomLeftPanelScrollTextBox.add(scroll);

        window.add(bottomLeftPanelScrollTextBox);
        window.setVisible(true);
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
