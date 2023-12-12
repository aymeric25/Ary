import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class Ary extends JFrame {
    ArrayList<User> List_of_users = new ArrayList<>();
    ArrayList<Listing> List_of_listings = new ArrayList<>();

    public Ary(String title) {
        setTitle(title);
        getContentPane().setBackground(Color.WHITE);
        int windowSize = 500;
        setPreferredSize(new Dimension(windowSize, windowSize));
        Dimension dimScreen = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(new Point((dimScreen.width - windowSize) / 2, (dimScreen.height - windowSize) / 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ary("ARY");
    }

    // add a function based on ratings in order to sort hosts
}
