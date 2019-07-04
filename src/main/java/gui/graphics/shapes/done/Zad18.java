package gui.graphics.shapes.done;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Zad18 extends JFrame {
    private int n = 1;
    private MyComponent komponent = null;

    private class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            int w = getWidth();
            int h = getHeight();

          /*  g.drawLine(w*4/8,h*4/8,w,h*4/8);
            g.drawLine(w*4/8,0,w*4/8,h*4/8);
            g.drawLine(0,0,w*4/8,h*4/8);
            g.drawLine(w*4/8,h*4/8,w,0);*/
            for (int i = 0; i <= n; i++) {
                int y = h * i / n;
                int x = w * i / n;
                g.drawLine(w*4/8,0, x , h*4/8);
                if (x <= w * 4/8) {
                  /*  g.drawLine(0,h*4/8,x,y);
                    g.drawLine(w-x,y,w*4/8,y);
                    g.drawLine(w*4/8,h*4/8,x,h);*/
                } else if (x <= w) {
                   // g.drawLine(w*4/8,y, w-x, y);
                    g.drawLine(x,y,x,h);

                    g.drawLine(x,h*4/8, x, y);
                 /*   g.drawLine(w*4/8,h*4/8,x,h);*/
                }
            }
        }
    }

    public Zad18(String appTitle) {
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
                new Zad18("kreski");
            }
        });
    }
}
