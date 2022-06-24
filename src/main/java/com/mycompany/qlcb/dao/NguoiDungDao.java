package com.mycompany.qlcb.dao;

import static com.mycompany.qlcb.helpers.DatabaseHelper.openConnection;
import com.mycompany.qlcb.model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class NguoiDungDao {
    public NguoiDung checkLogin(String tenDangNhap, String matKhau) throws Exception {
        String sql = "Select username, password,macb, quyen  from tbl_taikhoan where username = ? and password = ?";
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
                    nd.setMaCB(rs.getInt("macb"));
                    int quyen = rs.getInt("quyen");
                    if(quyen == 0){
                        nd.setVaiTro("Quản trị viên");
                    }
                    if(quyen == 1){
                        nd.setVaiTro("Công nhân");
                    }
                    if(quyen == 2){
                        nd.setVaiTro("Kỹ sư");
                    }
                    if(quyen == 3){
                        nd.setVaiTro("Nhân viên");
                    }
                    return nd;
                    
                }
            }
        }
        
        return null;
    }    
    
}
