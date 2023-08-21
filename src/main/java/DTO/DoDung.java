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
public class DoDung {

    int MaDoDung;
    String TenDoDung;
    int LoaiDoDung;
    Double GiaNhap;
    Double GiaBan;
    int SoLuong;
    int DonViTinh;
    Date NgayTao;
    boolean TinhTrang;
    byte[] HinhAnh;



    
    public DoDung(int MaDoDung, String TenDoDung, int LoaiDoDung, Double GiaNhap, Double GiaBan, int SoLuong, int DonViTinh, Date NgayTao, boolean TinhTrang, byte[] HinhAnh) {
        this.MaDoDung = MaDoDung;
        this.TenDoDung = TenDoDung;
        this.LoaiDoDung = LoaiDoDung;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.SoLuong = SoLuong;
        this.DonViTinh = DonViTinh;
        this.NgayTao = NgayTao;
        this.TinhTrang = TinhTrang;
        this.HinhAnh = HinhAnh;
    }

    public DoDung() {
    }

    public DoDung(String TenDoDung, int LoaiDoDung, Double GiaNhap, Double GiaBan, int SoLuong, int DonViTinh, boolean TinhTrang, byte[] HinhAnh) {
        this.TenDoDung = TenDoDung;
        this.LoaiDoDung = LoaiDoDung;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.SoLuong = SoLuong;
        this.DonViTinh = DonViTinh;
        this.TinhTrang = TinhTrang;
        this.HinhAnh = HinhAnh;
    }

    public byte[] getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(byte[] HinhAnh) {
        this.HinhAnh = HinhAnh;
    }







    public void setMaDoDung(int MaDoDung) {
        this.MaDoDung = MaDoDung;
    }

    public int getMaDoDung() {
        return MaDoDung;
    }



    public void setTenDoDung(String TenDoDung) {
        this.TenDoDung = TenDoDung;
    }

    public void setLoaiDoDung(int LoaiDoDung) {
        this.LoaiDoDung = LoaiDoDung;
    }

    public void setGiaNhap(Double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public void setGiaBan(Double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setDonViTinh(int DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getTenDoDung() {
        return TenDoDung;
    }

    public int getLoaiDoDung() {
        return LoaiDoDung;
    }

    public Double getGiaNhap() {
        return GiaNhap;
    }

    public Double getGiaBan() {
        return GiaBan;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public int getDonViTinh() {
        return DonViTinh;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }
}
