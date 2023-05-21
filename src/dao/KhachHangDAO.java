/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import admin.GiaoDienQuanLyFrame;
import java.sql.Connection;
import connection.JDBCUtil;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.KhachHang;
import user.DangNhapFrame;
/**
 *
 * @author ACER
 */
public class KhachHangDAO implements DAOInterface<KhachHang>{
    Connection connection=JDBCUtil.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    public int getMaxRow(){
    
        int row =0;
        try {
            st=connection.createStatement();
            rs=st.executeQuery("select max(ID_khachhang) from khachhang");
            while(rs.next()){
            
                row= rs.getInt(1);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public boolean kiemTraEmailTonTai(String email) {
         try {
            ps = connection.prepareStatement("select * from khachhang where email=?");
            ps.setString(1, email);
            rs=ps.executeQuery();
            if (rs.next()) {
                return true;
            } 
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    

    
    
}
