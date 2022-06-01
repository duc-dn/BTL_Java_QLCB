package com.mycompany.qlcb.model;


public class Nhanvien extends Canbo{
    private String congviec;

    public Nhanvien() {
    }

    public Nhanvien(String congviec) {
        this.congviec = congviec;
    }

    public Nhanvien(String congviec, String tencb, String namsinh, String gioitinh, String diachi) {
        super(tencb, namsinh, gioitinh, diachi);
        this.congviec = congviec;
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    public String getTencb() {
        return tencb;
    }

    public void setTencb(String tencb) {
        this.tencb = tencb;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
}
