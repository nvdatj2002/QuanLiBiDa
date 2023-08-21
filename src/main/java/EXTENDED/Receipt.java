///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package EXTENDED;
//
//import java.util.Hashtable;
//import net.sf.jasperreports.engine.JasperCompileManager;
//import net.sf.jasperreports.engine.JasperExportManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.view.JasperViewer;
//
///**
// *
// * @author ADMIN
// */
//public class Receipt {
//    public static void XuatHoaDon(int idhd){
//        try {
//            Hashtable map = new Hashtable();
//            JasperReport report = JasperCompileManager.compileReport("src/gui/rpReceiptNew.jrxml");
//            map.put("id", idhd);          
//            JasperPrint p = JasperFillManager.fillReport(report,  map, sqlConnect.openConnection() );
//            JasperViewer.viewReport(p,false);
//            JasperExportManager.exportReportToPdfFile(p, "test.pdf");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//}
