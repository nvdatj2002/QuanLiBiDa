/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.DoDung;
import DTO.LoaiDoDung;
import EXTENDED.Caution;
import EXTENDED.MyComboBox;
import EXTENDED.RenderLable;
import EXTENDED.Transform;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class BLLDoDung {

    public static ArrayList<DoDung> GetAllDoDung() {
        ResultSet rs = DAL.DAL_DoDung.GetAllDataDoDung();
        ArrayList<DoDung> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                DoDung dd = new DoDung();
                dd.setMaDoDung(rs.getInt("MaDoDung"));
                dd.setTenDoDung(rs.getString("TenDoDung"));
                dd.setLoaiDoDung(rs.getInt("LoaiDoDung"));
                dd.setGiaNhap(rs.getDouble("GiaNhap"));
                dd.setGiaBan(rs.getDouble("GiaBan"));
                dd.setSoLuong(rs.getInt("SoLuong"));
                dd.setDonViTinh(rs.getInt("DonViTinh"));
                dd.setNgayTao(rs.getDate("NgayTao"));
                dd.setTinhTrang(rs.getBoolean("TinhTrang"));
                dd.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(dd);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public static ArrayList<LoaiDoDung> GetAllLoaiDoDung() {
        ResultSet rs = DAL.DAL_DoDung.GetAllDataLoaiDoDung();
        ArrayList<LoaiDoDung> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                LoaiDoDung ldd = new LoaiDoDung();
                ldd.setLoaiDoDung(rs.getInt("MaLoaiDoDung"));
                ldd.setTenLoaiDoDung(rs.getString("TenLoaiDoDung"));
                arr.add(ldd);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr; //trả về ds loại sản phẩm
    }

    public static String loadTenDoDung(int maDoDung) {
        ResultSet rs = DAL.DAL_DoDung.GetNameById(maDoDung);
        try {
            if (rs.next()) {
                return rs.getString("TenDoDung");
            }
        } catch (SQLException ex) {

        }
        return null;
    }

    public static int loadMaBangTen(String tenDoDung) {
        ResultSet rs = DAL.DAL_DoDung.GetIdByName(tenDoDung);
        try {
            if (rs.next()) {
                return rs.getInt("MaDoDung");
            }
        } catch (SQLException ex) {

        }
        return 0;
    }

    public static String loadTenLSP(int maDoDung) {
        ResultSet rs = DAL.DAL_DoDung.GetAllDataLoaiDoDungbyMa(maDoDung);
        try {
            if (rs.next()) {
                return rs.getString("TenLoaiDoDung");
            }
        } catch (SQLException ex) {

        }
        return null;
    }

    public static String loadHinhAnh(String ten) {
        ResultSet rs = DAL.DAL_DoDung.TimHinhAnh(ten);
        try {
            if (rs.next()) {
                return rs.getString("HinhAnh");
            }
        } catch (SQLException ex) {

        }
        return null;
    }

    public static String loadTenDVT(int MaLoaDVT) {
        ResultSet rs = DAL.DAL_DoDung.GetAllDataDVTbyMa(MaLoaDVT);
        try {
            if (rs.next()) {
                return rs.getString("Ten");
            }
        } catch (SQLException ex) {

        }
        return null;
    }

    public static void DoVaoTable(ArrayList<DoDung> arr, JTable table) {
        String[] headerTable = {"STT", "Mã đồ dùng", "Tên", "Loại", "Giá nhập", "Giá bán", "Số lượng", "Đơn vị tính", "Ngày tạo", "Tình trạng", "Hình ảnh",};
        DefaultTableModel tbModel = (DefaultTableModel) table.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (DoDung dd : arr) {
            Object obj[] = new Object[11];
            obj[0] = table.getRowCount() + 1;
            obj[1] = dd.getMaDoDung();
            obj[2] = dd.getTenDoDung();
            obj[3] = loadTenLSP(dd.getLoaiDoDung());
            obj[4] = Transform.SoString(dd.getGiaNhap());
            obj[5] = Transform.SoString(dd.getGiaBan());
            obj[6] = Transform.SoString(dd.getSoLuong());
            obj[7] = loadTenDVT(dd.getDonViTinh());
            obj[8] = Transform.LayNgayStringMDung(dd.getNgayTao());
            obj[9] = dd.isTinhTrang() ? "Còn bán" : "Không bán";
            obj[10] = dd.getHinhAnh();
            tbModel.addRow(obj);

        }
        table.setModel(tbModel);
        table.getColumnModel().getColumn(10).setCellRenderer(new RenderLable());
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
        table.getColumnModel().getColumn(8).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(9).setHeaderRenderer(centerRenderer);

        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);

    }

    public static void ThemDoDung(DoDung dd) {

        DAL.DAL_DoDung.AddDoDung(dd);
        Caution.ThongBaoDonGian("Thông báo", "Thêm thành công");
    }

    public static void SuaDoDung(DoDung dd, int ma) {

        DAL.DAL_DoDung.Update(dd, ma);
        Caution.ThongBaoDonGian("Thông báo", "Sửa thành công");
    }

    public static ArrayList<DoDung> FindByLoaiDoDung(int ldd) {
        ResultSet rs = DAL.DAL_DoDung.FindByMaLSP(ldd);
        ArrayList<DoDung> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                DoDung dd = new DoDung();
                dd.setMaDoDung(rs.getInt("MaDoDung"));
                dd.setTenDoDung(rs.getString("TenDoDung"));
                dd.setLoaiDoDung(rs.getInt("LoaiDoDung"));
                dd.setGiaNhap(rs.getDouble("GiaNhap"));
                dd.setGiaBan(rs.getDouble("GiaBan"));
                dd.setSoLuong(rs.getInt("SoLuong"));
                dd.setDonViTinh(rs.getInt("DonViTinh"));
                dd.setNgayTao(rs.getDate("NgayTao"));
                dd.setTinhTrang(rs.getBoolean("TinhTrang"));
                dd.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(dd);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public static ArrayList<DoDung> FindbyTenDoDung(String ldd) {
        ResultSet rs = DAL.DAL_DoDung.FindByName(ldd);
        ArrayList<DoDung> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                DoDung dd = new DoDung();
                dd.setMaDoDung(rs.getInt("MaDoDung"));
                dd.setTenDoDung(rs.getString("TenDoDung"));
                dd.setLoaiDoDung(rs.getInt("LoaiDoDung"));
                dd.setGiaNhap(rs.getDouble("GiaNhap"));
                dd.setGiaBan(rs.getDouble("GiaBan"));
                dd.setSoLuong(rs.getInt("SoLuong"));
                dd.setDonViTinh(rs.getInt("DonViTinh"));
                dd.setNgayTao(rs.getDate("NgayTao"));
                dd.setHinhAnh(rs.getBytes("HinhAnh"));
                dd.setTinhTrang(rs.getBoolean("TinhTrang"));
                arr.add(dd);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public static ArrayList<DoDung> FindbyMaDoDung(int ldd) {
        ResultSet rs = DAL.DAL_DoDung.FindByMa(ldd);
        ArrayList<DoDung> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                DoDung dd = new DoDung();
                dd.setMaDoDung(rs.getInt("MaDoDung"));
                dd.setTenDoDung(rs.getString("TenDoDung"));
                dd.setLoaiDoDung(rs.getInt("LoaiDoDung"));
                dd.setGiaNhap(rs.getDouble("GiaNhap"));
                dd.setGiaBan(rs.getDouble("GiaBan"));
                dd.setSoLuong(rs.getInt("SoLuong"));
                dd.setDonViTinh(rs.getInt("DonViTinh"));
                dd.setNgayTao(rs.getDate("NgayTao"));
                dd.setHinhAnh(rs.getBytes("HinhAnh"));
                dd.setTinhTrang(rs.getBoolean("TinhTrang"));
                arr.add(dd);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public static void XoaDoDung(int ma, boolean status) {
        DAL.DAL_DoDung.DeletebyMa(ma, status);
    }

    public static void UpdateTinhTrang(DoDung dd, String Ten) {
        DAL.DAL_DoDung.UpdateTinhTrang(dd, Ten);
    }

    public static void thongbaosaphethang(JDialog jdl) {
        ArrayList<DoDung> arrdd = BLL.BLLDoDung.GetAllDoDung();
        for (DoDung dd : arrdd) {
            if (dd.getSoLuong() < 10) {
                jdl.setVisible(true);
            }
        }
    }

    public static ArrayList<DoDung> FindbySoLuong() {
        ResultSet rs = DAL.DAL_DoDung.FindBySoLuong();
        ArrayList<DoDung> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                DoDung dd = new DoDung();
                dd.setMaDoDung(rs.getInt("MaDoDung"));
                dd.setTenDoDung(rs.getString("TenDoDung"));
                dd.setSoLuong(rs.getInt("SoLuong"));
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

    public static void DoVaoCBLoaiDoDung(ArrayList<LoaiDoDung> arr, JComboBox cb) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.removeAllElements();//xóa dữ liệu trên cbbox
        for (LoaiDoDung ldd : arr) {
            Object text = ldd.getTenLoaiDoDung();
            Object value = ldd.getLoaiDoDung();
            MyComboBox myCBB = new MyComboBox(value, text);
            model.addElement(myCBB);
            cb.setModel(model);
        }
        cb.repaint();
    }

}
