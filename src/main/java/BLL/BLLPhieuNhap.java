/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import static BLL.BLLDoDung.loadTenDVT;
import DTO.ChiTietPhieuNhap;
import DTO.PhieuNhap;
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
public class BLLPhieuNhap {

    public static ArrayList<PhieuNhap> GetAllPN() {
        ResultSet rs = DAL.DAL_PhieuNhap.GetAllPhieuNhap();
        ArrayList<PhieuNhap> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                PhieuNhap dd = new PhieuNhap();
                dd.setMaPhieuNhap(rs.getInt("MaPhieuNhap"));
                dd.setTenPhieuNhap(rs.getString("TenPhieuNhap"));
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

    public static ArrayList<ChiTietPhieuNhap> GetAllCTPN() {
        ResultSet rs = DAL.DAL_PhieuNhap.GetAllCTPhieuNhap();
        ArrayList<ChiTietPhieuNhap> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                ChiTietPhieuNhap dd = new ChiTietPhieuNhap();
                dd.setMaPhieuNhap(rs.getInt("MaPhieuNhap"));
                dd.setTenhangNhap(rs.getString("TenHangNhap"));
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

    public static ArrayList<ChiTietPhieuNhap> GetAllCTPNbyMa(int ma) {
        ResultSet rs = DAL.DAL_PhieuNhap.GetCTPNbyMa(ma);
        ArrayList<ChiTietPhieuNhap> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                ChiTietPhieuNhap dd = new ChiTietPhieuNhap();
                dd.setMaPhieuNhap(rs.getInt("MaPhieuNhap"));
                dd.setTenhangNhap(rs.getString("TenHangNhap"));
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

    public void DoVaoTablePhieuNhap(ArrayList<PhieuNhap> arr, JTable table) {
        JButton btnThem = new JButton();
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/IMG/search.png"));
        btnThem.setIcon(imageIcon);
        btnThem.setOpaque(true);
        btnThem.setBackground(Color.white);
        btnThem.setFocusPainted(false);
        btnThem.setFocusable(false);
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);
        String[] headerTable = {"STT", "Mã phiếu nhập", "Tên phiếu nhập", "Ngày tạo", "Người tạo", "Tổng tiền", "Tình trạng", "Thêm"};
        DefaultTableModel tbModel = (DefaultTableModel) table.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (PhieuNhap dd : arr) {
            Object obj[] = new Object[8];
            obj[0] = table.getRowCount() + 1;
            obj[1] = dd.getMaPhieuNhap();
            obj[2] = dd.getTenPhieuNhap();
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

    public static void DoVaoTable(ArrayList<ChiTietPhieuNhap> arr, JTable table) {
        String[] headerTable = {"STT", "Tên hàng nhập", "Số lượng", "Đơn giá", "Đơn vị tính"};
        DefaultTableModel tbModel = (DefaultTableModel) table.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (ChiTietPhieuNhap dd : arr) {
            Object obj[] = new Object[5];
            obj[0] = table.getRowCount() + 1;
            obj[1] = dd.getTenhangNhap();
            obj[2] = Transform.SoString(dd.getSoLuong());
            obj[3] = Transform.SoString(dd.getDonGia());
            obj[4] = loadTenDVT(dd.getDonViTinh());
            tbModel.addRow(obj);
        }
    }

    public static void TaoPhieuNhap(PhieuNhap pn) {
        DAL.DAL_PhieuNhap.AddPhieuNhap(pn);
    }

    public static void UpdateTinhTranggPhieuNhap(double tongtien, boolean tinhtrang, int ma) {
        DAL.DAL_PhieuNhap.UpdatePhieuNhap(tongtien, tinhtrang, ma);
    }

    public static void ThemChiTietPhieuNhap(ChiTietPhieuNhap pn) {
        try {
            DAL.DAL_PhieuNhap.AddChiTietPhieuNhap(pn);
        } catch (Exception e) {
            Caution.ThongBaoDonGian("Thông báo", "Lỗi");
        }

    }

    public static int LayMaPhieuNhap() {
        ResultSet rs = DAL.DAL_PhieuNhap.GetMaPhieuNhap();
        try {
            if (rs.next()) {
                return rs.getInt("MaPhieuNhap");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static double LayTongTien(int ma) {
        ResultSet rs = DAL.DAL_PhieuNhap.TongTien(ma);
        try {
            if (rs.next()) {
                return rs.getDouble("tongtien");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int DemPhieuNhap(boolean ma) {
        ResultSet rs = DAL.DAL_PhieuNhap.DemPhieuNhap(ma);
        try {
            if (rs.next()) {
                return rs.getInt("tongphieu");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static boolean LayTinhTrangPhieuNhap() {
        ResultSet rs = DAL.DAL_PhieuNhap.GetTinhTrangPhieuNhap();
        try {
            if (rs.next()) {
                return rs.getBoolean("TinhTrang");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public static boolean LayTinhTrangPhieuNhapbyMa(int ma) {
        ResultSet rs = DAL.DAL_PhieuNhap.GetTinhTrangPhieuNhapbyMa(ma);
        try {
            if (rs.next()) {
                return rs.getBoolean("TinhTrang");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public static ArrayList<PhieuNhap> FindPhieuNhap(String ten, String ma) {
        ResultSet rs = DAL.DAL_PhieuNhap.FindPhieuNhapbyMaorten(ten, ma);
        ArrayList<PhieuNhap> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                PhieuNhap dd = new PhieuNhap();
                dd.setMaPhieuNhap(rs.getInt("MaPhieuNhap"));
                dd.setTenPhieuNhap(rs.getString("TenPhieuNhap"));
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

    public static ArrayList<PhieuNhap> FindPhieuNhapByMa(int ma) {
        ResultSet rs = DAL.DAL_PhieuNhap.FindPhieuNhapbyMa(ma);
        ArrayList<PhieuNhap> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                PhieuNhap dd = new PhieuNhap();
                dd.setMaPhieuNhap(rs.getInt("MaPhieuNhap"));
                dd.setTenPhieuNhap(rs.getString("TenPhieuNhap"));
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
