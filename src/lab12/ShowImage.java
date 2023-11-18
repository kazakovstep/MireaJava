package lab12;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ShowImage extends JFrame{

    public ShowImage(String path) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame(path);
                frame.setDefaultCloseOperation(3);
                BufferedImage img;
                try {
                    img = ImageIO.read(new File(path));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                JLabel label = new JLabel();
                label.setIcon(new ImageIcon(img));
                frame.getContentPane().add(label, BorderLayout.CENTER);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new ShowImage("D:\\idea_Projects\\PracticJava\\src\\Practic_5\\image_5.jpg");
    }

}