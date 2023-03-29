import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame{
    private JLabel titleLabel;
    private JLabel name;

    private JLabel slipPanel;
    private JButton totalButton;
    private JButton receipButton;
    private JButton resetButton;
    private JButton exiButton;

    public Dashboard() {
        setSize(1360, 790);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
    }

    
    public static void main(String[] args) throws Exception {
        new Dashboard().setVisible(true);
    }







}
