/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runSplash;

import GUI.MenuDangNhap;
import GUI.Splash;
import SplashScreen.ProgressBarPainter;
import SplashScreen.SplashScreen;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

/**
 *
 * @author code4lifevn
 */
public class StartApp {

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    UIDefaults myUI = UIManager.getLookAndFeelDefaults();
                    break;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run() {
                new SplashScreen();
            }
        });
    }
}
