package Empire;

import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.net.URL;

public class GUI {
    JFrame window;
    JPanel topPanel, bottomLeftPanelScrollTextBox, coffersPanel;

    JPanel panelCitizens, panelFarms, panelMining, panelWoodcutting, panelBuilders, panelScholars;
    JPanel[] jPanels = {panelCitizens, panelFarms, panelMining, panelWoodcutting, panelBuilders, panelScholars};

    JLabel labelCitizens, labelFarms, labelMining, labelWoodcutting, labelBuilders, labelScholars;
    JLabel[] jLabels = {labelCitizens, labelFarms, labelMining, labelWoodcutting, labelBuilders, labelScholars};

    JButton buttonCitizens, buttonFarms, buttonMining, buttonWoodcutting, buttonBuilders, buttonScholars;
    JButton[] jButtons = {buttonCitizens, buttonFarms, buttonMining, buttonWoodcutting, buttonBuilders, buttonScholars};

    JButton buttonCitizens1, buttonFarms1, buttonMining1, buttonWoodcutting1, buttonBuilders1, buttonScholars1;
    JButton[] jButtons1 = {buttonCitizens1, buttonFarms1, buttonMining1, buttonWoodcutting1, buttonBuilders1, buttonScholars1};

    JButton buttonCitizens2, buttonFarms2, buttonMining2, buttonWoodcutting2, buttonBuilders2, buttonScholars2;
    JButton[] jButtons2 = {buttonCitizens2, buttonFarms2, buttonMining2, buttonWoodcutting2, buttonBuilders2, buttonScholars2};

    JButton buttonCitizens3, buttonFarms3, buttonMining3, buttonWoodcutting3, buttonBuilders3, buttonScholars3;
    JButton[] jButtons3 = {buttonCitizens3, buttonFarms3, buttonMining3, buttonWoodcutting3, buttonBuilders3, buttonScholars3};

    JButton buttonCitizens4, buttonFarms4, buttonMining4, buttonWoodcutting4, buttonBuilders4, buttonScholars4;
    JButton[] jButtons4 = {buttonCitizens4, buttonFarms4, buttonMining4, buttonWoodcutting4, buttonBuilders4, buttonScholars4};

    JButton buttonCitizens5, buttonFarms5, buttonMining5, buttonWoodcutting5, buttonBuilders5, buttonScholars5;
    JButton[] jButtons5 = {buttonCitizens5, buttonFarms5, buttonMining5, buttonWoodcutting5, buttonBuilders5, buttonScholars5};

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
        panelsNaming();
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

    public void createTopPanels() {
        GridBagConstraints c1 = new GridBagConstraints();

        for(int i = 0; i<jLabels.length; i++) {
            jLabels[i] = new JLabel("test");
            jLabels[i].setForeground(Color.black);
            jLabels[i].setFont(font2);
            System.out.println("createTopPanels method created jLabel number " + i + " description:" + jLabels[i]);

            jPanels[i] = new JPanel();
            jPanels[i].setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            jPanels[i].setBackground(colorLightTorquese);
            jPanels[i].setBorder(BorderFactory.createMatteBorder(2, 10, 12, 6, colorDarkTintedTorquese));
            jPanels[i].setPreferredSize(new Dimension(250, topPanel.getHeight()));
            System.out.println("createTopPanels method created jPanel number " + i + " description:" + jPanels[i]);

            c.fill = GridBagConstraints.RELATIVE;
            c.gridx = 1;
            c.gridy = 0;
            jPanels[i].add(jLabels[i], c);

            jButtons[i] = new JButton();
            jButtons[i].setFocusPainted(false);
            jButtons[i].setPreferredSize(new Dimension(100,30));
            jButtons[i].setFont(font3);
            jButtons[i].setText("Idle");
            c.fill = GridBagConstraints.RELATIVE;
            c.gridx = 1;
            c.gridy = 2;

            jPanels[i].add(jButtons[i], c);

            jButtons1[i] = new JButton();
            jButtons1[i].setFocusPainted(false);
            jButtons1[i].setPreferredSize(new Dimension(100,30));
            jButtons1[i].setFont(font3);
            jButtons1[i].setText("2");
            c1.fill = GridBagConstraints.RELATIVE;
            c1.gridx = 1;
            c1.gridy = 3;

            jPanels[i].add(jButtons1[i], c1);

            jButtons2[i] = new JButton();
            jButtons2[i].setFocusPainted(false);
            jButtons2[i].setPreferredSize(new Dimension(100,30));
            jButtons2[i].setFont(font3);
            jButtons2[i].setText("3");
            c1.fill = GridBagConstraints.RELATIVE;
            c1.gridx = 1;
            c1.gridy = 4;

            jPanels[i].add(jButtons2[i], c1);

            jButtons3[i] = new JButton();
            jButtons3[i].setFocusPainted(false);
            jButtons3[i].setPreferredSize(new Dimension(100,30));
            jButtons3[i].setFont(font3);
            jButtons3[i].setText("4");
            c1.fill = GridBagConstraints.RELATIVE;
            c1.gridx = 1;
            c1.gridy = 5;

            jPanels[i].add(jButtons3[i], c1);

            jButtons4[i] = new JButton();
            jButtons4[i].setFocusPainted(false);
            jButtons4[i].setPreferredSize(new Dimension(100,30));
            jButtons4[i].setFont(font3);
            jButtons4[i].setText("5");
            c1.fill = GridBagConstraints.RELATIVE;
            c1.gridx = 1;
            c1.gridy = 6;

            jPanels[i].add(jButtons4[i], c1);

            jButtons5[i] = new JButton();
            jButtons5[i].setFocusPainted(false);
            jButtons5[i].setPreferredSize(new Dimension(100,30));
            jButtons5[i].setFont(font3);
            jButtons5[i].setText("6");
            c1.fill = GridBagConstraints.RELATIVE;
            c1.gridx = 1;
            c1.gridy = 7;

            jPanels[i].add(jButtons5[i], c1);

            topPanel.add(jPanels[i]);
        }
    }

    public void panelsNaming() {
        jLabels[0].setText("Citizens: " + EmpireGame.Engine.villagersArray.size());
        jButtons[0].setText("Create");
        jButtons1[0].setText("Transform to Farmer");
        jButtons2[0].setText("Transform to Miner");
        jButtons3[0].setText("Transform to Woodcutter");
        jButtons4[0].setText("Transform to Builder");
        jButtons5[0].setText("Transform to Scholar");

        jLabels[1].setText("Farmers: " + EmpireGame.Engine.villagersFarmingArray.size());

        jLabels[2].setText("Miners: " + EmpireGame.Engine.villagersMiningArray.size());

        jLabels[3].setText("Woodcutters: " + EmpireGame.Engine.villagersWoodcuttingArray.size());

        jLabels[4].setText("Builders: " + EmpireGame.Engine.villagersBuildingArray.size());

        jLabels[5].setText("Scholars: " + EmpireGame.Engine.villlagersScholarsArray.size());
    }

    public void addActionListenersForButtons() {
        jButtons[0].addActionListener(e -> {
            CreateActions.createVillagerGui();
        });
        jButtons1[0].addActionListener(e -> {
            CreateActions.transformVillagers(EmpireGame.Engine.villagersArray, EmpireGame.Engine.villagersFarmingArray);
        });
        jButtons2[0].addActionListener(e -> {
            CreateActions.transformVillagers(EmpireGame.Engine.villagersArray, EmpireGame.Engine.villagersMiningArray);
        });
        jButtons3[0].addActionListener(e -> {
            CreateActions.transformVillagers(EmpireGame.Engine.villagersArray, EmpireGame.Engine.villagersWoodcuttingArray);
        });
        jButtons4[0].addActionListener(e -> {
            CreateActions.transformVillagers(EmpireGame.Engine.villagersArray, EmpireGame.Engine.villagersBuildingArray);
        });
        jButtons5[0].addActionListener(e -> {
            CreateActions.transformVillagers(EmpireGame.Engine.villagersArray, EmpireGame.Engine.villlagersScholarsArray);
        });

        jButtons[1].addActionListener(e -> {
            GUI.display.append("\njButton2");
        });
        jButtons[2].addActionListener(e -> {
            GUI.display.append("\njButton2");
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
        bottomLeftPanelScrollTextBox.setBounds(10,250,600,1080-topPanel.getHeight());
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
        coffersLabel.setText(String.valueOf(Counter.honey));
        coffersLabel.setEditable(false);

        coffersPanel.add(coffersLabel);
        window.add(coffersPanel);
    }

    public void coffersPanelUpdate() {
        coffersLabel.setText("Coffers\n" + "Honey: " + Counter.honey);
    }

    public void bottomPanel() {
        coffersPanel();
        bottomLeftPanel();
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
