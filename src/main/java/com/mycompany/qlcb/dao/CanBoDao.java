/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlcb.dao;

import com.mycompany.qlcb.helpers.DatabaseHelper;
import com.mycompany.qlcb.model.Canbo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Duc
 */
public class CanBoDao {
    public boolean insertCB(Canbo cb, int manghe) throws SQLException, Exception{
        String sql = "insert into tbl_canbo (tencb, namsinh, gioitinh, diachi, manghe) "
                + "values(?, ?, ?, ?, ?)";
        
        try
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);  
        ) 
        {
            pstmt.setString(1, cb.getTencb());
            pstmt.setString(2, cb.getNamsinh());
            pstmt.setString(3, cb.getGioitinh());
            pstmt.setString(4, cb.getDiachi());
            pstmt.setInt(5, manghe);
            return pstmt.executeUpdate() > 0;
        }
        
    }
    
}
