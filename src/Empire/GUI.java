package Empire;

import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

public class GUI {
    JFrame window;
    JPanel topPanel, bottomLeftPanelScrollTextBox, coffersPanel;

    public JPanel panelCitizens, panelFarms, panelMining, panelWoodcutting, panelBuilders, panelScholars;
    JPanel[] jPanels = {panelCitizens, panelFarms, panelMining, panelWoodcutting, panelBuilders, panelScholars};

    public JLabel labelCitizens, labelFarms, labelMining, labelWoodcutting, labelBuilders, labelScholars;
    JLabel[] jLabels = {labelCitizens, labelFarms, labelMining, labelWoodcutting, labelBuilders, labelScholars};

    JButton buttonCitizens, buttonFarms, buttonMining, buttonWoodcutting, buttonBuilders, buttonScholars;
    JButton[] jButtonsCitizens = {buttonCitizens, buttonFarms, buttonMining, buttonWoodcutting, buttonBuilders, buttonScholars};
    String[] CitizensButtonsStrings = {"Create", "Transform to Farmer", "Transform to Miner", "Transform to Woodcutter", "Transform to Builder", "Transform to Scholar"};

    JButton buttonCitizens1, buttonMining1, buttonWoodcutting1, buttonBuilders1, buttonScholars1;
    JButton[] jButtonsFarmers = {buttonCitizens1, buttonMining1, buttonWoodcutting1, buttonBuilders1, buttonScholars1};
    String[] FarmerButtonsStrings = {"Create", "Transform to Miner", "Transform to Woodcutter", "Transform to Builder", "Transform to Scholar"};


    JButton buttonCitizens2, buttonFarms2, buttonWoodcutting2, buttonBuilders2, buttonScholars2;
    JButton[] jButtonsMiners = {buttonCitizens2, buttonFarms2, buttonWoodcutting2, buttonBuilders2, buttonScholars2};
    String[] MinersButtonsStrings = {"Create", "Transform to Farmer", "Transform to Woodcutter", "Transform to Builder", "Transform to Scholar"};


    JButton buttonCitizens3, buttonFarms3, buttonMining3, buttonBuilders3, buttonScholars3;
    JButton[] jButtonsWoodcutters = {buttonCitizens3, buttonFarms3, buttonMining3, buttonBuilders3, buttonScholars3};
    String[] WoodcuttersButtonsStrings = {"Create", "Transform to Farmer", "Transform to Miner", "Transform to Builder", "Transform to Scholar"};


    JButton buttonCitizens4, buttonFarms4, buttonMining4, buttonWoodcutting4, buttonScholars4;
    JButton[] jButtonsBuilders = {buttonCitizens4, buttonFarms4, buttonMining4, buttonWoodcutting4, buttonScholars4};
    String[] BuildersButtonsStrings = {"Create", "Transform to Farmer", "Transform to Miner", "Transform to Woodcutter", "Transform to Scholar"};


    JButton buttonCitizens5, buttonFarms5, buttonMining5, buttonWoodcutting5, buttonBuilders5;
    JButton[] jButtonsScholars = {buttonCitizens5, buttonFarms5, buttonMining5, buttonWoodcutting5, buttonBuilders5};
    String[] ScholarsButtonsStrings = {"Create", "Transform to Farmer", "Transform to Miner", "Transform to Woodcutter", "Transform to Builder"};


    Color colorTorquese = new Color(43, 104, 115);
    Color colorLightTorquese = new Color(63, 149, 164);
    Color colorDarkTorquese = new Color(21, 49, 54);
    Color colorDarkTintedTorquese = new Color(29, 67, 73);
    Font font = new Font("Times New Roman", Font.PLAIN,40);
    Font font2 = new Font("Times New Roman", Font.PLAIN,30);
    Font font1 = new Font("Arial", Font.BOLD,13);
    Font font3 = new Font("Arial", Font.BOLD,8);

    public static JTextArea display, coffersLabel;
    JScrollPane scroll;

    public GUI() {
        Frame();
        topPanel();
        bottomPanel();
        addActionListenersForButtons();

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

    public void topPanelsCreation(JPanel jpanel, JLabel jlabel, JButton[] jButtons, String nameOfLabel, ArrayList<Npc.Villager> arrayList, String[] buttonStrings) {
        GridBagConstraints c = new GridBagConstraints();
        jlabel = new JLabel();
        jlabel.setText(nameOfLabel + ": " + arrayList.size());
        jlabel.setForeground(Color.black);
        jlabel.setFont(font2);
//        System.out.println("createTopPanels method created jLabel number " + i + " description:" + jLabels[i]);

        jpanel = new JPanel();
        jpanel.setLayout(new GridBagLayout());
        jpanel.setBackground(colorLightTorquese);
        jpanel.setBorder(BorderFactory.createMatteBorder(2, 10, 12, 6, colorDarkTintedTorquese));
        jpanel.setPreferredSize(new Dimension(250, topPanel.getHeight()));
//        System.out.println("createTopPanels method created jPanel number " + i + " description:" + jPanels[i]);

        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 0;
        jpanel.add(jlabel, c);

        for (int i = 0; i < jButtons.length; i++) {
        jButtons[i] = new JButton();
        jButtons[i].setFocusPainted(false);
        jButtons[i].setPreferredSize(new Dimension(150,20));
        jButtons[i].setFont(font3);
        jButtons[i].setText(buttonStrings[i]);
        c.fill = GridBagConstraints.RELATIVE;
        c.gridx = 1;
        c.gridy = 1+i;

        jpanel.add(jButtons[i], c);
        }

        topPanel.add(jpanel);
    }

    public void createTopPanels() {
        topPanelsCreation(panelCitizens, labelCitizens, jButtonsCitizens, "Citizens", EmpireGame.Engine.villagersArray, CitizensButtonsStrings);
        topPanelsCreation(panelFarms, labelFarms, jButtonsFarmers, "Farmers", EmpireGame.Engine.villagersFarmingArray, FarmerButtonsStrings);
        topPanelsCreation(panelMining, labelMining, jButtonsMiners, "Miners", EmpireGame.Engine.villagersMiningArray, MinersButtonsStrings);
        topPanelsCreation(panelWoodcutting, labelWoodcutting, jButtonsWoodcutters, "Woodcutters", EmpireGame.Engine.villagersWoodcuttingArray, WoodcuttersButtonsStrings);
        topPanelsCreation(panelBuilders, labelBuilders, jButtonsBuilders, "Builders", EmpireGame.Engine.villagersBuildersArray, BuildersButtonsStrings);
        topPanelsCreation(panelScholars, labelScholars, jButtonsScholars, "Scholars", EmpireGame.Engine.villlagersScholarsArray, ScholarsButtonsStrings);
    }

    public void panelsNaming() {
        jLabels[0].setText("Citizens: " + EmpireGame.Engine.villagersArray.size());
    }

    public void addActionListenersForButtons() {
        jButtonsCitizens[0].addActionListener(e -> {
            CreateActions.createVillagerGui();
        });
        jButtonsCitizens[1].addActionListener(e -> {
            CreateActions.transformVillagers(EmpireGame.Engine.villagersArray, EmpireGame.Engine.villagersFarmingArray);
            labelCitizens.setText("Citizens: " + EmpireGame.Engine.villagersArray.size());
        });
        jButtonsCitizens[2].addActionListener(e -> {
            CreateActions.createVillagerGui();
        });
        jButtonsCitizens[3].addActionListener(e -> {
            CreateActions.createVillagerGui();
        });
        jButtonsCitizens[4].addActionListener(e -> {
            CreateActions.createVillagerGui();
        });
        jButtonsCitizens[5].addActionListener(e -> {
            CreateActions.createVillagerGui();
        });
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
