/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_NhanVien;
import DTO.NhanVien;
import EXTENDED.Caution;
import EXTENDED.Render;
import EXTENDED.RenderLable;
import EXTENDED.Transform;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class BLLNhanVien {

    public static ArrayList<NhanVien> GetAllNhanVien() {
        ResultSet rs = DAL.DAL_NhanVien.GetAllData();
        ArrayList<NhanVien> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getInt("MaNhanVien"));
                nv.setTenNhanvien(rs.getString("TenNhanVien"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setNgayVaoLam(rs.getDate("NgayVaoLam"));
                nv.setChucVu(rs.getInt("ChucVu"));
                nv.setSoDienThoai(rs.getString("SoDienThoai"));
                nv.setEmail(rs.getString("Email"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setGioiTinh(rs.getBoolean("GioiTinh"));
                nv.setLuong(rs.getDouble("Luong"));
                nv.setTenDangNhap(rs.getString("TenDangNhap"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setTinhTrang(rs.getBoolean("TinhTrang"));
                nv.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(nv);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public static ArrayList<NhanVien> GetAllNhanVienbyMa(int ma) {
        ResultSet rs = DAL.DAL_NhanVien.GetAllDatabyMa(ma);
        ArrayList<NhanVien> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getInt("MaNhanVien"));
                nv.setTenNhanvien(rs.getString("TenNhanVien"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setNgayVaoLam(rs.getDate("NgayVaoLam"));
                nv.setChucVu(rs.getInt("ChucVu"));
                nv.setSoDienThoai(rs.getString("SoDienThoai"));
                nv.setEmail(rs.getString("Email"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setGioiTinh(rs.getBoolean("GioiTinh"));
                nv.setLuong(rs.getDouble("Luong"));
                nv.setTenDangNhap(rs.getString("TenDangNhap"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setTinhTrang(rs.getBoolean("TinhTrang"));
                nv.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(nv);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public static ArrayList<NhanVien> GetAllNhanVienByTinhTrang(boolean ma) {
        ResultSet rs = DAL.DAL_NhanVien.FindNVBytinhTrang(ma);
        ArrayList<NhanVien> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getInt("MaNhanVien"));
                nv.setTenNhanvien(rs.getString("TenNhanVien"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setNgayVaoLam(rs.getDate("NgayVaoLam"));
                nv.setChucVu(rs.getInt("ChucVu"));
                nv.setSoDienThoai(rs.getString("SoDienThoai"));
                nv.setEmail(rs.getString("Email"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setGioiTinh(rs.getBoolean("GioiTinh"));
                nv.setLuong(rs.getDouble("Luong"));
                nv.setTenDangNhap(rs.getString("TenDangNhap"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setTinhTrang(rs.getBoolean("TinhTrang"));
                nv.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(nv);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public static ArrayList<NhanVien> FindNhanVienByName(String ten, String ma) {
        ResultSet rs = DAL.DAL_NhanVien.GetAllDatabyTen(ten,ma);
        ArrayList<NhanVien> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getInt("MaNhanVien"));
                nv.setTenNhanvien(rs.getString("TenNhanVien"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setNgayVaoLam(rs.getDate("NgayVaoLam"));
                nv.setChucVu(rs.getInt("ChucVu"));
                nv.setSoDienThoai(rs.getString("SoDienThoai"));
                nv.setEmail(rs.getString("Email"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setGioiTinh(rs.getBoolean("GioiTinh"));
                nv.setLuong(rs.getDouble("Luong"));
                nv.setTenDangNhap(rs.getString("TenDangNhap"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setTinhTrang(rs.getBoolean("TinhTrang"));
                nv.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(nv);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr;
    }

    public void DoVaoTableNhanVien(ArrayList<NhanVien> arr, JTable tbl) {
        JButton btnThem = new JButton();
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/IMG/search.png"));
        btnThem.setIcon(imageIcon);
        btnThem.setOpaque(true);
        btnThem.setBackground(Color.white);
        btnThem.setFocusPainted(false);
        btnThem.setFocusable(false);
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);

        String[] headerTable = {"STT", "Mã nhân viên", "Tên", "Ngày sinh", "Ngày vào làm", "Chức vụ", "Số điện thoại", "Email", "Địa chỉ", "Giới tính", "lương", "Tình trạng", "Chi tiết", "Hình ảnh",};
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (NhanVien nv : arr) {
            Object obj[] = new Object[14];
            obj[0] = tbl.getRowCount() + 1;
            obj[1] = nv.getMaNhanVien();
            obj[2] = nv.getTenNhanvien();
            obj[3] = Transform.LayNgayStringMDung(nv.getNgaySinh());
            obj[4] = Transform.LayNgayStringMDung(nv.getNgayVaoLam());
            obj[5] = BLLKhac.loadTenChucVu(nv.getChucVu());
            obj[6] = nv.getSoDienThoai();
            obj[7] = nv.getEmail();
            obj[8] = nv.getDiaChi();
            obj[9] = nv.isGioiTinh() ? "Nam" : "Nữ";
            obj[10] = Transform.SoString(nv.getLuong());
            obj[11] = nv.isTinhTrang() ? "Đang làm" : "Đã nghỉ";
            obj[12] = btnThem;
            obj[13] = nv.getHinhAnh();
            tbModel.addRow(obj);
        }
        tbl.setModel(tbModel);
        tbl.getColumnModel().getColumn(12).setCellRenderer(new Render());
        tbl.getColumnModel().getColumn(13).setCellRenderer(new RenderLable());
        tbl.setRowHeight(50);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tbl.getColumnModel().getColumn(0).setHeaderRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(1).setHeaderRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(2).setHeaderRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(3).setHeaderRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(4).setHeaderRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(5).setHeaderRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(6).setHeaderRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(7).setHeaderRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(8).setHeaderRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(9).setHeaderRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(10).setHeaderRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(11).setHeaderRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(12).setHeaderRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(13).setHeaderRenderer(centerRenderer);

        tbl.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(10).setCellRenderer(centerRenderer);
        tbl.getColumnModel().getColumn(11).setCellRenderer(centerRenderer);
//        tbl.getColumnModel().getColumn(12).setCellRenderer(centerRenderer);
//        tbl.getColumnModel().getColumn(13).setCellRenderer(centerRenderer);

    }

    public static boolean CheckNV(String Sdt, String Email, String tendn) {
        ArrayList<NhanVien> arr = GetAllNhanVien();
        for (NhanVien nv : arr) {
            if (nv.getSoDienThoai().equals(Sdt)) {
                Caution.ThongBaoDonGian("Lỗi", "Số điện thoại đã tồn tại!");
                return false;
            }
            if (nv.getEmail().equals(Email)) {
                Caution.ThongBaoDonGian("Lỗi", "Email đã tồn tại!");
                return false;
            }
            if (nv.getTenDangNhap().equals(tendn)) {
                Caution.ThongBaoDonGian("Lỗi", "Tên đăng nhập đã tồn tại!");
                return false;
            }
        }
        return true;
    }

    public static boolean Checksdt(String Sdt) {
        ArrayList<NhanVien> arr = GetAllNhanVien();
        for (NhanVien nv : arr) {
            if (nv.getSoDienThoai().equals(Sdt)) {
                Caution.ThongBaoDonGian("Lỗi", "Số điện thoại đã tồn tại!");
                return false;
            }

        }
        return true;
    }

    public static boolean CheckEmail(String email) {
        ArrayList<NhanVien> arr = GetAllNhanVien();
        for (NhanVien nv : arr) {
            if (nv.getEmail().equals(email)) {
                Caution.ThongBaoDonGian("Lỗi", "Email đã tồn tại!");
                return false;
            }

        }
        return true;
    }

    public static boolean CheckTendn(String tendn) {
        ArrayList<NhanVien> arr = GetAllNhanVien();
        for (NhanVien nv : arr) {
            if (nv.getTenDangNhap().equals(tendn)) {
                Caution.ThongBaoDonGian("Lỗi", "Tên đăng nhập đã tồn tại!");
                return false;
            }

        }
        return true;
    }

    public static boolean checkdinhdangemail(String email) {
        String regex = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        Pattern ptn = Pattern.compile(regex);
        Matcher mt = ptn.matcher(email);
        if (mt.find()) {
            return true;
        } else {
            Caution.ThongBaoDonGian("Thông báo", "Email không đúng định dạng");
            return false;

        }
    }

    public static void add(NhanVien nv, String email) {
        if (CheckNV(nv.getSoDienThoai(), nv.getEmail(), nv.getTenDangNhap()) && checkdinhdangemail(email)) {
            DAL.DAL_NhanVien.Add(nv);
            Caution.ThongBaoDonGian("Thông báo", "Thành công");
        }
    }

    public static void update(NhanVien nv, int mnv, String email) {
        if (checkdinhdangemail(email)) {
            DAL.DAL_NhanVien.Update(nv, mnv);
            Caution.ThongBaoDonGian("Thông báo", "Thành công");
        }
    }

    public static void updatecheck(NhanVien nv, int mnv, String email) {
        if (CheckNV(nv.getSoDienThoai(), nv.getEmail(), nv.getTenDangNhap()) && checkdinhdangemail(email)) {
            DAL.DAL_NhanVien.Update(nv, mnv);
            Caution.ThongBaoDonGian("Thông báo", "Thành công");
        }
    }

    public static void updatechecksdt(NhanVien nv, int mnv, String email) {
        if (Checksdt(nv.getSoDienThoai()) && checkdinhdangemail(email)) {
            DAL.DAL_NhanVien.Update(nv, mnv);
            Caution.ThongBaoDonGian("Thông báo", "Thành công");
        }
    }

    public static void updatecheckemail(NhanVien nv, int mnv, String email) {
        if (CheckEmail(nv.getEmail()) && checkdinhdangemail(email)) {
            DAL.DAL_NhanVien.Update(nv, mnv);
            Caution.ThongBaoDonGian("Thông báo", "Thành công");
        }
    }

    public static void updatechecktendn(NhanVien nv, int mnv, String email) {
        if (CheckTendn(nv.getTenDangNhap()) && checkdinhdangemail(email)) {
            DAL.DAL_NhanVien.Update(nv, mnv);
            Caution.ThongBaoDonGian("Thông báo", "Thành công");
        }
    }

    public static void delete(int id) {
        try {
            DAL.DAL_NhanVien.Delete(id);
        } catch (Exception e) {
            Caution.ThongBaoDonGian("Thông báo", "Xóa không thành công");
        }

    }

    public static boolean GetAccountNV(String TenDN, String MK) {
        ResultSet rs = DAL.DAL_NhanVien.GetTenDNMatKhau(TenDN, MK);
        ArrayList<NhanVien> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setTenNhanvien(rs.getString("TenNhanVien"));
                nv.setChucVu(rs.getInt("ChucVu"));
                nv.setTenDangNhap(rs.getString("TenDangNhap"));
                nv.setMatKhau(rs.getString("MatKhau"));
                return true;

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return false;
    }

    public static String getTenNV(int ma) {
        ResultSet rs = DAL.DAL_NhanVien.GetTenNV(ma);
        try {
            if(rs.next()){
                return rs.getString("TenNhanVien");
            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return null;
    }

    public static Boolean DoiMatKhau(int id, String pass) {
        if (DAL_NhanVien.DoiMatKhau(id, pass) > 0) {
            return true;
        }
        return false;
    }
    public static NhanVien account = new NhanVien();

    public static NhanVien GetAccountNhanVien() {
        return account;
    }

    public static boolean getAccount(String username, String password) {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_NhanVien.GetTenDNMatKhau(username, password);
        try {
            while (rs.next()) {
                account.setMaNhanVien(rs.getInt("MaNhanVien"));
                account.setTenNhanvien(rs.getString("TenNhanVien"));
                account.setChucVu(rs.getInt("ChucVu"));
                account.setTenDangNhap(rs.getString("TenDangNhap"));
                account.setMatKhau(rs.getString("MatKhau"));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL_NhanVien.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static Boolean DoiMatKhauByEmail(String email , String pass) {
        if(DAL_NhanVien.DoiMatKhauByEmail(email, pass)>0){
            return true;
        }
        return  false;
    }

}
