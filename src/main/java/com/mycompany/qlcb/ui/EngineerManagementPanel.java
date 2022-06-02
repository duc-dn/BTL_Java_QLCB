package com.mycompany.qlcb.ui;

import com.mycompany.qlcb.dao.CanBoDao;
import com.mycompany.qlcb.dao.KySuDao;
import com.mycompany.qlcb.helpers.DataValidator;
import com.mycompany.qlcb.helpers.MessageDialogHelper;
import com.mycompany.qlcb.model.Kysu;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EngineerManagementPanel extends javax.swing.JPanel {
    private MainForm parentForm;
    private DefaultTableModel tblModel;
    
    public EngineerManagementPanel() {
        initComponents();
        rdNam.setSelected(true);
        rdNu.setSelected(false);
        initTable();
        loadDataToTable();
    }
    
    private void initTable() {
       tblModel = new DefaultTableModel();
       tblModel.setColumnIdentifiers(new String[] {"Mã KS","Họ tên","Năm sinh", "Giới tính", 
           "Địa chỉ", "Ngành đào tạo", "Loại bằng"});
       tblEngineer.setModel(tblModel);
    }
    
    private void loadDataToTable() {
        try {
            KySuDao dao = new KySuDao();
            ArrayList<Kysu> list = dao.getAllKysu();
            tblModel.setRowCount(0);
            for (Kysu it:list) {
                tblModel.addRow(new Object[] {
                    it.getMacb(),it.getTencb(), it.getNamsinh(), it.getGioitinh(), 
                    it.getDiachi(), it.getNganhdt(), it.getLoaibang()
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
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
        txtname = new javax.swing.JTextField();
        txtmaks = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("QUẢN LÝ KỸ SƯ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 18, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 51, 636, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Năm sinh");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Địa chỉ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 636, 7));

        txtAddress.setPreferredSize(new java.awt.Dimension(9, 22));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 510, 30));

        genderGroup.add(rdNam);
        rdNam.setText("Nam");
        add(rdNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        genderGroup.add(rdNu);
        rdNu.setText("Nữ");
        add(rdNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/new-icon-16.png"))); // NOI18N
        btnAdd.setText("Tạo mới");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Save-icon.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

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
        tblEngineer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEngineerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEngineer);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 640, 150));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 636, 9));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Ngành đào tạo");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtField.setPreferredSize(new java.awt.Dimension(9, 22));
        txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldActionPerformed(evt);
            }
        });
        add(txtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 509, 30));

        txtDegree.setPreferredSize(new java.awt.Dimension(9, 22));
        txtDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDegreeActionPerformed(evt);
            }
        });
        add(txtDegree, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 509, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Loại bằng");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtMaNghe.setText("2");
        txtMaNghe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNgheActionPerformed(evt);
            }
        });
        add(txtMaNghe, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        txtNamSinh.setPreferredSize(new java.awt.Dimension(9, 22));
        txtNamSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamSinhActionPerformed(evt);
            }
        });
        add(txtNamSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 510, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Họ tên");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtname.setPreferredSize(new java.awt.Dimension(9, 22));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 510, 30));
        add(txtmaks, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));
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
        DataValidator.validateEmpty(txtmaks, sb, "Năm sinh không được bỏ trống!!");
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
            ks.setGioitinh(rdNam.isSelected()?"Nam":"Nữ");
            ks.setLoaibang(txtField.getText());
            ks.setDiachi(txtAddress.getText());
            ks.setNganhdt(txtField.getText());
            
            int manghe = Integer.parseInt(txtMaNghe.getText());
            CanBoDao dao = new CanBoDao();
            if (dao.insertCB(ks, manghe))
            {
                MessageDialogHelper.showMessageDialog(parentForm, "Kỹ sư đã được thêm thành công!!",
                "Thông báo");
            }
            else {
                MessageDialogHelper.showConfirmDialog(parentForm, 
                        "Kỹ sư không được lưu do lỗi", "Cảnh báo");
            }
            
            // Lấy ra mã cán bộ cuối cùng trong bảng để chèn vào bảng nhân viên
            
            if (dao.getLastIdCB() != -1) {
                int macb = dao.getLastIdCB();
                
                // Chèn vào bảng nhân viên
                dao.insertTable("tbl_kysu", macb, txtField.getText(), txtDegree.getText());
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
                txtname.setText((String)tblModel.getValueAt(row, 1));
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
            ks.setGioitinh(rdNam.isSelected()?"Nam":"Nữ");
            ks.setNganhdt(txtField.getText());
            ks.setLoaibang(txtDegree.getText());
            ks.setDiachi(txtAddress.getText());
            ks.setMacb(Integer.parseInt(txtmaks.getText()));
            KySuDao dao = new KySuDao();
            
            
            if (dao.update(ks))
            {
                MessageDialogHelper.showMessageDialog(parentForm, "Kỹ sư đã được cập nhật thành công!!",
                "Thông báo");
            }
            else {
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
            
            
            
            if (dao.delete("tbl_kysu", "maks",maks))
            {
                MessageDialogHelper.showMessageDialog(parentForm, "Kỹ sư đã được xóa thành công!!",
                "Thông báo");
            }
            else {
                MessageDialogHelper.showConfirmDialog(parentForm, 
                        "Kỹ sư không được xóa do lỗi", "Cảnh báo");
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tblEngineer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDegree;
    private javax.swing.JTextField txtField;
    private javax.swing.JTextField txtMaNghe;
    private javax.swing.JTextField txtNamSinh;
    private javax.swing.JTextField txtmaks;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
