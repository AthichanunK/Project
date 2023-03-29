import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame{
    private JLabel titleLabel;
    private JLabel[] priceLabel = new JLabel[6];
    private JSpinner[] quantity = new JSpinner[12];
    private JCheckBox[] nameCheckBox = new JCheckBox[12];
    private JTextArea slipPanel;
    private JButton totalButton;
    private JButton receipButton;
    private JButton resetButton;
    private JButton exiButton;

    public Dashboard() {
        setSize(1360, 790);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);

        titleLabel = new JLabel("Sunny Side Up! Cafe");
        titleLabel.setFont(new Font("Bahnschrift", Font.BOLD, 30));

        nameCheckBox[0] = new JCheckBox("Capuccino");
        nameCheckBox[1] = new JCheckBox("Espresso");
        nameCheckBox[2] = new JCheckBox("Mocca");
        nameCheckBox[3] = new JCheckBox("Latte");
        nameCheckBox[4] = new JCheckBox("Americano");
        nameCheckBox[5] = new JCheckBox("Coco");
        nameCheckBox[5] = new JCheckBox("Milk Green Tea");
        nameCheckBox[6] = new JCheckBox("Thai Tea");
        nameCheckBox[7] = new JCheckBox("Milk");
        nameCheckBox[8] = new JCheckBox("Cake");
        nameCheckBox[9] = new JCheckBox("Cookie");
        nameCheckBox[10] = new JCheckBox("Pancake");
        nameCheckBox[11] = new JCheckBox("Muffin");

        quantity[0] = new JSpinner(new SpinnerNumberModel(0,0,5,1));
        quantity[1] = new JSpinner(new SpinnerNumberModel(0,0,3,1));
        quantity[2] = new JSpinner(new SpinnerNumberModel(0,0,5,1));
        quantity[3] = new JSpinner(new SpinnerNumberModel(0,0,5,1));
        quantity[4] = new JSpinner(new SpinnerNumberModel(0,0,5,1));
        quantity[5] = new JSpinner(new SpinnerNumberModel(0,0,5,1));
        quantity[6] = new JSpinner(new SpinnerNumberModel(0,0,5,1));
        quantity[7] = new JSpinner(new SpinnerNumberModel(0,0,5,1));
        quantity[8] = new JSpinner(new SpinnerNumberModel(0,0,5,1));
        quantity[9] = new JSpinner(new SpinnerNumberModel(0,0,5,1));
        quantity[10] = new JSpinner(new SpinnerNumberModel(0,0,5,1));
        quantity[11] = new JSpinner(new SpinnerNumberModel(0,0,5,1));


        slipPanel = new JTextArea(20, 50);
        slipPanel.setEditable(false);
        slipPanel.append("Hello, world!\n");
        slipPanel.append("This is a message in Terminal.\n");
        slipPanel.append("Type your commands here.\n");


        JPanel panel = new JPanel(new GridBagLayout());
        panel.add(titleLabel);
        for(int i = 0 ; i<12;i++){
            panel.add(nameCheckBox[i]);  
            panel.add(quantity[i]);  
        }          

        // gbc.gridy++;
        // gbc.gridwidth = 100;
        // panel.add(slipPanel, gbc);
        add(panel);
    }

    
    public static void main(String[] args) throws Exception {
        new Dashboard().setVisible(true);
    }
}