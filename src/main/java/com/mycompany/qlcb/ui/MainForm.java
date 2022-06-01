package com.mycompany.qlcb.ui;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



public class MainForm extends javax.swing.JFrame {

    private WorkerManagementPanel mWorkerPanel;
    private EngineerManagementPanel mEngineerPanel;
    private EmployeeManagementPanel mEmployeePanel;
    
    
    public MainForm() {
        initComponents();
        setTitle("Nhóm 11 - Quản lý cán bộ");
        
        // căn giua màn hình
        setLocationRelativeTo(null);
        
        // phong to kich thuoc cua so main form
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        // Khoi tao form login
//        LoginDialog dialog = new LoginDialog(this, true);
//        dialog.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        tbrLogout = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        tbrQLCN = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        tbrQLKS = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        tbrQLNV = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        tbrAboutUs = new javax.swing.JButton();
        tplMainBoard = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuFile_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuManageWorker = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnuManageEngineer = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mnuManageEmployee = new javax.swing.JMenuItem();
        mnuAboutUs = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        tbrLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/logout-icon-32.png"))); // NOI18N
        tbrLogout.setText("Đăng xuất");
        tbrLogout.setFocusable(false);
        tbrLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrLogout);
        jToolBar1.add(jSeparator9);

        tbrQLCN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/worker32px.png"))); // NOI18N
        tbrQLCN.setText("QL Công nhân");
        tbrQLCN.setFocusable(false);
        tbrQLCN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrQLCN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrQLCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrQLCNActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrQLCN);
        jToolBar1.add(jSeparator5);

        tbrQLKS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Engineer32px.png"))); // NOI18N
        tbrQLKS.setText("QL Kỹ Sư");
        tbrQLKS.setFocusable(false);
        tbrQLKS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrQLKS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrQLKS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrQLKSActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrQLKS);
        jToolBar1.add(jSeparator4);

        tbrQLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        tbrQLNV.setText("QL Nhân Viên");
        tbrQLNV.setFocusable(false);
        tbrQLNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrQLNV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrQLNVActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrQLNV);
        jToolBar1.add(jSeparator2);

        tbrAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Actions-help-about-icon-32.png"))); // NOI18N
        tbrAboutUs.setText("Giới thiệu");
        tbrAboutUs.setFocusable(false);
        tbrAboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrAboutUs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrAboutUsActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrAboutUs);

        jMenu1.setText("Hệ thống");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/logout-icon-16.png"))); // NOI18N
        jMenuItem1.setText("Đăng xuất");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        menuFile_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuFile_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Actions-edit-delete-icon-16.png"))); // NOI18N
        menuFile_Exit.setText("Thoát");
        menuFile_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuFile_Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        mnuManageWorker.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuManageWorker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/worker16px.png"))); // NOI18N
        mnuManageWorker.setText("Quản lý công nhân");
        mnuManageWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageWorkerActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageWorker);
        jMenu2.add(jSeparator6);

        mnuManageEngineer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuManageEngineer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Engineer16px.png"))); // NOI18N
        mnuManageEngineer.setText("Quản lý kỹ sư");
        mnuManageEngineer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageEngineerActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageEngineer);
        jMenu2.add(jSeparator7);

        mnuManageEmployee.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuManageEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        mnuManageEmployee.setText("Quản lý nhân viên");
        mnuManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageEmployeeActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageEmployee);

        jMenuBar1.add(jMenu2);

        mnuAboutUs.setText("Trợ giúp");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Help-icon-16.png"))); // NOI18N
        jMenuItem5.setText("Giới thiệu");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnuAboutUs.add(jMenuItem5);
        mnuAboutUs.add(jSeparator8);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlcb/icons/Actions-help-about-icon-16.png"))); // NOI18N
        jMenuItem6.setText("Nội dung");
        mnuAboutUs.add(jMenuItem6);

        jMenuBar1.add(mnuAboutUs);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageEmployeeActionPerformed
        if (mEmployeePanel == null) {
            mEmployeePanel = new EmployeeManagementPanel();
            tplMainBoard.addTab("Quản lý nhân viên", mEmployeePanel);
        }
        tplMainBoard.setSelectedComponent(mEmployeePanel);
    }//GEN-LAST:event_mnuManageEmployeeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuFile_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile_ExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_menuFile_ExitActionPerformed

    private void mnuManageWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageWorkerActionPerformed
        if (mWorkerPanel == null) {
            mWorkerPanel = new WorkerManagementPanel();
        
            tplMainBoard.addTab("Quản lý công nhân", mWorkerPanel);
        }
        tplMainBoard.setSelectedComponent(mWorkerPanel);
    }//GEN-LAST:event_mnuManageWorkerActionPerformed

    private void tbrAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrAboutUsActionPerformed
        AboutUsDialog aboutDialog = new AboutUsDialog(this, true);
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_tbrAboutUsActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        AboutUsDialog aboutDialog = new AboutUsDialog(this, true);
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void tbrQLCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrQLCNActionPerformed
        if (mWorkerPanel == null) {
            mWorkerPanel = new WorkerManagementPanel();
        
            tplMainBoard.addTab("Quản lý công nhân", mWorkerPanel);
        }
        tplMainBoard.setSelectedComponent(mWorkerPanel);
    }//GEN-LAST:event_tbrQLCNActionPerformed

    private void mnuManageEngineerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageEngineerActionPerformed
        // TODO add your handling code here:
        if (mEngineerPanel == null) {
            mEngineerPanel = new EngineerManagementPanel();
            
            tplMainBoard.addTab("Quản lý kỹ sư", mEngineerPanel);
        }
        tplMainBoard.setSelectedComponent(mEngineerPanel);
    }//GEN-LAST:event_mnuManageEngineerActionPerformed

    private void tbrQLKSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrQLKSActionPerformed
        if (mEngineerPanel == null) {
            mEngineerPanel = new EngineerManagementPanel();
            
            tplMainBoard.addTab("Quản lý kỹ sư", mEngineerPanel);
        }
        tplMainBoard.setSelectedComponent(mEngineerPanel);
    }//GEN-LAST:event_tbrQLKSActionPerformed

    private void tbrQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrQLNVActionPerformed
        if (mEmployeePanel == null) {
            mEmployeePanel = new EmployeeManagementPanel();
            tplMainBoard.addTab("Quản lý nhân viên", mEmployeePanel);
        }
        tplMainBoard.setSelectedComponent(mEmployeePanel);
    }//GEN-LAST:event_tbrQLNVActionPerformed

    
    // Xu ly logout
    private void tbrLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrLogoutActionPerformed
        LoginDialog loginDialog = new LoginDialog(this, true);
        loginDialog.setVisible(true);
    }//GEN-LAST:event_tbrLogoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LoginDialog dialog = new LoginDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuFile_Exit;
    private javax.swing.JMenu mnuAboutUs;
    private javax.swing.JMenuItem mnuManageEmployee;
    private javax.swing.JMenuItem mnuManageEngineer;
    private javax.swing.JMenuItem mnuManageWorker;
    private javax.swing.JButton tbrAboutUs;
    private javax.swing.JButton tbrLogout;
    private javax.swing.JButton tbrQLCN;
    private javax.swing.JButton tbrQLKS;
    private javax.swing.JButton tbrQLNV;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}
