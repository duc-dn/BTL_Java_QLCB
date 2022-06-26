/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.qlcb.ui;

import com.mycompany.qlcb.dao.CanBoDao;
import com.mycompany.qlcb.dao.NhanVienDao;
import com.mycompany.qlcb.helpers.DataValidator;
import com.mycompany.qlcb.helpers.MessageDialogHelper;
import com.mycompany.qlcb.model.Canbo;
import com.mycompany.qlcb.model.Nhanvien;
import com.mycompany.qlcb.model.TaiKhoan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Duc
 */
public class AccountManagementPanel extends javax.swing.JPanel {

    private MainForm parentForm;
    private DefaultTableModel tblModel;
    
    public AccountManagementPanel() {
        initComponents();
        initTable();
        loadDataToTable();
    }

    private void initTable() {
       tblModel = new DefaultTableModel();
       tblModel.setColumnIdentifiers(new String[] {"Mã CB","Tên đăng nhập","Quyền", "Trạng thái"});
       tbAccount.setModel(tblModel);
    }
    
    public void loadDataToTable() {
        try {
            CanBoDao dao = new CanBoDao();
            ArrayList<TaiKhoan> list = dao.getInfoAccount();
            tblModel.setRowCount(0);
            
            for (TaiKhoan it:list) {
                String cv = null;
                if (it.getQuyen() == 0) cv = "Quản trị viên";
                else if (it.getQuyen() == 1) cv = "User thường";
                
                tblModel.addRow(new Object[] {
                    it.getMacb(),it.getUsername(), cv, it.getTrangthai()
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbAccount = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tblReload = new javax.swing.JButton();
        cbRule = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();

        tbAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAccountMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAccount);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("QUẢN LÝ TÀI KHOẢN NGƯỜI DÙNG");

        jLabel2.setText("ID:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel3.setText("Username");

        jLabel4.setText("Quyền");

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Cập nhật");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Trạng thái");

        tblReload.setText("Reload");
        tblReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblReloadActionPerformed(evt);
            }
        });

        cbRule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản trị viên", "User thường" }));
        cbRule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRuleActionPerformed(evt);
            }
        });

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang hoạt động", "Vô hiệu hóa" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(txtId)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tblReload, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbRule, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbStatus, 0, 144, Short.MAX_VALUE))))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbRule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(tblReload)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void tbAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccountMouseClicked
        try {
            // Lấy ra dong được click
            int row = tbAccount.getSelectedRow();
            if (row >= 0) {
                txtId.setText(String.valueOf(tbAccount.getValueAt(row, 0)));
                txtUsername.setText((String)tbAccount.getValueAt(row, 1));
                if ((String)tbAccount.getValueAt(row, 2) == "Quản trị viên") {
                    cbRule.setSelectedIndex(0);
                }
                else if ((String)tbAccount.getValueAt(row, 2) == "User thường") {
                    cbRule.setSelectedIndex(1);
                }
                
                
                if ((String)tbAccount.getValueAt(row, 3) == "Đang hoạt động") {
                    System.out.println("alo 1");
                    cbStatus.setSelectedIndex(0);
                }
                else if ((String)tbAccount.getValueAt(row, 3) == "Vô hiệu hóa")
                {
                    System.out.println("alo2");
                    cbStatus.setSelectedIndex(1);
                }
            }
        } catch (Exception e) {
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tbAccountMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtId, sb, "Mã cán bộ không được để trống!!");
        DataValidator.validateEmpty(txtUsername, sb, "Tên đăng nhập không được bỏ trống!!");

        // Nếu có lỗi
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        
        if (MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn cập nhật sinh tài khoản?", 
                "Xác nhận") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            // Lấy dữ liệu từ trên form xuống
            TaiKhoan tk = new TaiKhoan();
            tk.setMacb(Integer.parseInt(txtId.getText()));
            int quyen = 0;
            if (rule.equalsIgnoreCase("Admin")) quyen = 0;
            else if (rule.equalsIgnoreCase("User thường")) quyen = 1;
           
            

            tk.setTrangthai(status);
           
            CanBoDao dao = new CanBoDao();
            
            
            if (dao.update(tk))
            {
                loadDataToTable();
                MessageDialogHelper.showMessageDialog(parentForm, "Tài khoản đã được cập nhật thành công!!",
                "Thông báo");
            }
            else {
                MessageDialogHelper.showConfirmDialog(parentForm, 
                        "Tài khoản không được cập nhật do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblReloadActionPerformed
        loadDataToTable();
    }//GEN-LAST:event_tblReloadActionPerformed
    
    String rule = "";
    private void cbRuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRuleActionPerformed
        String txt = (String)cbRule.getSelectedItem();
        rule = txt;
    }//GEN-LAST:event_cbRuleActionPerformed

    String status = "";
    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        String txt = (String)cbStatus.getSelectedItem();
        status = txt;
    }//GEN-LAST:event_cbStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbRule;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAccount;
    private javax.swing.JButton tblReload;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
