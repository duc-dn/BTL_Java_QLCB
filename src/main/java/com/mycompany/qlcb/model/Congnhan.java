package com.mycompany.qlcb.model;


public class Congnhan extends Canbo{
    private int bac;

    public Congnhan() {
    }

    public Congnhan(int bac) {
        this.bac = bac;
    }

    public Congnhan(int bac, String tencb, String gioitinh, String diachi, int namsinh) {
        super(tencb, gioitinh, diachi, namsinh);
        this.bac = bac;
    }

    
    public int getMacb() {
        return macb;
    }

    public void setMacb(int macb) {
        this.macb = macb;
    }

    public int getManghe() {
        return manghe;
    }

    public void setManghe(int manghe) {
        this.manghe = manghe;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
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
