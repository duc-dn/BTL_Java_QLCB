package com.mycompany.qlcb.dao;

import static com.mycompany.qlcb.helpers.DatabaseHelper.openConnection;
import com.mycompany.qlcb.model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Duc
 */
public class NguoiDungDao {
    public NguoiDung checkLogin(String tenDangNhap, String matKhau) throws Exception {
        String sql = "Select username, password, quyen  from tbl_taikhoan where username = ? and password = ?";
        try
        (
            Connection con = openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);  
        ) 
        {
            pstmt.setString(1, tenDangNhap);
            pstmt.setString(2, matKhau);
            try(ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    nd.setVaiTro(rs.getString("quyen"));
                    System.out.println("TK" + rs.getString("username")+ " " + tenDangNhap);
                    System.out.println("MK" + rs.getString("password")+ " " + matKhau);
                    return nd;
                }
            }
        }
        
        return null;
    }    
}
