/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DSDonHang;
import Model.DanhMuc;
import Model.DonHang;
import Model.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class UserDAO {

    Connection con = SQLConnection.getConnection();

    public static List<DanhMuc> getDataFromDB() {
        Connection con = SQLConnection.getConnection();
        String sql = "Select * from tblHang";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<DanhMuc> list = new ArrayList<DanhMuc>();
            while (rs.next()) {
                DanhMuc danhmuc = new DanhMuc(rs.getString("maHang"), rs.getString("tenhang"), rs.getDouble("tien"), rs.getString("loaiHang"), rs.getInt("soLuong"));
                list.add(danhmuc);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean check(String ID) {
        Connection con = SQLConnection.getConnection();
        String sql = "select * from tblHang";
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                if (resultSet.getString("maHang").equals(ID)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
  
    // the cho nay la gi, duoc co 3 cai
    public void addRecord(DanhMuc danhMuc) {
        Connection con = SQLConnection.getConnection();
        String sql = "insert into tblHang(maHang,tenHang,tien, loaiHang,soLuong) values(?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, danhMuc.getMaHang());
            preparedStatement.setString(2, danhMuc.getTenHang());
            preparedStatement.setDouble(3, danhMuc.getTien());
            preparedStatement.setString(4, danhMuc.getLoaiSP());
            preparedStatement.setInt(5, danhMuc.getSoLuong());
            preparedStatement.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public void deleteRecord(String ID) {
        Connection con = SQLConnection.getConnection();
        String sql = "delete tblHang where maHang = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, ID);
            preparedStatement.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public void updateRecord(DanhMuc danhMuc) {
        Connection con = SQLConnection.getConnection();
        String sql = "update tblHang set tenHang = ?, tien = ?, LoaiHang = ?, soLuong = ? where maHang = ? ";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, danhMuc.getTenHang());
            preparedStatement.setDouble(2, danhMuc.getTien());
            preparedStatement.setString(3, danhMuc.getLoaiSP());
            preparedStatement.setInt(4, danhMuc.getSoLuong());
            preparedStatement.setString(5, danhMuc.getMaHang());
            preparedStatement.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public void deleteKhachHang(String ID) {
        Connection con = SQLConnection.getConnection();
        String sql = "delete tblKhachHang where maKhachHang = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, ID);
            preparedStatement.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
public void deleteDonHang(String ID) {
        Connection con = SQLConnection.getConnection();
        String sql = "delete tbDonHang where MaDonHang = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, ID);
            preparedStatement.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
    public static List<KhachHang> getDataKhachHang() {
        Connection con = SQLConnection.getConnection();
        String sql = "Select * from tblKhachHang";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<KhachHang> list = new ArrayList<KhachHang>();
            while (rs.next()) {
                KhachHang khachHang = new KhachHang(rs.getString("maKhachHang"), rs.getString("tenKhachHang"), rs.getString("SDT"), rs.getString("diaChi"), rs.getString("gioitinh"));
                list.add(khachHang);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addRecord123(KhachHang khachHang) {
        Connection con = SQLConnection.getConnection();
        String sql = "insert into tblKhachHang(maKhachHang,tenKhachHang,SDT,diaChi,gioitinh) values(?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, khachHang.getMaKhachHang());
            preparedStatement.setString(2, khachHang.getTenKhachHang());
            preparedStatement.setString(3, khachHang.getSdt());
            preparedStatement.setString(4, khachHang.getDiaChi());
            preparedStatement.setString(5, khachHang.getGioiTinh());
            preparedStatement.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
    public boolean checkKhachHang(String ID) {
        Connection con = SQLConnection.getConnection();
        String sql = "select * from tblKhachHang";
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                if (resultSet.getString("maKhachHang").equals(ID)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void updateKhachHang(KhachHang khachHang) {
        Connection con = SQLConnection.getConnection();
        String sql = "update tblKhachHang set tenKhachHang = ?, SDT = ?, diaChi = ?, gioitinh = ? where maKhachHang = ? ";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, khachHang.getTenKhachHang());
            preparedStatement.setString(2, khachHang.getSdt());
            preparedStatement.setString(3, khachHang.getDiaChi());
            preparedStatement.setString(4, khachHang.getGioiTinh());
            preparedStatement.setString(5, khachHang.getMaKhachHang());
            preparedStatement.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public List<DanhMuc> getSanPham(String sanpham) {
        String sql = "select * from tblHang where LoaiHang =?";
        try {
            List<DanhMuc> list = new ArrayList<DanhMuc>();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, sanpham);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                DanhMuc danhmuc = new DanhMuc(rs.getString("maHang"), rs.getString("tenhang"), rs.getDouble("tien"), rs.getString("loaiHang"), rs.getInt("soLuong"));
                list.add(danhmuc);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    long millis = System.currentTimeMillis();
    java.sql.Date date = new java.sql.Date(millis);

    public void addDonHang(DSDonHang DSdonHang) {
        String sql = "insert into tbDonHang(MaDonHang,TenDonHang,SoLuong,Tien,ngayMua) values(?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, DSdonHang.getMa());
            preparedStatement.setString(2, DSdonHang.getTen());
            preparedStatement.setInt(3, DSdonHang.getSl());
            preparedStatement.setDouble(4, DSdonHang.getTien());
            preparedStatement.setDate(5, date);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
 public static List<DonHang> getDonHang() {
        Connection con = SQLConnection.getConnection();
        String sql = "Select * from tbDonHang"; 
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<DonHang> list = new ArrayList<DonHang>();
            while (rs.next()) {
                DonHang donHang = new DonHang(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getString(5));
                list.add(donHang);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
 public List<DonHang> lichsu(String a, String b) {
        String sql = "select * from tbDonHang where ngayMua>=? and ngayMua<=? ";
        List<DonHang> list = new ArrayList<DonHang>();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, a);
            preparedStatement.setString(2, b);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                DonHang donHang = new DonHang(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getString(5));
                list.add(donHang);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
 
    
 
}
