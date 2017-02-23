package main;

import guithings.HomeGUI;
import javax.swing.*;

public class  Main {
    public static void main(String[] args) {
        // Run the GUI codes on Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HomeGUI();
            }
        });
    }
}
