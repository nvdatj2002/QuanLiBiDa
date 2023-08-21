/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class Ban {
    int MaBan;
    String TenBan;
    int LoaiBan;
    int KhuVuc;
    String TinhTrang;

    public Ban(int MaBan, String TenBan, int LoaiBan, int KhuVuc, String TinhTrang) {
        this.MaBan = MaBan;
        this.TenBan = TenBan;
        this.LoaiBan = LoaiBan;
        this.KhuVuc = KhuVuc;
        this.TinhTrang = TinhTrang;
    }

    public Ban(String TenBan, int LoaiBan, int KhuVuc) {
        this.TenBan = TenBan;
        this.LoaiBan = LoaiBan;
        this.KhuVuc = KhuVuc;
    }
    
    

    public void setMaBan(int MaBan) {
        this.MaBan = MaBan;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public int getMaBan() {
        return MaBan;
    }

    public Ban(String TenBan, int LoaiBan, int KhuVuc, String TinhTrang) {
        this.TenBan = TenBan;
        this.LoaiBan = LoaiBan;
        this.KhuVuc = KhuVuc;
        this.TinhTrang = TinhTrang;
    }
    

    public Ban() {
    }

    
    public String getTenBan() {
        return TenBan;
    }

    public int getLoaiBan() {
        return LoaiBan;
    }

    public int getKhuVuc() {
        return KhuVuc;
    }



    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTenBan(String TenBan) {
        this.TenBan = TenBan;
    }

    public void setLoaiBan(int LoaiBan) {
        this.LoaiBan = LoaiBan;
    }

    public void setKhuVuc(int KhuVuc) {
        this.KhuVuc = KhuVuc;
    }


    
}
