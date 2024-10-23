import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FancyLoginGUI {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Fancy Login Interface");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10)); // Add spacing between components

        // Create a title label and set its properties
        JLabel titleLabel = new JLabel("Welcome! Please Log In", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(new Color(0, 102, 204)); // Title color

        // Create a panel for the input fields
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10)); // Grid layout with gaps
        panel.setBackground(new Color(240, 240, 240)); // Light gray background

        // Create labels and text fields
        JLabel userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Arial", Font.BOLD, 14));
        JTextField userText = new JTextField();
        userText.setPreferredSize(new Dimension(200, 25)); // Adjusted input field size

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 14));
        JPasswordField passwordText = new JPasswordField();
        passwordText.setPreferredSize(new Dimension(200, 25)); // Adjusted input field size

        // Create login button
        JButton loginButton = new JButton("Login");
        loginButton.setBackground(new Color(0, 102, 204)); // Blue background
        loginButton.setForeground(Color.WHITE); // White text
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.setFocusPainted(false); // Remove focus border
        loginButton.setPreferredSize(new Dimension(80, 30)); // Adjusted button size

        // Add action listener to button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                // Simple validation (for demonstration purposes)
                if (username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(frame, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add components to the panel
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(loginButton);

        // Add title and panel to the frame
        frame.add(titleLabel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        // Set frame visibility and center it
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
    }
}