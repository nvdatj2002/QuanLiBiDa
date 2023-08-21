/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SplashScreen;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author code4lifevn
 */
public class ImagePanel extends JPanel {
    private String imageURL;
    private URL URLimg;
    private Image backgroundImage;
    private Dimension dim;

    public ImagePanel() {
        super();
    }

    public URL getURLimg() {
        return URLimg;
    }

    public ImagePanel(LayoutManager layout) {
        super(layout);
    }

    public ImagePanel(boolean isDoubleBuffered) {
        super(isDoubleBuffered);
    }

    public ImagePanel(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
    }

    public ImagePanel(String imageURL) {
        this.imageURL = imageURL;
    }

    public ImagePanel(String imageURL, LayoutManager layout) {
        super(layout);
        this.imageURL = imageURL;
    }

    public ImagePanel(String imageURL, boolean isDoubleBuffered) {
        super(isDoubleBuffered);
        this.imageURL = imageURL;
    }

    public ImagePanel(String imageURL, LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
        this.imageURL = imageURL;
    }

    ImagePanel(URL resource) {
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        URL url = getURLimg();
        backgroundImage = new ImageIcon(getClass().getResource("/IMG/SplashScreen.png")).getImage();
        int w = backgroundImage.getWidth(null);
        int h = backgroundImage.getHeight(null);
        dim = new Dimension(w, h);
        this.setPreferredSize(dim);
        g.drawImage(backgroundImage, 0, 0, null);
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Image getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public Dimension getDim() {
        return dim;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }
}
