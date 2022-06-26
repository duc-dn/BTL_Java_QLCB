package com.mycompany.qlcb.ui;

import com.mycompany.qlcb.dao.CanBoDao;
import com.mycompany.qlcb.dao.KySuDao;
import com.mycompany.qlcb.filehelpers.ExportBase;
import com.mycompany.qlcb.helpers.DataValidator;
import com.mycompany.qlcb.helpers.MessageDialogHelper;
import com.mycompany.qlcb.helpers.VNCharacterUtils;
import com.mycompany.qlcb.model.Kysu;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EngineerManagementPanel extends javax.swing.JPanel {

    private MainForm parentForm;
    private DefaultTableModel tblModel;
    ArrayList<Kysu> list;
    String fieldSort = "";
    String sortType = "ASC";

    public EngineerManagementPanel() {
        initComponents();
        rdNam.setSelected(true);
        rdNu.setSelected(false);
        initTable();
        loadDataToTable();
    }

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã KS", "Họ tên", "Năm sinh", "Giới tính",
            "Địa chỉ", "Ngành đào tạo", "Loại bằng"});
        tblEngineer.setModel(tblModel);
    }

    private void loadDataToTable() {
        try {
            KySuDao dao = new KySuDao();
            list = dao.getAllKysu(null, "");
            tblModel.setRowCount(0);
            for (Kysu it : list) {
                tblModel.addRow(new Object[]{
                    it.getMacb(), it.getTencb(), it.getNamsinh(), it.getGioitinh(),
                    it.getDiachi(), it.getNganhdt(), it.getLoaibang()
                });
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEngineer = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtField = new javax.swing.JTextField();
        txtDegree = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMaNghe = new javax.swing.JTextField();
        txtNamSinh = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtmaks = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbField = new javax.swing.JComboBox<>();
        cbSort = new javax.swing.JComboBox<>();
        btnSort = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("QUẢN LÝ KỸ SƯ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Năm sinh");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Địa chỉ");

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

        tblEngineer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Họ tên", "Năm sinh", "Giới tính", "Địa chỉ", "Bậc", "Loại bằng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblEngineer.setMinimumSize(new java.awt.Dimension(1000, 64));
        tblEngineer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEngineerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEngineer);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Ngành đào tạo");

        txtField.setPreferredSize(new java.awt.Dimension(9, 22));
        txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldActionPerformed(evt);
            }
        });

        txtDegree.setPreferredSize(new java.awt.Dimension(9, 22));
        txtDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDegreeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Loại bằng");

        txtMaNghe.setText("2");
        txtMaNghe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNgheActionPerformed(evt);
            }
        });

        txtNamSinh.setPreferredSize(new java.awt.Dimension(9, 22));
        txtNamSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamSinhActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Họ tên");

        txtmaks.setEditable(false);
        txtmaks.setAlignmentX(0.0F);
        txtmaks.setAlignmentY(0.0F);

        txtname.setPreferredSize(new java.awt.Dimension(9, 22));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Sắp xếp");

        cbField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ tên", "Năm sinh", "Giới tính", "Ngành đào tạo", "Loại bằng" }));
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Thông tin tìm kiếm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtmaks, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtMaNghe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(24, 24, 24)
                                .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(58, 58, 58)
                                .addComponent(txtDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(60, 60, 60)
                                        .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4))
                                            .addGap(67, 67, 67)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(rdNam)
                                                    .addGap(38, 38, 38)
                                                    .addComponent(rdNu))
                                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSearch)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtmaks, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSearch))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSort))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdNam)
                                    .addComponent(jLabel4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdNu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAdd)
                                .addComponent(btnSave))
                            .addComponent(btnUpdate))
                        .addGap(13, 13, 13)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnDelete))
                        .addGap(64, 64, 64)
                        .addComponent(txtMaNghe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExport)
                        .addGap(17, 17, 17))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldActionPerformed

    }//GEN-LAST:event_txtFieldActionPerformed

    private void txtDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDegreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDegreeActionPerformed

    private void txtMaNgheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNgheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNgheActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        txtname.setText("");
        txtAddress.setText("");
        txtDegree.setText("");
        txtNamSinh.setText("");
        txtmaks.setText("");
        txtField.setText("");
        rdNam.setSelected(true);
        rdNu.setSelected(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtname, sb, "Tên nhân viên không được để trống!!");
        DataValidator.validateEmpty(txtAddress, sb, "Địa chỉ không được bỏ trống!");
        DataValidator.validateEmpty(txtField, sb, "Tên ngành đào tạo không được bỏ trống!!");
        DataValidator.validateEmpty(txtDegree, sb, "Bằng không được bỏ trống!!");

        // Nếu có lỗi
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }

        try {
            // Lấy dữ liệu từ trên form xuống
            Kysu ks = new Kysu();
            ks.setTencb(txtname.getText());
            ks.setNamsinh(Integer.parseInt(txtNamSinh.getText()));
            ks.setGioitinh(rdNam.isSelected() ? "Nam" : "Nữ");
            ks.setLoaibang(txtField.getText());
            ks.setDiachi(txtAddress.getText());
            ks.setNganhdt(txtField.getText());

            int manghe = Integer.parseInt(txtMaNghe.getText());
            CanBoDao dao = new CanBoDao();
            if (dao.insertCB(ks, manghe)) {
                MessageDialogHelper.showMessageDialog(parentForm, "Kỹ sư đã được thêm thành công!!",
                        "Thông báo");
            } else {
                MessageDialogHelper.showConfirmDialog(parentForm,
                        "Kỹ sư không được lưu do lỗi", "Cảnh báo");
            }

            // Lấy ra mã cán bộ cuối cùng trong bảng để chèn vào bảng nhân viên
            if (dao.getLastIdCB() != -1) {
                int macb = dao.getLastIdCB();

                // Chèn vào bảng nhân viên
                dao.insertTable("tbl_kysu", macb, txtField.getText(), txtDegree.getText());
                //tao tai khoan tu dong
                String tk = VNCharacterUtils.removeAccent(txtname.getText()).replace(" ", "").toLowerCase();
                System.out.print(tk);
                Random rand = new Random();
                String mk = String.valueOf(rand.nextInt(100000000));
                if (dao.insertTaiKhoan(tk, mk, macb, Integer.valueOf(txtMaNghe.getText()))) {
                    MessageDialogHelper.showMessageDialog(parentForm, "Tạo tài khoản thành công!\nTài khoản: " + tk + "\nMật khẩu: " + mk,
                            "Thông báo");
                }
                loadDataToTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNamSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamSinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamSinhActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void tblEngineerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEngineerMouseClicked
        try {
            // Lấy ra dong được click
            int row = tblEngineer.getSelectedRow();
            if (row >= 0) {
                txtmaks.setText((String.valueOf(tblModel.getValueAt(row, 0))));
                txtname.setText((String) tblModel.getValueAt(row, 1));
                txtNamSinh.setText(String.valueOf(tblModel.getValueAt(row, 2)));
                String gender = (String) tblModel.getValueAt(row, 3);
                if (gender.equalsIgnoreCase("Nam")) {
                    rdNam.setSelected(true);
                    rdNu.setSelected(false);
                } else {
                    rdNu.setSelected(true);
                    rdNam.setSelected(false);
                }
                txtAddress.setText((String) tblModel.getValueAt(row, 4));
                txtField.setText(String.valueOf(tblModel.getValueAt(row, 5)));
                txtDegree.setText(String.valueOf(tblModel.getValueAt(row, 6)));
            }
        } catch (Exception e) {
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tblEngineerMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtname, sb, "Tên nhân viên không được để trống!!");
        DataValidator.validateEmpty(txtNamSinh, sb, "Năm sinh không được bỏ trống!!");
        DataValidator.validateEmpty(txtAddress, sb, "Địa chỉ không được bỏ trống!");
        DataValidator.validateEmpty(txtField, sb, "Trường làm việc không được bỏ trống!!");

        // Nếu có lỗi
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }

        if (MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn cập nhật sinh viên không?",
                "Xác nhận") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            // Lấy dữ liệu từ trên form xuống
            Kysu ks = new Kysu();
            ks.setTencb(txtname.getText());
            ks.setNamsinh(Integer.parseInt(txtNamSinh.getText()));
            ks.setGioitinh(rdNam.isSelected() ? "Nam" : "Nữ");
            ks.setNganhdt(txtField.getText());
            ks.setLoaibang(txtDegree.getText());
            ks.setDiachi(txtAddress.getText());
            ks.setMacb(Integer.parseInt(txtmaks.getText()));
            KySuDao dao = new KySuDao();

            if (dao.update(ks)) {
                loadDataToTable();
                MessageDialogHelper.showMessageDialog(parentForm, "Kỹ sư đã được cập nhật thành công!!",
                        "Thông báo");
            } else {
                MessageDialogHelper.showConfirmDialog(parentForm,
                        "Kỹ sư không được cập nhật do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtname, sb, "Tên Kỹ sư không được để trống!!");
        DataValidator.validateEmpty(txtNamSinh, sb, "Năm sinh không được bỏ trống!!");
        DataValidator.validateEmpty(txtAddress, sb, "Địa chỉ không được bỏ trống!");
        DataValidator.validateEmpty(txtDegree, sb, "Loại bằng không được bỏ trống!!");
        DataValidator.validateEmpty(txtField, sb, "Ngành làm việc không được bỏ trống!!");
        // Nếu có lỗi
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }

        if (MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn xóa kỹ sư không?",
                "Xác nhận") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            // Lấy dữ liệu từ trên form xuống
            CanBoDao dao = new CanBoDao();
            int maks = Integer.parseInt(txtmaks.getText());

            if (dao.delete("tbl_kysu", "maks", maks)) {
                loadDataToTable();
                MessageDialogHelper.showMessageDialog(parentForm, "Kỹ sư đã được xóa thành công!!",
                        "Thông báo");
            } else {
                MessageDialogHelper.showConfirmDialog(parentForm,
                        "Kỹ sư không được xóa do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            KySuDao dao = new KySuDao();
            String info = txtSearch.getText();

            if (info.length() == 0) {
                MessageDialogHelper.showErrorDialog(parentForm, "Thông tin tìm kiếm không được bỏ trống!!", "Lỗi");
            } else {
                info = "'%" + info + "%'";
                ArrayList<Kysu> list = dao.findKysu(info);
                tblModel.setRowCount(0);
                for (Kysu it : list) {
                    tblModel.addRow(new Object[]{
                        it.getMacb(), it.getTencb(), it.getNamsinh(), it.getGioitinh(),
                        it.getDiachi(), it.getNganhdt(), it.getLoaibang()
                    });
                }
                tblModel.fireTableDataChanged();
            }

        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFieldActionPerformed
        String txt = (String) cbField.getSelectedItem();
        fieldSort = txt;
    }//GEN-LAST:event_cbFieldActionPerformed

    private void cbSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSortActionPerformed
        String type = (String) cbSort.getSelectedItem();
        sortType = type;
    }//GEN-LAST:event_cbSortActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        KySuDao dao = new KySuDao();
        ArrayList<Kysu> listt;
        tblModel.setRowCount(0);
        try {
            listt = dao.sortEngineer(fieldSort, sortType);
            for (Kysu it : listt) {
                tblModel.addRow(new Object[]{
                    it.getMacb(), it.getTencb(), it.getNamsinh(), it.getGioitinh(),
                    it.getDiachi(), it.getNganhdt(), it.getLoaibang()
                });
            }
            tblModel.fireTableDataChanged();
            tblEngineer.setModel(tblModel);
        } catch (Exception ex) {
            Logger.getLogger(EngineerManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSortActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int manv = Integer.parseInt(txtmaks.getText());
        Random rand = new Random();
        String mk = String.valueOf(rand.nextInt(100000000));
        CanBoDao dao = new CanBoDao();
        try {
            if (dao.chagePassword(mk, manv)) {
                MessageDialogHelper.showMessageDialog(parentForm, "Reset mật khẩu thành công!!\nMật khẩu mới: " + mk, "Thông báo");
            }

        } catch (Exception ex) {
            MessageDialogHelper.showErrorDialog(parentForm, ex.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        try {
            KySuDao dao = new KySuDao();
            list = dao.getAllKysu(null, "");

            if (list.size() > 0) {
                ExportBase export = new ExportBase();
                export.KySuExport(list);

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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tblEngineer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDegree;
    private javax.swing.JTextField txtField;
    private javax.swing.JTextField txtMaNghe;
    private javax.swing.JTextField txtNamSinh;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtmaks;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
