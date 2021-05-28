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
public class DonHang {
    private String madh;
    private String tendh;
    private int soluong;
    private double tien;
    private String ngaymua;

    public DonHang() {
    }

    public DonHang(String madh, String tendh, int soluong, double tien, String ngaymua) {
        this.madh = madh;
        this.tendh = tendh;
        this.soluong = soluong;
        this.tien = tien;
        this.ngaymua = ngaymua;
    }

    public String getMadh() {
        return madh;
    }

    public String getTendh() {
        return tendh;
    }

    public int getSoluong() {
        return soluong;
    }

    public double getTien() {
        return tien;
    }
  

    public String getNgaymua() {
        return ngaymua;
    }

    public void setMadh(String madh) {
        this.madh = madh;
    }

    public void setTendh(String tendh) {
        this.tendh = tendh;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }


    public void setNgaymua(String ngaymua) {
        this.ngaymua = ngaymua;
    }
    
}
