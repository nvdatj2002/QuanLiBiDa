/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXTENDED;

import BLL.BLLDoDung;
import DTO.DoDung;
import GUI.Order;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author dell 7559
 */
public class RenderLable extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        byte[] photo = null ;
        photo = (byte[]) value;
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(photo)
                .getImage().getScaledInstance(
                        60,
                        60,
                        Image.SCALE_DEFAULT));
        return new JLabel(imageIcon);
    }
}
