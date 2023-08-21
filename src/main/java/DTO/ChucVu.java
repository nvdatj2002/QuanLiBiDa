/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class ChucVu {
    int MaChucVu;
    String TenChucVu;

    public ChucVu(int MaChucVu, String TenChucVu) {
        this.MaChucVu = MaChucVu;
        this.TenChucVu = TenChucVu;
    }

    public void setMaChucVu(int MaChucVu) {
        this.MaChucVu = MaChucVu;
    }

    public int getMaChucVu() {
        return MaChucVu;
    }

    public ChucVu() {
    }

    public ChucVu(String TenChucVu) {
        this.TenChucVu = TenChucVu;
    }

    public void setTenChucVu(String TenChucVu) {
        this.TenChucVu = TenChucVu;
    }

    public String getTenChucVu() {
        return TenChucVu;
    }
}
