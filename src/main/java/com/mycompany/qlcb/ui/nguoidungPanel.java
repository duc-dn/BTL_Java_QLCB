package com.mycompany.qlcb.ui;

import com.mycompany.qlcb.dao.CanBoDao;
import com.mycompany.qlcb.dao.NhanVienDao;
import com.mycompany.qlcb.helpers.DataValidator;
import com.mycompany.qlcb.helpers.MessageDialogHelper;
import com.mycompany.qlcb.helpers.SharedData;
import com.mycompany.qlcb.model.Canbo;
import com.mycompany.qlcb.model.Nhanvien;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class nguoidungPanel extends javax.swing.JPanel {

    private MainForm parentForm;
    private DefaultTableModel tblModel;

    public nguoidungPanel() throws Exception {
        initComponents();
        rdNam.setSelected(true);
        rdNu.setSelected(false);
        addInfoNguoiDung();
    }

    public void addInfoNguoiDung() throws Exception {
        Canbo cb = new Canbo();
        CanBoDao dao = new CanBoDao();
        cb = dao.getDataND(SharedData.nguoiDangNhap.getMaCB());
        txtName.setText(cb.getTencb());
        txtNamSinh.setText(String.valueOf(cb.getNamsinh()));
        if (cb.getGioitinh().equalsIgnoreCase("Nam")) {
            rdNam.setSelected(true);
            rdNu.setSelected(false);
        } else {
            rdNu.setSelected(true);
            rdNam.setSelected(false);
        }
        txtAddress.setText(cb.getDiachi());
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
        jSeparator2 = new javax.swing.JSeparator();
        txtNamSinh = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        btnUpdate = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        txtMaNghe = new javax.swing.JTextField();
        txtmanv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnChangePw = new javax.swing.JButton();
        txtPasOld = new javax.swing.JPasswordField();
        txtPasNew = new javax.swing.JPasswordField();
        txtRePw = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("QU???N L?? NH??N VI??N");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("H??? t??n");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("N??m sinh");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Gi???i t??nh");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("?????a ch???");

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
        rdNu.setText("N???");

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate.setText("C???p nh???t");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtMaNghe.setText("3");

        txtmanv.setText("jTextField1");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("?????i m???t kh???u");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("M???t kh???u c??:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("M???t kh???u m???i:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Nh???p l???i m???t kh???u:");

        btnChangePw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        btnChangePw.setText("Thuc hien");
        btnChangePw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePwActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNghe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1))
                            .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)
                                .addGap(73, 73, 73)
                                .addComponent(rdNam)
                                .addGap(79, 79, 79)
                                .addComponent(rdNu)))
                        .addGap(0, 448, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(84, 84, 84)
                                .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(83, 83, 83)
                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(66, 66, 66)
                                .addComponent(txtNamSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPasNew)
                                    .addComponent(txtRePw)
                                    .addComponent(txtPasOld)))
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnChangePw, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaNghe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4))
                    .addComponent(rdNam)
                    .addComponent(rdNu))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addGap(12, 12, 12)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasOld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRePw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(11, 11, 11)
                .addComponent(btnChangePw)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNamSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamSinhActionPerformed

    }//GEN-LAST:event_txtNamSinhActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed

    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtName, sb, "T??n kh??ng ???????c ????? tr???ng!!");
        DataValidator.validateEmpty(txtNamSinh, sb, "N??m sinh kh??ng ???????c b??? tr???ng!!");
        DataValidator.validateEmpty(txtAddress, sb, "?????a ch??? kh??ng ???????c b??? tr???ng!");

        // N???u c?? l???i
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "L???i");
            return;
        }

        if (MessageDialogHelper.showConfirmDialog(parentForm, "B???n c?? mu???n c???p nh???t sinh vi??n kh??ng?",
                "X??c nh???n") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            // L???y d??? li???u t??? tr??n form xu???ng
            Canbo cb = new Canbo();
            cb.setTencb(txtName.getText());
            cb.setNamsinh(Integer.parseInt(txtNamSinh.getText()));
            cb.setGioitinh(rdNam.isSelected() ? "Nam" : "N???");
            cb.setDiachi(txtAddress.getText());
            cb.setMacb((SharedData.nguoiDangNhap.getMaCB()));
            CanBoDao dao = new CanBoDao();
            
            if (dao.update_general(cb)) {
                MessageDialogHelper.showMessageDialog(parentForm, "C??ng nh??n ???? ???????c c???p nh???t th??nh c??ng!!",
                        "Th??ng b??o");
            } else {
                MessageDialogHelper.showConfirmDialog(parentForm,
                        "C??ng nh??n kh??ng ???????c c???p nh???t do l???i", "C???nh b??o");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "L???i");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnChangePwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePwActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtPasOld, sb, "B???n c???n nh???p m???t kh???u hi???n t???i!!");
        DataValidator.validateEmpty(txtNamSinh, sb, "H??y hh???p m???t kh???u m??i!!");
        DataValidator.validateEmpty(txtAddress, sb, "H??y hh???p l???i m???t kh???u m??i!!");
        int macb = SharedData.nguoiDangNhap.getMaCB();
        // N???u c?? l???i
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "L???i");
            return;
        }

        if (MessageDialogHelper.showConfirmDialog(parentForm, "X??c nh???n ?????i m???t kh???u?",
                "X??c nh???n") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            // L???y d??? li???u t??? tr??n form xu???ng
            CanBoDao dao = new CanBoDao();
            if (dao.checkPw(new String(txtPasOld.getPassword()), macb)) {
                if (new String(txtPasNew.getPassword()).equals(new String(txtRePw.getPassword()))) {
                    if (dao.chagePassword(new String(txtPasNew.getPassword()), macb)) {
                        MessageDialogHelper.showMessageDialog(parentForm, "?????i m???t kh???u th??nh c??ng!!", "Th??ng b??o");
                    } else {
                        MessageDialogHelper.showConfirmDialog(parentForm, "?????i m???t kh???u l???i", "C???nh b??o");
                    }
                }else{
                    MessageDialogHelper.showConfirmDialog(parentForm, "M???t kh???u kh??ng kh???p!!", "C???nh b??o");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "L???i");
        }
    }//GEN-LAST:event_btnChangePwActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePw;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtMaNghe;
    private javax.swing.JTextField txtNamSinh;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPasNew;
    private javax.swing.JPasswordField txtPasOld;
    private javax.swing.JPasswordField txtRePw;
    private javax.swing.JTextField txtmanv;
    // End of variables declaration//GEN-END:variables
}
