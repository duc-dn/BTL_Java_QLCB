package com.mycompany.qlcb.dao;

import com.mycompany.qlcb.helpers.DatabaseHelper;
import com.mycompany.qlcb.model.Canbo;
import com.mycompany.qlcb.model.Nhanvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CanBoDao {

    // Thực hiện chèn vào table cán bộ
    public boolean insertCB(Canbo cb, int manghe) throws SQLException, Exception {
        String sql = "insert into tbl_canbo (tencb, namsinh, gioitinh, diachi, manghe) "
                + "values(?, ?, ?, ?, ?)";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, cb.getTencb());
            pstmt.setInt(2, cb.getNamsinh());
            pstmt.setString(3, cb.getGioitinh());
            pstmt.setString(4, cb.getDiachi());
            pstmt.setInt(5, manghe);
            return pstmt.executeUpdate() > 0;
        }

    }

    // Lấy ra id của cán bộ cuối cùng trong table cán bộ
    public int getLastIdCB() throws SQLException, Exception {
        String sql = "SELECT macb FROM tbl_canbo ORDER BY macb DESC LIMIT 1;";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    return rs.getInt("macb");
                }
            }
        }
        return -1;
    }

    // Thực hiện chèn chung cho 3 bảng nhân viên, kỹ sư, công nhân
    public boolean insertTable(String table, int macb, String filed1, String filed2)
            throws SQLException, Exception {

        if (table.equalsIgnoreCase("tbl_kysu")) {
            String sql = "Insert into " + table + " values (?,?, ?)";

            try (
                    Connection con = DatabaseHelper.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                pstmt.setInt(1, macb);
                pstmt.setString(2, filed1);
                pstmt.setString(3, filed2);
                return pstmt.executeUpdate() > 0;
            }

        } else {
            String sql = "Insert into " + table + " values (?,?)";

            try (
                    Connection con = DatabaseHelper.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                pstmt.setInt(1, macb);
                if (table.equalsIgnoreCase("tbl_congnhan")) {
                    pstmt.setInt(2, Integer.parseInt(filed1));
                } else {
                    pstmt.setString(2, filed1);
                }
                return pstmt.executeUpdate() > 0;
            }
        }

    }

    // Cập nhật thông tin
    public void update(String table, Canbo cb, String filed1, String filed2) throws SQLException, Exception {
        if (table.equalsIgnoreCase("tbl_kysu")) {
            String sql = "update tbl_canbo, " + table + " set tencb = ?, "
                    + "namsinh = ?, gioitinh = ?, diachi = ?, congviec = ?"
                    + "where tbl_canbo.macb = tbl_nhanvien.manv"
                    + "and macb = ?";

            try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) 
                {
                    pstmt.setString(1, cb.getTencb());
                    pstmt.setInt(2, cb.getNamsinh());
                    pstmt.setString(3, cb.getGioitinh());
                    pstmt.setString(4, cb.getDiachi());
                    pstmt.setString(5, filed1);
                    pstmt.setString(6, filed2);
                }
        }

    }

}
