package gui.swing.practise.from_netbeans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.FileDialog;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class Losowe extends javax.swing.JFrame {

    /**
     * Creates new form Losowe
     */
    public Losowe() {
        initComponents();
        losowanie();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        suwakOd = new javax.swing.JSlider();
        suwakDo = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wylosowane = new javax.swing.JTable();
        przyciskLosuj = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        wyborWiersza = new javax.swing.JSpinner();
        poleTekstuSuma = new javax.swing.JTextField();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opcjaZapisz = new javax.swing.JMenuItem();
        opcjaZakoncz = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opcjaSuma = new javax.swing.JMenuItem();
        opcjaCzysc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operacje na tabeli");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Ustaw przedział losowania");

        suwakOd.setMajorTickSpacing(1);
        suwakOd.setMaximum(0);
        suwakOd.setMinimum(-10);
        suwakOd.setPaintLabels(true);
        suwakOd.setPaintTicks(true);
        suwakOd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Od", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        suwakOd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                suwakOdStateChanged(evt);
            }
        });

        suwakDo.setMajorTickSpacing(1);
        suwakDo.setMaximum(10);
        suwakDo.setPaintLabels(true);
        suwakDo.setPaintTicks(true);
        suwakDo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Do", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        suwakDo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                suwakDoStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(15, Short.MAX_VALUE)
                                                .addComponent(suwakOd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(suwakDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(suwakOd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(suwakDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(75, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Wylosowane liczby");

        wylosowane.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "A", "B", "C", "D", "E"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(wylosowane);

        przyciskLosuj.setText("LOSUJ");
        przyciskLosuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskLosujActionPerformed(evt);
            }
        });

        jLabel3.setText("Suma w wierszu");

        wyborWiersza.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));
        wyborWiersza.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                wyborWierszaStateChanged(evt);
            }
        });

        jMenu1.setText("Plik");

        opcjaZapisz.setText("Zapisz wyniki");
        opcjaZapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcjaZapiszActionPerformed(evt);
            }
        });
        jMenu1.add(opcjaZapisz);

        opcjaZakoncz.setText("Zakończ");
        opcjaZakoncz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcjaZakonczActionPerformed(evt);
            }
        });
        jMenu1.add(opcjaZakoncz);

        menu.add(jMenu1);

        jMenu2.setText("Operacje na tabeli");

        opcjaSuma.setText("Suma wiersza");
        opcjaSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcjaSumaActionPerformed(evt);
            }
        });
        jMenu2.add(opcjaSuma);

        opcjaCzysc.setText("Czyść tabelę");
        jMenu2.add(opcjaCzysc);

        menu.add(jMenu2);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(wyborWiersza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(poleTekstuSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(przyciskLosuj)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(133, 133, 133)
                                                .addComponent(przyciskLosuj))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(wyborWiersza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(poleTekstuSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void suwakOdStateChanged(javax.swing.event.ChangeEvent evt) {
        losowanie();
    }

    private void suwakDoStateChanged(javax.swing.event.ChangeEvent evt) {
        losowanie();
    }

    private void opcjaSumaActionPerformed(java.awt.event.ActionEvent evt) {
        int wybranyWiersz = (int)wyborWiersza.getValue();
        int suma = 0;
        for(int x = 0; x<wylosowane.getColumnCount();x++){
            int przegladanaWartosc = (int) wylosowane.getValueAt(wybranyWiersz,x);
            suma += przegladanaWartosc;
            poleTekstuSuma.setText("" + suma);
        }
    }

    private void wyborWierszaStateChanged(javax.swing.event.ChangeEvent evt) {
        poleTekstuSuma.setText("");
    }

    private void opcjaZapiszActionPerformed(java.awt.event.ActionEvent evt) {
        FileDialog oknoZapisu = new FileDialog(this,"Zapis",FileDialog.SAVE);
        oknoZapisu.setVisible(true);
        if(oknoZapisu.getFile()!=null){
            String sciezkaPliku = oknoZapisu.getDirectory();
            String nazwaPliku = oknoZapisu.getFile();
            String pelnaSciezka = sciezkaPliku + nazwaPliku;
            try {
                FileWriter writer =new FileWriter(pelnaSciezka + ".txt");
                for(int y = 0; y<wylosowane.getRowCount();y++){
                    for(int x = 0; x<wylosowane.getColumnCount();x++){
                        writer.write(wylosowane.getValueAt(y, x) + " ");
                    }
                    writer.write("\r\n");
                }
                writer.close();


            } catch (IOException ex) {
                System.out.println("error");
            }

        }
    }

    private void przyciskLosujActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void opcjaZakonczActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Losowe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Losowe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Losowe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Losowe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Losowe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem opcjaCzysc;
    private javax.swing.JMenuItem opcjaSuma;
    private javax.swing.JMenuItem opcjaZakoncz;
    private javax.swing.JMenuItem opcjaZapisz;
    private javax.swing.JTextField poleTekstuSuma;
    private javax.swing.JButton przyciskLosuj;
    private javax.swing.JSlider suwakDo;
    private javax.swing.JSlider suwakOd;
    private javax.swing.JSpinner wyborWiersza;
    private javax.swing.JTable wylosowane;
    // End of variables declaration

    private void losowanie() {
        Random random = new Random();
        int wylosowana = 0;
        int minimum = suwakOd.getValue();
        int maksimum = suwakDo.getValue();

        for (int y = 0; y < wylosowane.getRowCount(); y++) {
            for (int x = 0; x < wylosowane.getColumnCount(); x++) {
                wylosowana = random.nextInt(maksimum - minimum + 1) + minimum;
                wylosowane.setValueAt(wylosowana, y, x);
            }
        }

    }

}
