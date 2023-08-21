/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class ChiTietPhieuNhap {

    int MaPhieuNhap;
    String TenhangNhap;
    int SoLuong;
    Double DonGia;
    int DonViTinh;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(int MaPhieuNhap, String TenhangNhap, int SoLuong, Double DonGia, int DonViTinh) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.TenhangNhap = TenhangNhap;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.DonViTinh = DonViTinh;
    }


    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public String getTenhangNhap() {
        return TenhangNhap;
    }

    public void setTenhangNhap(String TenhangNhap) {
        this.TenhangNhap = TenhangNhap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public int getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(int DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

}
