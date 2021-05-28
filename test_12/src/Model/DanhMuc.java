/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
    
public class DanhMuc {
    private String maHang;
    private String tenHang;
    private double tien;
    private String loaiSP;
    private Integer soLuong;

    public DanhMuc() {
    }

    public DanhMuc(String maHang, String tenHang, double tien, String loaiSP, Integer soLuong) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.tien = tien;
        this.loaiSP = loaiSP;
        this.soLuong = soLuong;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
    
    
    

    
   
}
