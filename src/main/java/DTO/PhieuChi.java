/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class PhieuChi {

    int MaPhieuChi;
    String TenPhieuChi;
    Date NgayTao;
    int NguoiTao;
    Double TongTien;
    boolean TinhTrang;

    public PhieuChi() {
    }

    public PhieuChi(String TenPhieuChi, Date NgayTao, int NguoiTao, Double TongTien, boolean TinhTrang) {
        this.TenPhieuChi = TenPhieuChi;
        this.NgayTao = NgayTao;
        this.NguoiTao = NguoiTao;
        this.TongTien = TongTien;
        this.TinhTrang = TinhTrang;
    }

    public PhieuChi(int MaPhieuChi, String TenPhieuChi, Date NgayTao, int NguoiTao, Double TongTien, boolean TinhTrang) {
        this.MaPhieuChi = MaPhieuChi;
        this.TenPhieuChi = TenPhieuChi;
        this.NgayTao = NgayTao;
        this.NguoiTao = NguoiTao;
        this.TongTien = TongTien;
        this.TinhTrang = TinhTrang;
    }

    public PhieuChi(String tenpn, int nguoitao, double tongtien) {
        this.TenPhieuChi = tenpn;
        this.NguoiTao = nguoitao;
        this.TongTien = tongtien;
    }

    public PhieuChi(boolean b) {
        this.TinhTrang = b;
    }

    public PhieuChi(String tenpn, int nguoitao, double tongtien, boolean tinhtrang) {
        this.TenPhieuChi = tenpn;
        this.NguoiTao = nguoitao;
        this.TongTien = tongtien;
        this.TinhTrang = tinhtrang;
    }

    public int getMaPhieuChi() {
        return MaPhieuChi;
    }

    public void setMaPhieuChi(int MaPhieuChi) {
        this.MaPhieuChi = MaPhieuChi;
    }

    public String getTenPhieuChi() {
        return TenPhieuChi;
    }

    public void setTenPhieuChi(String TenPhieuChi) {
        this.TenPhieuChi = TenPhieuChi;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public int getNguoiTao() {
        return NguoiTao;
    }

    public void setNguoiTao(int NguoiTao) {
        this.NguoiTao = NguoiTao;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

}
