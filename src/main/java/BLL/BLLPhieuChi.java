/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import static BLL.BLLDoDung.loadTenDVT;
import DTO.ChiTietPhieuChi;
import DTO.PhieuChi;
import EXTENDED.Caution;
import EXTENDED.Render;
import EXTENDED.Transform;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell 7559
 */
public class BLLPhieuChi {

    public static ArrayList<PhieuChi> GetAllPC() {
        ResultSet rs = DAL.DAL_PhieuChi.GetAllPhieuChi();
        ArrayList<PhieuChi> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                PhieuChi dd = new PhieuChi();
                dd.setMaPhieuChi(rs.getInt("MaPhieuChi"));
                dd.setTenPhieuChi(rs.getString("TenPhieuChi"));
                dd.setNgayTao(rs.getDate("NgayTao"));
                dd.setNguoiTao(rs.getInt("Nguoitao"));
                dd.setTongTien(rs.getDouble("TongTien"));
                dd.setTinhTrang(rs.getBoolean("tinhTrang"));
                arr.add(dd);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public static ArrayList<ChiTietPhieuChi> GetAllCTPC() {
        ResultSet rs = DAL.DAL_PhieuChi.GetAllCTPhieuChi();
        ArrayList<ChiTietPhieuChi> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                ChiTietPhieuChi dd = new ChiTietPhieuChi();
                dd.setMaPhieuChi(rs.getInt("MaPhieuChi"));
                dd.setTenhangChi(rs.getString("TenHangChi"));
                dd.setSoLuong(rs.getInt("SoLuong"));
                dd.setDonGia(rs.getDouble("DonGia"));
                dd.setDonViTinh(rs.getInt("DonViTinh"));
                arr.add(dd);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public static ArrayList<ChiTietPhieuChi> GetAllCTPCbyMa(int ma) {
        ResultSet rs = DAL.DAL_PhieuChi.GetCTPNbyMa(ma);
        ArrayList<ChiTietPhieuChi> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                ChiTietPhieuChi dd = new ChiTietPhieuChi();
                dd.setMaPhieuChi(rs.getInt("MaPhieuChi"));
                dd.setTenhangChi(rs.getString("TenHangChi"));
                dd.setSoLuong(rs.getInt("SoLuong"));
                dd.setDonGia(rs.getDouble("DonGia"));
                dd.setDonViTinh(rs.getInt("DonViTinh"));
                arr.add(dd);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public void DoVaoTablePhieuChi(ArrayList<PhieuChi> arr, JTable table) {
        JButton btnThem = new JButton();
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/IMG/search.png"));
        btnThem.setIcon(imageIcon);
        btnThem.setOpaque(true);
        btnThem.setBackground(Color.white);
        btnThem.setFocusPainted(false);
        btnThem.setFocusable(false);
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);
        String[] headerTable = {"STT", "Mã phiếu chi", "Tên phiếu chi", "Ngày tạo", "Người tạo", "Tổng tiền", "Tình trạng", "Thêm"};
        DefaultTableModel tbModel = (DefaultTableModel) table.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (PhieuChi dd : arr) {
            Object obj[] = new Object[8];
            obj[0] = table.getRowCount() + 1;
            obj[1] = dd.getMaPhieuChi();
            obj[2] = dd.getTenPhieuChi();
            obj[3] = Transform.LayNgayStringMDung(dd.getNgayTao());
            obj[4] = BLLNhanVien.getTenNV(dd.getNguoiTao());
            obj[5] = Transform.SoString(dd.getTongTien());
            obj[6] = dd.isTinhTrang();
            obj[7] = btnThem;
            tbModel.addRow(obj);
            table.setModel(tbModel);
            table.getColumnModel().getColumn(7).setCellRenderer(new Render());
            table.setRowHeight(30);
            table.setShowGrid(false);
        }
    }

    public static void DoVaoTable(ArrayList<ChiTietPhieuChi> arr, JTable table) {
        String[] headerTable = {"STT", "Tên hàng chi", "Số lượng", "Đơn giá", "Đơn vị tính"};
        DefaultTableModel tbModel = (DefaultTableModel) table.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (ChiTietPhieuChi dd : arr) {
            Object obj[] = new Object[5];
            obj[0] = table.getRowCount() + 1;
            obj[1] = dd.getTenhangChi();
            obj[2] = Transform.SoString(dd.getSoLuong());
            obj[3] = Transform.SoString(dd.getDonGia());
            obj[4] = loadTenDVT(dd.getDonViTinh());
            tbModel.addRow(obj);
        }
    }

    public static void TaoPhieuChi(PhieuChi pn) {
        DAL.DAL_PhieuChi.AddPhieuChi(pn);
    }

    public static void UpdateTinhTranggPhieuChi(double tongtien, boolean tinhtrang, int ma) {
        DAL.DAL_PhieuChi.UpdatePhieuChi(tongtien, tinhtrang, ma);
    }

    public static void ThemChiTietPhieuChi(ChiTietPhieuChi pn) {
        try {
            DAL.DAL_PhieuChi.AddChiTietPhieuChi(pn);
        } catch (Exception e) {
            Caution.ThongBaoDonGian("Thông báo", "Lỗi");
        }

    }

    public static int LayMaPhieuChi() {
        ResultSet rs = DAL.DAL_PhieuChi.GetMaPhieuChi();
        try {
            if (rs.next()) {
                return rs.getInt("MaPhieuChi");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static double LayTongTien(int ma) {
        ResultSet rs = DAL.DAL_PhieuChi.TongTien(ma);
        try {
            if (rs.next()) {
                return rs.getDouble("tongtien");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int DemPhieuChi(boolean ma) {
        ResultSet rs = DAL.DAL_PhieuChi.DemPhieuChi(ma);
        try {
            if (rs.next()) {
                return rs.getInt("tongphieu");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static boolean LayTinhTrangPhieuChi() {
        ResultSet rs = DAL.DAL_PhieuChi.GetTinhTrangPhieuChi();
        try {
            if (rs.next()) {
                return rs.getBoolean("TinhTrang");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public static boolean LayTinhTrangPhieuChibyMa(int ma) {
        ResultSet rs = DAL.DAL_PhieuChi.GetTinhTrangPhieuChibyMa(ma);
        try {
            if (rs.next()) {
                return rs.getBoolean("TinhTrang");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public static ArrayList<PhieuChi> FindPhieuChi(String ten, String ma) {
        ResultSet rs = DAL.DAL_PhieuChi.FindPhieuChibyMaorten(ten, ma);
        ArrayList<PhieuChi> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                PhieuChi dd = new PhieuChi();
                dd.setMaPhieuChi(rs.getInt("MaPhieuChi"));
                dd.setTenPhieuChi(rs.getString("TenPhieuChi"));
                dd.setNgayTao(rs.getDate("NgayTao"));
                dd.setNguoiTao(rs.getInt("Nguoitao"));
                dd.setTongTien(rs.getDouble("TongTien"));
                arr.add(dd);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public static ArrayList<PhieuChi> FindPhieuChiByMa(int ma) {
        ResultSet rs = DAL.DAL_PhieuChi.FindPhieuChibyMa(ma);
        ArrayList<PhieuChi> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                PhieuChi dd = new PhieuChi();
                dd.setMaPhieuChi(rs.getInt("MaPhieuChi"));
                dd.setTenPhieuChi(rs.getString("TenPhieuChi"));
                dd.setNgayTao(rs.getDate("NgayTao"));
                dd.setNguoiTao(rs.getInt("Nguoitao"));
                dd.setTongTien(rs.getDouble("TongTien"));
                arr.add(dd);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

}
