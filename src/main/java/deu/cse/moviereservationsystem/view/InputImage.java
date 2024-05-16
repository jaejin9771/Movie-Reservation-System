/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author LG
 */
public class InputImage {
    public void imageLabel(String imagePath, JLabel jLabel) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        jLabel.setIcon(icon);  
    }
    public void imageButt(String imagePath, JButton jbutton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        jbutton.setIcon(icon);
    }
}
