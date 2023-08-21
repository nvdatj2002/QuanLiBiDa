/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class KhuyenMai {
    int MaKhuyenMai;
    String TenKhuyenMai;
    int GiaTri;
    boolean TinhTrang;

    public KhuyenMai(String TenKhuyenMai, int GiaTri, boolean TinhTrang) {
        this.TenKhuyenMai = TenKhuyenMai;
        this.GiaTri = GiaTri;
        this.TinhTrang = TinhTrang;
    }

    public KhuyenMai() {
    }

    public KhuyenMai(int MaKhuyenMai, String TenKhuyenMai, int GiaTri, boolean TinhTrang) {
        this.MaKhuyenMai = MaKhuyenMai;
        this.TenKhuyenMai = TenKhuyenMai;
        this.GiaTri = GiaTri;
        this.TinhTrang = TinhTrang;
    }

    public int getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(int MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return TenKhuyenMai;
    }

    public void setTenKhuyenMai(String TenKhuyenMai) {
        this.TenKhuyenMai = TenKhuyenMai;
    }

    public int getGiaTri() {
        return GiaTri;
    }

    public void setGiaTri(int GiaTri) {
        this.GiaTri = GiaTri;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
}
