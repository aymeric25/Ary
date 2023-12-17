import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ary extends JFrame {
    ArrayList<User> List_of_users = new ArrayList<>();
    ArrayList<Listing> List_of_listings = new ArrayList<>();
    JButton sortButton, addButton;

    public Ary(String title) {
        setTitle(title);
        getContentPane().setBackground(Color.WHITE);
        int windowSize = 500;
        setPreferredSize(new Dimension(windowSize, windowSize));
        Dimension dimScreen = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(new Point((dimScreen.width - windowSize) / 2, (dimScreen.height - windowSize) / 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        sortButton = new JButton("Sort Hosts");
        addButton = new JButton("Add User");

        // Add action listeners to the buttons
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call the function to sort hosts based on ratings
                // Add your sorting logic here
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the AddUserWindow when addButton is clicked
                new AddUserWindow();
            }
        });

        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(sortButton);
        buttonPanel.add(addButton);

        // Use BorderLayout to position the button panel at the bottom
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ary("ARY");
    }
}
