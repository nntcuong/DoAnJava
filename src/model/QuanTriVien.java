/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class QuanTriVien extends NguoiDung  {
    private Date ngaySinh;

    
    public QuanTriVien(int id, String ten, int sdt, String email, String matkhau, String diachi,Date ngaySinh) {
        super(id, ten, sdt, email, matkhau, diachi);
        this.ngaySinh=ngaySinh;
  
    }

    @Override
    public void capnhat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
