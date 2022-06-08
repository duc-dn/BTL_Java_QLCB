/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlcb.helpers;

import com.mycompany.qlcb.model.NguoiDung;

/**
 *
 * @author Duc
 */
public class SharedData {
    public static NguoiDung nguoiDangNhap;
    public static String tenNguoiDung;
    public void show_info() {
        System.out.println(nguoiDangNhap.getTenDangNhap());
        System.out.println(nguoiDangNhap.getVaiTro());
    }
}



