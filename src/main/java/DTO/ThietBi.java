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
public class ThietBi {

    int MaThietBi;
    String TenThietBi;
    Double GiaNhap;
    int SoLuong;
    int DVT;
    Date NgayTao;
    byte[] HinhAnh;

    public void setDVT(int DVT) {
        this.DVT = DVT;
    }

    public int getDVT() {
        return DVT;
    }
    
    public ThietBi() {
    }

    public ThietBi(int MaThietBi, String TenThietBi, Double GiaNhap, int SoLuong,int DVT, Date NgayTao, byte[] HinhAnh) {
        this.MaThietBi = MaThietBi;
        this.TenThietBi = TenThietBi;
        this.GiaNhap = GiaNhap;
        this.SoLuong = SoLuong;
        this.DVT=DVT;
        this.NgayTao = NgayTao;
        this.HinhAnh = HinhAnh;
    }

    public ThietBi(String Ten, Double gianhap, int soluong,int DVT, byte[] img) {
        this.TenThietBi = Ten;
        this.GiaNhap = gianhap;
        this.SoLuong = soluong;
        this.DVT=DVT;
        this.HinhAnh = img;
    }

    public int getMaThietBi() {
        return MaThietBi;
    }

    public String getTenThietBi() {
        return TenThietBi;
    }

    public Double getGiaNhap() {
        return GiaNhap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public byte[] getHinhAnh() {
        return HinhAnh;
    }

    public void setMaThietBi(int MaThietBi) {
        this.MaThietBi = MaThietBi;
    }

    public void setTenThietBi(String TenThietBi) {
        this.TenThietBi = TenThietBi;
    }

    public void setGiaNhap(Double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public void setHinhAnh(byte[] HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

}
