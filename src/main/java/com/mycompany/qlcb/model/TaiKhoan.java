/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlcb.model;

/**
 *
 * @author Duc
 */
public class TaiKhoan {
    private int macb, quyen;
    private String username, trangthai;

    public int getMacb() {
        return macb;
    }

    public void setMacb(int macb) {
        this.macb = macb;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public TaiKhoan(int macb, int quyen, String username, String trangthai) {
        this.macb = macb;
        this.quyen = quyen;
        this.username = username;
        this.trangthai = trangthai;
    }

    public TaiKhoan() {
    }


    
}
