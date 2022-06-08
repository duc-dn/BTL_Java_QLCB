package com.mycompany.qlcb.helpers;


import java.sql.Connection;
import java.sql.DriverManager;



public class DatabaseHelper {
    public static Connection openConnection() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");  
        String url = "jdbc:mysql://localhost:3306/db_qlcb";
        String dbusername = "root";
        String password = "";
        Connection con=DriverManager.getConnection(  
        url,dbusername,password);  
        if (con==null) {
            System.out.println("That bai");
        }
        else System.out.println("Thanh cong!");
        return con;
    }
}
