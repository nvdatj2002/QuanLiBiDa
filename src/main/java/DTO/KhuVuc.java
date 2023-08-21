/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class KhuVuc {
    int MaKhuVuc;
    String TenKhuvuc;

    public KhuVuc(int MaKhuVuc, String TenKhuvuc) {
        this.MaKhuVuc = MaKhuVuc;
        this.TenKhuvuc = TenKhuvuc;
    }

    public KhuVuc(String TenKhuvuc) {
        this.TenKhuvuc = TenKhuvuc;
    }

    public void setMaKhuVuc(int MaKhuVuc) {
        this.MaKhuVuc = MaKhuVuc;
    }

    public int getMaKhuVuc() {
        return MaKhuVuc;
    }

    public KhuVuc() {
    }

    public void setTenKhuvuc(String TenKhuvuc) {
        this.TenKhuvuc = TenKhuvuc;
    }

    public String getTenKhuvuc() {
        return TenKhuvuc;
    }
}
