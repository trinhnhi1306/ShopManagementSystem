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
import controller.BrandController;
import controller.CategoryController;
import controller.ProductController;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.List;
//import java.util.Vector;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
//import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
//import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Brand;
import model.Category;
import model.Product;
import model.Response;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.ByteString;
import output.ProductOutput;
import retrofit2.Call;
import retrofit2.Callback;
import service.APIClient;
//import model.database.Connect;
//import model.database.Staff;
import swing.UIController;
import utils.ConnectAPI;
import service.UploadFileService;
//import utilities.File;

/**
 *
 * @author Admin
 */
public class ProductPanel extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private ProductController pc;
    private CategoryController cc;
    private BrandController bc;
    private ProductOutput output;
    private String imageName = "";
    private File selectedFile;

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
        jTextArea_Description.setWrapStyleWord(true);
        dtm = (DefaultTableModel) jTable_Product.getModel();
        pc = new ProductController();
        cc = new CategoryController();
        bc = new BrandController();        
        
        loadData(1);
        loadCategory();
        loadBrand();
        setEditableForAll(false);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(jTable_Product.getModel());
        jTable_Product.setRowSorter(sorter);
        
        
    }
    
    public void upload() {   
        File fileName = new File("C:\\Users\\TRINH\\OneDrive - Sang ltd\\Documents\\Nam4\\Phat trien cac ung dung di dong\\GiuaKy\\GiuaKiAndroid\\QuanLyTruyenHinh_Nhom10\\app\\src\\main\\res\\drawable\\category.png");
        String url = "http://localhost:8080/api/image/category";
        try {
            int res = ConnectAPI.uploadImage(fileName, url, "POST", true);
            if (res == HttpURLConnection.HTTP_OK) {
            System.err.println("Success!");
        } else {
            System.err.printf("Failed %d\n", res);
        }
        } catch (IOException ex) {
            Logger.getLogger(ProductPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void loadData(int page) {        
        output = pc.getProductInOnePage(page);
        jLabel_Page.setText(output.getPage() + "/" + output.getTotalPage());
        pc.loadTable(output.getListResult(), dtm);
    }

    public void loadCategory() {
        List<Category> list = cc.getAllCategories();
        for(Category c: list) {
            jComboBox_Category.addItem(c);
            jComboBox_FilterCategory.addItem(c);
        }
    }
    
    public void loadBrand() {
        List<Brand> list = bc.getAllBrands();
        for(Brand b: list) {
            jComboBox_Brand.addItem(b);
            jComboBox_FilterBrand.addItem(b);
        }
    }
    
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
        jLabel_Category = new javax.swing.JLabel();
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
        jButton_Change = new javax.swing.JButton();
        jButton_Category = new javax.swing.JButton();
        jButton_Brand = new javax.swing.JButton();
        jLabel_Image = new javax.swing.JLabel();
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
        jButton_PreviousPage = new javax.swing.JButton();
        jButton_NextPage = new javax.swing.JButton();
        jLabel_Page = new javax.swing.JLabel();

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

        jLabel_Category.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel_Category.setText("Category");

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
        jTextArea_Description.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextArea_Description.setLineWrap(true);
        jTextArea_Description.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Description);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel18.setText("Image");

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

        jLabel_Image.setText("image");

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
                                        .addComponent(jSpinner_Discount, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))))
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
                    .addComponent(jLabel_Category, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox_Brand, 0, 235, Short.MAX_VALUE)
                            .addComponent(jComboBox_Category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Category, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Brand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Change, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(17, 17, 17)
                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                        .addComponent(jLabel_Category)
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
        jButton_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_AddMouseClicked(evt);
            }
        });
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
        jButton_Modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_ModifyMouseClicked(evt);
            }
        });
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
        jButton_Remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RemoveMouseClicked(evt);
            }
        });
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
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Product.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable_ProductFocusLost(evt);
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

        jButton_PreviousPage.setText("<");
        jButton_PreviousPage.setEnabled(false);
        jButton_PreviousPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PreviousPageActionPerformed(evt);
            }
        });

        jButton_NextPage.setText(">");
        jButton_NextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NextPageActionPerformed(evt);
            }
        });

        jLabel_Page.setText("/");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_ShowImportHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jButton_Deleted, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jButton_Import, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton_PreviousPage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jLabel_Page, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_NextPage)
                                .addGap(22, 22, 22)))))
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jButton_Import, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_ShowImportHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Deleted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_PreviousPage)
                            .addComponent(jButton_NextPage)
                            .addComponent(jLabel_Page))
                        .addGap(26, 26, 26))))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void clearAll() {
        jTextField_ID.setText("");
        jTextField_Name.setText("");
        jTextArea_Description.setText("");
        jTextField_Unit.setText("");
        jTextField_Specification.setText("");
        jComboBox_Category.setSelectedIndex(-1);
        jComboBox_Brand.setSelectedIndex(-1);
        jSpinner_Quantity.setValue(0);
        jSpinner_Price.setValue(0);
        jSpinner_Discount.setValue(0);
    }
    public void setEditableForAll(boolean editable) {
        jTextField_Name.setEditable(editable);
        jTextArea_Description.setEditable(editable);
        jTextField_Unit.setEditable(editable);
        jTextField_Specification.setEditable(editable);
        jComboBox_Category.setEnabled(editable);
        jComboBox_Brand.setEnabled(editable);
        jSpinner_Quantity.setEnabled(editable);
        jSpinner_Price.setEnabled(editable);
        jSpinner_Discount.setEnabled(editable);
        jComboBox_FilterBrand.setEnabled(!editable);
        jComboBox_FilterCategory.setEnabled(!editable);
        jTextField_NameSearch.setEnabled(!editable);
        jButton_Change.setEnabled(editable);
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
//            Logger.getLogger(ProductPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return tonTai;
//    }

    private void jButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OKActionPerformed
        // TODO add your handling code here:
        String name = jTextField_Name.getText();
        String unit = jTextField_Unit.getText();
        String specification = jTextField_Specification.getText();
        String description = jTextArea_Description.getText();
        double price = Double.parseDouble(jSpinner_Price.getValue().toString());
        int discount = Integer.parseInt(jSpinner_Discount.getValue().toString());
        int soldQuantity = Integer.parseInt(jTextField_Sold.getText());
        int quantity = Integer.parseInt(jSpinner_Quantity.getValue().toString());
        
        Brand brand = (Brand) jComboBox_Brand.getSelectedItem();
        Category category = (Category) jComboBox_Category.getSelectedItem();        
        
        if (mode == Mode.ADD) {            
            Product product = new Product();
            product.setName(name);
            product.setDescription(description);
            product.setPrice(price);
            product.setSpecification(specification);
            product.setCalculationUnit(unit);
            product.setDiscount(discount);
            product.setSoldQuantity(soldQuantity);
            product.setQuantity(quantity);
            product.setCategory(category);
            product.setBrand(brand);
            product.setStatus(true);
            if(selectedFile != null) {
                try {
                    RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), selectedFile);
                    MultipartBody.Part part = MultipartBody.Part.createFormData("file", selectedFile.getName(), requestBody);
                    UploadFileService uploadFileInterface = APIClient.getClient().create(UploadFileService.class);
                    uploadFileInterface.upload(part).enqueue(new Callback<ResponseBody>() {

                        @Override
                        public void onResponse(Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
                            try {
                                if(response.isSuccessful()) {
                                    String str = response.body().string();
                                    product.setImage(str);
                                    System.out.println("vãi: " + product.getImage());
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e.getMessage());
                            }
                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {
                            JOptionPane.showMessageDialog(null, t.getMessage());
                        }

                    });
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
            else {
                product.setImage("default.png");
            }
            Response response = pc.addProduct(product);
            JOptionPane.showMessageDialog(this, response.getMessage());
            if(response.getResponseCode() == 200)
                loadData(output.getPage());
            else
                return;            
        }
        if (mode == Mode.MODIFY) {
            Product product = new Product();
            product.setProductId(Integer.parseInt(jTextField_ID.getText()));
            product.setName(name);
            product.setDescription(description);
            product.setImage(imageName);
            product.setPrice(price);
            product.setSpecification(specification);
            product.setCalculationUnit(unit);
            product.setDiscount(discount);
            product.setSoldQuantity(soldQuantity);
            product.setQuantity(quantity);
            product.setCategory(category);
            product.setBrand(brand);
            product.setStatus(true);
            Response response = pc.updateProductByID(product.getProductId(), product);
            JOptionPane.showMessageDialog(this, response.getMessage());
            if(response.getResponseCode() == 200)
                loadData(output.getPage());
            else
                return;          
        }
        mode = Mode.FREE;
        UIController.showCardLayout("cardFirst", jPanel_Card);
        setEditableForAll(false);
        jTable_Product.setEnabled(true);
        imageName = "";
    }//GEN-LAST:event_jButton_OKActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // TODO add your handling code here:
        mode = Mode.FREE;
        clearAll();
        setEditableForAll(false);
        jTable_Product.setEnabled(true);
//        if (jTable_Staff.getSelectedRow() != -1) {
//        } else {
//            jButton_Modify.setEnabled(false);
//            jButton_Remove.setEnabled(false);
//        }
        UIController.showCardLayout("cardFirst", jPanel_Card);
        imageName = "";
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        // TODO add your handling code here:
        clearAll();
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        clearAll();
        mode = Mode.ADD;
        UIController.showCardLayout("cardSecond", jPanel_Card);
        setEditableForAll(true);
        jTable_Product.setEnabled(false);
        imageName = "default.png";
        jTextField_Sold.setText("0");
    }//GEN-LAST:event_jButton_AddActionPerformed

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }

    private void jButton_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoveActionPerformed
        // TODO add your handling code here:        
        int luaChon = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove this product?", "OK", 0);
        if (luaChon == JOptionPane.CANCEL_OPTION) {
            return;
        } else if (luaChon == JOptionPane.OK_OPTION) {
            Response response = pc.deleteProductByID(jTextField_ID.getText());
            JOptionPane.showMessageDialog(this, response.getMessage());
            if(response.getResponseCode() == 200)
                loadData(output.getPage());
            else
                return;            
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
        if(mode == Mode.ADD || mode == Mode.MODIFY) return;
        int selectedRow = jTable_Product.convertRowIndexToModel(jTable_Product.getSelectedRow());

        Product p = pc.getProductById(dtm.getValueAt(selectedRow, 0).toString());
        jTextField_ID.setText(p.getProductId() + "");
        jTextField_Name.setText(p.getName());
        jTextField_Unit.setText(p.getCalculationUnit());
        jTextField_Specification.setText(p.getSpecification());
        jTextField_Sold.setText(p.getSoldQuantity() + "");
        jTextArea_Description.setText(p.getDescription());
        imageName = p.getImage();
        
        for (int i = 0; i < jComboBox_Brand.getItemCount(); i++) {
            if (jComboBox_Brand.getItemAt(i).getBrandId().equals(p.getBrand().getBrandId())) {
                jComboBox_Brand.setSelectedIndex(i);
            }
        }
        
        for (int i = 0; i < jComboBox_Category.getItemCount(); i++) {
            if (jComboBox_Category.getItemAt(i).getCategoryId().equals(p.getCategory().getCategoryId())) {
                jComboBox_Category.setSelectedIndex(i);
            }
        }
        
        Image img = pc.getImage(p.getImage());
        Image newImg = img.getScaledInstance(jLabel_Image.getWidth(), jLabel_Image.getHeight(), java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newImg);
        jLabel_Image.setIcon(icon);
        
        jSpinner_Price.setValue(p.getPrice());
        jSpinner_Discount.setValue(p.getDiscount());
        jSpinner_Quantity.setValue(p.getQuantity());
        jButton_Modify.setEnabled(true);
        jButton_Remove.setEnabled(true);
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
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + tuKhoa));
    }//GEN-LAST:event_jTextField_NameSearchCaretUpdate

    private void jButton_ExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExportExcelActionPerformed
        // TODO add your handling code here:
//        File.xuatFileExcel("DSNhanVien", (DefaultTableModel) jTable_Staff.getModel(), "NhanVien");
        JOptionPane.showMessageDialog(this, "Xuất file excel thành công!");
    }//GEN-LAST:event_jButton_ExportExcelActionPerformed

    private void jButton_ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ChangeActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "jpg", "png");
        fileChooser.setFileFilter(imageFilter);
        fileChooser.setMultiSelectionEnabled(false);
        int x = fileChooser.showDialog(this, "Select image");
        if (x == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            ImageIcon imgIcon = new ImageIcon(selectedFile.getAbsolutePath());
            Image img = imgIcon.getImage();
            Image newImg = img.getScaledInstance(jLabel_Image.getWidth(), jLabel_Image.getHeight(), java.awt.Image.SCALE_SMOOTH);
            jLabel_Image.setIcon(new ImageIcon(newImg));
            imageName = selectedFile.getName();
            System.out.println(selectedFile.getName());
        }
        else {
            return;
        }
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

    private void jButton_NextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NextPageActionPerformed
        // TODO add your handling code here:
        if(output.getPage() < output.getTotalPage()) {
            loadData(output.getPage() + 1);
            jButton_PreviousPage.setEnabled(true);
        }
        if(output.getPage() == output.getTotalPage())
            jButton_NextPage.setEnabled(false);
    }//GEN-LAST:event_jButton_NextPageActionPerformed

    private void jButton_PreviousPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PreviousPageActionPerformed
        // TODO add your handling code here:
        if(output.getPage() > 1) {
            loadData(output.getPage() - 1);
            jButton_NextPage.setEnabled(true);
        }
        if(output.getPage() == 1)
            jButton_PreviousPage.setEnabled(false);
    }//GEN-LAST:event_jButton_PreviousPageActionPerformed

    private void jTable_ProductFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable_ProductFocusLost
        // TODO add your handling code here:
        jButton_Modify.setEnabled(false);
        jButton_Remove.setEnabled(false);
    }//GEN-LAST:event_jTable_ProductFocusLost

    private void jButton_ModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ModifyMouseClicked
        // TODO add your handling code here:
        System.out.println("modify");
        mode = Mode.MODIFY;
        UIController.showCardLayout("cardSecond", jPanel_Card);
        setEditableForAll(true);
        jTable_Product.setEnabled(false);
    }//GEN-LAST:event_jButton_ModifyMouseClicked

    private void jButton_ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModifyActionPerformed
        // TODO add your handling code here:
//        System.out.println("modify");
//        mode = Mode.MODIFY;
//        UIController.showCardLayout("cardSecond", jPanel_Card);
//        setEditableForAll(true);
    }//GEN-LAST:event_jButton_ModifyActionPerformed

    private void jButton_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AddMouseClicked
        // TODO add your handling code here:
        clearAll();
        mode = Mode.ADD;
        UIController.showCardLayout("cardSecond", jPanel_Card);
        setEditableForAll(true);
        jTable_Product.setEnabled(false);
    }//GEN-LAST:event_jButton_AddMouseClicked

    private void jButton_RemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RemoveMouseClicked
        // TODO add your handling code here:
        int luaChon = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove this product?", "OK", 0);
        if (luaChon == JOptionPane.CANCEL_OPTION) {
            return;
        } else if (luaChon == JOptionPane.OK_OPTION) {
            Response response = pc.deleteProductByID(jTextField_ID.getText());
            JOptionPane.showMessageDialog(this, response.getMessage());
            if(response.getResponseCode() == 200) {
                loadData(output.getPage());
                clearAll();
            }
            else
                return;            
        }
    }//GEN-LAST:event_jButton_RemoveMouseClicked

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
    private javax.swing.JButton jButton_NextPage;
    private javax.swing.JButton jButton_OK;
    private javax.swing.JButton jButton_PreviousPage;
    private javax.swing.JButton jButton_Remove;
    private javax.swing.JButton jButton_ShowImportHistory;
    private javax.swing.JComboBox<Brand> jComboBox_Brand;
    private javax.swing.JComboBox<Category> jComboBox_Category;
    private javax.swing.JComboBox<Brand> jComboBox_FilterBrand;
    private javax.swing.JComboBox<Category> jComboBox_FilterCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel_Category;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Page;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Card;
    private javax.swing.JPanel jPanel_Card1;
    private javax.swing.JPanel jPanel_Card2;
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
