package javalife;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GT
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    Controller controller;

    public View() {
        initComponents();

        int[][] arr = new int[8][8];

        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {

                arr[i][j] = 0;
            }
        }
        update(arr);

    }

    //Model model = new Model();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, "", "", "", null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowHeight(50);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Игра \"Жизнь\"");

        jButton1.setText("Старт");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Стоп");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Расположение клеток первого поколения");

        jButton3.setText("Квадрат");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Шахматная доска");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Снежинка");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Паук");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Правила игры");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(301, 301, 301))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(112, 112, 112))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2)
                        .addGap(35, 35, 35)
                        .addComponent(jButton7)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton3))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int Row = jTable1.getSelectedRow();
        int Column = jTable1.getSelectedColumn();
        System.out.print(Row);
        System.out.println(Column);
        if ("1".equals(jTable1.getValueAt(Row, Column))) {
            jTable1.setValueAt("0", Row, Column);

        } else {
            jTable1.setValueAt("1", Row, Column);

        }

        YourTableCellRenderer cr = new YourTableCellRenderer();

        jTable1.setDefaultRenderer(Object.class, cr);


    }//GEN-LAST:event_jTable1MouseClicked

    //Квадрат-закрашиваем первое поколение клеток
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getRowCount(); j++) {
                jTable1.setValueAt("0", i, j);
            }
        }

        for (int i = 3; i <= 4; i++) {
            for (int j = 3; j <= 4; j++) {
                jTable1.setValueAt("1", i, j);
            }
        }

        YourTableCellRenderer cr = new YourTableCellRenderer();
        jTable1.setDefaultRenderer(Object.class, cr);

    }//GEN-LAST:event_jButton3ActionPerformed

    //Шахматная доска-первое поколение клеток
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getRowCount(); j++) {
                jTable1.setValueAt("0", i, j);
            }
        }

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < jTable1.getColumnCount(); j += 2) {
                    jTable1.setValueAt("1", i, j);

                }
            } else {
                for (int j = 1; j < jTable1.getColumnCount(); j += 2) {
                    jTable1.setValueAt("1", i, j);

                }
            }
        }

        YourTableCellRenderer cr = new YourTableCellRenderer();
        jTable1.setDefaultRenderer(Object.class, cr);

    }//GEN-LAST:event_jButton4ActionPerformed

    //Снежинки-первое поколение клеток
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getRowCount(); j++) {
                jTable1.setValueAt("0", i, j);
            }
        }

        for (int j = 0; j < jTable1.getColumnCount() - 1; j += 3) {
            jTable1.setValueAt("1", 0, j);
            jTable1.setValueAt("1", 6, j);
        }

        for (int j = 1; j < 6; j += 2) {
            jTable1.setValueAt("1", 1, j);
            jTable1.setValueAt("1", 5, j);
        }

        for (int j = 2; j < 5; j++) {
            jTable1.setValueAt("1", 2, j);
            jTable1.setValueAt("1", 4, j);
        }

        for (int j = 0; j < 7; j++) {
            if (j != 3) {
                jTable1.setValueAt("1", 3, j);
            }
        }

        YourTableCellRenderer cr = new YourTableCellRenderer();
        jTable1.setDefaultRenderer(Object.class, cr);


    }//GEN-LAST:event_jButton5ActionPerformed

    //Паук-первое поколение клеток
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getRowCount(); j++) {
                jTable1.setValueAt("0", i, j);
            }
        }

        jTable1.setValueAt("1", 0, 0);
        jTable1.setValueAt("1", 0, 6);

        for (int j = 1; j < 6; j += 2) {
            jTable1.setValueAt("1", 1, j);
        }

        for (int j = 2; j < 5; j++) {
            jTable1.setValueAt("1", 2, j);
            jTable1.setValueAt("1", 4, j);

        }

        for (int j = 0; j < 7; j++) {
            jTable1.setValueAt("1", 3, j);
        }

        for (int j = 1; j < 6; j++) {
            if (j != 3) {
                jTable1.setValueAt("1", 5, j);
            }
        }

        for (int j = 1; j < 6; j += 4) {
            jTable1.setValueAt("1", 6, j);
            jTable1.setValueAt("1", 7, j);

        }

        YourTableCellRenderer cr = new YourTableCellRenderer();
        jTable1.setDefaultRenderer(Object.class, cr);

    }//GEN-LAST:event_jButton6ActionPerformed

    //Показать правила
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
//        Model model = new Model();
        //model.showRules();
        controller.showRules();
    }//GEN-LAST:event_jButton7ActionPerformed

    //Пуск игры
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int[][] massive1 = massive();
        controller.startGame(massive1);
    }//GEN-LAST:event_jButton1ActionPerformed

    //Стоп игры
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        controller.stopGame();

    }//GEN-LAST:event_jButton2ActionPerformed

    public void update(int[][] field) {
        System.out.println();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                String str = Integer.toString(field[i][j]);
                jTable1.setValueAt(str, i, j);
            }
            System.out.println();

        }

        YourTableCellRenderer cr = new YourTableCellRenderer();
        jTable1.setDefaultRenderer(Object.class, cr);
    }

    public int[][] massive() {
        int n = jTable1.getRowCount();
        int m = jTable1.getColumnCount();

        int[][] massive1 = new int[n][m];
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                massive1[i][j] = Integer.parseInt(jTable1.getValueAt(i, j).toString());
            }
        }
        return massive1;

    }

    public class YourTableCellRenderer
            extends DefaultTableCellRenderer {

//        int col1;
//        int row1;
//
//        YourTableCellRenderer(int Row, int Col) {
//            this.row1 = Row;
//            this.col1 = Col;
//
//        }
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {
            Component c
                    = super.getTableCellRendererComponent(table, value,
                            isSelected, hasFocus,
                            row, column);

            if ("1".equals(table.getModel().getValueAt(row, column))) {

                c.setBackground(Color.red);
                c.setForeground(Color.black);

            } else {
                c.setBackground(Color.white);
                c.setForeground(Color.black);
            }
            return c;
        }
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                View view = new View();
                view.setVisible(true);

                Model model = new Model();
                Controller controller = new Controller(view, model);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
