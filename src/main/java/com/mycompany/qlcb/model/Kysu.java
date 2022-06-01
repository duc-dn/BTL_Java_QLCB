package com.mycompany.qlcb.model;


public class Kysu extends Canbo{
    private String nganhdt, loaibang;

    public Kysu() {
        
    }

    public Kysu(String nganhdt, String loaibang, String tencb, String namsinh, String gioitinh, String diachi) {
        super(tencb, namsinh, gioitinh, diachi);
        this.nganhdt = nganhdt;
        this.loaibang = loaibang;
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
    
    
}
