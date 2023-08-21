/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SplashScreen;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import javax.swing.JProgressBar;
import javax.swing.Painter;

/**
 *
 * @author code4lifevn
 */
public class ProgressBarPainter implements Painter<JProgressBar> {
    private Color color1;
    private Color color2;

    public ProgressBarPainter(Color color) {
        this.color1 = color;
    }

    public ProgressBarPainter(Color color1, Color color2) {
        this.color1 = color1;
        this.color2 = color2;
    }

    @Override
    public void paint(Graphics2D g, JProgressBar object, int width, int height) {
        if(color2 != null) {
            GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
            g.setPaint(gp);
        } else {
            g.setColor(color1);
        }
        g.fillRect(0, 0, width - 1, height - 1);
    }

}