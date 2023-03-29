import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame{
    private JLabel titleLabel;
    private JLabel[] nameLabels = new JLabel[10];
    private JLabel[] priceLabel = new JLabel[10];
    private JLabel[] quantityLabel = new JLabel[10];
    private JLabel[] purchaseLabel = new JLabel[10];
    private JCheckBox[] purchasCheckBox = new JCheckBox[10];
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

        slipPanel = new JTextArea(20, 50);



        JPanel panel = new JPanel(new GridBagLayout());
        // GridBagConstraints gbc = new GridBagConstraints();
        panel.add(titleLabel);
        add(panel);
    }

    
    public static void main(String[] args) throws Exception {
        new Dashboard().setVisible(true);
    }







}
