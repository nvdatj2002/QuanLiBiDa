/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class ChiTietPhieuChi {

    int MaPhieuChi;
    String TenhangChi;
    int SoLuong;
    Double DonGia;
    int DonViTinh;

    public ChiTietPhieuChi() {
    }

    public ChiTietPhieuChi(int MaPhieuChi, String TenhangChi, int SoLuong, Double DonGia, int DonViTinh) {
        this.MaPhieuChi = MaPhieuChi;
        this.TenhangChi = TenhangChi;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.DonViTinh = DonViTinh;
    }


    public int getMaPhieuChi() {
        return MaPhieuChi;
    }

    public void setMaPhieuChi(int MaPhieuChi) {
        this.MaPhieuChi = MaPhieuChi;
    }

    public String getTenhangChi() {
        return TenhangChi;
    }

    public void setTenhangChi(String TenhangChi) {
        this.TenhangChi = TenhangChi;
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
