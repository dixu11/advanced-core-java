package gui.graphics.shapes.done;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Zad4 extends JFrame {
    private int n = 1;
    private MyComponent komponent = null;

    private class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            int w = getWidth();
            int h = getHeight();
            for (int i = 0; i <= n; i++) {
                int y = h * i / n;
                int x = w * i / n;
                if (x <= w * 4/8) {
                g.drawLine(0,0,w-x,y);
                } else if (x <= w) {
                    g.drawLine(w*6/8,h,x,0);
                    g.drawLine(w*4/8,y,w-x,y);
                }
            }
        }
    }

    public Zad4(String appTitle) {
        super(appTitle);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        add(komponent = new MyComponent());
        final JSlider slider = new JSlider(1, 20, n);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                n = slider.getValue();
                komponent.repaint();
            }
        });
        add(slider, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Zad4("kreski");
            }
        });
    }
}
