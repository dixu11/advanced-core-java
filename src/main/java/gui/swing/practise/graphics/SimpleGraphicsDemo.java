package gui.swing.practise.graphics;

import javax.swing.*;
import java.awt.*;

public class SimpleGraphicsDemo extends JFrame {

    private PanelGraficzny panel;

    public SimpleGraphicsDemo(String title) throws HeadlessException {
        super(title);
        setVisible(true);
        setSize(600,400);
//        setBackground(Color.WHITE);

        initComponents();

    }

    private void initComponents() {
        panel = new PanelGraficzny();
        panel.setBounds(0,0,getWidth(),getHeight());
        add(panel);
    }

    private class PanelGraficzny extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
//            g.clearRect(0,0,getWidth(),getHeight());
        }


    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleGraphicsDemo("Prezentacja grafiki");
            }
        });
    }


}
