
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SplashScreen;


import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JDialog;

/**
 *
 * @author code4lifevn
 */
public final class SplashScreenDrawer extends JComponent implements ComponentListener, WindowFocusListener, Runnable {
    private JDialog frame;
    protected Image background;
    private long lastupdate = 0;
    private boolean refreshRequested = true;

    SplashScreenDrawer(JDialog frame) {
        this.frame = frame;
        updateBackground();
        frame.addComponentListener(this);
        //frame.addWindowFocusListener(this);

        new Thread(this).start();
    }

    private void updateBackground() {
        try {
            Robot rbt = new Robot();
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension dim = tk.getScreenSize();
            background = rbt.createScreenCapture(new Rectangle(0,0,(int)dim.getWidth(),(int)dim.getHeight()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override public void paintComponent(Graphics g) {
        try {
            Point pos = this.getLocationOnScreen();
            Point offset = new Point(-pos.x,-pos.y);
            g.drawImage(background,offset.x,offset.y,null);
        } catch(IllegalComponentStateException ex) {
            ex.getCause();
        }
    }

    @Override public void componentShown(ComponentEvent evt) { repaint(); }
    @Override public void componentResized(ComponentEvent evt) { repaint(); }
    @Override public void componentMoved(ComponentEvent evt) { repaint(); }
    @Override public void componentHidden(ComponentEvent evt) { }

    @Override public void windowGainedFocus(WindowEvent evt) { refresh(); }
    @Override public void windowLostFocus(WindowEvent evt) { refresh(); }

    private void refresh() {
       if(this.isVisible() && frame.isVisible()) {
            repaint();
            refreshRequested = true;
            lastupdate = new Date().getTime();
        }
    }

    @Override public void run() {
        try {
            while(true) {
                Thread.sleep(50);
                long now = new Date().getTime();
                if(refreshRequested &&
                   ((now - lastupdate) > 10)) {
                    if(frame.isVisible()) {
                        Point location = frame.getLocation();
                        frame.setVisible(false);
                        updateBackground();
                        frame.setVisible(true);
                        frame.setLocation(location);
                        refresh();
                    }
                    lastupdate = now;
                    refreshRequested = false;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}