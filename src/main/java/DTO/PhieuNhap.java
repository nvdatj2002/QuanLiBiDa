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
public class PhieuNhap {

    int MaPhieuNhap;
    String TenPhieuNhap;
    Date NgayTao;
    int NguoiTao;
    Double TongTien;
    boolean TinhTrang;

    public PhieuNhap() {
    }

    public PhieuNhap(String TenPhieuNhap, Date NgayTao, int NguoiTao, Double TongTien, boolean TinhTrang) {
        this.TenPhieuNhap = TenPhieuNhap;
        this.NgayTao = NgayTao;
        this.NguoiTao = NguoiTao;
        this.TongTien = TongTien;
        this.TinhTrang = TinhTrang;
    }

    public PhieuNhap(int MaPhieuNhap, String TenPhieuNhap, Date NgayTao, int NguoiTao, Double TongTien, boolean TinhTrang) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.TenPhieuNhap = TenPhieuNhap;
        this.NgayTao = NgayTao;
        this.NguoiTao = NguoiTao;
        this.TongTien = TongTien;
        this.TinhTrang = TinhTrang;
    }

    public PhieuNhap(String tenpn, int nguoitao, double tongtien) {
        this.TenPhieuNhap = tenpn;
        this.NguoiTao = nguoitao;
        this.TongTien = tongtien;
    }

    public PhieuNhap(boolean b) {
        this.TinhTrang = b;
    }

    public PhieuNhap(String tenpn, int nguoitao, double tongtien, boolean tinhtrang) {
        this.TenPhieuNhap = tenpn;
        this.NguoiTao = nguoitao;
        this.TongTien = tongtien;
        this.TinhTrang = tinhtrang;
    }

    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public String getTenPhieuNhap() {
        return TenPhieuNhap;
    }

    public void setTenPhieuNhap(String TenPhieuNhap) {
        this.TenPhieuNhap = TenPhieuNhap;
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
