/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXTENDED;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ADMIN
 */
public class Mail {

    final String username = "thaivpk02670@fpt.edu.vn";
    final String password = "thaimisen2828";

    Properties prop = new Properties();

    public Mail() {
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
    }//TLS

    public Boolean send(String to, int otp) {
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(to)
            );
            message.setSubject("Verify Email");
            message.setText("Ma OTP cua ban: " + otp);
            Transport.send(message);
            Caution.ThongBaoDonGian("Thông báo", "mã xác thực đã gửi đến email của bạn");
            return true;
        } catch (MessagingException e) {
            e.getStackTrace();
            Caution.ThongBaoDonGian("Thông báo", "Địa chỉ email không hợp lệ");
            return false;
        }
    }

//
//    Properties props = new Properties();
//
//    public Mail() {
//
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.socketFactory.port", "465");
//        props.put("mail.smtp.socketFactory.class",
//                "javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.port", "465");
//    }
//    String from = "thaivpk02670@fpt.edu.vn";
//        String password = "thaimisen2828";
//    public void send(String to, int otp) {
//        //get Session  
//        
//        Session session = Session.getDefaultInstance(props,
//                new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(from, password);
//            }
//        });
//        //compose message    
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(from));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            message.setSubject("Verify Your Email");
//            message.setText("Mã OTP của bạn: " + otp);
////           MimeMessage message = new MimeMessage(session);    
////           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
////           message.setSubject(sub);    
////           message.setText(msg);    
//            //send message  
//            Transport.send(message);
//            Caution.ThongBaoDonGian("Thông báo", "mã xác thực đã gửi đến email của bạn");
//        } catch (MessagingException e) {
//            e.getStackTrace();
//            Caution.ThongBaoDonGian("Thông báo", "Địa chỉ email không hợp lệ");
//        }
//
//    }
//    public void sendMail() {
//        Properties prop = new Properties();
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.starttls.enable", "true"); //TLS
//
//        Session session = Session.getInstance(prop,
//                new Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(txtNguoiGui.getText(), new String(txtMatKhau.getPassword()));
//            }
//        });
//
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(txtNguoiGui.getText()));
//            message.setRecipients(
//                    Message.RecipientType.TO,
//                    InternetAddress.parse(txtNguoiNhan.getText())
//            );
//            message.setSubject(txtTieuDe.getText());
//            message.setText(txaNoiDung.getText());
//            MimeBodyPart messageBodyPart2 = new MimeBodyPart();
//            // Duong dan den file cua ban
//            String filePath = file.toString();
//            DataSource source1 = new FileDataSource(filePath);
//            messageBodyPart2.setDataHandler(new DataHandler(source1));
//            messageBodyPart2.setFileName(filePath);
//            Multipart multipart = new MimeMultipart();
//            multipart.addBodyPart(messageBodyPart2);
//            message.setContent(multipart);
//            Transport.send(message);
//
//            JOptionPane.showMessageDialog(this, "Email Sented...");
//
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//}
}
