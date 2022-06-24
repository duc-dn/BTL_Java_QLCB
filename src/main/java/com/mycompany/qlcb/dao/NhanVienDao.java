package com.mycompany.qlcb.dao;

import com.mycompany.qlcb.helpers.DatabaseHelper;
import com.mycompany.qlcb.model.Nhanvien;
import com.mycompany.qlcb.model.Nhanvien;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Duc
 */
public class NhanVienDao {
    public ArrayList<Nhanvien> getAllNhanVien(String field, String type) throws SQLException, Exception {
        String sql = "select * from tbl_canbo cb inner join tbl_nhanvien nv on cb.macb = nv.manv order by " + field + " " + type;

        try 
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) 
        {
            try (ResultSet rs = pstmt.executeQuery();) {
                ArrayList<Nhanvien> listnv = new ArrayList<Nhanvien>();
                while (rs.next()) {
                    Nhanvien nv = new Nhanvien();
                    nv.setMacb(rs.getInt("macb"));
                    nv.setTencb(rs.getString("tencb"));
                    nv.setNamsinh(rs.getInt("namsinh"));
                    nv.setGioitinh(rs.getString("gioitinh"));
                    nv.setDiachi(rs.getString("diachi"));
                    nv.setCongviec(rs.getString("congviec"));
                    listnv.add(nv);
                }
                return listnv;
            }
        }
    }
    
    // Tìm kiếm thông tin nhân viên
    public ArrayList<Nhanvien> findNhanVien(String info) throws SQLException, Exception {
        String sql = "select * from tbl_canbo cb inner join "
                + "tbl_nhanvien nv on cb.macb = nv.manv "
                + "where tencb like" + info + " or namsinh like" + info + " or gioitinh like " + info
                + " or diachi like " + info + "or congviec like " + info + " or macb like " + info;

        try 
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) 
        {
            try (ResultSet rs = pstmt.executeQuery();) {
                ArrayList<Nhanvien> listnv = new ArrayList<Nhanvien>();
                while (rs.next()) {
                    Nhanvien nv = new Nhanvien();
                    nv.setMacb(rs.getInt("macb"));
                    nv.setTencb(rs.getString("tencb"));
                    nv.setNamsinh(rs.getInt("namsinh"));
                    nv.setGioitinh(rs.getString("gioitinh"));
                    nv.setDiachi(rs.getString("diachi"));
                    nv.setCongviec(rs.getString("congviec"));
                    listnv.add(nv);
                }
                return listnv;
            }
        }
    }
    
    public Nhanvien getDetailNhanVien(int macb) throws SQLException, Exception {
        String sql = "select * from tbl_canbo cb inner join tbl_nhanvien nv on cb.macb = nv.manv where macb = " + macb;

        try 
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) 
        {
            try (ResultSet rs = pstmt.executeQuery();) {
                Nhanvien nv = new Nhanvien();
                while (rs.next()) {
                    nv.setMacb(rs.getInt("macb"));
                    nv.setTencb(rs.getString("tencb"));
                    nv.setNamsinh(rs.getInt("namsinh"));
                    nv.setGioitinh(rs.getString("gioitinh"));
                    nv.setDiachi(rs.getString("diachi"));
                    nv.setCongviec(rs.getString("congviec"));
                }
                return nv;
            }
        }
    }
    
    public boolean update(Nhanvien nv) throws SQLException, Exception {
        
        String sql = "update tbl_canbo, tbl_nhanvien set tencb = ?, namsinh = ?, gioitinh = ?, diachi = ?, congviec = ?"
            + "where tbl_canbo.macb = tbl_nhanvien.manv and tbl_canbo.macb = ?";
            
        try (
        Connection con = DatabaseHelper.openConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);) 
        {
            pstmt.setString(1, nv.getTencb());
            pstmt.setInt(2, nv.getNamsinh());
            pstmt.setString(3, nv.getGioitinh());
            pstmt.setString(4, nv.getDiachi());
            pstmt.setString(5, nv.getCongviec());
            pstmt.setInt(6, nv.getMacb());
            return pstmt.executeUpdate() > 0;
        }
    }
    
   public ArrayList<Nhanvien> sortEmployee(String filed, String type) throws SQLException, Exception {
        
        ArrayList<Nhanvien> list = null;
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
        else if (filed.equalsIgnoreCase("Công việc")) {
            f = "congviec";
        }
        list = getAllNhanVien(f, sortType);
        return list;
    }
}
