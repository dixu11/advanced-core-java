package gui.swing.practise.simple_window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Display  {

    private JFrame okno;
    private JPanel panel;
    private JTextArea tekst;

    private JButton start;
    private JButton zakoncz;

    public Display(String title) {
        okno = new JFrame(title);
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        prepareOkno();
        okno.add(panel);

        initComponents();
        addListeners();
       // okno.pack();

    }

    private void prepareOkno() {
        okno.setVisible(true);
        okno.setSize(100, 300);
        okno.setDefaultCloseOperation(EXIT_ON_CLOSE);

        okno.setLocationRelativeTo(null);
        okno.setResizable(false);
    }

    private void initComponents() {
        start = new JButton("Dodaj tekst");
        zakoncz = new JButton("Wyczyść");
        tekst = new JTextArea();
        tekst.setEditable(false);

        panel.add(start, BorderLayout.SOUTH);
        panel.add(zakoncz, BorderLayout.NORTH);
        panel.add(tekst, BorderLayout.CENTER);

    }

    private void addListeners() {
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tekst.append("Czołem!\n");
                tekst.setBackground(getRandomColor());
                zakoncz.setBackground(getRandomColor());
                start.setBackground(getRandomColor());
            }

        });

        zakoncz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tekst.setText("");
                tekst.setBackground(Color.WHITE);
                zakoncz.setBackground(Color.WHITE);
                start.setBackground(Color.WHITE);
            }
        });
    }

    private Color getRandomColor() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }



}
