package com.mycompany.qlcb.model;


public class NguoiDung {
    private String tenDangNhap, matKhau, vaiTro;
    private int macb;

    public NguoiDung() {
    }

    public NguoiDung(String tenDangNhap, String matKhau,int macb, String vaiTro) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.macb = macb;
        this.vaiTro = vaiTro;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }
    public int getMaCB() {
        return macb;
    }

    public void setMaCB(int macb) {
        this.macb = macb;
    }
    
}
