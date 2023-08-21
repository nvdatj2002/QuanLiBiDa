/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.HoaDon;
import EXTENDED.sqlConnect;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author dell 7559
 */
public class DALHoaDon {

    public static ResultSet getDataByTinhTrangfalse() {
        String sql = "select count(*) from HoaDon where TinhTrang = 0 and format(NgayRa,'dd-MM-yyyy')=format(GETDATE(),'dd-MM-yyyy')";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet getDataByTinhTrangtrue() {
        String sql = "select count(*) from HoaDon where TinhTrang = 1 and format(NgayVao,'dd-MM-yyyy')=format(GETDATE(),'dd-MM-yyyy')";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet getdoanhthu(int ngay) {
        String sql = "select sum(tongtien) from hoadon where dateadd(day,0,format(Ngayra,'yyyy-MM-dd'))=dateadd(day,?,format(GETDATE(),'yyyy-MM-dd'))";
        return sqlConnect.executeQuery(sql, ngay);
    }

    public static ResultSet getDataByTinhTrang(int maBan) {
        String sql = "select * from HoaDon where TinhTrang = 1 and MaBan = ?";
        return sqlConnect.executeQuery(sql, maBan);
    }

    public static ResultSet getDataByMa(int maHoaDon) {
        String sql = "select * from HoaDon where MaHoaDon = ?";
        return sqlConnect.executeQuery(sql, maHoaDon);
    }

    public static ResultSet GetHistory(int maban) {
        String sql = "SELECT MaHoaDon as 'MaHoaDon',FORMAT(HoaDon.NgayVao , 'dd/MM/yyyy HH:mm:ss') as 'NgayVao',FORMAT(HoaDon.NgayRa , 'dd/MM/yyyy HH:mm:ss') as 'NgayRa',TongTien as 'TongTien' FROM HoaDon WHERE Maban = ? AND TinhTrang = 0";
        return sqlConnect.executeQuery(sql, maban);
    }

    public static ResultSet GetHistoryHDByDay() {
        String sql = "select MaHoaDon,Format(NgayVao,'dd/MM/yyyy HH:mm:ss') as 'NgayVao',Format(NgayRa,'dd/MM/yyyy HH:mm:ss') as 'NgayRa',MaNhanVien, TenBan,LoaiBan,KhuVuc,TongTien from HoaDon inner join Ban on HoaDon.MaBan = Ban.MaBan where Day(HoaDon.NgayVao) = Day(GETDATE()) and Month(HoaDon.NgayVao) = Month(GETDATE()) and Year(HoaDon.NgayVao) = Year(GETDATE()) and HoaDon.TinhTrang = 0";
        return sqlConnect.executeQuery(sql);
    }
    public static ResultSet GetHistoryHDByMonth() {
        String sql = "select MaHoaDon,Format(NgayVao,'dd/MM/yyyy HH:mm:ss') as 'NgayVao',Format(NgayRa,'dd/MM/yyyy HH:mm:ss') as 'NgayRa',MaNhanVien, TenBan,LoaiBan,KhuVuc,TongTien from HoaDon inner join Ban on HoaDon.MaBan = Ban.MaBan where Month(HoaDon.NgayVao) = Month(GETDATE()) and Year(HoaDon.NgayVao) = Year(GETDATE()) and HoaDon.TinhTrang = 0";
        return sqlConnect.executeQuery(sql);
    }
    public static ResultSet GetHistoryHDByYear() {
        String sql = "select MaHoaDon,Format(NgayVao,'dd/MM/yyyy HH:mm:ss') as 'NgayVao',Format(NgayRa,'dd/MM/yyyy HH:mm:ss') as 'NgayRa',MaNhanVien, TenBan,LoaiBan,KhuVuc,TongTien from HoaDon inner join Ban on HoaDon.MaBan = Ban.MaBan where Year(HoaDon.NgayVao) = Year(GETDATE()) and HoaDon.TinhTrang = 0";
        return sqlConnect.executeQuery(sql);
    }
//    public static ResultSet GetHoaDonBySo(String soHoaDon) {
//        
//        
//    }
//
//    public static ResultSet CountSoHoaDon(String soHoaDon) {
//    }

    public static void insert(HoaDon hd) {
        String sql = "INSERT INTO [dbo].[HoaDon]([NgayVao],[MaNhanVien],[MaBan],[GiaTienGio],[TinhTrang])VALUES(?,?,?,?,?)";
        sqlConnect.executeUpdate(sql, hd.getNgayVao(), hd.getMaNhanVien(), hd.getMaBan(), hd.getGiaTienGio(), 1);
    }

    public static void thanhToan(Date ngayRa, double tongTien, boolean tinhTrang, int MaHoaDon, Object maKhuyenMai) {
        String sql = "UPDATE [dbo].[HoaDon] SET [NgayRa] = ?,[TongTien] = ?,[TinhTrang] = ?, [KhuyenMai] = ? WHERE [MaHoaDon] = ?";
        sqlConnect.executeUpdate(sql, ngayRa, tongTien, tinhTrang, maKhuyenMai, MaHoaDon);
    }

    public static ResultSet loadNgayVao(int maHoaDon) {
        String sql = "select Format(NgayVao, 'dd-MM-yyyy HH:mm:ss') as NgayVao from HoaDon where MaHoaDon = ?";
        return sqlConnect.executeQuery(sql, maHoaDon);
    }

    // chuyen ban
    public static void chuyenBan(int maHoaDon, int maBan) {
        String sql = "update HoaDon set MaBan = ? where MaHoaDon = ?";
        sqlConnect.executeUpdate(sql, maBan, maHoaDon);
    }

}
