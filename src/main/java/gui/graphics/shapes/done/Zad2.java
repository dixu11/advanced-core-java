package gui.graphics.shapes.done;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

// Karol Kuśmierz
// zadanie nr 2
// zaliczenie poprawkowe

public class Zad2 extends JFrame {
    private int n = 1;
    private MyComponent komponent = null;

    private class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            int w = getWidth();
            int h = getHeight();
            g.drawLine(w*4/8,0,w*4/8,h);
            g.drawLine(0,0,w*4/8,h*4/8);
            g.drawLine(w*4/8,h*4/8,0,h);
            for (int i = 0; i <= n; i++) {
                int y = h * i / n;
                int x = w * i / n;
                g.drawLine(w*4/8,h*4/8,w,y);
                g.drawLine(0,y/2,x/2,y/2);

                    g.drawLine(w * 4 / 8, h, w - x/2, y/2);

            }
        }
    }

    public Zad2(String appTitle) {
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
                new Zad2("Kusmierz Karol");
            }
        });
    }
}