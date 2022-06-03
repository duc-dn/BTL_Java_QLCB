package com.mycompany.qlcb.ui;

import com.mycompany.qlcb.dao.CanBoDao;
import com.mycompany.qlcb.dao.CongNhanDao;
import com.mycompany.qlcb.helpers.DataValidator;
import com.mycompany.qlcb.helpers.MessageDialogHelper;
import com.mycompany.qlcb.model.Congnhan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class WorkerManagementPanel extends javax.swing.JPanel {

    private MainForm parentForm;
    private DefaultTableModel tblModel;
    
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
            ArrayList<Congnhan> list = dao.getAllCongNhan();
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
        jSeparator3 = new javax.swing.JSeparator();
        txtMaNghe = new javax.swing.JTextField();
        txtmacn = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("QUẢN LÝ CÔNG NHÂN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 18, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 51, 636, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Họ tên");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 79, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Năm sinh");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 118, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 157, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Địa chỉ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 209, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Bậc");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 258, -1, -1));

        txtName.setPreferredSize(new java.awt.Dimension(9, 22));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 69, 510, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 291, 636, 7));

        txtNamSinh.setPreferredSize(new java.awt.Dimension(9, 22));
        txtNamSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamSinhActionPerformed(evt);
            }
        });
        add(txtNamSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 108, 510, 30));

        txtBac.setPreferredSize(new java.awt.Dimension(9, 22));
        txtBac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBacActionPerformed(evt);
            }
        });
        add(txtBac, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 248, 510, 30));

        txtAddress.setPreferredSize(new java.awt.Dimension(9, 22));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 199, 510, 30));

        genderGroup.add(rdNam);
        rdNam.setText("Nam");
        add(rdNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 156, -1, -1));

        genderGroup.add(rdNu);
        rdNu.setText("Nữ");
        add(rdNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 156, -1, -1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/new-icon-16.png"))); // NOI18N
        btnAdd.setText("Tạo mới");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 305, -1, -1));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Save-icon.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 305, -1, -1));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 305, -1, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 305, -1, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 356, 636, 150));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 343, 636, 6));

        txtMaNghe.setText("1");
        add(txtMaNghe, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 465, -1, -1));
        add(txtmacn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tblWorker;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBac;
    private javax.swing.JTextField txtMaNghe;
    private javax.swing.JTextField txtNamSinh;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtmacn;
    // End of variables declaration//GEN-END:variables
}
