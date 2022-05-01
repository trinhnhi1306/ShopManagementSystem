/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.categories;

/**
 *
 * @author PC
 */
public class CategoryPanel extends javax.swing.JPanel {

    /**
     * Creates new form CategoryPanel
     */
    public CategoryPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_ExportExcel = new javax.swing.JButton();
        jTextField_NameSearch = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel_Card = new javax.swing.JPanel();
        jPanel_Card1 = new javax.swing.JPanel();
        jButton_Add = new javax.swing.JButton();
        jButton_Modify = new javax.swing.JButton();
        jButton_Remove = new javax.swing.JButton();
        jPanel_Card2 = new javax.swing.JPanel();
        jButton_OK = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Note = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jButton_Change = new javax.swing.JButton();
        jLabel_Image = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Product = new javax.swing.JTable();
        jButton_PreviousPage = new javax.swing.JButton();
        jButton_NextPage = new javax.swing.JButton();
        jLabel_Page = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jButton_ExportExcel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_ExportExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        jButton_ExportExcel.setText("Export");
        jButton_ExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExportExcelActionPerformed(evt);
            }
        });

        jTextField_NameSearch.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField_NameSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField_NameSearchCaretUpdate(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel14.setText("Search:");

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Category information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Name");

        jTextField_ID.setEditable(false);
        jTextField_ID.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField_ID.setEnabled(false);

        jTextField_Name.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel17.setText("Note");

        jTextArea_Note.setColumns(20);
        jTextArea_Note.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextArea_Note.setLineWrap(true);
        jTextArea_Note.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Note);

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

        jLabel_Image.setText("image");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(jTextField_Name))
                        .addGap(36, 36, 36)))
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Change)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(379, 379, 379))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel18)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Change, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jTable_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Image", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jButton_PreviousPage.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton_PreviousPage.setText("<");
        jButton_PreviousPage.setEnabled(false);
        jButton_PreviousPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PreviousPageActionPerformed(evt);
            }
        });

        jButton_NextPage.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton_NextPage.setText(">");
        jButton_NextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NextPageActionPerformed(evt);
            }
        });

        jLabel_Page.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel_Page.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_NameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_PreviousPage)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel_Page, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_NextPage)
                        .addGap(59, 59, 59)
                        .addComponent(jButton_ExportExcel)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_Card, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_PreviousPage)
                            .addComponent(jButton_NextPage)
                            .addComponent(jLabel_Page))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_NameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jButton_ExportExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExportExcelActionPerformed
        // TODO add your handling code here:
        //        File.xuatFileExcel("DSNhanVien", (DefaultTableModel) jTable_Staff.getModel(), "NhanVien");
//        JOptionPane.showMessageDialog(this, "Xuất file excel thành công!");
    }//GEN-LAST:event_jButton_ExportExcelActionPerformed

    private void jTextField_NameSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField_NameSearchCaretUpdate
        // TODO add your handling code here:
        String tuKhoa = jTextField_NameSearch.getText().toLowerCase();
//        TableRowSorter<TableModel> trs = new TableRowSorter<>(jTable_Product.getModel());
//        jTable_Product.setRowSorter(trs);
//        trs.setRowFilter(RowFilter.regexFilter("(?i)" + tuKhoa));
    }//GEN-LAST:event_jTextField_NameSearchCaretUpdate

    private void jButton_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_AddMouseClicked

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
//        clearAll();
//        mode = Mode.ADD;
//        UIController.showCardLayout("cardSecond", jPanel_Card);
//        setEditableForAll(true);
//        jTable_Product.setEnabled(false);
//        jTextField_Sold.setText("0");
//
//        imageName = DEFAULT_IMAGE;
//        Image img = pc.getImage(imageName);
//        Image newImg = img.getScaledInstance(jLabel_Image.getWidth(), jLabel_Image.getHeight(), java.awt.Image.SCALE_SMOOTH);
//        ImageIcon icon = new ImageIcon(newImg);
//        jLabel_Image.setIcon(icon);
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_ModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ModifyMouseClicked
        // TODO add your handling code here:
        System.out.println("modify");
//        mode = Mode.MODIFY;
//        UIController.showCardLayout("cardSecond", jPanel_Card);
//        setEditableForAll(true);
        jTable_Product.setEnabled(false);
    }//GEN-LAST:event_jButton_ModifyMouseClicked

    private void jButton_ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ModifyActionPerformed

    private void jButton_RemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RemoveMouseClicked
        // TODO add your handling code here:
//        int luaChon = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove this product?", "OK", 0);
//        if (luaChon == JOptionPane.CANCEL_OPTION) {
//            return;
//        } else if (luaChon == JOptionPane.OK_OPTION) {
//            Response response = pc.deleteProductByID(jTextField_ID.getText());
//            JOptionPane.showMessageDialog(this, response.getMessage());
//            if(response.getResponseCode() == 200) {
//                loadData(output.getPage());
//                clearAll();
//            }
//            else
//            return;
//        }
    }//GEN-LAST:event_jButton_RemoveMouseClicked

    private void jButton_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_RemoveActionPerformed

    private void jButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OKActionPerformed
        // TODO add your handling code here:
//        String name = jTextField_Name.getText();
//        String unit = jTextField_Unit.getText();
//        String specification = jTextField_Specification.getText();
//        String description = jTextArea_Note.getText();
//        double price = Double.parseDouble(jSpinner_Price.getValue().toString());
//        int discount = Integer.parseInt(jSpinner_Discount.getValue().toString());
//        int soldQuantity = Integer.parseInt(jTextField_Sold.getText());
//        int quantity = Integer.parseInt(jSpinner_Quantity.getValue().toString());
//
//        Brand brand = (Brand) jComboBox_Brand.getSelectedItem();
//        Category category = (Category) jComboBox_Category.getSelectedItem();
//
//        if (mode == Mode.ADD) {
//            Product product = new Product();
//            product.setName(name);
//            product.setDescription(description);
//            product.setPrice(price);
//            product.setSpecification(specification);
//            product.setCalculationUnit(unit);
//            product.setDiscount(discount);
//            product.setSoldQuantity(soldQuantity);
//            product.setQuantity(quantity);
//            product.setCategory(category);
//            product.setBrand(brand);
//            product.setStatus(true);
//            if(selectedFile != null) {
//                try {
//                    RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), selectedFile);
//                    MultipartBody.Part part = MultipartBody.Part.createFormData("file", selectedFile.getName(), requestBody);
//                    UploadFileService uploadFileInterface = APIClient.getClient().create(UploadFileService.class);
//                    uploadFileInterface.upload(part).enqueue(new Callback<ResponseBody>() {
//
//                        @Override
//                        public void onResponse(Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
//                            try {
//                                if(response.isSuccessful()) {
//                                    String str = response.body().string();
//                                    product.setImage(str);
//                                    System.out.println("vãi: " + product.getImage());
//                                    Response res = pc.addProduct(product);
//                                    JOptionPane.showMessageDialog(null, res.getMessage());
//                                    if(res.getResponseCode() == 200)
//                                    loadData(output.getPage());
//                                    else
//                                    return;
//                                }
//                            } catch (Exception e) {
//                                JOptionPane.showMessageDialog(null, e.getMessage());
//                            }
//                        }
//
//                        @Override
//                        public void onFailure(Call<ResponseBody> call, Throwable t) {
//                            JOptionPane.showMessageDialog(null, t.getMessage());
//                        }
//
//                    });
//                } catch (Exception e) {
//                    JOptionPane.showMessageDialog(this, e.getMessage());
//                }
//            }
//            else {
//                product.setImage(imageName);
//                Response response = pc.addProduct(product);
//                JOptionPane.showMessageDialog(this, response.getMessage());
//                if(response.getResponseCode() == 200)
//                loadData(output.getPage());
//                else
//                return;
//            }
//        }
//        if (mode == Mode.MODIFY) {
//            Product product = new Product();
//            product.setProductId(Integer.parseInt(jTextField_ID.getText()));
//            product.setName(name);
//            product.setDescription(description);
//            product.setPrice(price);
//            product.setSpecification(specification);
//            product.setCalculationUnit(unit);
//            product.setDiscount(discount);
//            product.setSoldQuantity(soldQuantity);
//            product.setQuantity(quantity);
//            product.setCategory(category);
//            product.setBrand(brand);
//            product.setStatus(true);
//            if(selectedFile != null) {
//                try {
//                    RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), selectedFile);
//                    MultipartBody.Part part = MultipartBody.Part.createFormData("file", selectedFile.getName(), requestBody);
//                    UploadFileService uploadFileInterface = APIClient.getClient().create(UploadFileService.class);
//                    uploadFileInterface.upload(part).enqueue(new Callback<ResponseBody>() {
//
//                        @Override
//                        public void onResponse(Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
//                            try {
//                                if(response.isSuccessful()) {
//                                    String str = response.body().string();
//                                    product.setImage(str);
//                                    System.out.println("vãi: " + product.getImage());
//                                    Response res = pc.updateProductByID(product.getProductId(), product);
//                                    JOptionPane.showMessageDialog(null, res.getMessage());
//                                    if(res.getResponseCode() == 200)
//                                    loadData(output.getPage());
//                                    else
//                                    return;
//                                }
//                            } catch (Exception e) {
//                                JOptionPane.showMessageDialog(null, e.getMessage());
//                            }
//                        }
//
//                        @Override
//                        public void onFailure(Call<ResponseBody> call, Throwable t) {
//                            JOptionPane.showMessageDialog(null, t.getMessage());
//                        }
//
//                    });
//                } catch (Exception e) {
//                    JOptionPane.showMessageDialog(this, e.getMessage());
//                }
//            }
//            else {
//                product.setImage(imageName);
//                Response response = pc.updateProductByID(product.getProductId(), product);
//                JOptionPane.showMessageDialog(this, response.getMessage());
//                if(response.getResponseCode() == 200)
//                loadData(output.getPage());
//                else
//                return;
//            }
//        }
//        mode = Mode.FREE;
//        UIController.showCardLayout("cardFirst", jPanel_Card);
//        setEditableForAll(false);
//        jTable_Product.setEnabled(true);
//        selectedFile = null;
    }//GEN-LAST:event_jButton_OKActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // TODO add your handling code here:
//        mode = Mode.FREE;
//        clearAll();
//        setEditableForAll(false);
//        jTable_Product.setEnabled(true);
//
//        UIController.showCardLayout("cardFirst", jPanel_Card);
//        selectedFile = null;
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        // TODO add your handling code here:
//        clearAll();
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ChangeActionPerformed
        // TODO add your handling code here:
//        JFileChooser fileChooser = new JFileChooser();
//        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "jpg", "png");
//        fileChooser.setFileFilter(imageFilter);
//        fileChooser.setMultiSelectionEnabled(false);
//        int x = fileChooser.showDialog(this, "Select image");
//        if (x == JFileChooser.APPROVE_OPTION) {
//            selectedFile = fileChooser.getSelectedFile();
//            ImageIcon imgIcon = new ImageIcon(selectedFile.getAbsolutePath());
//            Image img = imgIcon.getImage();
//            Image newImg = img.getScaledInstance(jLabel_Image.getWidth(), jLabel_Image.getHeight(), java.awt.Image.SCALE_SMOOTH);
//            jLabel_Image.setIcon(new ImageIcon(newImg));
//            System.out.println(selectedFile.getName());
//        }
//        else {
//            return;
//        }
    }//GEN-LAST:event_jButton_ChangeActionPerformed

    private void jTable_ProductFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable_ProductFocusLost
        // TODO add your handling code here:
        jButton_Modify.setEnabled(false);
        jButton_Remove.setEnabled(false);
    }//GEN-LAST:event_jTable_ProductFocusLost

    private void jTable_ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ProductMouseClicked
        // TODO add your handling code here:
//        if(mode == Mode.ADD || mode == Mode.MODIFY) return;
//        int selectedRow = jTable_Product.convertRowIndexToModel(jTable_Product.getSelectedRow());
//
//        Product p = pc.getProductById(dtm.getValueAt(selectedRow, 0).toString());
//        jTextField_ID.setText(p.getProductId() + "");
//        jTextField_Name.setText(p.getName());
//        jTextField_Unit.setText(p.getCalculationUnit());
//        jTextField_Specification.setText(p.getSpecification());
//        jTextField_Sold.setText(p.getSoldQuantity() + "");
//        jTextArea_Note.setText(p.getDescription());
//
//        for (int i = 0; i < jComboBox_Brand.getItemCount(); i++) {
//            if (jComboBox_Brand.getItemAt(i).getBrandId().equals(p.getBrand().getBrandId())) {
//                jComboBox_Brand.setSelectedIndex(i);
//            }
//        }
//
//        for (int i = 0; i < jComboBox_Category.getItemCount(); i++) {
//            if (jComboBox_Category.getItemAt(i).getCategoryId().equals(p.getCategory().getCategoryId())) {
//                jComboBox_Category.setSelectedIndex(i);
//            }
//        }
//
//        imageName = p.getImage();
//        Image img = pc.getImage(imageName);
//        Image newImg = img.getScaledInstance(jLabel_Image.getWidth(), jLabel_Image.getHeight(), java.awt.Image.SCALE_SMOOTH);
//        ImageIcon icon = new ImageIcon(newImg);
//        jLabel_Image.setIcon(icon);
//
//        jSpinner_Price.setValue(p.getPrice());
//        jSpinner_Discount.setValue(p.getDiscount());
//        jSpinner_Quantity.setValue(p.getQuantity());
//        jButton_Modify.setEnabled(true);
//        jButton_Remove.setEnabled(true);
    }//GEN-LAST:event_jTable_ProductMouseClicked

    private void jButton_PreviousPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PreviousPageActionPerformed
        // TODO add your handling code here:
//        if(output.getPage() > 1) {
//            loadData(output.getPage() - 1);
//            jButton_NextPage.setEnabled(true);
//        }
//        if(output.getPage() == 1)
//        jButton_PreviousPage.setEnabled(false);
    }//GEN-LAST:event_jButton_PreviousPageActionPerformed

    private void jButton_NextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NextPageActionPerformed
        // TODO add your handling code here:
//        if(output.getPage() < output.getTotalPage()) {
//            loadData(output.getPage() + 1);
//            jButton_PreviousPage.setEnabled(true);
//        }
//        if(output.getPage() == output.getTotalPage())
//        jButton_NextPage.setEnabled(false);
    }//GEN-LAST:event_jButton_NextPageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Change;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_ExportExcel;
    private javax.swing.JButton jButton_Modify;
    private javax.swing.JButton jButton_NextPage;
    private javax.swing.JButton jButton_OK;
    private javax.swing.JButton jButton_PreviousPage;
    private javax.swing.JButton jButton_Remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Page;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Card;
    private javax.swing.JPanel jPanel_Card1;
    private javax.swing.JPanel jPanel_Card2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Product;
    private javax.swing.JTextArea jTextArea_Note;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_NameSearch;
    // End of variables declaration//GEN-END:variables
}
