/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SplashScreen;

import GUI.MenuDangNhap;
import Tasks.CheckConfigFileExecutor;
import Tasks.CheckDatabaseExecutor;
import Tasks.ITaskExcutor;
import Tasks.PrepareWorkSpaceExecutor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.GroupLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle;

/**
 *
 * @author MrManh
 */
public final class SplashScreen implements Runnable {

    private static final List<ITaskExcutor> taskExecutor = new ArrayList<ITaskExcutor>(3);

    static {
        taskExecutor.add(new CheckConfigFileExecutor());
        taskExecutor.add(new CheckDatabaseExecutor());
        taskExecutor.add(new PrepareWorkSpaceExecutor());
    }

    private JProgressBar progressBar;
    private JDialog frame;
    private JLabel lbMsg;

    public SplashScreen() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        //=> Init ProgressBar
        progressBar = new JProgressBar(0, 100);
        progressBar.setPreferredSize(new Dimension(146, 44));
        progressBar.setForeground(new Color(0,204,255));
        progressBar.setStringPainted(true);

        //=> Init JDialog
        frame = new JDialog();
        frame.setUndecorated(true);

        //=> Init JLabel
        lbMsg = new JLabel();

        //=> Init SplashScreen
        SplashScreenDrawer splashScreenDrawer = new SplashScreenDrawer(frame);
        splashScreenDrawer.setLayout(new BorderLayout());

        //=> Init ImagePanel
        ImagePanel imagePanel = new ImagePanel(getClass().getResource("/IMG/SplashScreen.png"));
        imagePanel.setOpaque(false);

        //=> Design Layout
        GroupLayout imagePanelLayout = new GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
                imagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(imagePanelLayout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addGroup(imagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lbMsg)
                                        .addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(172, Short.MAX_VALUE)));
        imagePanelLayout.setVerticalGroup(
                imagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, imagePanelLayout.createSequentialGroup()
                                .addContainerGap(288, Short.MAX_VALUE)
                                .addComponent(lbMsg)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)));

        splashScreenDrawer.add("Center", imagePanel);
        frame.getContentPane().add("Center", splashScreenDrawer);
        frame.pack();
        frame.setSize(700, 450);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        handleExcutors();
        frame.dispose();
        new MenuDangNhap().setVisible(true);
    }

    private void handleExcutors() {
        //Handling progressbar
        double val = 1;
        int i = 0;
        for (ITaskExcutor task : taskExecutor) {
            try {
                val += (i * 100) / taskExecutor.size();
                progressBar.setValue((int) Math.ceil(val));
                task.execute(this);
                Random rd = new Random();
                int delay = rd.nextInt(2500);
                Thread.sleep(delay);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Lỗi!", JOptionPane.ERROR_MESSAGE);
                break;
            }
            ++i;
        }

    }

    public void setProgressMessage(String message) {
        this.lbMsg.setText(message);
    }

}
