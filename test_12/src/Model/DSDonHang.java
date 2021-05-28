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
public class DSDonHang {
    private String ma;
    private String ten;
    private int sl;
    private double tien;

    public DSDonHang() {
    }

    public DSDonHang(String ma, String ten, int sl, double tien) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.tien = tien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }
    
    
}
