/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import DAO.UserDAO;
import Model.DSDonHang;
import Model.DanhMuc;
import Model.DonHang;
import Model.KhachHang;

public class UserService {

    UserDAO userDAO;
    static DefaultTableModel tableModel;

    public UserService() {
        userDAO = new UserDAO();
    }

    public List<DanhMuc> getAllData() {
        return userDAO.getDataFromDB();
    }

    public void addRecord(DanhMuc danhMuc) {
        userDAO.addRecord(danhMuc);
    }

    public void updateRecord(DanhMuc danhMuc) {
        userDAO.updateRecord(danhMuc);
    }

    public void deleteRecord(String danhMuc) {
        userDAO.deleteRecord(danhMuc);
    }
    
  
    
    public boolean check(String danhMuc) {
        return userDAO.check(danhMuc);
    }
    
    public boolean checkKhachHang(String khachHang) {
        return userDAO.checkKhachHang(khachHang);
    }

    public void deleteKhachHang(String khachHang) {
        userDAO.deleteKhachHang(khachHang);
    }
    
    public void deleteDonHang(String ma) {
        userDAO.deleteDonHang(ma);
                        
    }

    public List<KhachHang> getDataKhachHang() {
        return userDAO.getDataKhachHang();
    }

    public void addRecord123(KhachHang khachHang) {
        userDAO.addRecord123(khachHang);
    }

    public void updateKhachHang(KhachHang khachHang) {
        userDAO.updateKhachHang(khachHang);
    }

    public List<DanhMuc> getSanPham(String sanpham) {
        return userDAO.getSanPham(sanpham);
    }

    public void addDonHang(DSDonHang DSDonHang ) {
        userDAO.addDonHang(DSDonHang);
    }
    
    public List<DonHang> getDonHang( ){
        return userDAO.getDonHang();
    }
    
    public List<DonHang> lichsu(String a, String b) {
        return userDAO.lichsu(a, b);
    }
}
