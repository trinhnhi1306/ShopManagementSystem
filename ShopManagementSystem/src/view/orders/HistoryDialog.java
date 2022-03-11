/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.orders;

import view.products.*;
import java.awt.Color;
import java.awt.Font;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
//import model.ingredient.ImportHistory;
//import model.ingredient.ImportHistoryFileManagement;
//import model.ingredient.Ingredient;
//import model.ingredient.IngredientList;
//import model.provider.ProviderList;
//import swing.UIControl;


public class HistoryDialog extends javax.swing.JDialog {

//    private final static ImportHistoryFileManagement importHistory
//            = new ImportHistoryFileManagement();
//    private ArrayList<ImportHistory> histories = new ArrayList<>();
//    private static final DateTimeFormatter DATE_TIME_FORMATTER
//            = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//    private IngredientList ingredientList;
//    private ProviderList providerList;

    /**
     * Creates new form ImportHistoryDialog
     * @param parent
     * @param modal
     */
    public HistoryDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
//        loadDataFromFiles();
        initComponents();
        setLocationRelativeTo(null);
//        setTableHeader(jTable_History);
//        this.getContentPane().setBackground(Color.WHITE);
    }

//    public void setIngredientList(IngredientList ingredientList) {
//        this.ingredientList = ingredientList;
//    }

//    public void setProviderList(ProviderList providerList) {
//        this.providerList = providerList;
//    }

//    private void loadDataFromFiles() {
//        histories = importHistory.readImportHistoriesByDate(LocalDate.now());
//    }

//    private static void setTableHeader(JTable table) {
//        DefaultTableCellRenderer defaultTableCellRenderer;
//        table.setRowHeight(30);
//        defaultTableCellRenderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
//        defaultTableCellRenderer.setHorizontalAlignment(0);
//        table.getTableHeader().setFont(new Font("Segoe UI", 1, 15));
//        table.setFont(new java.awt.Font("Segoe UI", 0, 15));
//        UIControl.setColumnWidth(table, 1, 260);
//        UIControl.setColumnWidth(table, 3, 70);
//        UIControl.setColumnWidth(table, 4, 75);
//        UIControl.setCurrencyCellRenderer(table, new int[]{5});
//    }

//    public void addRowsToHistoryTable(IngredientList list) {
//        DefaultTableModel tableModel = (DefaultTableModel) jTable_History.getModel();
//        tableModel.setRowCount(0);
//        int IDIngredient;
//        for (ImportHistory history: histories) {
//            IDIngredient = history.getIngredientID();
//            Ingredient ingredient = list.getByID(IDIngredient);
//            tableModel.addRow(new Object[]{
//                ingredient.getName(),
//                providerList.getByID(ingredient.getProviderID()).getName(),
//                history.getDatetime().format(DATE_TIME_FORMATTER),
//                history.getQuantities(),
//                ingredient.getUnit().toString(),
//                history.getTotalAmount()
//            });
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_ImportHistory = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_History = new javax.swing.JTable();
        jPanel_BillDateInfo = new javax.swing.JPanel();
        jLabel_DayImportHistoryFrom = new javax.swing.JLabel();
        jLabel_DayImportHistoryTo = new javax.swing.JLabel();
        jDateChooser_ImportHistoryFrom = new com.toedter.calendar.JDateChooser();
        jDateChooser_ImportHistoryTo = new com.toedter.calendar.JDateChooser();
        jButton_Apply = new javax.swing.JButton();
        jButton_Today = new javax.swing.JButton();
        jLabel_Sum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel_ImportHistory.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_ImportHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ImportHistory.setText("History");

        jTable_History.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "User ID", "Total price", "Ngày đặt", "Duyệt", "Hủy", "Ngày duyệt/hủy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_History);

        jPanel_BillDateInfo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_BillDateInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date filter", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel_DayImportHistoryFrom.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel_DayImportHistoryFrom.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_DayImportHistoryFrom.setText("From");

        jLabel_DayImportHistoryTo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel_DayImportHistoryTo.setText("To");

        jDateChooser_ImportHistoryFrom.setDate(new java.util.Date());
        jDateChooser_ImportHistoryFrom.setDateFormatString("dd-MM-yyyy");
        jDateChooser_ImportHistoryFrom.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jDateChooser_ImportHistoryTo.setDate(new java.util.Date());
        jDateChooser_ImportHistoryTo.setDateFormatString("dd-MM-yyyy");
        jDateChooser_ImportHistoryTo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jButton_Apply.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_Apply.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Apply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tick3.png"))); // NOI18N
        jButton_Apply.setText("Apply");
        jButton_Apply.setFocusPainted(false);
        jButton_Apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ApplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BillDateInfoLayout = new javax.swing.GroupLayout(jPanel_BillDateInfo);
        jPanel_BillDateInfo.setLayout(jPanel_BillDateInfoLayout);
        jPanel_BillDateInfoLayout.setHorizontalGroup(
            jPanel_BillDateInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BillDateInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_DayImportHistoryFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooser_ImportHistoryFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_DayImportHistoryTo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooser_ImportHistoryTo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Apply, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );
        jPanel_BillDateInfoLayout.setVerticalGroup(
            jPanel_BillDateInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BillDateInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BillDateInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_DayImportHistoryTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel_DayImportHistoryFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_ImportHistoryTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser_ImportHistoryFrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Apply, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton_Today.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_Today.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Today.setText("Today");
        jButton_Today.setPreferredSize(new java.awt.Dimension(115, 40));
        jButton_Today.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TodayActionPerformed(evt);
            }
        });

        jLabel_Sum.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel_Sum.setText("... đơn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_ImportHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel_BillDateInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Today, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_Sum, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_ImportHistory)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_BillDateInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Today, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Sum)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_TodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TodayActionPerformed
        // TODO add your handling code here:
//        histories = importHistory.readImportHistoriesByDate(LocalDate.now());
//        addRowsToHistoryTable(ingredientList);
    }//GEN-LAST:event_jButton_TodayActionPerformed

    private void jButton_ApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ApplyActionPerformed
        // TODO add your handling code here:
//        LocalDate startDate = jDateChooser_ImportHistoryFrom.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDate endDate = jDateChooser_ImportHistoryTo.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        Duration diff = Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay());
//        long diffDays = diff.toDays();
//        if (diffDays < 0) {
//            JOptionPane.showMessageDialog(this, "The start date must be less than the end date!");
//        } else {
//            histories = importHistory.readImportHistoriesByDate(startDate, endDate);
//            addRowsToHistoryTable(ingredientList);
//        }
    }//GEN-LAST:event_jButton_ApplyActionPerformed

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
            java.util.logging.Logger.getLogger(HistoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HistoryDialog dialog = new HistoryDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Apply;
    private javax.swing.JButton jButton_Today;
    private com.toedter.calendar.JDateChooser jDateChooser_ImportHistoryFrom;
    private com.toedter.calendar.JDateChooser jDateChooser_ImportHistoryTo;
    private javax.swing.JLabel jLabel_DayImportHistoryFrom;
    private javax.swing.JLabel jLabel_DayImportHistoryTo;
    private javax.swing.JLabel jLabel_ImportHistory;
    private javax.swing.JLabel jLabel_Sum;
    private javax.swing.JPanel jPanel_BillDateInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_History;
    // End of variables declaration//GEN-END:variables
}
