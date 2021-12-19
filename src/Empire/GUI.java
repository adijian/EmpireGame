package Empire;

import javax.swing.*;
import javax.swing.text.DefaultCaret;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

public class GUI {
    JFrame window;
    JPanel topPanel, bottomLeftPanelScrollTextBox, coffersPanel;

    JPanel panelCitizens, panelFarms, panelMining, panelWoodcutting, panelBuilders, panelScholars;
    JTextPane textCitizens, textFarms, textMining, textWoodcutting, textBuilders, textScholars;

    //Citizens
    JButton buttonCitizens, buttonCitizenstoFarms;
    //Farmers
    JButton buttonFarmstoCitizens;
    //Miners
    JButton buttonMinerstoCitizens;
    //Woodcutters
    JButton buttonWoodcutterstoCitizens;
    //Builders
    JButton buttonBuilderstoCitizens;
    //Scholars
    JButton buttonScholarstoCitizens;

    Color colorTorquese = new Color(43, 104, 115);
    Color colorLightTorquese = new Color(63, 149, 164);
    Color colorDarkTorquese = new Color(21, 49, 54);
    Color colorDarkTintedTorquese = new Color(29, 67, 73);
    Font font = new Font("Times New Roman", Font.PLAIN,40);
    Font font2 = new Font("Times New Roman", Font.PLAIN,30);
    Font font1 = new Font("Arial", Font.BOLD,13);
    Font font3 = new Font("Arial", Font.BOLD,10);

    public static JTextArea display, coffersLabel;
    JScrollPane scroll;

    public GUI() {
        Frame();
        topPanel();
        bottomPanel();
        addActionListenersForButtons();
        panelUpdate();
        window.setVisible(true);
    }

    public void Frame() {
        window = new JFrame();
        window.setSize(1920, 1080);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(colorDarkTorquese);
        window.setLayout(null);
        window.setVisible(true);
        window.setTitle("EmpireGame - GUI Demo");
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void createTopPanels() {
        //Citizens
        GridBagConstraints c = new GridBagConstraints();
        textCitizens = new JTextPane();
//        textCitizens.setText(" ");
        textCitizens.setForeground(Color.black);
        textCitizens.setFont(font2);
        textCitizens.setBackground(colorLightTorquese);
        textCitizens.setEditable(false);
        StyledDocument style = textCitizens.getStyledDocument();
        SimpleAttributeSet align= new SimpleAttributeSet();
        StyleConstants.setAlignment(align, StyleConstants.ALIGN_CENTER);
        style.setParagraphAttributes(0, style.getLength(), align, false);

        panelCitizens = new JPanel();
        panelCitizens.setLayout(new GridBagLayout());
        panelCitizens.setBackground(colorLightTorquese);
        panelCitizens.setBorder(BorderFactory.createMatteBorder(2, 10, 12, 6, colorDarkTintedTorquese));
        panelCitizens.setPreferredSize(new Dimension(250, topPanel.getHeight()));

        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 0;
        panelCitizens.add(textCitizens, c);
        buttonCitizens = new JButton();
        buttonCitizens.setFocusPainted(false);
        buttonCitizens.setPreferredSize(new Dimension(150,20));
        buttonCitizens.setFont(font3);
        buttonCitizens.setText("Create");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 1;
        panelCitizens.add(buttonCitizens, c);


        buttonCitizenstoFarms = new JButton();
        buttonCitizenstoFarms.setFocusPainted(false);
        buttonCitizenstoFarms.setPreferredSize(new Dimension(150,20));
        buttonCitizenstoFarms.setFont(font3);
        buttonCitizenstoFarms.setText("Transform to Farmer");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 2;
        panelCitizens.add(buttonCitizenstoFarms, c);

        topPanel.add(panelCitizens);

        //Farmers
        textFarms = new JTextPane();
        textFarms.setText(" ");
        textFarms.setForeground(Color.black);
        textFarms.setFont(font2);
        textFarms.setBackground(colorLightTorquese);
        textFarms.setEditable(false);

        panelFarms = new JPanel();
        panelFarms.setLayout(new GridBagLayout());
        panelFarms.setBackground(colorLightTorquese);
        panelFarms.setBorder(BorderFactory.createMatteBorder(2, 10, 12, 6, colorDarkTintedTorquese));
        panelFarms.setPreferredSize(new Dimension(250, topPanel.getHeight()));

        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 0;
        panelFarms.add(textFarms, c);

        buttonFarmstoCitizens = new JButton();
        buttonFarmstoCitizens.setFocusPainted(false);
        buttonFarmstoCitizens.setPreferredSize(new Dimension(150,20));
        buttonFarmstoCitizens.setFont(font3);
        buttonFarmstoCitizens.setText("Idle");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 1;
        panelFarms.add(buttonFarmstoCitizens, c);

        topPanel.add(panelFarms);

        //Mining
        textMining = new JTextPane();
        textMining.setText(" ");
        textMining.setForeground(Color.black);
        textMining.setFont(font2);
        textMining.setBackground(colorLightTorquese);
        textMining.setEditable(false);

        panelMining = new JPanel();
        panelMining.setLayout(new GridBagLayout());
        panelMining.setBackground(colorLightTorquese);
        panelMining.setBorder(BorderFactory.createMatteBorder(2, 10, 12, 6, colorDarkTintedTorquese));
        panelMining.setPreferredSize(new Dimension(250, topPanel.getHeight()));

        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 0;
        panelMining.add(textMining, c);

        buttonMinerstoCitizens = new JButton();
        buttonMinerstoCitizens.setFocusPainted(false);
        buttonMinerstoCitizens.setPreferredSize(new Dimension(150,20));
        buttonMinerstoCitizens.setFont(font3);
        buttonMinerstoCitizens.setText("Idle");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 1;
        panelMining.add(buttonMinerstoCitizens, c);

        topPanel.add(panelMining);

//        //Woodcutting
        textWoodcutting = new JTextPane();
        textWoodcutting.setText(" ");
        textWoodcutting.setForeground(Color.black);
        textWoodcutting.setFont(font2);
        textWoodcutting.setBackground(colorLightTorquese);
        textWoodcutting.setEditable(false);

        panelWoodcutting = new JPanel();
        panelWoodcutting.setLayout(new GridBagLayout());
        panelWoodcutting.setBackground(colorLightTorquese);
        panelWoodcutting.setBorder(BorderFactory.createMatteBorder(2, 10, 12, 6, colorDarkTintedTorquese));
        panelWoodcutting.setPreferredSize(new Dimension(250, topPanel.getHeight()));

        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 0;
        panelWoodcutting.add(textWoodcutting, c);

        buttonWoodcutterstoCitizens = new JButton();
        buttonWoodcutterstoCitizens.setFocusPainted(false);
        buttonWoodcutterstoCitizens.setPreferredSize(new Dimension(150,20));
        buttonWoodcutterstoCitizens.setFont(font3);
        buttonWoodcutterstoCitizens.setText("Transform");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 1;
        panelWoodcutting.add(buttonWoodcutterstoCitizens, c);

        topPanel.add(panelWoodcutting);

//        //Builders
        textBuilders = new JTextPane();
        textBuilders.setText(" ");
        textBuilders.setForeground(Color.black);
        textBuilders.setFont(font2);
        textBuilders.setBackground(colorLightTorquese);
        textBuilders.setEditable(false);

        panelBuilders = new JPanel();
        panelBuilders.setLayout(new GridBagLayout());
        panelBuilders.setBackground(colorLightTorquese);
        panelBuilders.setBorder(BorderFactory.createMatteBorder(2, 10, 12, 6, colorDarkTintedTorquese));
        panelBuilders.setPreferredSize(new Dimension(250, topPanel.getHeight()));

        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 0;
        panelBuilders.add(textBuilders, c);

        buttonBuilderstoCitizens = new JButton();
        buttonBuilderstoCitizens.setFocusPainted(false);
        buttonBuilderstoCitizens.setPreferredSize(new Dimension(150,20));
        buttonBuilderstoCitizens.setFont(font3);
        buttonBuilderstoCitizens.setText("Transform");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 1;
        panelBuilders.add(buttonBuilderstoCitizens, c);

        topPanel.add(panelBuilders);

//        //Scholars
        textScholars = new JTextPane();
        textScholars.setText(" ");
        textScholars.setForeground(Color.black);
        textScholars.setFont(font2);
        textScholars.setBackground(colorLightTorquese);
        textScholars.setEditable(false);

        panelScholars = new JPanel();
        panelScholars.setLayout(new GridBagLayout());
        panelScholars.setBackground(colorLightTorquese);
        panelScholars.setBorder(BorderFactory.createMatteBorder(2, 10, 12, 6, colorDarkTintedTorquese));
        panelScholars.setPreferredSize(new Dimension(250, topPanel.getHeight()));

        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 0;
        panelScholars.add(textScholars, c);

        buttonScholarstoCitizens = new JButton();
        buttonScholarstoCitizens.setFocusPainted(false);
        buttonScholarstoCitizens.setPreferredSize(new Dimension(150,20));
        buttonScholarstoCitizens.setFont(font3);
        buttonScholarstoCitizens.setText("Idle");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 1;
        panelScholars.add(buttonScholarstoCitizens, c);

        topPanel.add(panelScholars);
    }

    public void addActionListenersForButtons() {
        buttonCitizens.addActionListener(e -> {
            CreateActions.createVillagerGui();
        });
        buttonCitizenstoFarms.addActionListener(e -> {
            CreateActions.transformVillagers(EmpireGame.Engine.villagersArray, EmpireGame.Engine.villagersFarmingArray);
        });
    }

    public void panelUpdate() {
        textCitizens.setText("Citizens: " + EmpireGame.Engine.villagersArray.size());
        textFarms.setText("Farmers: " + EmpireGame.Engine.villagersFarmingArray.size());
        textMining.setText("Miners: " + EmpireGame.Engine.villagersMiningArray.size());
        textWoodcutting.setText("Woodcutters: " + EmpireGame.Engine.villagersWoodcuttingArray.size());
        textBuilders.setText("Builders: " + EmpireGame.Engine.villagersBuildersArray.size());
        textScholars.setText("Scholars: " + EmpireGame.Engine.villlagersScholarsArray.size());
    }

    public void topPanel() {
        topPanel = new JPanel();
        topPanel.setBounds(0,0,window.getWidth(),220);
        topPanel.setBackground(colorTorquese);
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 60,10));

        createTopPanels();

        window.add(topPanel);
    }

    public void bottomLeftPanel() {
        // bottom left panel with scrolling text box
        bottomLeftPanelScrollTextBox = new JPanel();
        bottomLeftPanelScrollTextBox.setBackground(colorLightTorquese);
        bottomLeftPanelScrollTextBox.setBounds(10,250,600,1080-220);
        display = new JTextArea(20,25);
        DefaultCaret caret = (DefaultCaret)display.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        display.append("~ Game started ~");
        display.setLineWrap(true);
        display.setFont(font2);
        display.setBackground(colorLightTorquese);
        display.setEditable(false);

        scroll = new JScrollPane(display);
        bottomLeftPanelScrollTextBox.add(scroll);

        window.add(bottomLeftPanelScrollTextBox);

    }

    public void coffersPanel() {
        coffersPanel = new JPanel();
        coffersPanel.setBackground(colorLightTorquese);
        coffersPanel.setBounds(620,250,250,200);

        coffersLabel = new JTextArea(6,10);
        coffersLabel.setForeground(Color.black);
        coffersLabel.setBackground(colorLightTorquese);
        coffersLabel.setFont(font2);
        coffersLabel.setLineWrap(true);
//        coffersLabel.setText(String.valueOf(Counter.honey));
        coffersLabel.setEditable(false);

        coffersPanel.add(coffersLabel);
        window.add(coffersPanel);
    }

    public void coffersPanelUpdate() {
        coffersLabel.setText("Coffers\n" + "Honey: " + Counter.honey);
    }

    public void bottomPanel() {
        bottomLeftPanel();
        coffersPanel();
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
