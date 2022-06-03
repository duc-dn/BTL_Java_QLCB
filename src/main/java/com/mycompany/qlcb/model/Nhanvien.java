package com.mycompany.qlcb.model;


public class Nhanvien extends Canbo{
    private String congviec;

    public Nhanvien() {
    }

    public Nhanvien(String congviec, String tencb, String gioitinh, String diachi, int namsinh) {
        super(tencb, gioitinh, diachi, namsinh);
        this.congviec = congviec;
    }

    public String getCongviec() {
        return congviec;
    }

    public int getManghe() {
        return manghe;
    }

    public void setManghe(int manghe) {
        this.manghe = manghe;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    public String getTencb() {
        return tencb;
    }

    public int getMacb() {
        return macb;
    }

    public void setMacb(int macb) {
        this.macb = macb;
    }

    public void setTencb(String tencb) {
        this.tencb = tencb;
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

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    
    
}
