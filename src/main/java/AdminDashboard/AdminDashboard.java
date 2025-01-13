package miracleclothingstore;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminDashboard extends JFrame {

    public AdminDashboard() {
        setTitle("Admin Dashboard");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton manageProductsButton = new JButton("Manage Products");
        manageProductsButton.setBounds(50, 50, 150, 30);
        add(manageProductsButton);

        JButton manageOrdersButton = new JButton("Manage Orders");
        manageOrdersButton.setBounds(50, 100, 150, 30);
        add(manageOrdersButton);

        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(50, 150, 150, 30);
        add(logoutButton);

        manageProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Product Management (could open a new window)
                JOptionPane.showMessageDialog(null, "Product Management will be implemented here.");
            }
        });

        manageOrdersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Orders Management (could open a new window)
                JOptionPane.showMessageDialog(null, "Order Management will be implemented here.");
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
