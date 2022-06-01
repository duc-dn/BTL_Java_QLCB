package com.mycompany.qlcb.model;


public class Congnhan extends Canbo{
    private int bac;

    public Congnhan() {
    }

    public Congnhan(String tencb, String namsinh, String gioitinh, String diachi, int bac) {
        super(tencb, namsinh, gioitinh, diachi);
        this.bac = bac;
    }
    
    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
    
    
}
