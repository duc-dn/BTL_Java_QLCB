package com.mycompany.qlcb.model;


public class Canbo {
    protected String  tencb, gioitinh, diachi, tennghe;
    protected int macb, manghe;

    protected int namsinh;
    public Canbo() {
    }

    public Canbo(String tencb, String gioitinh, String diachi, int namsinh) {
        this.tencb = tencb;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.namsinh = namsinh;
    }
    
     public Canbo(String tencb, String gioitinh, String diachi, int namsinh, int manghe, String tennghe) {
        this.tencb = tencb;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.namsinh = namsinh;
        this.manghe = manghe;
        this.tennghe = tennghe;
    }

    public String getTennghe() {
        return tennghe;
    }

    public void setTennghe(String tennghe) {
        this.tennghe = tennghe;
    }

    public String getTencb() {
        return tencb;
    }

    public void setTencb(String tencb) {
        this.tencb = tencb;
    }

    public int getManghe() {
        return manghe;
    }

    public void setManghe(int manghe) {
        this.manghe = manghe;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public int getMacb() {
        return macb;
    }

    public void setMacb(int macb) {
        this.macb = macb;
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
