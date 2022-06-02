package com.mycompany.qlcb.model;


public class Canbo {
    protected String tencb, gioitinh, diachi;

    protected int namsinh;
    public Canbo() {
    }

    public Canbo(String tencb, String gioitinh, String diachi, int namsinh) {
        this.tencb = tencb;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.namsinh = namsinh;
    }

    public String getTencb() {
        return tencb;
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
