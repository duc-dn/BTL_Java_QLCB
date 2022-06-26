package com.mycompany.qlcb.ui;

import com.mycompany.qlcb.dao.CanBoDao;
import com.mycompany.qlcb.dao.NhanVienDao;
import com.mycompany.qlcb.helpers.DataValidator;
import com.mycompany.qlcb.helpers.MessageDialogHelper;
import com.mycompany.qlcb.filehelpers.ExportBase;
import com.mycompany.qlcb.helpers.VNCharacterUtils;
import com.mycompany.qlcb.model.Nhanvien;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.formula.functions.Count;

public class EmployeeManagementPanel extends javax.swing.JPanel {

    private MainForm parentForm;
    private DefaultTableModel tblModel;
    ArrayList<Nhanvien> list;
    String fieldSort = "tencb";
    String sortType = "ASC";

    public EmployeeManagementPanel() {
        initComponents();
        rdNam.setSelected(true);
        rdNu.setSelected(false);
        initTable();
        loadDataToTable();
    }

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã NV", "Họ tên", "Năm sinh", "Giới tính",
            "Địa chỉ", "Công việc"});
        tblEmployee.setModel(tblModel);
    }

    private void loadDataToTable() {
        try {
            NhanVienDao dao = new NhanVienDao();
            ArrayList<Nhanvien> list = dao.getAllNhanVien(null, "");
            tblModel.setRowCount(0);
            for (Nhanvien it : list) {
                tblModel.addRow(new Object[]{
                    it.getMacb(), it.getTencb(), it.getNamsinh(), it.getGioitinh(),
                    it.getDiachi(), it.getCongviec()
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
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNamSinh = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        txtJob = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMaNghe = new javax.swing.JTextField();
        txtmanv = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        btnSeach = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbField = new javax.swing.JComboBox<>();
        cbSort = new javax.swing.JComboBox<>();
        btnSort = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Họ tên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Năm sinh");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Địa chỉ");

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

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/new-icon-16.png"))); // NOI18N
        btnNew.setText("Tạo mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
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

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Họ tên", "Năm sinh", "Giới tính", "Địa chỉ", "Công việc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        txtJob.setPreferredSize(new java.awt.Dimension(9, 22));
        txtJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJobActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Công việc");

        txtMaNghe.setText("3");

        txtmanv.setText("jTextField1");

        btnSeach.setText("Tìm kiếm");
        btnSeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeachActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Thông tin tìm kiếm");

        cbField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ tên", "Năm sinh", "Giới tính", "Địa chỉ", "Công việc" }));
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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Sắp xếp");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addComponent(rdNam)
                        .addGap(26, 26, 26)
                        .addComponent(rdNu))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(46, 46, 46)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSeach)
                            .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtMaNghe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(btnUpdate))
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtJob, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                            .addComponent(btnExport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtMaNghe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdNam)
                                .addComponent(rdNu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5))
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel8))
                            .addComponent(txtJob, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNew)
                            .addComponent(btnSave)
                            .addComponent(btnUpdate))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(txtmanv, 0, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSort)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnExport)
                        .addContainerGap())))
        );

        txtMaNghe.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNamSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamSinhActionPerformed

    }//GEN-LAST:event_txtNamSinhActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed

    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobActionPerformed

    }//GEN-LAST:event_txtJobActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtName.setText("");
        txtAddress.setText("");
        txtJob.setText("");
        txtNamSinh.setText("");
        rdNam.setSelected(true);
        rdNu.setSelected(false);
    }//GEN-LAST:event_btnNewActionPerformed

    // Sự kiện save
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtName, sb, "Tên Công nhân không được để trống!!");
        DataValidator.validateEmpty(txtNamSinh, sb, "Năm sinh không được bỏ trống!!");
        DataValidator.validateEmpty(txtAddress, sb, "Địa chỉ không được bỏ trống!");
        DataValidator.validateEmpty(txtJob, sb, "Công việc không được bỏ trống!!");

        // Nếu có lỗi
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }

        try {
            // Lấy dữ liệu từ trên form xuống
            Nhanvien nv = new Nhanvien();
            nv.setTencb(txtName.getText());
            nv.setNamsinh(Integer.parseInt(txtNamSinh.getText()));
            nv.setGioitinh(rdNam.isSelected() ? "Nam" : "Nữ");
            nv.setCongviec(txtJob.getText());
            nv.setDiachi(txtAddress.getText());
            int manghe = Integer.parseInt(txtMaNghe.getText());
            CanBoDao dao = new CanBoDao();

            if (dao.insertCB(nv, manghe)) {
                MessageDialogHelper.showMessageDialog(parentForm, "Công nhân đã được thêm thành công!!",
                        "Thông báo");
            } else {
                MessageDialogHelper.showConfirmDialog(parentForm,
                        "Công nhân không được lưu do lỗi", "Cảnh báo");
            }

            // Lấy ra mã cán bộ cuối cùng trong bảng để chèn vào bảng Công nhân
            if (dao.getLastIdCB() != -1) {
                int macb = dao.getLastIdCB();

                // Chèn vào bảng Công nhân
                dao.insertTable("tbl_nhanvien", macb, txtJob.getText(), "");
                SatisticManagementPanel sasPanel = new SatisticManagementPanel();
                sasPanel.loadDataToTable1();

                //tao tai khoan tu dong
                String tk = VNCharacterUtils.removeAccent(txtName.getText()).replace(" ", "").toLowerCase();
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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtName, sb, "Tên Công nhân không được để trống!!");
        DataValidator.validateEmpty(txtNamSinh, sb, "Năm sinh không được bỏ trống!!");
        DataValidator.validateEmpty(txtAddress, sb, "Địa chỉ không được bỏ trống!");
        DataValidator.validateEmpty(txtJob, sb, "Công việc không được bỏ trống!!");

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
            Nhanvien nv = new Nhanvien();
            nv.setTencb(txtName.getText());
            nv.setNamsinh(Integer.parseInt(txtNamSinh.getText()));
            nv.setGioitinh(rdNam.isSelected() ? "Nam" : "Nữ");
            nv.setCongviec(txtJob.getText());
            nv.setDiachi(txtAddress.getText());
            nv.setMacb(Integer.parseInt(txtmanv.getText()));
            NhanVienDao dao = new NhanVienDao();

            if (dao.update(nv)) {
                loadDataToTable();
                MessageDialogHelper.showMessageDialog(parentForm, "Công nhân đã được cập nhật thành công!!",
                        "Thông báo");
            } else {
                MessageDialogHelper.showConfirmDialog(parentForm,
                        "Công nhân không được cập nhật do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        try {
            // Lấy ra dong được click
            int row = tblEmployee.getSelectedRow();
            if (row >= 0) {
                txtmanv.setText(String.valueOf(tblModel.getValueAt(row, 0)));
                txtName.setText((String) tblModel.getValueAt(row, 1));
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
                txtJob.setText((String) tblModel.getValueAt(row, 5));
            }
        } catch (Exception e) {
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tblEmployeeMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtName, sb, "Tên Công nhân không được để trống!!");
        DataValidator.validateEmpty(txtNamSinh, sb, "Năm sinh không được bỏ trống!!");
        DataValidator.validateEmpty(txtAddress, sb, "Địa chỉ không được bỏ trống!");
        DataValidator.validateEmpty(txtJob, sb, "Công việc không được bỏ trống!!");

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
            CanBoDao dao = new CanBoDao();
            int manv = Integer.parseInt(txtmanv.getText());

            if (dao.delete("tbl_nhanvien", "manv", manv)) {
                MessageDialogHelper.showMessageDialog(parentForm, "Công nhân đã được xóa thành công!!",
                        "Thông báo");
                loadDataToTable();
            } else {
                MessageDialogHelper.showConfirmDialog(parentForm,
                        "Công nhân không được xóa do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeachActionPerformed
        try {
            NhanVienDao dao = new NhanVienDao();
            String info = txtSearch.getText();
            if (info.length() == 0) {
                MessageDialogHelper.showErrorDialog(parentForm, "Thông tin tìm kiếm không được bỏ trống!!", "Lỗi");
            } else {
                info = "'%" + info + "%'";
                ArrayList<Nhanvien> list = dao.findNhanVien(info);
                tblModel.setRowCount(0);
                for (Nhanvien it : list) {
                    tblModel.addRow(new Object[]{
                        it.getMacb(), it.getTencb(), it.getNamsinh(), it.getGioitinh(),
                        it.getDiachi(), it.getCongviec()
                    });
                }
                tblModel.fireTableDataChanged();
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnSeachActionPerformed

    private void cbFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFieldActionPerformed
        String txt = (String) cbField.getSelectedItem();
        fieldSort = txt;
    }//GEN-LAST:event_cbFieldActionPerformed

    private void cbSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSortActionPerformed
        String type = (String) cbSort.getSelectedItem();
        sortType = type;
    }//GEN-LAST:event_cbSortActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        NhanVienDao dao = new NhanVienDao();
        ArrayList<Nhanvien> listt;
        tblModel.setRowCount(0);
        try {
            listt = dao.sortEmployee(fieldSort, sortType);
            for (Nhanvien it : listt) {
                tblModel.addRow(new Object[]{
                    it.getMacb(), it.getTencb(), it.getNamsinh(), it.getGioitinh(),
                    it.getDiachi(), it.getCongviec()
                });
            }
            tblModel.fireTableDataChanged();
            tblEmployee.setModel(tblModel);

        } catch (Exception ex) {
            Logger.getLogger(EngineerManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSortActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int manv = Integer.parseInt(txtmanv.getText());
        Random rand = new Random();
        String mk = String.valueOf(rand.nextInt(100000000));
        CanBoDao dao = new CanBoDao();
        try {
            System.out.println("alo dmm1");
            if (dao.chagePassword(mk, manv)) {

                System.out.println("alo dmm2");
                MessageDialogHelper.showMessageDialog(parentForm, "Reset mật khẩu thành công!!\nMật khẩu mới: " + mk, "Thông báo");
            }

        } catch (Exception ex) {
            MessageDialogHelper.showErrorDialog(parentForm, ex.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        try {
            NhanVienDao dao = new NhanVienDao();
            ArrayList<Nhanvien> list = dao.getAllNhanVien(null, "");

            if (list.size() > 0) {
                ExportBase export = new ExportBase();
                export.NhanVienExport(list);

                MessageDialogHelper.showMessageDialog(parentForm, "Xuất file thành công", "Thông báo");
            }

        } catch (Exception ex) {
            MessageDialogHelper.showErrorDialog(parentForm, ex.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnExportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSeach;
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
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtJob;
    private javax.swing.JTextField txtMaNghe;
    private javax.swing.JTextField txtNamSinh;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtmanv;
    // End of variables declaration//GEN-END:variables

}
