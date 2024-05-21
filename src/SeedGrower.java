import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class SeedGrower extends JFrame {

    public SeedGrower() {
        setTitle("Seed Grower");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);

        // Main container panel
        JPanel mainPanel = new JPanel(new CardLayout());
        Page1 page1 = new Page1(mainPanel);
        Page2 page2 = new Page2(page1);

        JScrollPane scrollPane = new JScrollPane(page2);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Adding both Page1 and the scrollable Page2 to the CardLayout
        mainPanel.add(page1, "Page 1");
        mainPanel.add(scrollPane, "Page 2");

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SeedGrower());
    }
}

