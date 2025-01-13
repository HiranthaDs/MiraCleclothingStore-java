package miracleclothingstore;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserDashboard extends JFrame {

    public UserDashboard() {
        setTitle("User Dashboard");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton browseButton = new JButton("Browse Products");
        browseButton.setBounds(50, 50, 150, 30);
        add(browseButton);

        JButton viewOrdersButton = new JButton("View Orders");
        viewOrdersButton.setBounds(50, 100, 150, 30);
        add(viewOrdersButton);

        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(50, 150, 150, 30);
        add(logoutButton);

        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Product Catalog (could open a new window)
                JOptionPane.showMessageDialog(null, "Product Catalog will be implemented here.");
            }
        });

        viewOrdersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // View Orders (could open a new window)
                JOptionPane.showMessageDialog(null, "Order Viewing will be implemented here.");
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Log out and return to login screen
                Login login = new Login();
                login.setVisible(true);
                dispose();
            }
        });
    }
}
