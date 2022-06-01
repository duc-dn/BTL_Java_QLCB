package com.mycompany.qlcb.helpers;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Duc
 */
public class MessageDialogHelper {
    
    // hop thoai thong bao
    public static void showMessageDialog(Component parent, String content, String title) {
        JOptionPane.showMessageDialog(parent, content, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    // hop thoai thong bao loi
    public static void showErrorDialog(Component parent, String content, String title) {
        JOptionPane.showMessageDialog(parent, content, title, JOptionPane.ERROR_MESSAGE);
    }
    
    
    // hop thoai thong bao xac nhan
    public static int showConfirmDialog(Component parent, String content, String title) {
        return JOptionPane.showConfirmDialog(parent, content, title, JOptionPane.YES_NO_OPTION ,
                JOptionPane.QUESTION_MESSAGE);
    }
    
}
