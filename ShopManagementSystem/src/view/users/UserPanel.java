/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.users;

import view.products.*;
import view.products.ImportHistoryDialog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
//import model.database.Connect;
//import model.database.Staff;
//import swing.UIController;
//import utilities.File;
//import view.main.librarian.ReaderPanel;
//import static view.main.librarian.ReaderPanel.hash;

/**
 *
 * @author Admin
 */
public class UserPanel extends javax.swing.JPanel {

    private DefaultTableModel dtm;

    private enum Mode {
        ADD,
        MODIFY,
        FREE
    }
    private Mode mode;
    private AddressDialog addressDialog;
    private UserDeletedDialog userDeletedDialog;

    /**
     * Creates new form StaffPanel
     */
    public UserPanel() {
        initComponents();
//        getStaff();
//        loadAddress();
//        loadRole();
//        UIController.setDefaultTableHeader(jTable_Staff);
        setEditableForAll(false);
    }

//    void loadAddress() {
//        Connection ketNoi = Connect.GetConnect();
//        try {
//            PreparedStatement ps = ketNoi.prepareStatement("select province_name from province");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                jComboBox_Province.addItem(rs.getString(1));
//            }
//            ps.close();
//            rs.close();
//            ketNoi.close();
//        } catch (SQLException ex) {
//            System.out.println("Lỗi lấy địa chỉ");
//        }
//    }

//    void loadRole() {
//        Connection ketNoi = Connect.GetConnect();
//        try {
//            PreparedStatement ps = ketNoi.prepareStatement("select role from role where role.role_id != 1");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                jComboBox_Role.addItem(rs.getString(1));
//            }
//            ps.close();
//            rs.close();
//            ketNoi.close();
//        } catch (SQLException ex) {
//            System.out.println("Lỗi lấy role!!");
//        }
//    }

    // get nhân viên (trừ độc giả) có status == 1(chưa xóa).
//    void getStaff() {
//        dtm = (DefaultTableModel) jTable_Staff.getModel();
//        dtm.setNumRows(0);
//        Connection ketNoi = Connect.GetConnect();
//        Vector vt;
//        try {
//            PreparedStatement ps = ketNoi.prepareStatement("select a.username,a.Full_Name,role.role,a.gender,a.date_of_birth,address.specific_address + ' - ' + ward.ward_name  + ' - ' + district.district_name + ' - ' + province.province_name as diachi,a.phone_number,a.email,a.registered_date from account a\n"
//                    + "  inner join address\n"
//                    + "  on address.address_id = a.address_id\n"
//                    + "  left join ward\n"
//                    + "  on address.ward_id = ward.ward_id\n"
//                    + "  left join district\n"
//                    + "  on ward.district_id = district.district_id\n"
//                    + "  left join province\n"
//                    + "  on district.province_id = province.province_id\n"
//                    + "	left join role\n"
//                    + " on role.role_id = a.role_id where role.role_id != 1 and a.status = 1");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                vt = new Vector();
//                vt.add(rs.getString(1));
//                vt.add(rs.getString(2));
//                vt.add(rs.getString(3));
//                vt.add(rs.getString(4));
//                vt.add(rs.getDate(5));
//                vt.add(rs.getString(6));
//                vt.add(rs.getString(7));
//                vt.add(rs.getString(8));
//                vt.add(rs.getDate(9));
//                dtm.addRow(vt);
//            }
//            jTable_Staff.setModel(dtm);
//            ps.close();
//            rs.close();
//            ketNoi.close();
//        } catch (SQLException ex) {
//            System.out.println("loi lay user");
//        }
//
//    }

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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_FirstName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Address = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel_Image = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jTextField_NumOfOrders = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_Phone = new javax.swing.JTextField();
        jTextField_CreatedAt = new javax.swing.JTextField();
        jButton_Detail = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_User = new javax.swing.JTable();
        jButton_ExportExcel = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox_Name = new javax.swing.JComboBox<>();
        jComboBox_Address = new javax.swing.JComboBox<>();
        jButton_Deleted = new javax.swing.JButton();
        jButton_Remove = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Username");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Address");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Email");

        jTextField_ID.setEditable(false);
        jTextField_ID.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextField_Username.setEditable(false);
        jTextField_Username.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Name");

        jTextField_FirstName.setEditable(false);
        jTextField_FirstName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Created at");

        jTextField_Address.setEditable(false);
        jTextField_Address.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel18.setText("Image");

        jPanel_Image.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel_ImageLayout = new javax.swing.GroupLayout(jPanel_Image);
        jPanel_Image.setLayout(jPanel_ImageLayout);
        jPanel_ImageLayout.setHorizontalGroup(
            jPanel_ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );
        jPanel_ImageLayout.setVerticalGroup(
            jPanel_ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("Phone");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setText("Number of orders");

        jTextField_LastName.setEditable(false);
        jTextField_LastName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextField_NumOfOrders.setEditable(false);
        jTextField_NumOfOrders.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextField_Email.setEditable(false);
        jTextField_Email.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextField_Phone.setEditable(false);
        jTextField_Phone.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextField_CreatedAt.setEditable(false);
        jTextField_CreatedAt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jButton_Detail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/detail.png"))); // NOI18N
        jButton_Detail.setContentAreaFilled(false);
        jButton_Detail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Detail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_CreatedAt, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jTextField_NumOfOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Email)
                    .addComponent(jTextField_Phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField_NumOfOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel18)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_CreatedAt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Detail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel14.setText("Search:");

        jTextField_Search.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField_Search.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField_SearchCaretUpdate(evt);
            }
        });

        jTable_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "First name", "Last name", "Address", "Email", "Phone", "Created at"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_User);

        jButton_ExportExcel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_ExportExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        jButton_ExportExcel.setText("Export");
        jButton_ExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExportExcelActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel19.setText("Filter:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel20.setText("Name");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel21.setText("Address");

        jComboBox_Name.setEditable(true);
        jComboBox_Name.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jComboBox_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_NameActionPerformed(evt);
            }
        });

        jComboBox_Address.setEditable(true);
        jComboBox_Address.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jComboBox_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_AddressActionPerformed(evt);
            }
        });

        jButton_Deleted.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jButton_Deleted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_list.png"))); // NOI18N
        jButton_Deleted.setText("Deleted");
        jButton_Deleted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Deleted.setFocusPainted(false);
        jButton_Deleted.setPreferredSize(new java.awt.Dimension(300, 60));
        jButton_Deleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeletedActionPerformed(evt);
            }
        });

        jButton_Remove.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_Remove.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N
        jButton_Remove.setText("Remove");
        jButton_Remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove.setMaximumSize(new java.awt.Dimension(123, 35));
        jButton_Remove.setMinimumSize(new java.awt.Dimension(95, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jButton_ExportExcel)
                        .addGap(31, 31, 31)
                        .addComponent(jButton_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton_Deleted, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Deleted, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ExportExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21)
                        .addComponent(jComboBox_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void clearAll() {
//        jRadioButton_Male.setSelected(true);
//        jDateChooser_DateOfBirth.setDate(null);
//        jTextField_Name.setText("");
//        jTextField_PhoneNumber.setText("");
//        jTextField_Email.setText("");
//        jTextField_ID.setText("");
//        jComboBox_Province.setSelectedIndex(0);
//        jComboBox_District.setSelectedIndex(0);
//        jComboBox_Commune.setSelectedIndex(0);
//        jComboBox_Role.setSelectedIndex(0);
    }

    public void setEditableForAll(boolean editable) {
//        jDateChooser_DateOfBirth.setEnabled(editable);
//        jTextField_Name.setEditable(editable);
//        jTextField_PhoneNumber.setEditable(editable);
//        jTextField_Email.setEditable(editable);
//        jComboBox_Province.setEnabled(editable);
//        jComboBox_District.setEnabled(editable);
//        jComboBox_Commune.setEnabled(editable);
//        jComboBox_Role.setEnabled(editable);
    }

//    private boolean checkinput() {
//        String id = jTextField_ID.getText();
//        String sqlId = "select * from account where username = '" + id + "'";
//        String sqlEmail = "select * from account where email = '" + jTextField_Email.getText() + "'";
//        String sqlPhone = "select * from account where phone_number = '" + jTextField_PhoneNumber.getText() + "'";
//        if ("".equals(id)) {
//            JOptionPane.showMessageDialog(this, "Mã nhân viên không được trống!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            jTextField_ID.requestFocusInWindow();
//            return false;
//        } else if (checkExist(sqlId) != 0) {
//            JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            jTextField_ID.requestFocusInWindow();
//            return false;
//        } else if ("".equals(jTextField_Name.getText())) {
//            JOptionPane.showMessageDialog(this, "Tên nhân viên không được trống!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            jTextField_Name.requestFocusInWindow();
//            return false;
//        } else if ("".equals(jTextField_PhoneNumber.getText())) {
//            JOptionPane.showMessageDialog(this, "SĐT nhân viên không được trống!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            jTextField_PhoneNumber.requestFocusInWindow();
//            return false;
//        } else if (!jTextField_PhoneNumber.getText().matches("0[0-9]{9}")) {
//            JOptionPane.showMessageDialog(this, "SĐT nhân viên nhập chưa đúng định dạng!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            jTextField_PhoneNumber.requestFocusInWindow();
//            return false;
//        } else if (checkExist(sqlPhone) != 0) {
//            JOptionPane.showMessageDialog(this, "SĐT nhân viên đã được sử dụng!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            jTextField_ID.requestFocusInWindow();
//            return false;
//        } else if ("".equals(jTextField_Email.getText())) {
//            JOptionPane.showMessageDialog(this, "Email nhân viên không được trống!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            jTextField_Email.requestFocusInWindow();
//            return false;
//        } else if (!jTextField_Email.getText().matches("^[a-zA-Z][\\w]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$")) {
//            JOptionPane.showMessageDialog(this, "Email nhân viên nhập chưa đúng định dạng!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            jTextField_Email.requestFocusInWindow();
//            return false;
//        } else if (checkExist(sqlEmail) != 0) {
//            JOptionPane.showMessageDialog(this, "Email nhân viên đã được sử dụng!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            jTextField_ID.requestFocusInWindow();
//            return false;
//        } else if ("".equals(jTextField_Address.getText())) {
//            JOptionPane.showMessageDialog(this, "Adress nhân viên không được trống!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            jTextField_Address.requestFocusInWindow();
//            return false;
//        } else {
//            return true;
//        }
//    }

//    public int checkExist(String sql) {
//        Connection ketNoi = Connect.GetConnect();
//        int tonTai = 0;
//        try {
//            PreparedStatement ps = ketNoi.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                tonTai = 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return tonTai;
//    }

    // check ward_id và specific_address , nếu trùng thì không cần thêm.
//    private int getAddress_idBySpecific_address(int ward_id, String specific_address) {
//        int id = -1;
//        Connection ketNoi = Connect.GetConnect();
//        String sql = "select * from address WHERE specific_address ='" + specific_address + "' and ward_id = '" + ward_id + "'";
//        try {
//            PreparedStatement ps = ketNoi.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                id = rs.getInt("address_id");
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(UserPanel.class
//                    .getName()).log(Level.SEVERE, null, ex);
//        }
//        return id;
//    }

    // nếu không trùng thì thêm specific_address
//    private void insertNewAddress(int ward_id, String specific_address) {
//        Connection ketNoi = Connect.GetConnect();
//        String sql = "insert into address(ward_id,specific_address) values(?,?)";
//        try {
//            PreparedStatement ps = ketNoi.prepareStatement(sql);
//            ps.setInt(1, ward_id);
//            ps.setString(2, specific_address);
//            ps.executeUpdate();
//
//        } catch (SQLException ex) {
//            Logger.getLogger(UserPanel.class
//                    .getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    //ok
//    public boolean insertAccount(Staff s) {
//        Connection ketNoi = Connect.GetConnect();
//        String sql = "INSERT INTO account (username, password , Full_Name, gender,date_of_birth,registered_date,address_id,phone_number,email,role_id,status)\n"
//                + "VALUES (?,?, ?, ?,?,?,?,?,?,?,?)";
//        PreparedStatement ps;
//        try {
//            ps = ketNoi.prepareStatement(sql);
//            ps.setString(1, s.getUsername());
//            ps.setString(2, s.getPassword());
//            ps.setString(3, s.getFullName());
//            ps.setString(4, s.getGender());
//            ps.setString(5, s.getDateOfBirth());
//            ps.setString(6, s.getRegisteredDate());
//            ps.setInt(7, s.getAddress_id());
//            ps.setString(8, s.getPhoneNumber());
//            ps.setString(9, s.getEmail());
//            ps.setInt(10, s.getRoleId());
//            ps.setInt(11, s.getStatus());
//            return ps.executeUpdate() > 0;
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ReaderPanel.class
//                    .getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//    }

    //
//    int getIdWard(String nameWard, String nameDistrict, String nameProvince) {
//        int i = 0;
//        Connection ketNoi = Connect.GetConnect();
//        try {
//            PreparedStatement ps = ketNoi.prepareStatement("select ward.ward_id from ward where ward.ward_name = ? and ward.district_id = ?");
//            ps.setString(1, nameWard);
//            ps.setInt(2, getIdDistrict(nameDistrict, nameProvince));
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                i = rs.getInt(1);
//            }
//            ps.close();
//            rs.close();
//            ketNoi.close();
//        } catch (SQLException ex) {
//        }
//        return i;
//    }

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }

//    public boolean updateAccount(String username, String Full_Name, String gender, String date_of_birth, int address_id, String phone_number, String email, int roleId) {
//        Connection ketNoi = Connect.GetConnect();
//        String sql = "update account\n"
//                + "set Full_Name= ?, gender = ?, date_of_birth = ?,address_id = ?, phone_number= ?, email= ? , role_id = ?\n"
//                + "WHERE username = ?";
//        PreparedStatement ps;
//        try {
//            ps = ketNoi.prepareStatement(sql);
//            ps.setString(1, Full_Name);
//            ps.setString(2, gender);
//            ps.setString(3, date_of_birth);
//            ps.setInt(4, address_id);
//            ps.setString(5, phone_number);
//            ps.setString(6, email);
//            ps.setInt(7, roleId);
//            ps.setString(8, username);
//            ps.executeUpdate();
//            return true;
//        } catch (SQLException ex) {
//            Logger.getLogger(ReaderPanel.class
//                    .getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//    }

    // status 0 => 1
//    public void xoaNhanVien(String maNV) {
//        String sql = "update account set status = 0 where username =  ? ";
//        Connection con = Connect.GetConnect();
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, maNV);
//            ps.executeUpdate();
//            ps.close();
//            con.close();
//
//        } catch (SQLException ex) {
//            Logger.getLogger(UserPanel.class
//                    .getName()).log(Level.SEVERE, null, ex);
//        }
//    }

//    int getIdProvince(String nameProvince) {
//        int i = 0;
//        Connection ketNoi = Connect.GetConnect();
//        try {
//            PreparedStatement ps = ketNoi.prepareStatement("select province.province_id from province where province.province_name = ?");
//            ps.setString(1, nameProvince);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                i = rs.getInt(1);
//            }
//            ps.close();
//            rs.close();
//            ketNoi.close();
//        } catch (SQLException ex) {
//            System.out.println("Lỗi lấy IdProvince!!");
//        }
//        return i;
//    }

//    int getIdRole(String role) {
//        int i = 0;
//        Connection ketNoi = Connect.GetConnect();
//        try {
//            PreparedStatement ps = ketNoi.prepareStatement("select role.role_id from role where role.role = ?");
//            ps.setString(1, role);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                i = rs.getInt(1);
//            }
//            ps.close();
//            rs.close();
//            ketNoi.close();
//        } catch (SQLException ex) {
//            System.out.println("Lỗi lấy role_id");
//        }
//        return i;
//    }

//    int getIdDistrict(String nameDistrict, String nameProvince) {
//        int i = 0;
//        Connection ketNoi = Connect.GetConnect();
//        try {
//            PreparedStatement ps = ketNoi.prepareStatement("select district.district_id from district where district.district_name = ? and district.province_id = ?");
//            ps.setString(1, nameDistrict);
//            ps.setInt(2, getIdProvince(nameProvince));
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                i = rs.getInt(1);
//            }
//            ps.close();
//            rs.close();
//            ketNoi.close();
//        } catch (SQLException ex) {
//            System.out.println("Lỗi lấy district_id!!");
//        }
//        return i;
//    }


    private void jTable_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_UserMouseClicked
        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel) jTable_Staff.getModel();
//        int selectedRow = jTable_Staff.getSelectedRow();
//
//        List<Integer> list = getIdDistrictAndIdProvince(model.getValueAt(selectedRow, 0).toString());
//        jTextField_ID.setText(model.getValueAt(selectedRow, 0).toString());
//        jTextField_Name.setText(model.getValueAt(selectedRow, 1).toString());
//        jTextField_Email.setText(model.getValueAt(selectedRow, 7).toString());
//        jTextField_PhoneNumber.setText(model.getValueAt(selectedRow, 6).toString());
//        jTextField_Address.setText(model.getValueAt(selectedRow, 5).toString().split(" - ")[0]);
//        jComboBox_Province.setSelectedIndex(list.get(2) - 1);
//        jComboBox_District.setSelectedItem(model.getValueAt(selectedRow, 5).toString().split(" - ")[2]);
//        jComboBox_Commune.setSelectedItem(model.getValueAt(selectedRow, 5).toString().split(" - ")[1]);
//        jComboBox_Role.setSelectedItem(model.getValueAt(selectedRow, 2).toString());
//        if (model.getValueAt(selectedRow, 3).toString().equalsIgnoreCase("Nam")) {
//            jRadioButton_Male.setSelected(true);
//        } else if (model.getValueAt(selectedRow, 3).toString().equalsIgnoreCase("Nữ")) {
//            jRadioButton_Female.setSelected(true);
//        } else {
//            jRadioButton_Other.setSelected(true);
//        }
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            jDateChooser_DateOfBirth.setDate(sdf.parse(model.getValueAt(selectedRow, 4).toString()));
//        } catch (ParseException ex) {
//            System.out.println(ex.getMessage());
//        }
//        jButton_Modify.setEnabled(true);
//        jButton_Remove.setEnabled(true);
    }//GEN-LAST:event_jTable_UserMouseClicked

    private void jTextField_SearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField_SearchCaretUpdate
        // TODO add your handling code here:
        String tuKhoa = jTextField_Search.getText().toLowerCase();
        TableRowSorter<TableModel> trs = new TableRowSorter<>(jTable_User.getModel());
        jTable_User.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + tuKhoa, 1));
    }//GEN-LAST:event_jTextField_SearchCaretUpdate

    private void jButton_ExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExportExcelActionPerformed
        // TODO add your handling code here:
//        File.xuatFileExcel("DSNhanVien", (DefaultTableModel) jTable_Staff.getModel(), "NhanVien");
        JOptionPane.showMessageDialog(this, "Xuất file excel thành công!");
    }//GEN-LAST:event_jButton_ExportExcelActionPerformed

    private void jComboBox_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_NameActionPerformed

    private void jComboBox_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_AddressActionPerformed

    private void jButton_DeletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeletedActionPerformed
        // TODO add your handling code here:
        userDeletedDialog = new UserDeletedDialog(null, true);
        userDeletedDialog.setVisible(true);
    }//GEN-LAST:event_jButton_DeletedActionPerformed

    private void jButton_DetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DetailActionPerformed
        // TODO add your handling code here:
        this.addressDialog = new AddressDialog(null, true, this);
        this.addressDialog.setVisible(true);
    }//GEN-LAST:event_jButton_DetailActionPerformed

//    List<Integer> getIdDistrictAndIdProvince(String username) {
//        int i = 0;
//        int j = 0;
//        int x = 0;
//        List<Integer> list = new ArrayList<Integer>();
//        Connection ketNoi = Connect.GetConnect();
//        try {
//            PreparedStatement ps = ketNoi.prepareStatement("select ward.ward_id,district.district_id,province.province_id from ward,district,province,address\n"
//                    + "where ward.district_id = district.district_id\n"
//                    + "and district.province_id = province.province_id\n"
//                    + "and ward.ward_id = address.ward_id\n"
//                    + "and address.address_id = ?");
//            ps.setInt(1, getIdAddressByUserName(username));
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                i = rs.getInt(1);
//                j = rs.getInt(2);
//                x = rs.getInt(3);
//            }
//            ps.close();
//            rs.close();
//            ketNoi.close();
//        } catch (SQLException ex) {
//            System.out.println("Lỗi lấy getIdDistrictAndIdProvince");
//        }
//        list.add(i);
//        list.add(j);
//        list.add(x);
//        return list;
//    }

//    int getIdAddressByUserName(String username) {
//        int i = 0;
//        Connection ketNoi = Connect.GetConnect();
//        try {
//            PreparedStatement ps = ketNoi.prepareStatement("select account.address_id from account where account.username = ?");
//            ps.setString(1, username);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                i = rs.getInt(1);
//            }
//            ps.close();
//            rs.close();
//            ketNoi.close();
//        } catch (SQLException ex) {
//            System.out.println("Lỗi lấy address_id từ username!!");
//        }
//        return i;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Deleted;
    private javax.swing.JButton jButton_Detail;
    private javax.swing.JButton jButton_ExportExcel;
    private javax.swing.JButton jButton_Remove;
    private javax.swing.JComboBox<String> jComboBox_Address;
    private javax.swing.JComboBox<String> jComboBox_Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Image;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_User;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_CreatedAt;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_NumOfOrders;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
