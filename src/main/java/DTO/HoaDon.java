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
public class HoaDon {
    int MaHoaDon;
    Date NgayVao;
    Date NgayRa;
    int MaNhanVien;
    int MaBan;
    Double GiaTienGio;
    int KhachHang;
    Double TongTien;
    boolean TinhTrang;
    int maKhuyenMai;

    public void setMaKhuyenMai(int maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public int getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaHoaDon(int MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public HoaDon(int MaHoaDon, Date NgayVao, Date NgayRa, int MaNhanVien, int MaBan, Double GiaTienGio, int KhachHang, Double TongTien, boolean TinhTrang,int khuyenMai) {
        this.MaHoaDon = MaHoaDon;
        this.NgayVao = NgayVao;
        this.NgayRa = NgayRa;
        this.MaNhanVien = MaNhanVien;
        this.MaBan = MaBan;
        this.GiaTienGio = GiaTienGio;
        this.KhachHang = KhachHang;
        this.TongTien = TongTien;
        this.TinhTrang = TinhTrang;
    }

    public HoaDon(Date NgayVao, Date NgayRa, int MaNhanVien, int MaBan, Double GiaTienGio, int KhachHang, Double TongTien, boolean TinhTrang) {
        this.NgayVao = NgayVao;
        this.NgayRa = NgayRa;
        this.MaNhanVien = MaNhanVien;
        this.MaBan = MaBan;
        this.GiaTienGio = GiaTienGio;
        this.KhachHang = KhachHang;
        this.TongTien = TongTien;
        this.TinhTrang = TinhTrang;
    }

    public HoaDon() {
    }

    public void setNgayVao(Date NgayVao) {
        this.NgayVao = NgayVao;
    }

    public void setNgayRa(Date NgayRa) {
        this.NgayRa = NgayRa;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public void setMaBan(int MaBan) {
        this.MaBan = MaBan;
    }

    public void setGiaTienGio(Double GiaTienGio) {
        this.GiaTienGio = GiaTienGio;
    }

    public void setKhachHang(int KhachHang) {
        this.KhachHang = KhachHang;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public Date getNgayVao() {
        return NgayVao;
    }

    public Date getNgayRa() {
        return NgayRa;
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public int getMaBan() {
        return MaBan;
    }

    public Double getGiaTienGio() {
        return GiaTienGio;
    }

    public int getKhachHang() {
        return KhachHang;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }
}
