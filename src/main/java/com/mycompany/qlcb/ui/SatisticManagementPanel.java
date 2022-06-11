/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.qlcb.ui;

import com.mycompany.qlcb.dao.CanBoDao;
import com.mycompany.qlcb.dao.KySuDao;
import com.mycompany.qlcb.dao.NhanVienDao;
import com.mycompany.qlcb.helpers.MessageDialogHelper;
import com.mycompany.qlcb.model.Canbo;
import com.mycompany.qlcb.model.Congnhan;
import com.mycompany.qlcb.model.Kysu;
import com.mycompany.qlcb.model.Nhanvien;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Duc
 */
public class SatisticManagementPanel extends javax.swing.JPanel {

    private MainForm parentForm;
    private DefaultTableModel tblModel1;
    private DefaultTableModel tblModel2;
    
    public SatisticManagementPanel() {
        initComponents();
        initTable1();
        loadDataToTable1();
    }
    

    private void initTable1() {
       tblModel1 = new DefaultTableModel();
       tblModel1.setColumnIdentifiers(new String[] {"Mã NV","Họ tên","Năm sinh", "Giới tính", 
           "Địa chỉ", "Mã nghành", "Tên ngành"});
       tbCanBo.setModel(tblModel1);
    }
    
    private void initTable(String field1, String field2) {
       tblModel2 = new DefaultTableModel();
       tblModel2.setColumnIdentifiers(new String[] {"Mã NV","Họ tên","Năm sinh", "Giới tính", 
           "Địa chỉ", field1, field2});
       tbDetailCb.setModel(tblModel2);
    }
    public void loadDataToTable1() {
        try {
            CanBoDao dao = new CanBoDao();
            ArrayList<Canbo> list = dao.getAllCanBo();
            tblModel1.setRowCount(0);
            for (Canbo it:list) {
                tblModel1.addRow(new Object[] {
                    it.getMacb(),it.getTencb(), it.getNamsinh(), it.getGioitinh(), 
                    it.getDiachi(), it.getManghe(), it.getTennghe()
                });
            }
            tblModel1.fireTableDataChanged();
            int[] arr = dao.getNumber();
            lbCongNhan.setText("Số công nhân: "+String.valueOf(arr[0]));            
            lbKySu.setText("Số kỹ sư: "+String.valueOf(arr[1]));
            lbNhanVien.setText("Số nhân viên: "+String.valueOf(arr[2]));

        }
        catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }
    
    private void loadDataToTableCn(int macb) {
        try {
            CanBoDao dao = new CanBoDao();
            Congnhan it = dao.getDetailCn(macb);
            tblModel2.addRow(new Object[] {
                it.getMacb(),it.getTencb(), it.getNamsinh(), it.getGioitinh(), 
                it.getDiachi(), it.getBac()
            });
            
            tblModel2.fireTableDataChanged();
        }
        catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }
    
    private void loadDataToTableKs(int macb) {
        try {
            KySuDao dao = new KySuDao();
            Kysu it = dao.getDetailKySu(macb);
            tblModel2.addRow(new Object[] {
                it.getMacb(),it.getTencb(), it.getNamsinh(), it.getGioitinh(), 
                it.getDiachi(), it.getNganhdt(), it.getLoaibang()
            });
            
            tblModel2.fireTableDataChanged();
        }
        catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }
    
    private void loadDataToTableNv(int macb) {
        try {
            NhanVienDao dao = new NhanVienDao();
            Nhanvien it = dao.getDetailNhanVien(macb);
            tblModel2.addRow(new Object[] {
                it.getMacb(),it.getTencb(), it.getNamsinh(), it.getGioitinh(), 
                it.getDiachi(), it.getCongviec()
            });
            
            tblModel2.fireTableDataChanged();
        }
        catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCanBo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDetailCb = new javax.swing.JTable();
        btnReload = new javax.swing.JButton();
        lbCongNhan = new javax.swing.JLabel();
        lbNhanVien = new javax.swing.JLabel();
        lbKySu = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("THỐNG KÊ TẤT CẢ CÁN BỘ");

        tbCanBo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbCanBo);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("THÔNG TIN CHI TIẾT");

        jLabel3.setText("Mã cán bộ");

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbDetailCb.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbDetailCb);

        btnReload.setText("Reload");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCongNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReload))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(68, 68, 68)
                                .addComponent(txtMaSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(lbKySu, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCongNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbKySu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {                                          
            CanBoDao dao = new CanBoDao();
            int macb = Integer.parseInt(txtMaSearch.getText());
            int manghe = dao.getManghe(macb);
            if (manghe < 0) {
                MessageDialogHelper.showMessageDialog(parentForm, "Mã cán bộ không tồn tại", "Thông báo");
                return;
            }
            
            try {
                if (manghe == 1) {
                    initTable("Bậc", "");
                    loadDataToTableCn(macb);
                }
                else if (manghe == 2) {
                    initTable("Ngành ĐT", "Loại bằng");
                    loadDataToTableKs(macb);
                }
                else if (manghe == 3) {
                    initTable("Công việc", "");
                    loadDataToTableNv(macb);
                }
            } catch (Exception ex) {
                MessageDialogHelper.showErrorDialog(parentForm, ex.getMessage(), "Lỗi");
            }
        } catch (Exception ex) {
            Logger.getLogger(SatisticManagementPanel.class.getName()).log(Level.SEVERE, null,ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        loadDataToTable1();
    }//GEN-LAST:event_btnReloadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCongNhan;
    private javax.swing.JLabel lbKySu;
    private javax.swing.JLabel lbNhanVien;
    private javax.swing.JTable tbCanBo;
    private javax.swing.JTable tbDetailCb;
    private javax.swing.JTextField txtMaSearch;
    // End of variables declaration//GEN-END:variables
}
