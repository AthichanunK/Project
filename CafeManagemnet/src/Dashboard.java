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
    private JButton exitButton;

    public Dashboard() {
        setSize(1360, 790);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);

        // Title panel
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        titleLabel = new JLabel("Sunny Side Up! Cafe");
        titleLabel.setFont(new Font("Bahnschrift", Font.BOLD, 30));
        titlePanel.add(titleLabel);

        // Menu panel
        JPanel menuPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Coffee names and picture squares
        nameCheckBox[0] = new JCheckBox("Capuccino");
        nameCheckBox[1] = new JCheckBox("Espresso");
        nameCheckBox[2] = new JCheckBox("Mocca");
        nameCheckBox[3] = new JCheckBox("Latte");
        nameCheckBox[4] = new JCheckBox("Americano");
        nameCheckBox[5] = new JCheckBox("Coco");
        nameCheckBox[6] = new JCheckBox("Milk Green Tea");
        nameCheckBox[7] = new JCheckBox("Thai Tea");

        JPanel coffeePanel = new JPanel(new GridLayout(4, 2, 10, 10));
        coffeePanel.setBorder(BorderFactory.createTitledBorder("Coffee"));
        
        JPanel capuccinoPanel = new JPanel(new BorderLayout());
        capuccinoPanel.add(nameCheckBox[0], BorderLayout.SOUTH);
        coffeePanel.add(capuccinoPanel);
        
        JPanel espressoPanel = new JPanel(new BorderLayout());
        espressoPanel.add(nameCheckBox[1], BorderLayout.SOUTH);
        coffeePanel.add(espressoPanel);
        
        JPanel moccaPanel = new JPanel(new BorderLayout());
        moccaPanel.add(nameCheckBox[2], BorderLayout.SOUTH);
        coffeePanel.add(moccaPanel);
        
        JPanel lattePanel = new JPanel(new BorderLayout());
        lattePanel.add(nameCheckBox[3], BorderLayout.SOUTH);
        coffeePanel.add(lattePanel);
        
        JPanel americanoPanel = new JPanel(new BorderLayout());
        americanoPanel.add(nameCheckBox[4], BorderLayout.SOUTH);
        coffeePanel.add(americanoPanel);
        
        add(coffeePanel);
    }

    public static void main(String[] args) throws Exception {
        new Dashboard().setVisible(true);
    }
}
