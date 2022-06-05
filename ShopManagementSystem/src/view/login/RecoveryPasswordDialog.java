/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.login;

/**
 *
 * @author Admin
 */
public class RecoveryPasswordDialog extends javax.swing.JDialog {

    private ChonDialog chonDialog;

    /**
     * Creates new form RecoveryPasswordDialog
     *
     * @param parent
     * @param modal
     */
    public RecoveryPasswordDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jButton_Tim = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Forgot password");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("TÌM TÀI KHOẢN CỦA BẠN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Vui lòng nhập username để tìm kiếm tài khoản của bạn.");

        jTextField_Username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        jButton_Tim.setBackground(new java.awt.Color(0, 153, 255));
        jButton_Tim.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton_Tim.setText("Tìm kiếm");
        jButton_Tim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TimActionPerformed(evt);
            }
        });

        jButton_Cancel.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton_Cancel.setText("Hủy");
        jButton_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addComponent(jTextField_Username)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_Cancel)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Tim)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Tim)
                    .addComponent(jButton_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TimActionPerformed
        // TODO add your handling code here:
        this.dispose();
//        if(getPhoneAndEmail(jTextField_Username.getText()))
//        {
        this.chonDialog = new ChonDialog(null, true);
        this.chonDialog.setVisible(true);
//        }else{
//             JOptionPane.showMessageDialog(null, "Username không tồn tại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
//             return;
//        }


    }//GEN-LAST:event_jButton_TimActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_CancelActionPerformed
//    boolean getPhoneAndEmail(String username){
//      
//        Connection ketNoi= Connect.GetConnect();
//        try {
//            PreparedStatement ps=ketNoi.prepareStatement("select phone_number,email,Full_Name from account where username = ?");
//            ps.setString(1, username);
//            ResultSet rs=ps.executeQuery();
//            while(rs.next()){  
//                LoginFrame.PhoneNumber = rs.getString(1);
//                LoginFrame.Email = rs.getString(2);
//                LoginFrame.name = rs.getString(3);
//                return true;
//            }
//            ps.close();
//            rs.close();
//            ketNoi.close();
//        } catch (SQLException ex) {
//            System.out.println("loi lay phone and email");
//        }
//        return false;
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Tim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
