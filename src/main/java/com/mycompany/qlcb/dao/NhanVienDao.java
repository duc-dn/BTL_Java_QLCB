package com.mycompany.qlcb.dao;

import com.mycompany.qlcb.helpers.DatabaseHelper;
import static com.mycompany.qlcb.helpers.DatabaseHelper.openConnection;
import com.mycompany.qlcb.model.Nhanvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Duc
 */
public class NhanVienDao {
    
    
    public boolean insertNV(Nhanvien nv) throws SQLException, Exception{
        String sql = "SELECT macb FROM tbl_canbo ORDER BY macb DESC LIMIT 1";
        
        try
        (
            Connection con = openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);  
        ) 
        {
            try(ResultSet rs = executeQuery(sql);) {
                if (rs.next()) {
                    System.out.println(rs);
                }
            }
        }
        try
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);  
        ) 
        {
            pstmt.setString(1, nv.getTencb());
            pstmt.setString(2, nv.getNamsinh());
            pstmt.setString(3, nv.getGioitinh());
            pstmt.setString(4, nv.getDiachi());
            return pstmt.executeUpdate() > 0;
        }
        
    }

    private ResultSet executeQuery(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
