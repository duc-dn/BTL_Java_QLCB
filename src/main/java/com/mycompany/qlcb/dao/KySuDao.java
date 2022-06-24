/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlcb.dao;

import com.mycompany.qlcb.helpers.DatabaseHelper;
import com.mycompany.qlcb.model.Kysu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Duc
 */
public class KySuDao {
    // Lấy thông tin kỹ sư từ database trả về một list để hiển thị lên table
    public ArrayList<Kysu> getAllKysu(String field, String type) throws SQLException, Exception {
        String sql = "select * from tbl_canbo cb inner join tbl_kysu ks on cb.macb = ks.maks order by " + field + " " + type;

        try 
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) 
        {
            try (ResultSet rs = pstmt.executeQuery();) {
                ArrayList<Kysu> listks = new ArrayList<Kysu>();
                while (rs.next()) {
                    Kysu ks = new Kysu();
                    ks.setMacb(rs.getInt("macb"));
                    ks.setTencb(rs.getString("tencb"));
                    ks.setNamsinh(rs.getInt("namsinh"));
                    ks.setGioitinh(rs.getString("gioitinh"));
                    ks.setDiachi(rs.getString("diachi"));
                    ks.setNganhdt(rs.getString("nganhdt"));
                    ks.setLoaibang(rs.getString("loaibang"));
                    listks.add(ks);
                }
                return listks;
            }
        }
    }
    
    // Tìm kiếm thông tin kỹ sư
    public ArrayList<Kysu> findKysu(String info) throws SQLException, Exception {
        String sql = "select * from tbl_canbo cb inner join "
                + "tbl_kysu ks on cb.macb = ks.maks "
                + "where tencb like" + info + " or namsinh like" + info + " or gioitinh like " + info
                + " or diachi like " + info + "or nganhdt like " + info + " or loaibang like " + info +
                " or macb like " + info;

        try 
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) 
        {
            try (ResultSet rs = pstmt.executeQuery();) {
                ArrayList<Kysu> listks = new ArrayList<Kysu>();
                while (rs.next()) {
                    Kysu ks = new Kysu();
                    ks.setMacb(rs.getInt("macb"));
                    ks.setTencb(rs.getString("tencb"));
                    ks.setNamsinh(rs.getInt("namsinh"));
                    ks.setGioitinh(rs.getString("gioitinh"));
                    ks.setDiachi(rs.getString("diachi"));
                    ks.setNganhdt(rs.getString("nganhdt"));
                    ks.setNganhdt(rs.getString("loaibang"));
                    listks.add(ks);
                }
                return listks;
            }
        }
    }
    
    // Lấy thông tin chi tiết của kỹ sư
    public Kysu getDetailKySu(int macb) throws SQLException, Exception {
        String sql = "select * from tbl_canbo cb inner join tbl_kysu ks on cb.macb = ks.maks where macb = " + macb;

        try 
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) 
        {
            try (ResultSet rs = pstmt.executeQuery();) {
                Kysu ks = new Kysu();
                while (rs.next()) {
                    
                    ks.setMacb(rs.getInt("macb"));
                    ks.setTencb(rs.getString("tencb"));
                    ks.setNamsinh(rs.getInt("namsinh"));
                    ks.setGioitinh(rs.getString("gioitinh"));
                    ks.setDiachi(rs.getString("diachi"));
                    ks.setNganhdt(rs.getString("nganhdt"));
                    ks.setLoaibang(rs.getString("loaibang"));
                }
                return ks;
            }
        }
    }
    
    // Cập nhật thông tin kỹ sư (nút Update)
    public boolean update(Kysu ks) throws SQLException, Exception {
        
        String sql = "select * from tbl_canbo cb inner join tbl_kysu ks on cb.macb = ks.maks order by";
            
        try (
        Connection con = DatabaseHelper.openConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);) 
        {
            pstmt.setString(1, ks.getTencb());
            pstmt.setInt(2, ks.getNamsinh());
            pstmt.setString(3, ks.getGioitinh());
            pstmt.setString(4, ks.getDiachi());
            pstmt.setString(5, ks.getNganhdt());
            pstmt.setString(6, ks.getLoaibang());
            pstmt.setInt(7, ks.getMacb());
            return pstmt.executeUpdate() > 0;
        }
    }
    
    
    public ArrayList<Kysu> sortEngineer(String filed, String type) throws SQLException, Exception {
        
        ArrayList<Kysu> list = null;
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
        else if (filed.equalsIgnoreCase("Ngành đào tạo")) {
            f = "nganhdt";
        }
        else if (filed.equalsIgnoreCase("Loại bằng")) {
            f = "loaibang";
        }
        list = getAllKysu(f, sortType);
        return list;
    }
}
