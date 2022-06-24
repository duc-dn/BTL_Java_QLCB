package com.mycompany.qlcb.dao;

import com.mycompany.qlcb.helpers.DatabaseHelper;
import com.mycompany.qlcb.model.Congnhan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CongNhanDao {
    public ArrayList<Congnhan> getAllCongNhan(String field, String type) throws SQLException, Exception {
        String sql = "select * from tbl_canbo cb inner join tbl_congnhan cn on cb.macb = cn.macn order by " + field + " " + type;

        try 
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) 
        {
            try (ResultSet rs = pstmt.executeQuery();) {
                ArrayList<Congnhan> listcn = new ArrayList<Congnhan>();
                while (rs.next()) {
                    Congnhan cn = new Congnhan();
                    cn.setMacb(rs.getInt("macb"));
                    cn.setTencb(rs.getString("tencb"));
                    cn.setNamsinh(rs.getInt("namsinh"));
                    cn.setGioitinh(rs.getString("gioitinh"));
                    cn.setDiachi(rs.getString("diachi"));
                    cn.setBac(rs.getInt("bac"));
                    listcn.add(cn);
                }
                return listcn;
            }
        }
    }
    
    public ArrayList<Congnhan> findCongnhan(String info) throws SQLException, Exception {
        String sql = "select * from tbl_canbo cb inner join "
                + "tbl_congnhan cn on cb.macb = cn.macn "
                + "where tencb like" + info + " or namsinh like" + info + " or gioitinh like " + info
                + " or diachi like " + info + "or bac like " + info + " or macb like " + info;

        try 
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) 
        {
            try (ResultSet rs = pstmt.executeQuery();) {
                ArrayList<Congnhan> listcn = new ArrayList<Congnhan>();
                while (rs.next()) {
                    Congnhan cn = new Congnhan();
                    cn.setMacb(rs.getInt("macb"));
                    cn.setTencb(rs.getString("tencb"));
                    cn.setNamsinh(rs.getInt("namsinh"));
                    cn.setGioitinh(rs.getString("gioitinh"));
                    cn.setDiachi(rs.getString("diachi"));
                    cn.setBac(rs.getInt("bac"));
                    listcn.add(cn);
                }
                return listcn;
            }
        }
    }
    public Congnhan getDetailCongNhan(int macb) throws SQLException, Exception {
        String sql = "select * from tbl_canbo cb inner join tbl_congnhan cn on cb.macb = cn.macn where macb = " + macb;

        try 
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) 
        {
            try (ResultSet rs = pstmt.executeQuery();) {
                Congnhan cn = new Congnhan();
                while (rs.next()) {
                    
                    cn.setMacb(rs.getInt("macb"));
                    cn.setTencb(rs.getString("tencb"));
                    cn.setNamsinh(rs.getInt("namsinh"));
                    cn.setGioitinh(rs.getString("gioitinh"));
                    cn.setDiachi(rs.getString("diachi"));
                    cn.setBac(rs.getInt("bac"));
                }
                return cn;
            }
        }
    }
    
    public boolean update(Congnhan cn) throws SQLException, Exception {
        
        String sql = "update tbl_canbo, tbl_congnhan set tencb = ?, namsinh = ?, gioitinh = ?, diachi = ?, bac = ? where tbl_canbo.macb = tbl_congnhan.macn and tbl_canbo.macb = ?";
            
        try (
        Connection con = DatabaseHelper.openConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);) 
        {
            pstmt.setString(1, cn.getTencb());
            pstmt.setInt(2, cn.getNamsinh());
            pstmt.setString(3, cn.getGioitinh());
            pstmt.setString(4, cn.getDiachi());
            pstmt.setInt(5, cn.getBac());
            pstmt.setInt(6, cn.getMacb());
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public ArrayList<Congnhan> sortWorker(String filed, String type) throws SQLException, Exception {
        
        ArrayList<Congnhan> list = null;
        String sortType = "ASC";
        String f = "tencb";
        if (type.equalsIgnoreCase("Giảm dần")) sortType = "DESC";
        else sortType = "ASC";
        
        if (filed.equalsIgnoreCase("Năm sinh")) {
            f = "namsinh";
        } 
        else if (filed.equalsIgnoreCase("Giới tính")) {
            f = "gioitinh";
        }
        else if (filed.equalsIgnoreCase("Địa chỉ")) {
            f = "diachi";
        }
        else if (filed.equalsIgnoreCase("Bậc")) {
            f = "bac";
        }
        
        list = getAllCongNhan(f, sortType);
        return list;
    }
}
