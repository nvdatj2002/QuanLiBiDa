/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXTENDED;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ADMIN
 */
public class QRCode {

    public static String filePath = "";
    public static double money = 25500;
    static String qrCodeText = "";

    public static String transform(double money) {
        String i = "0";
        if (10000- money<=0) {
            i = "5";
        }if (100000 - money<=0) {
            i = "6";
        }if (1000000 - money<=0) {
            i = "7";
        }if (10000000 - money<=0) {
            i = "8";
        }if (100000000 - money<=0) {
            i = "9";
        }
        return i;
    }
    public static int castInt(){
        int i=0;
        try {
            i= Integer.parseInt(String.valueOf(money));
        } catch (Exception e) {
            
        }
        return i;
    }
    
    public static String MoMo(){
        return qrCodeText="2|99|0378882649|VO THAI||0|0|" +String.valueOf((int)money) + "||transfer_myqr";
    }
    public static String VietQR() throws UnsupportedEncodingException{
        String qrCode="00020101021238550010A000000727012500069704230111vothaidubi20208QRIBFTTA5303704540"+transform(money)+String.valueOf((int)money)+"5802VN6304";
        return qrCodeText=crc(qrCode);
    }

    public static void createURL(String qrCodeText) throws WriterException, IOException {
        File file = new File("D:\\imageQRCode");
        if (!file.exists()) {
            file.mkdir();
        }
        String filePath = "D:\\imageQRCode\\qr.png";
        int size = 256;
        String fileType = "png";
        File qrFile = new File(filePath);
        createQRImage(qrFile, qrCodeText, size, fileType);
    }

    private static void createQRImage(File qrFile, String qrCodeText, int size,
            String fileType) throws WriterException, IOException {
        // Create the ByteMatrix for the QR-Code that encodes the given String
        Hashtable hintMap = new Hashtable();
        hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix byteMatrix = qrCodeWriter.encode(qrCodeText,
                BarcodeFormat.QR_CODE, size, size, hintMap);
        // Make the BufferedImage that are to hold the QRCode
        int matrixWidth = byteMatrix.getWidth();
        BufferedImage image = new BufferedImage(matrixWidth, matrixWidth,
                BufferedImage.TYPE_INT_RGB);
        image.createGraphics();

        Graphics2D graphics = (Graphics2D) image.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, matrixWidth, matrixWidth);
        // Paint and save the image using the ByteMatrix
        graphics.setColor(Color.BLACK);

        for (int i = 0; i < matrixWidth; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                if (byteMatrix.get(i, j)) {
                    graphics.fillRect(i, j, 1, 1);
                }
            }
        }
        ImageIO.write(image, fileType, qrFile);
    }

    public static void getImage(JLabel lbimage,String str) throws WriterException, IOException {
        createURL(str);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("D:\\imageQRCode\\qr.png").getImage().
                getScaledInstance(lbimage.getWidth(), lbimage.getHeight(), Image.SCALE_DEFAULT));
        lbimage.setIcon(imageIcon);
    }

    public static String crc(String str) throws UnsupportedEncodingException {
        int crc = 0xFFFF;          // initial value
        int polynomial = 0x1021;   // 0001 0000 0010 0001  (0, 5, 12)

        byte[] testBytes = str.getBytes("ASCII");

//        byte[] bytes = args[0].getBytes();
        for (byte b : testBytes) {
            for (int i = 0; i < 8; i++) {
                boolean bit = ((b >> (7 - i) & 1) == 1);
                boolean c15 = ((crc >> 15 & 1) == 1);
                crc <<= 1;
                if (c15 ^ bit) {
                    crc ^= polynomial;
                }
            }
        }
        crc &= 0xffff;
        String newcrc="";
        if(Integer.toHexString(crc).length()<4){
            newcrc="0"+Integer.toHexString(crc);
        }else{
            newcrc=Integer.toHexString(crc);
        }
        for(int i=0;i<newcrc.length();i++){
            Character.toUpperCase(newcrc.charAt(i));
        }
        return str+newcrc;
    }
}
