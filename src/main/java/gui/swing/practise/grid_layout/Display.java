package gui.swing.practise.grid_layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Display  {

    private JFrame okno;
    private JPanel mainPanel;
    private LeftPanel leftPanel;
    private JTextArea tekst;

    private JButton start;
    private JButton zakoncz;

    public Display(String title) {
        okno = new JFrame(title);
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        leftPanel = new LeftPanel();
        prepareOkno();
        okno.add(mainPanel);
        mainPanel.add(leftPanel, BorderLayout.WEST);

        initComponents();
        addListeners();
       // okno.pack();

    }

    private void prepareOkno() {
        okno.setVisible(true);
        okno.setSize(500, 300);
        okno.setDefaultCloseOperation(EXIT_ON_CLOSE);

        okno.setLocationRelativeTo(null);
        okno.setResizable(false);
    }

    private void initComponents() {
        start = new JButton("Click me!");
        zakoncz = new JButton("Clear");
        tekst = new JTextArea();
        tekst.setEditable(false);

        mainPanel.add(start, BorderLayout.SOUTH);
        mainPanel.add(zakoncz, BorderLayout.NORTH);
        mainPanel.add(tekst, BorderLayout.CENTER);

    }

    private void addListeners() {
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tekst.append("Czołem!\n");
                tekst.setBackground(getRandomColor());
                zakoncz.setBackground(getRandomColor());
                start.setBackground(getRandomColor());
                leftPanel.setBackground(getRandomColor());

            }

        });

        zakoncz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tekst.setText("");
                tekst.setBackground(Color.WHITE);
                zakoncz.setBackground(Color.WHITE);
                start.setBackground(Color.WHITE);
                leftPanel.setBackground(Color.WHITE);

            }
        });
    }

    private Color getRandomColor() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }


    private class LeftPanel extends JPanel {

        private JLabel nameLabel;
        private JLabel roleLabel;
        private JTextField nameField;
        private JTextField roleField;
        private JButton addButton;

        public LeftPanel() {
            Dimension size = getPreferredSize();
            size.width = 200;
            setPreferredSize(size);

            setLayout(new GridBagLayout());
            setBorder(BorderFactory.createTitledBorder("Add to party: "));

            createComponents();
            setComponents();
            addListeners();

        }

        private void createComponents() {
            nameLabel = new JLabel("Name: ");
            roleLabel = new JLabel("Role: ");
            nameField = new JTextField(10); // add 10
            roleField = new JTextField(10);
            addButton = new JButton("Add");
        }

        private void setComponents() {
            GridBagConstraints constraints = new GridBagConstraints();

            //first column
            constraints.anchor = GridBagConstraints.LINE_END;
            constraints.weightx = 0.5; // space alocated for cell. 0.5 means half
            constraints.weighty = 0.5;

            constraints.gridx = 0;
            constraints.gridy = 0;

            add(nameLabel, constraints);

            constraints.gridx = 0;
            constraints.gridy = 1;

            add(roleLabel, constraints);

            //second column
            constraints.anchor = GridBagConstraints.LINE_START;
            constraints.gridx = 1;
            constraints.gridy = 0;

            add(nameField, constraints);

            constraints.gridx = 1;
            constraints.gridy = 1;

            add(roleField, constraints);

            //row 3
            constraints.anchor = GridBagConstraints.FIRST_LINE_START;
            constraints.weighty = 10; // high value to take more place
            constraints.gridy = 2;
            add(addButton, constraints);
        }

        private void addListeners() {
            //easier way but not the best -> better way is to separate controllers
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = nameField.getText();
                    String role = roleField.getText();

                    String newOne = String.format("%s %s\n",name,role);
                    tekst.append(newOne);
                    nameField.setText("");
                    roleField.setText("");
                }
            });
        }
    }




}
