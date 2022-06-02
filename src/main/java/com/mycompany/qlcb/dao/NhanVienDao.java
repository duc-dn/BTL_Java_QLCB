package com.mycompany.qlcb.dao;

import com.mycompany.qlcb.helpers.DatabaseHelper;
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
    public ArrayList<Nhanvien> getAllNhanVien() throws SQLException, Exception {
        String sql = "select * from tbl_canbo cb inner join tbl_nhanvien nv on cb.macb = nv.manv";

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
}
