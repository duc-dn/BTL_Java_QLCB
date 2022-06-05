package com.mycompany.qlcb.dao;

import com.mycompany.qlcb.helpers.DatabaseHelper;
import com.mycompany.qlcb.model.Canbo;
import com.mycompany.qlcb.model.Congnhan;
import com.mycompany.qlcb.model.Kysu;
import com.mycompany.qlcb.model.Nhanvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    //Thêm tài kho?n
    public boolean insertTaiKhoan(String username, String password, int macb, int quyen) throws SQLException, Exception {
        String sql = "Insert into tbl_taikhoan(username, password, macb, quyen) values (?,?,?,?)";
        try (
            Connection con = DatabaseHelper.openConnection();  
            PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setInt(3, macb);             
            pstmt.setInt(4, quyen);            
           
            return pstmt.executeUpdate() > 0;
            }
    }
    // Cập nhật thông tin
    public void update(String table, Canbo cb, String filed1, String filed2) throws SQLException, Exception {
        if (table.equalsIgnoreCase("tbl_kysu")) {
            String sql = "update tbl_canbo, " + table + " set tencb = ?, "
                    + "namsinh = ?, gioitinh = ?, diachi = ?, nganhdt = ?, loaibang = ?"
                    + "where tbl_canbo.macb = tbl_nhacbien.macb"
                    + "and macb = ?";

            try (
                    Connection con = DatabaseHelper.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                pstmt.setString(1, cb.getTencb());
                pstmt.setInt(2, cb.getNamsinh());
                pstmt.setString(3, cb.getGioitinh());
                pstmt.setString(4, cb.getDiachi());
                pstmt.setString(5, filed1);
                pstmt.setString(6, filed2);
                pstmt.setInt(7, cb.getMacb());
            }
        } else {
            String sql;
            if (table.equalsIgnoreCase("tbl_nhacbien")) {
                sql = "update tbl_canbo, " + table + " set tencb = ?, "
                        + "namsinh = ?, gioitinh = ?, diachi = ?, nganhdt = ?, congviec = ?"
                        + "where tbl_canbo.macb = tbl_nhacbien.macb"
                        + "and macb = ?";
            } else {
                sql = "update tbl_canbo, " + table + " set tencb = ?, "
                        + "namsinh = ?, gioitinh = ?, diachi = ?, nganhdt = ?, bac = ?"
                        + "where tbl_canbo.macb = tbl_nhacbien.macb"
                        + "and macb = ?";
            }

            try (
                    Connection con = DatabaseHelper.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                pstmt.setString(1, cb.getTencb());
                pstmt.setInt(2, cb.getNamsinh());
                pstmt.setString(3, cb.getGioitinh());
                pstmt.setString(4, cb.getDiachi());
                pstmt.setString(5, filed1);
                pstmt.setInt(6, cb.getMacb());
            }
        }

    }

    public boolean delete(String table, String ma, int macb) throws SQLException, Exception {

        String sql = "DELETE tbl_canbo.*, " + table + ".* from tbl_canbo inner join "
                + table + " on tbl_canbo.macb = " + table + "." + ma + " where tbl_canbo.macb = ?;";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, macb);
            return pstmt.executeUpdate() > 0;
        }
    }

    // Lấy thông tin tất cả các cán bộ hiển thị trên panel thống kê
    public ArrayList<Canbo> getAllCanBo() throws SQLException, Exception {
        String sql = "select * from tbl_canbo inner join tbl_nghe on tbl_canbo.manghe = tbl_nghe.manghe";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                ArrayList<Canbo> listcb = new ArrayList<Canbo>();
                while (rs.next()) {
                    Canbo cb = new Canbo();
                    cb.setMacb(rs.getInt("macb"));
                    cb.setTencb(rs.getString("tencb"));
                    cb.setNamsinh(rs.getInt("namsinh"));
                    cb.setGioitinh(rs.getString("gioitinh"));
                    cb.setDiachi(rs.getString("diachi"));
                    cb.setManghe(rs.getInt("manghe"));
                    cb.setTennghe(rs.getString("tennghe"));
                    listcb.add(cb);
                }
                return listcb;
            }
        }
    }
    
    public Congnhan getDetailCn(int macb) throws SQLException, Exception {
        String sql = "SELECT * FROM tbl_canbo inner join tbl_congnhan on macb = macn where macb = " + macb;
        Congnhan cn;
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    CongNhanDao dao = new CongNhanDao();
                    cn = dao.getDetailCongNhan(macb);
                    return cn;
                }
                
            }
        }
        return null;
    }
    
     public Kysu getDetailKs(int macb) throws SQLException, Exception {
        String sql = "SELECT * FROM tbl_canbo inner join tbl_kysu on macb = maks where macb = " + macb;
        Kysu ks;
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    KySuDao dao = new KySuDao();
                    ks = dao.getDetailKySu(macb);
                    return ks;
                }
                
            }
        }
        return null;
    }
     
     public Nhanvien getDetailNv(int macb) throws SQLException, Exception {
        String sql = "SELECT * FROM tbl_canbo inner join tbl_nhanvien on macb = manv where macb = " + macb;
        Nhanvien nv;
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    NhanVienDao dao = new NhanVienDao();
                    nv = dao.getDetailNhanVien(macb);
                    return nv;
                }
                
            }
        }
        return null;
    }
    
    public int getManghe(int macb) throws SQLException, Exception {
        String sql = "select manghe from tbl_canbo where macb = " + macb;
        int manghe;
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    manghe = rs.getInt("manghe");
                    return manghe;
                }

            }
        }
        return -1;
    }
    // Lấy ra thông tin ngu?i dùng
    public Canbo getDataND(int maCB) throws SQLException, Exception {
        String sql = "SELECT * FROM tbl_canbo where macb = " + String.valueOf(maCB);

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    Canbo cb = new Canbo();                    
                    cb.setMacb(maCB);
                    cb.setTencb(rs.getString("tencb"));                    
                    cb.setNamsinh(rs.getInt("namsinh"));
                    cb.setGioitinh(rs.getString("gioitinh"));
                    cb.setDiachi(rs.getString("diachi"));
                     return cb;
                }
            }
        }
        return null;
    }
    //update cán b?
    public boolean update(String pw, int macb) throws SQLException, Exception {
        
        String sql = "update tbl_taikhoan SET password = ?"
            + "where tbl_taikhoan.macb = ?";
            
        try (
        Connection con = DatabaseHelper.openConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);) 
        {
            pstmt.setString(1, pw);            
            pstmt.setInt(2, macb);

            return pstmt.executeUpdate() > 0;
        }
    }
    //check password
    public boolean checkPw(String pw, int macb) throws SQLException, Exception {
        
        String sql = "select password form tbl_taikhoan where password = ? AND macb=?";
            
        try (
        Connection con = DatabaseHelper.openConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);) 
        {
            pstmt.setString(1, pw);            
            pstmt.setInt(2, macb);

            return true;
        }
    }
}
