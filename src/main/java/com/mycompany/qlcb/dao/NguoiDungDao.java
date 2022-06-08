package com.mycompany.qlcb.dao;

import static com.mycompany.qlcb.helpers.DatabaseHelper.openConnection;
import com.mycompany.qlcb.helpers.SharedData;
import com.mycompany.qlcb.model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class NguoiDungDao {
    public NguoiDung checkLogin(String tenDangNhap, String matKhau) throws Exception {
        String sql = "Select username, password,tbl_taikhoan.macb, quyen, tencb  from tbl_taikhoan, tbl_canbo where tbl_taikhoan.macb = tbl_canbo.macb and username = ? and password = ?";
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
                    SharedData.tenNguoiDung = rs.getString("tencb");
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    nd.setMaCB(rs.getInt("macb"));
                    int quyen = rs.getInt("quyen");
                    switch (quyen) {
                        case 0:
                            nd.setVaiTro("Quản trị viên");
                            break;
                        case 1:
                            nd.setVaiTro("Công nhân");
                            break;
                        case 2:
                            nd.setVaiTro("Kỹ sư");
                            break;
                        case 3:
                            nd.setVaiTro("Nhân viên");
                            break;
                        default:
                            break;
                    }
                    return nd;
                    
                }
            }
        }
        
        return null;
    }    
    
}
