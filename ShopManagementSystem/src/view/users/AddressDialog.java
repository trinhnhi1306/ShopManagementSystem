/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.users;

import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class AddressDialog extends javax.swing.JDialog {

    /**
     * Creates new form NewCategoryDialog
     *
     * @param parent
     * @param modal
     * @param parentPanel
     */
    public AddressDialog(java.awt.Frame parent, boolean modal, JPanel parentPanel) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
//        getId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Address = new javax.swing.JTextField();
        jTextField_Address1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Address2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Address3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Address");
        jLabel1.setPreferredSize(new java.awt.Dimension(214, 50));
        jPanel3.add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("1)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("2)");

        jTextField_Address.setEditable(false);
        jTextField_Address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField_Address1.setEditable(false);
        jTextField_Address1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("3)");

        jTextField_Address2.setEditable(false);
        jTextField_Address2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("4)");

        jTextField_Address3.setEditable(false);
        jTextField_Address3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Address, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                            .addComponent(jTextField_Address1)
                            .addComponent(jTextField_Address2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Address3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Address2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Address3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String xoaKhoangTrangThua(String str) {
        str = str.trim();
        String temp[] = str.split("\\s+");
        str = "";
        for (int i = 0; i < temp.length; i++) {
            str += temp[i];
            if (i < temp.length - 1) {
                str += " ";
            }
        }
        return str;
    }

//    private void getId(){
//        Connection con = Connect.GetConnect();
//
//        try {
//            PreparedStatement ps = con.prepareStatement("SELECT count(c.category_id) FROM category c");
//            ResultSet rs = ps.executeQuery();
//            
//            while (rs.next()) {
//                String id = rs.getString(1);
//                id = String.valueOf(Integer.parseInt(id) + 1);
//                jTextField_ID.setText(id);
//            }
//            
//            rs.close();
//            ps.close();
//            con.close();
//        } catch (SQLException ex) {
//            System.out.println("Lỗi lấy dữ liệu");
//        }
//    }
//    private int newCategory(String name, String note){
//        String sql = "INSERT INTO category(category, note) VALUES (?, ?)";
//        Connection con = Connect.GetConnect();
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, name);
//            ps.setString(2, note);
//            ps.executeUpdate();
//            ps.close();
//            con.close();
//        } catch (SQLException ex) {
//            System.out.println("Lỗi thêm mới thể loại!");
//            return 0;
//        }
//        return 1;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Address1;
    private javax.swing.JTextField jTextField_Address2;
    private javax.swing.JTextField jTextField_Address3;
    // End of variables declaration//GEN-END:variables
}
