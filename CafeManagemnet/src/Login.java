import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton cancelButton;
    private JLabel loginTitle;
    private JLabel usernameLabel;
    private JLabel passwordLabel;

    public Login() {
        // Set up the frame
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        
        loginTitle = new JLabel(" WELCOME ");
        loginTitle.setFont(new Font("Bahnschrift", Font.BOLD, 24));
        loginTitle.setHorizontalAlignment(SwingConstants.CENTER);

        // Create the username label and field
        usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        usernameField = new JTextField(18);
        usernameField.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
        
        // Create the password label and field
        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        passwordField = new JPasswordField(18);
        passwordField.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
        
        // Create the login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginButton.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(60, 120, 160));

        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);
        cancelButton.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setBackground(Color.RED);
        
        // Add the components to the frame
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridwidth = 2;
        panel.add(loginTitle, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1;
        panel.add(usernameLabel, gbc);
        gbc.gridy++;
        panel.add(passwordLabel, gbc);
        gbc.gridx++;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(usernameField, gbc);
        gbc.gridy++;
        panel.add(passwordField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 1;
        panel.add(loginButton, gbc);
        gbc.gridx++;
        panel.add(cancelButton, gbc);
        panel.setBackground(Color.WHITE);
        add(panel);
    }

    // Handle login button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Check if username and password are correct
            if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }
        } else if (e.getSource() == cancelButton) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
