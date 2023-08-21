/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import static BLL.BLLDoDung.loadTenDVT;
import DTO.DoDung;
import DTO.ThietBi;
import EXTENDED.Caution;
import EXTENDED.RenderLable;
import EXTENDED.Transform;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class BLLThietBi {
    


    public static ArrayList<ThietBi> GetAllThietBi() {
        ResultSet rs = DAL.DAL_ThietBi.GetAllThietbi();
        ArrayList<ThietBi> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                ThietBi dd = new ThietBi();
                dd.setMaThietBi(rs.getInt("MaThietBi"));
                dd.setTenThietBi(rs.getString("TenThietBi"));
                dd.setGiaNhap(rs.getDouble("GiaNhap"));
                dd.setSoLuong(rs.getInt("SoLuong"));
                dd.setDVT(rs.getInt("DonViTinh"));
                dd.setNgayTao(rs.getDate("NgayTao"));
                dd.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(dd);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public static void DoVaoTable(ArrayList<ThietBi> arr, JTable table) {
        String[] headerTable = {"STT", "Mã thiết bị", "Tên", "Giá nhập", "Số lượng", "DonViTinh", "Ngày tạo", "Hình ảnh"};
        DefaultTableModel tbModel = (DefaultTableModel) table.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (ThietBi dd : arr) {
            Object obj[] = new Object[8];
            obj[0] = table.getRowCount() + 1;
            obj[1] = dd.getMaThietBi();
            obj[2] = dd.getTenThietBi();
            obj[3] = Transform.SoString(dd.getGiaNhap());
            obj[4] = Transform.SoString(dd.getSoLuong());
            obj[5] = loadTenDVT(dd.getDVT());
            obj[6] = Transform.LayNgayStringMDung(dd.getNgayTao());
            obj[7] = dd.getHinhAnh();
            tbModel.addRow(obj);

//        }
        table.setModel(tbModel);
        table.getColumnModel().getColumn(7).setCellRenderer(new RenderLable());
        table.setRowHeight(50);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(0).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(3).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(5).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(6).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(7).setHeaderRenderer(centerRenderer);

        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);

    }
    }

    public static void ThemThietBi(ThietBi tb) {

        DAL.DAL_ThietBi.AddThietBi(tb);
        Caution.ThongBaoDonGian("Thông báo", "Thêm thành công");
    }

    public static void SuaThietBi(ThietBi tb, int ma) {

        DAL.DAL_ThietBi.UpdateThietBi(tb, ma);
        Caution.ThongBaoDonGian("Thông báo", "Sửa thành công");
    }

    public static void XoaThietBi(int ma) {
        DAL.DAL_ThietBi.DeleteThietBi(ma);

    }

    public static void thongbaosaphethang(JDialog jdl) {
        ArrayList<ThietBi> arrdd = BLL.BLLThietBi.GetAllThietBi();
        for (ThietBi dd : arrdd) {
            if (dd.getSoLuong() < 10) {
                jdl.setVisible(true);
            }
        }
    }

    public static ArrayList<ThietBi> TimKiemThietBi(String ten, String ma) {
        ResultSet rs = DAL.DAL_ThietBi.FindThietbibyMaorTen(ten, ma);
        ArrayList<ThietBi> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                ThietBi dd = new ThietBi();
                dd.setMaThietBi(rs.getInt("MaThietBi"));
                dd.setTenThietBi(rs.getString("TenThietBi"));
                dd.setGiaNhap(rs.getDouble("GiaNhap"));
                dd.setSoLuong(rs.getInt("SoLuong"));
                dd.setDVT(rs.getInt("DonViTinh"));
                dd.setNgayTao(rs.getDate("NgayTao"));
                dd.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(dd);
            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public static ArrayList<ThietBi> TimKiemThietBiBangMa(int ma) {
        ResultSet rs = DAL.DAL_ThietBi.FindThietbibyMa(ma);
        ArrayList<ThietBi> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                ThietBi dd = new ThietBi();
                dd.setMaThietBi(rs.getInt("MaThietBi"));
                dd.setTenThietBi(rs.getString("TenThietBi"));
                dd.setGiaNhap(rs.getDouble("GiaNhap"));
                dd.setSoLuong(rs.getInt("SoLuong"));
                dd.setDVT(rs.getInt("DonViTinh"));
                dd.setNgayTao(rs.getDate("NgayTao"));
                dd.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(dd);
            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public static void DoVaoTableThongbaohethang(ArrayList<DoDung> arr, JTable table) {
        String[] headerTable = {"STT", "Mã đồ dùng", "Tên", "Số lượng"};
        DefaultTableModel tbModel = (DefaultTableModel) table.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (DoDung dd : arr) {
            Object obj[] = new Object[4];
            obj[0] = table.getRowCount() + 1;
            obj[1] = dd.getMaDoDung();
            obj[2] = dd.getTenDoDung();
            obj[3] = Transform.SoString(dd.getSoLuong());
            tbModel.addRow(obj);
        }
    }

}
