/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.products;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
import java.util.Enumeration;
//import java.util.List;
//import java.util.Vector;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
//import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
//import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
//import model.database.Connect;
//import model.database.Staff;
import swing.UIController;
//import utilities.File;

/**
 *
 * @author Admin
 */
public class ProductPanel extends javax.swing.JPanel {

    private DefaultTableModel dtm;

    private enum Mode {
        ADD,
        MODIFY,
        FREE
    }
    private Mode mode;
    private NewCategoryDialog newCategoryDialog;
    private NewBrandDialog newBrandDialog;
    private ImportHistoryDialog history;
    private ProductImportDialog productImportDialog;
    private ProductDeletedDialog productDeletedDialog;

    /**
     * Creates new form StaffPanel
     */
    public ProductPanel() {
        initComponents();
//        getStaff();
//        loadAddress();
//        loadRole();
//        UIController.setDefaultTableHeader(jTable_Staff);
//        setEditableForAll(false);
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
        jLabel13 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBox_Brand = new javax.swing.JComboBox<>();
        jComboBox_Category = new javax.swing.JComboBox<>();
        jTextField_Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Unit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Specification = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSpinner_Price = new javax.swing.JSpinner();
        jSpinner_Quantity = new javax.swing.JSpinner();
        jSpinner_Discount = new javax.swing.JSpinner();
        jTextField_Sold = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jPanel_Image = new javax.swing.JPanel();
        jButton_Change = new javax.swing.JButton();
        jButton_Category = new javax.swing.JButton();
        jButton_Brand = new javax.swing.JButton();
        jPanel_Card = new javax.swing.JPanel();
        jPanel_Card1 = new javax.swing.JPanel();
        jButton_Add = new javax.swing.JButton();
        jButton_Modify = new javax.swing.JButton();
        jButton_Remove = new javax.swing.JButton();
        jPanel_Card2 = new javax.swing.JPanel();
        jButton_OK = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField_NameSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Product = new javax.swing.JTable();
        jButton_ExportExcel = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox_FilterCategory = new javax.swing.JComboBox<>();
        jComboBox_FilterBrand = new javax.swing.JComboBox<>();
        jButton_Import = new javax.swing.JButton();
        jButton_ShowImportHistory = new javax.swing.JButton();
        jButton_Deleted = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Sold quantity");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Price");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel13.setText("Brand");

        jTextField_ID.setEditable(false);
        jTextField_ID.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel15.setText("Category");

        jComboBox_Brand.setEditable(true);
        jComboBox_Brand.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jComboBox_Category.setEditable(true);
        jComboBox_Category.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jComboBox_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_CategoryActionPerformed(evt);
            }
        });

        jTextField_Name.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("đ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Unit");

        jTextField_Unit.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Specification");

        jTextField_Specification.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Discount");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setText("Quantity");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("%");

        jSpinner_Price.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jSpinner_Price.setModel(new javax.swing.SpinnerNumberModel(10000, 0, null, 10000));

        jSpinner_Quantity.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jSpinner_Quantity.setModel(new javax.swing.SpinnerNumberModel(5, 1, null, 5));

        jSpinner_Discount.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jSpinner_Discount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 5));

        jTextField_Sold.setEditable(false);
        jTextField_Sold.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel17.setText("Description");

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Description);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel18.setText("Image");

        jPanel_Image.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel_ImageLayout = new javax.swing.GroupLayout(jPanel_Image);
        jPanel_Image.setLayout(jPanel_ImageLayout);
        jPanel_ImageLayout.setHorizontalGroup(
            jPanel_ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel_ImageLayout.setVerticalGroup(
            jPanel_ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton_Change.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_Change.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Change.setText("Choose file");
        jButton_Change.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ChangeActionPerformed(evt);
            }
        });

        jButton_Category.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_Category.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButton_Category.setMaximumSize(new java.awt.Dimension(35, 29));
        jButton_Category.setMinimumSize(new java.awt.Dimension(35, 29));
        jButton_Category.setPreferredSize(new java.awt.Dimension(35, 29));
        jButton_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CategoryActionPerformed(evt);
            }
        });

        jButton_Brand.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_Brand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButton_Brand.setMaximumSize(new java.awt.Dimension(35, 29));
        jButton_Brand.setMinimumSize(new java.awt.Dimension(35, 29));
        jButton_Brand.setPreferredSize(new java.awt.Dimension(35, 29));
        jButton_Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BrandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Name)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSpinner_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addGap(102, 102, 102))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_Unit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_Specification)
                                        .addGap(1, 1, 1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jSpinner_Discount, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                            .addComponent(jTextField_ID)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Sold))))
                    .addComponent(jLabel1))
                .addGap(8, 8, 8)
                .addComponent(jLabel16)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox_Brand, 0, 235, Short.MAX_VALUE)
                            .addComponent(jComboBox_Category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Category, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Brand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Change, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField_Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField_Specification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner_Price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel5)
                                        .addComponent(jSpinner_Discount)
                                        .addComponent(jLabel15)
                                        .addComponent(jComboBox_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jSpinner_Quantity)
                                .addComponent(jTextField_Sold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(jComboBox_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_Change, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel_Card.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Card.setLayout(new java.awt.CardLayout());

        jPanel_Card1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Card1.setMaximumSize(new java.awt.Dimension(30000, 33));
        jPanel_Card1.setPreferredSize(new java.awt.Dimension(439, 30));
        jPanel_Card1.setLayout(new java.awt.GridLayout(1, 0, 35, 0));

        jButton_Add.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_Add.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add30px.png"))); // NOI18N
        jButton_Add.setText("Add");
        jButton_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add.setMaximumSize(new java.awt.Dimension(95, 30));
        jButton_Add.setMinimumSize(new java.awt.Dimension(95, 30));
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });
        jPanel_Card1.add(jButton_Add);

        jButton_Modify.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_Modify.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jButton_Modify.setText("Modify");
        jButton_Modify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Modify.setEnabled(false);
        jButton_Modify.setMaximumSize(new java.awt.Dimension(95, 33));
        jButton_Modify.setMinimumSize(new java.awt.Dimension(95, 30));
        jButton_Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModifyActionPerformed(evt);
            }
        });
        jPanel_Card1.add(jButton_Modify);

        jButton_Remove.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_Remove.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N
        jButton_Remove.setText("Remove");
        jButton_Remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove.setEnabled(false);
        jButton_Remove.setMaximumSize(new java.awt.Dimension(123, 35));
        jButton_Remove.setMinimumSize(new java.awt.Dimension(95, 30));
        jButton_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemoveActionPerformed(evt);
            }
        });
        jPanel_Card1.add(jButton_Remove);

        jPanel_Card.add(jPanel_Card1, "cardFirst");

        jPanel_Card2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Card2.setLayout(new java.awt.GridLayout(1, 0, 35, 0));

        jButton_OK.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_OK.setForeground(new java.awt.Color(51, 51, 51));
        jButton_OK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add30px.png"))); // NOI18N
        jButton_OK.setText("OK");
        jButton_OK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OKActionPerformed(evt);
            }
        });
        jPanel_Card2.add(jButton_OK);

        jButton_Cancel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_Cancel.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel20px.png"))); // NOI18N
        jButton_Cancel.setText("Cancel");
        jButton_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });
        jPanel_Card2.add(jButton_Cancel);

        jButton_Clear.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png"))); // NOI18N
        jButton_Clear.setText("Clear");
        jButton_Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });
        jPanel_Card2.add(jButton_Clear);

        jPanel_Card.add(jPanel_Card2, "cardSecond");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel14.setText("Search:");

        jTextField_NameSearch.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField_NameSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField_NameSearchCaretUpdate(evt);
            }
        });

        jTable_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Brand", "Unit", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Product);

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
        jLabel20.setText("Category");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel21.setText("Brand");

        jComboBox_FilterCategory.setEditable(true);
        jComboBox_FilterCategory.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jComboBox_FilterCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_FilterCategoryActionPerformed(evt);
            }
        });

        jComboBox_FilterBrand.setEditable(true);
        jComboBox_FilterBrand.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jComboBox_FilterBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_FilterBrandActionPerformed(evt);
            }
        });

        jButton_Import.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jButton_Import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delivery.png"))); // NOI18N
        jButton_Import.setText("Import");
        jButton_Import.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Import.setEnabled(false);
        jButton_Import.setFocusPainted(false);
        jButton_Import.setPreferredSize(new java.awt.Dimension(300, 60));
        jButton_Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ImportActionPerformed(evt);
            }
        });

        jButton_ShowImportHistory.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jButton_ShowImportHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/history.png"))); // NOI18N
        jButton_ShowImportHistory.setText("History");
        jButton_ShowImportHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ShowImportHistory.setFocusPainted(false);
        jButton_ShowImportHistory.setPreferredSize(new java.awt.Dimension(300, 60));
        jButton_ShowImportHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ShowImportHistoryActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_FilterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(jComboBox_FilterBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_NameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_ExportExcel)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_Card, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_ShowImportHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jButton_Deleted, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton_Import, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_Card, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_NameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jButton_ExportExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21)
                        .addComponent(jComboBox_FilterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_FilterBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jButton_Import, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_ShowImportHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Deleted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

//    public void clearAll() {
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
//    }
//    public void setEditableForAll(boolean editable) {
//        jDateChooser_DateOfBirth.setEnabled(editable);
//        jTextField_Name.setEditable(editable);
//        jTextField_PhoneNumber.setEditable(editable);
//        jTextField_Email.setEditable(editable);
//        jComboBox_Province.setEnabled(editable);
//        jComboBox_District.setEnabled(editable);
//        jComboBox_Commune.setEnabled(editable);
//        jComboBox_Role.setEnabled(editable);
//    }
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
//            Logger.getLogger(ProductPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return tonTai;
//    }

    private void jButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OKActionPerformed
        // TODO add your handling code here:
//        String username = jTextField_ID.getText();
//        String Full_Name = jTextField_Name.getText();
//        String genderEndlish = getSelectedButtonText(buttonGroup1);
//        String gender = "";
//        if (genderEndlish.equalsIgnoreCase("Male")) {
//            gender = "Nam";
//        } else if (genderEndlish.equalsIgnoreCase("Female")) {
//            gender = "Nữ";
//        } else {
//            gender = "Khác";
//        }
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String date_of_birth = sdf.format(jDateChooser_DateOfBirth.getDate());
//        String specific_address = jTextField_Address.getText();
//        String email = jTextField_Email.getText();
//        String phone_number = jTextField_PhoneNumber.getText();
//        int ward_id = getIdWard(jComboBox_Commune.getSelectedItem().toString(), jComboBox_District.getSelectedItem().toString(), jComboBox_Province.getSelectedItem().toString());
//        String registeredDate = java.time.LocalDate.now().toString();
//        if (mode == Mode.ADD) {
//            if (checkinput() == true) {
//                String username = jTextField_ID.getText();
//                String Full_Name = jTextField_Name.getText();
//                String genderEndlish = getSelectedButtonText(buttonGroup1);
//                String gender = "";
//                if (genderEndlish.equalsIgnoreCase("Male")) {
//                    gender = "Nam";
//                } else if (genderEndlish.equalsIgnoreCase("Female")) {
//                    gender = "Nữ";
//                } else {
//                    gender = "Khác";
//                }
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                String date_of_birth = sdf.format(jDateChooser_DateOfBirth.getDate());
//                String specific_address = jTextField_Address.getText();
//                String email = jTextField_Email.getText();
//                String phone_number = jTextField_PhoneNumber.getText();
//                int ward_id = getIdWard(jComboBox_Commune.getSelectedItem().toString(), jComboBox_District.getSelectedItem().toString(), jComboBox_Province.getSelectedItem().toString());
//                String registeredDate = java.time.LocalDate.now().toString();
//                
//                int address_id = getAddress_idBySpecific_address(ward_id, specific_address);
//                if (address_id == -1) {
//                    insertNewAddress(ward_id, specific_address);
//                    address_id = getAddress_idBySpecific_address(ward_id, specific_address);
//                }
//                
//                String role = jComboBox_Role.getSelectedItem().toString();
//                int roleId = getIdRole(role);
//                
//                Staff s1 = new Staff(username, hash(username), Full_Name, gender, date_of_birth, registeredDate, address_id, phone_number, email, roleId, 1);
//                boolean flag = insertAccount(s1);
//                if (flag != false) {
//                    JOptionPane.showMessageDialog(this, "Thêm nhân viên mới thành công!!!", "", JOptionPane.CLOSED_OPTION);
//                    getStaff();
//                } else {
//                    JOptionPane.showMessageDialog(this, "Thêm nhân viên mới thất bại!!!", "", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//        }
//        if (mode == Mode.MODIFY) {
//            //jTextField_ID.setEnabled(false);
//            String username = jTextField_ID.getText();
//            String Full_Name = jTextField_Name.getText();
//            String genderEndlish = getSelectedButtonText(buttonGroup1);
//            String gender = "";
//            if (genderEndlish.equalsIgnoreCase("Male")) {
//                gender = "Nam";
//            } else if (genderEndlish.equalsIgnoreCase("Female")) {
//                gender = "Nữ";
//            } else {
//                gender = "Khác";
//            }
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            String date_of_birth = sdf.format(jDateChooser_DateOfBirth.getDate());
//            String specific_address = jTextField_Address.getText();
//            String email = jTextField_Email.getText();
//            String phone_number = jTextField_PhoneNumber.getText();
//            int ward_id = getIdWard(jComboBox_Commune.getSelectedItem().toString(), jComboBox_District.getSelectedItem().toString(), jComboBox_Province.getSelectedItem().toString());
//            String registeredDate = java.time.LocalDate.now().toString();
//
//            int address_id = getAddress_idBySpecific_address(ward_id, specific_address);
//            if (address_id == -1) {
//                insertNewAddress(ward_id, specific_address);
//                address_id = getAddress_idBySpecific_address(ward_id, specific_address);
//            } else {
//                address_id = getAddress_idBySpecific_address(ward_id, specific_address);
//            }
//
//            String role = jComboBox_Role.getSelectedItem().toString();
//            int roleId = getIdRole(role);
//
//            boolean flag = updateAccount(username, Full_Name, gender, date_of_birth, address_id, phone_number, email, roleId);
//            if (flag == true) {
//                JOptionPane.showMessageDialog(null, "Sửa thông tin nhân viên mới thành công!!!", "", JOptionPane.CLOSED_OPTION);
//                getStaff();
//            } else {
//                JOptionPane.showMessageDialog(null, "Sửa thông tin nhân viên mới thất bại!!!", "", JOptionPane.ERROR_MESSAGE);
//            }
//        }
        UIController.showCardLayout("cardFirst", jPanel_Card);
    }//GEN-LAST:event_jButton_OKActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // TODO add your handling code here:
        mode = Mode.FREE;
//        clearAll();
//        setEditableForAll(false);
//        if (jTable_Staff.getSelectedRow() != -1) {
//        } else {
//            jButton_Modify.setEnabled(false);
//            jButton_Remove.setEnabled(false);
//        }
        UIController.showCardLayout("cardFirst", jPanel_Card);
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        // TODO add your handling code here:
//        clearAll();
    }//GEN-LAST:event_jButton_ClearActionPerformed

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
//            Logger.getLogger(ProductPanel.class
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
//            Logger.getLogger(ProductPanel.class
//                    .getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
//        clearAll();
        mode = Mode.ADD;
        UIController.showCardLayout("cardSecond", jPanel_Card);
//        setEditableForAll(true);
//        jTextField_ID.setEditable(true);
//
//        Date date = new Date();
//        jDateChooser_DateOfBirth.setDate(date);
//        jComboBox_Province.setSelectedIndex(0);
//        jComboBox_District.setSelectedIndex(0);
//        jComboBox_Commune.setSelectedIndex(0);
    }//GEN-LAST:event_jButton_AddActionPerformed

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

    private void jButton_ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModifyActionPerformed
        // TODO add your handling code here:
        mode = Mode.MODIFY;
        UIController.showCardLayout("cardSecond", jPanel_Card);
//        setEditableForAll(true);
    }//GEN-LAST:event_jButton_ModifyActionPerformed

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

    private void jButton_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoveActionPerformed
        // TODO add your handling code here:
        jButton_Modify.setEnabled(false);
        jButton_Remove.setEnabled(false);
        String maNV = jTextField_ID.getText();
        if (maNV.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên bạn muốn xóa");
        } else {
            int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa?", "Xác nhận", 0);
            if (luaChon == JOptionPane.CANCEL_OPTION) {
                return;
            } else if (luaChon == JOptionPane.OK_OPTION) {
//                xoaNhanVien(maNV);
                JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công!");
//                clearAll();
//                getStaff();
            }
        }
    }//GEN-LAST:event_jButton_RemoveActionPerformed

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
//            Logger.getLogger(ProductPanel.class
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

    private void jTable_ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ProductMouseClicked
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
    }//GEN-LAST:event_jTable_ProductMouseClicked

    private void jComboBox_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_CategoryActionPerformed
//        Connection ketNoi = Connect.GetConnect();
//        try {
//            PreparedStatement ps = ketNoi.prepareStatement("select role from role");
//            ps.setInt(1, getIdRole(jComboBox_Role.getSelectedItem().toString()));
//            ResultSet rs = ps.executeQuery();
//            jComboBox_Role.removeAllItems();
//            while (rs.next()) {
//                jComboBox_Role.addItem(rs.getString(1));
//            }
//            ps.close();
//            rs.close();
//            ketNoi.close();
//        } catch (SQLException ex) {
//            System.out.println("Lỗi lấy role!!");
//        }
    }//GEN-LAST:event_jComboBox_CategoryActionPerformed

    private void jTextField_NameSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField_NameSearchCaretUpdate
        // TODO add your handling code here:
        String tuKhoa = jTextField_NameSearch.getText().toLowerCase();
        TableRowSorter<TableModel> trs = new TableRowSorter<>(jTable_Product.getModel());
        jTable_Product.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + tuKhoa, 1));
    }//GEN-LAST:event_jTextField_NameSearchCaretUpdate

    private void jButton_ExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExportExcelActionPerformed
        // TODO add your handling code here:
//        File.xuatFileExcel("DSNhanVien", (DefaultTableModel) jTable_Staff.getModel(), "NhanVien");
        JOptionPane.showMessageDialog(this, "Xuất file excel thành công!");
    }//GEN-LAST:event_jButton_ExportExcelActionPerformed

    private void jButton_ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ChangeActionPerformed

    private void jComboBox_FilterCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_FilterCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_FilterCategoryActionPerformed

    private void jComboBox_FilterBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_FilterBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_FilterBrandActionPerformed

    private void jButton_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CategoryActionPerformed
        // TODO add your handling code here:
        this.newCategoryDialog = new NewCategoryDialog(null, true, this);
        this.newCategoryDialog.setVisible(true);
    }//GEN-LAST:event_jButton_CategoryActionPerformed

    private void jButton_BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BrandActionPerformed
        // TODO add your handling code here:
        this.newBrandDialog = new NewBrandDialog(null, true, this);
        this.newBrandDialog.setVisible(true);
    }//GEN-LAST:event_jButton_BrandActionPerformed

    private void jButton_ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ImportActionPerformed
//        Ingredient newIngredient = ingredientList.getByID(getIDAtSelectedRow());
        this.productImportDialog = new ProductImportDialog(null, true, /*newIngredient,*/ this);
//        UIControl.setLocationCenterForDialog(ingredientImport);
        this.productImportDialog.setVisible(true);
//        jButton_Modify.setEnabled(false);
//        jButton_Remove.setEnabled(false);
//        jButton_Import.setEnabled(false);
    }//GEN-LAST:event_jButton_ImportActionPerformed

    private void jButton_ShowImportHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ShowImportHistoryActionPerformed
        history = new ImportHistoryDialog(null, true);
        history.setVisible(true);
    }//GEN-LAST:event_jButton_ShowImportHistoryActionPerformed

    private void jButton_DeletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeletedActionPerformed
        // TODO add your handling code here:
        productDeletedDialog = new ProductDeletedDialog(null, true);
        productDeletedDialog.setVisible(true);
    }//GEN-LAST:event_jButton_DeletedActionPerformed

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
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Brand;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Category;
    private javax.swing.JButton jButton_Change;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Deleted;
    private javax.swing.JButton jButton_ExportExcel;
    private javax.swing.JButton jButton_Import;
    private javax.swing.JButton jButton_Modify;
    private javax.swing.JButton jButton_OK;
    private javax.swing.JButton jButton_Remove;
    private javax.swing.JButton jButton_ShowImportHistory;
    private javax.swing.JComboBox<String> jComboBox_Brand;
    private javax.swing.JComboBox<String> jComboBox_Category;
    private javax.swing.JComboBox<String> jComboBox_FilterBrand;
    private javax.swing.JComboBox<String> jComboBox_FilterCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Card;
    private javax.swing.JPanel jPanel_Card1;
    private javax.swing.JPanel jPanel_Card2;
    private javax.swing.JPanel jPanel_Image;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_Discount;
    private javax.swing.JSpinner jSpinner_Price;
    private javax.swing.JSpinner jSpinner_Quantity;
    private javax.swing.JTable jTable_Product;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_NameSearch;
    private javax.swing.JTextField jTextField_Sold;
    private javax.swing.JTextField jTextField_Specification;
    private javax.swing.JTextField jTextField_Unit;
    // End of variables declaration//GEN-END:variables
}
