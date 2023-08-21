/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXTENDED;

import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class Caution {

    public static void ThongBaoDonGian(String Title, String Content) {
        JOptionPane.showMessageDialog(null,
                Content, Title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void ThongBaoCoIcon(String Title, String Content, int md) {
        JOptionPane.showMessageDialog(null,
                Content, Title, md);
    }

    public static void ThongBaoThanhCong(String Title, String Content) {
        JOptionPane.showMessageDialog(null,
                Content, Title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean ThongBaoYesNo() {
        int dialogButton = JOptionPane.showConfirmDialog(null, "Vui lòng xác nhận lại?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogButton == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean ThongBao(String txt) {
        int dialogButton = JOptionPane.showConfirmDialog(null, txt, "Thông báo", JOptionPane.YES_NO_OPTION);
        if (dialogButton == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean ThongBaoXuathoadon() {
        int dialogButton = JOptionPane.showConfirmDialog(null, "Bạn có muốn xuất hóa đơn?", "WARNING", JOptionPane.YES_NO_OPTION);
        if (dialogButton == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    public static void ThongBaoDrinks(int id,int idorders, int count,int countdrink) {
        JTextField soluong = new JTextField();
        JLabel a = new JLabel();
        a.setText("Số lượng hiện có" + count + " vui nhập số lượng nhỏ hơn!");
        soluong.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent keyEvent) {
                String isoluong = soluong.getText();
                double cdsoluong = Transform.SoDouble(isoluong);
                soluong.setText(Transform.SoString(cdsoluong));
            }
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }
        });
        switch (JOptionPane.showConfirmDialog(null, soluong, "Nhập số lượng: ", JOptionPane.YES_NO_OPTION)) {
            case JOptionPane.YES_NO_OPTION:
                if (Transform.SoDouble(soluong.getText()) > count) {
                    ThongBaoDonGian("Thông báo", a.getText());
                    ThongBaoDrinks(id,idorders,count,countdrink);
                } else {
                    Double sl = Transform.SoDouble(soluong.getText());
                    int spcount=0;
                    if(Integer.parseInt(soluong.getText())>countdrink){
                         spcount = Integer.parseInt(soluong.getText())-countdrink;
                    }else{
                         spcount = -Integer.parseInt(soluong.getText())+countdrink;
                    }
                    
//                    BLL.BLL_Menu.SuaSanphamSoluong(idorders,sl);
//                    BLL.BLL_DoUong.SuaSanphamSoluong(id,spcount);
                }
                break;
            case JOptionPane.NO_OPTION:
                break;
        }
    }
}
