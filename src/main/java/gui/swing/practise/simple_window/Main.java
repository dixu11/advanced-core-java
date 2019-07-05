package gui.swing.practise.simple_window;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // swing utilities are build to be run from event dispatch thread. That's why we need to
        // write all code interacting with gui in invokeLater method

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Display display = new Display("Strugam wariata");
            }
        });

    }
}
