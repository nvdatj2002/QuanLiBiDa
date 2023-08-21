/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXTENDED;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Transform {
    


/**
 *
 * @author CuongNP
 */

    //Chuyển đổi kiểu Date <-> String
    //Tạo định dạng ngày tháng
    static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
    static DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
    static DateFormat dateFormat3 = new SimpleDateFormat("MM-dd-yyyy");
    static DateFormat dateFormat4 = new SimpleDateFormat("dd-MM-yyyy");
    //Hàm chuyển Date -> String
    public static String LayNgayString(Date date){
        return dateFormat.format(date);
    }
        public static String LayNgayStringMDung(Date date) {
        return dateFormat4.format(date);
    }
    //Hàm chuyển String -> Date
    public static Date LayNgayDate(String ngay){
        try {
            return dateFormat.parse(ngay);
        } catch (ParseException ex) {
            System.out.println("Lỗi chuyển ngày");
            return null;
        }
    }
    public static Date LayNgayDateloi(String ngay){
        try {
            return dateFormat2.parse(ngay);
        } catch (ParseException ex) {
            System.out.println("Lỗi chuyển ngày");
            return null;
        }
    }
    public static Date LayNgayDateloi2(String ngay){
        try {
            return dateFormat3.parse(ngay);
        } catch (ParseException ex) {
            System.out.println("Lỗi chuyển ngày");
            return null;
        }
    }
    
    //Chuyển đổi số Double <-> String 10.000.000
    //Hàm chuyển Double -> String
    public static String SoString(double so){
        return NumberFormat.getNumberInstance().format(so);
    }
    
    //Hàm chuyển String -> Double
    public static double SoDouble(String so){
        try {
            return NumberFormat.getNumberInstance().parse(so).doubleValue();
        } catch (ParseException ex) {
            System.out.println("Lỗi chuyển số");
            return 0;
        }
    }

}
