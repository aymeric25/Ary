import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddUserWindow extends JFrame {
    private JLabel userIdLabel, nameLabel, firstnameLabel, emailLabel;
    private JTextField nameField, firstnameField, emailField;

    public AddUserWindow() {
        userIdLabel = new JLabel("User ID: "); // User ID will be assigned when user clicks 'Add User'
        nameLabel = new JLabel("Name:");
        firstnameLabel = new JLabel("Firstname:");
        emailLabel = new JLabel("Email:");

        nameField = new JTextField(10);
        firstnameField = new JTextField(10);
        emailField = new JTextField(15);

        JButton addUserButton = new JButton("Add User");
        addUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String firstname = firstnameField.getText();
                String email = emailField.getText();

                // Check if the input fields are not empty
                if (!name.isEmpty() && !firstname.isEmpty() && !email.isEmpty()) {
                    // Create a new User instance
                    User newUser = new User(name, firstname, email);

                    // Update the displayed user ID
                    userIdLabel.setText("User ID: " + newUser.getUser_id());

                    // Print the user information (for testing purposes)
                    System.out.println(newUser);

                    // Close the AddUserWindow
                    dispose();
                } else {
                    // Show an error message if any of the fields are empty
                    JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));
        inputPanel.add(userIdLabel);
        inputPanel.add(new JLabel()); // Empty label for spacing
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(firstnameLabel);
        inputPanel.add(firstnameField);
        inputPanel.add(emailLabel);
        inputPanel.add(emailField);
        inputPanel.add(addUserButton);

        setMinimumSize(new Dimension(300, 200));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class User {
    private static int lastUserId = 0;

    private int user_id;
    private String name;
    private String firstname;
    private String userEmail;

    public User(String name, String firstname, String userEmail) {
        this.user_id = ++lastUserId;
        this.firstname = firstname;
        this.name = name;
        this.userEmail = userEmail;
    }

    public int getUser_id() {
        return user_id;
    }

    public static int getLastUserId() {
        return lastUserId;
    }

    public String toString() {
        return "User ID: " + user_id + " Name: " + name + " Firstname: " + firstname + " Email: " + userEmail;
    }
}
