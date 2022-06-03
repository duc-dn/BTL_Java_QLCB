package com.mycompany.qlcb.model;


public class Kysu extends Canbo{
    private String nganhdt, loaibang;

    public Kysu() {
        
    }

    public Kysu(String nganhdt, String loaibang) {
        this.nganhdt = nganhdt;
        this.loaibang = loaibang;
    }

    public Kysu(String nganhdt, String loaibang, String tencb, String gioitinh, String diachi, int namsinh) {
        super(tencb, gioitinh, diachi, namsinh);
        this.nganhdt = nganhdt;
        this.loaibang = loaibang;
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

    public String getNganhdt() {
        return nganhdt;
    }

    public void setNganhdt(String nganhdt) {
        this.nganhdt = nganhdt;
    }

    public String getLoaibang() {
        return loaibang;
    }

    public void setLoaibang(String loaibang) {
        this.loaibang = loaibang;
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
