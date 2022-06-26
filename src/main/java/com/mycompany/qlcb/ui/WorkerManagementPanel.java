package com.mycompany.qlcb.ui;

import com.mycompany.qlcb.dao.CanBoDao;
import com.mycompany.qlcb.dao.CongNhanDao;
import com.mycompany.qlcb.filehelpers.ExportBase;
import com.mycompany.qlcb.helpers.DataValidator;
import com.mycompany.qlcb.helpers.MessageDialogHelper;
import com.mycompany.qlcb.helpers.VNCharacterUtils;
import com.mycompany.qlcb.model.Congnhan;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class WorkerManagementPanel extends javax.swing.JPanel {

    private MainForm parentForm;
    private DefaultTableModel tblModel;
    ArrayList<Congnhan> list;
    String fieldSort = "tencb";
    String sortType = "ASC";
    
    public WorkerManagementPanel() {
        initComponents();
        rdNam.setSelected(true);
        rdNu.setSelected(false);
        initTable();
        loadDataToTable();
    }
    
    private void initTable() {
       tblModel = new DefaultTableModel();
       tblModel.setColumnIdentifiers(new String[] {"Mã CN","Họ tên","Năm sinh", "Giới tính", 
           "Địa chỉ", "Bậc"});
       tblWorker.setModel(tblModel);
    }
    
    private void loadDataToTable() {
        try {
            CongNhanDao dao = new CongNhanDao();
            list = dao.getAllCongNhan(null, "");
            tblModel.setRowCount(0);
            for (Congnhan it:list) {
                tblModel.addRow(new Object[] {
                    it.getMacb(), it.getTencb(), it.getNamsinh(), it.getGioitinh(), 
                    it.getDiachi(), it.getBac()
                });
            }
            tblModel.fireTableDataChanged();
        }
        catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtNamSinh = new javax.swing.JTextField();
        txtBac = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorker = new javax.swing.JTable();
        txtMaNghe = new javax.swing.JTextField();
        txtmacn = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbField = new javax.swing.JComboBox<>();
        cbSort = new javax.swing.JComboBox<>();
        btnSort = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("QUẢN LÝ CÔNG NHÂN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Họ tên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Năm sinh");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Địa chỉ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Bậc");

        txtName.setPreferredSize(new java.awt.Dimension(9, 22));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtNamSinh.setPreferredSize(new java.awt.Dimension(9, 22));
        txtNamSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamSinhActionPerformed(evt);
            }
        });

        txtBac.setPreferredSize(new java.awt.Dimension(9, 22));
        txtBac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBacActionPerformed(evt);
            }
        });

        txtAddress.setPreferredSize(new java.awt.Dimension(9, 22));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        genderGroup.add(rdNam);
        rdNam.setText("Nam");

        genderGroup.add(rdNu);
        rdNu.setText("Nữ");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/new-icon-16.png"))); // NOI18N
        btnAdd.setText("Tạo mới");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Save-icon.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblWorker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Họ tên", "Năm sinh", "Giới tính", "Địa chỉ", "Bậc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblWorker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWorkerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblWorker);

        txtMaNghe.setText("1");

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Thông tin tìm kiếm");

        cbField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ tên", "Năm sinh", "Giới tính", "Địa chỉ", "Bậc" }));
        cbField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFieldActionPerformed(evt);
            }
        });

        cbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng dần", "Giảm dần", " " }));
        cbSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSortActionPerformed(evt);
            }
        });

        btnSort.setText("Sắp xếp");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        jButton1.setText("Reset mật khẩu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnExport.setText("Xuất file");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Sắp xếp");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(25, 25, 25)
                                .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel8)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(32, 32, 32)
                                .addComponent(rdNam)
                                .addGap(120, 120, 120)
                                .addComponent(rdNu))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(43, 43, 43)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(63, 63, 63)
                                .addComponent(txtBac, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(33, 33, 33)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSort)
                            .addComponent(cbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4))
                            .addComponent(rdNam)
                            .addComponent(rdNu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5))
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6))
                            .addComponent(txtBac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnSave)
                            .addComponent(btnUpdate))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnDelete)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExport)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNamSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamSinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamSinhActionPerformed

    private void txtBacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBacActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        txtName.setText("");
        txtAddress.setText("");
        txtNamSinh.setText("");
        rdNam.setSelected(true);
        rdNu.setSelected(false);
        txtBac.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtName, sb, "Tên Công nhân không được để trống!!");
        DataValidator.validateEmpty(txtNamSinh, sb, "Năm sinh không được bỏ trống!!");
        DataValidator.validateEmpty(txtAddress, sb, "Địa chỉ không được bỏ trống!");
        DataValidator.validateEmpty(txtBac, sb, "Bậc không được bỏ trống!!");
        
        // Nếu có lỗi
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        
        
        try {
            // Lấy dữ liệu từ trên form xuống
            Congnhan cn = new Congnhan();
            cn.setTencb(txtName.getText());
            cn.setNamsinh(Integer.parseInt(txtNamSinh.getText()));
            cn.setGioitinh(rdNam.isSelected()?"Nam":"Nữ");
            cn.setBac(Integer.parseInt(txtBac.getText()));
            cn.setDiachi(txtAddress.getText());
            int manghe = Integer.parseInt(txtMaNghe.getText());
            CanBoDao dao = new CanBoDao();
            if (dao.insertCB(cn, manghe))
            {
                
                MessageDialogHelper.showMessageDialog(parentForm, "Công nhân đã được thêm thành công!!",
                "Thông báo");
            }
            else {
                MessageDialogHelper.showConfirmDialog(parentForm, 
                        "Công nhân không được lưu do lỗi", "Cảnh báo");
            }
            
            // Lấy ra mã cán bộ cuối cùng trong bảng để chèn vào bảng Công nhân
            
            if (dao.getLastIdCB() != -1) {
                int macb = dao.getLastIdCB();
                
                // Chèn vào bảng Công nhân
                dao.insertTable("tbl_congnhan", macb, txtBac.getText(), "");
                //tao tai khoan tu dong
                String tk = VNCharacterUtils.removeAccent(txtName.getText()).replace(" ", "").toLowerCase();
                System.out.print(tk);
                Random rand = new Random();
                String mk = String.valueOf(rand.nextInt(100000000));
                if(dao.insertTaiKhoan(tk, mk, macb, Integer.valueOf(txtMaNghe.getText()))){
                    MessageDialogHelper.showMessageDialog(parentForm, "Tạo tài khoản thành công!\nTài khoản: "+tk+"\nMật khẩu: "+mk,
                "Thông báo");
                }
                loadDataToTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblWorkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWorkerMouseClicked
        try {
            // Lấy ra dong được click
            int row = tblWorker.getSelectedRow();
            if (row >= 0) {
                txtmacn.setText((String.valueOf(tblModel.getValueAt(row, 0))));
                txtName.setText((String)tblModel.getValueAt(row, 1));
                txtNamSinh.setText(String.valueOf(tblModel.getValueAt(row, 2)));
                String gender = (String)tblModel.getValueAt(row, 3);
                if (gender.equalsIgnoreCase("Nam")) {
                    rdNam.setSelected(true);
                    rdNu.setSelected(false);
                }
                else {
                    rdNu.setSelected(true); rdNam.setSelected(false);
                }
                txtAddress.setText((String)tblModel.getValueAt(row, 4));
                txtBac.setText(String.valueOf(tblModel.getValueAt(row, 5)));
            }
        } catch (Exception e) {
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tblWorkerMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtName, sb, "Tên Công nhân không được để trống!!");
        DataValidator.validateEmpty(txtNamSinh, sb, "Năm sinh không được bỏ trống!!");
        DataValidator.validateEmpty(txtAddress, sb, "Địa chỉ không được bỏ trống!");
        DataValidator.validateEmpty(txtBac, sb, "Bậc không được bỏ trống!!");
        
        // Nếu có lỗi
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        
        if (MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn cập nhật công nhân không?", 
                "Xác nhận") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            // Lấy dữ liệu từ trên form xuống
            Congnhan ks = new Congnhan();
            ks.setTencb(txtName.getText());
            ks.setNamsinh(Integer.parseInt(txtNamSinh.getText()));
            ks.setGioitinh(rdNam.isSelected()?"Nam":"Nữ");
            ks.setBac(Integer.parseInt(txtBac.getText()));
            ks.setDiachi(txtAddress.getText());
            ks.setMacb(Integer.parseInt(txtmacn.getText()));
            CongNhanDao dao = new CongNhanDao();
            
            
            if (dao.update(ks))
            {
                loadDataToTable();
                MessageDialogHelper.showMessageDialog(parentForm, "Công nhân đã được cập nhật thành công!!",
                "Thông báo");
            }
            else {
                MessageDialogHelper.showConfirmDialog(parentForm, 
                        "Công nhân không được cập nhật do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtName, sb, "Tên Công nhân không được để trống!!");
        DataValidator.validateEmpty(txtNamSinh, sb, "Năm sinh không được bỏ trống!!");
        DataValidator.validateEmpty(txtAddress, sb, "Địa chỉ không được bỏ trống!");
        DataValidator.validateEmpty(txtBac, sb, "Bậc không được bỏ trống!!");

        // Nếu có lỗi
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        
        if (MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn xóa công nhân không?", 
                "Xác nhận") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            // Lấy dữ liệu từ trên form xuống
            CanBoDao dao = new CanBoDao();
            int macn = Integer.parseInt(txtmacn.getText());
            
            
            
            if (dao.delete("tbl_congnhan", "macn",macn))
            {
                loadDataToTable();
                MessageDialogHelper.showMessageDialog(parentForm, "Công nhân đã được xóa thành công!!",
                "Thông báo");
            }
            else {
                MessageDialogHelper.showConfirmDialog(parentForm, 
                        "Công nhân không được xóa do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            CongNhanDao dao = new CongNhanDao();
            String info = txtSearch.getText();
            
            if (info.length() == 0) {
                MessageDialogHelper.showErrorDialog(parentForm, "Thông tin tìm kiếm không được bỏ trống!!", "Lỗi");
            }
            else {
                info = "'%" + info + "%'"; 
                ArrayList<Congnhan> list = dao.findCongnhan(info);
                tblModel.setRowCount(0);
                for (Congnhan it:list) {
                    tblModel.addRow(new Object[] {
                        it.getMacb(),it.getTencb(), it.getNamsinh(), it.getGioitinh(), 
                        it.getDiachi(), it.getBac()
                    });
                }
                tblModel.fireTableDataChanged();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFieldActionPerformed
        String txt = (String)cbField.getSelectedItem();
        fieldSort = txt;
    }//GEN-LAST:event_cbFieldActionPerformed

    private void cbSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSortActionPerformed
        String type = (String)cbSort.getSelectedItem();
        sortType = type;
    }//GEN-LAST:event_cbSortActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        CongNhanDao dao = new CongNhanDao();
        ArrayList<Congnhan> listt;
        tblModel.setRowCount(0);
        try {
            listt = dao.sortWorker(fieldSort, sortType);
            for (Congnhan it:listt) {
                tblModel.addRow(new Object[] {
                    it.getMacb(),it.getTencb(), it.getNamsinh(), it.getGioitinh(),
                    it.getDiachi(), it.getBac()
                });
            }
            tblModel.fireTableDataChanged();
            tblWorker.setModel(tblModel);
        } catch (Exception ex) {
            Logger.getLogger(EngineerManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSortActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int manv = Integer.parseInt(txtmacn.getText());
        Random rand = new Random();
        String mk = String.valueOf(rand.nextInt(100000000));
        CanBoDao dao = new CanBoDao();
        try {
            if (dao.chagePassword(mk, manv)) {
                MessageDialogHelper.showMessageDialog(parentForm, "Reset mật khẩu thành công!!\nMật khẩu mới: " + mk , "Thông báo");
            }

        } catch (Exception ex) {
            MessageDialogHelper.showErrorDialog(parentForm, ex.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        try {
            CongNhanDao dao = new CongNhanDao();
            list = dao.getAllCongNhan(null, "");

            if (list.size() > 0) {
                ExportBase export = new ExportBase();
                export.WorkerExport(list);

                MessageDialogHelper.showMessageDialog(parentForm, "Xuất file thành công", "Thông báo");
            }

        } catch (Exception ex) {
            MessageDialogHelper.showErrorDialog(parentForm, ex.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnExportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbField;
    private javax.swing.JComboBox<String> cbSort;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tblWorker;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBac;
    private javax.swing.JTextField txtMaNghe;
    private javax.swing.JTextField txtNamSinh;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtmacn;
    // End of variables declaration//GEN-END:variables
}
