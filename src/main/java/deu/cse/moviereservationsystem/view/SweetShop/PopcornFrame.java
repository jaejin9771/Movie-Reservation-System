/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deu.cse.moviereservationsystem.view.SweetShop;

import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Items;
import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Popcorn.*;
import deu.cse.moviereservationsystem.Pattern.SweetShopObserver.Displayment;
import deu.cse.moviereservationsystem.Pattern.SweetShopObserver.Observer;
import deu.cse.moviereservationsystem.Pattern.SweetShopObserver.OrderList;
import deu.cse.moviereservationsystem.view.InputImage;
import javax.swing.JFrame;

/**
 *
 * @author LG
 */
public class PopcornFrame extends javax.swing.JFrame  implements Observer, Displayment {

    /**
     * Creates new form PopcornFrame
     */
     private static PopcornFrame instance;
    private OrderList order;
    int countOrder;
     InputImage input = new InputImage();
     
    private PopcornFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //창 숨김
        inputImage();
    }
    public static  PopcornFrame getInstance() {
        if (instance == null) {
            synchronized (PopcornFrame.class) {
                if (instance == null) {
                    instance = new PopcornFrame();
                }
            }
        }
        return instance;
    }

    public void setOrder(OrderList order) {
        this.order = order;
        order.addObserver(this);
    }
    @Override
    public void updateObserver(String menu, String size, int cost, int CountOrder) {
        this.countOrder = CountOrder;
        display();
    }

    @Override
    public void display() {
        setCountOrder.setText(Integer.toString(countOrder));
    }
    
    Items item;
    
    private void clickButton() {
        AddSeasoningFrame frame = new AddSeasoningFrame(item);
        frame.setVisible(true);
        dispose();
    }
    
    private void inputImage(){
        input.imageLabel("/image/BasicsPopcorn.png", jLabel3);
        input.imageLabel("/image/CaramelPopcorn.png", jLabel2);
        input.imageButt("/image/ShoppingCart.png", ShoppingCartButton);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        previousFrameButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ShoppingCartButton = new javax.swing.JButton();
        setCountOrder = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CaramelButton = new javax.swing.JButton();
        BasicsPopcornButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));

        previousFrameButton.setBackground(new java.awt.Color(204, 204, 204));
        previousFrameButton.setText("←");
        previousFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousFrameButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel1.setText("팝콘 주문");

        ShoppingCartButton.setBackground(new java.awt.Color(232, 232, 232));
        ShoppingCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShoppingCartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ShoppingCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previousFrameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousFrameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(ShoppingCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setCountOrder.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        setCountOrder.setText("0");

        jLabel6.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel6.setText("주문갯수 : ");

        CaramelButton.setBackground(new java.awt.Color(224, 224, 224));
        CaramelButton.setText("담기");
        CaramelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaramelButtonActionPerformed(evt);
            }
        });

        BasicsPopcornButton.setBackground(new java.awt.Color(224, 224, 224));
        BasicsPopcornButton.setText("담기");
        BasicsPopcornButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasicsPopcornButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(setCountOrder))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BasicsPopcornButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CaramelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 107, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(setCountOrder))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BasicsPopcornButton)
                    .addComponent(CaramelButton))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousFrameButtonActionPerformed
        // TODO add your handling code here:
        SweetShopFrame cart = SweetShopFrame.getInstance();
        cart.setVisible(true);
        dispose();
    }//GEN-LAST:event_previousFrameButtonActionPerformed

    private void ShoppingCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShoppingCartButtonActionPerformed
        // TODO add your handling code here:
        ShoppingCartFrame cart = ShoppingCartFrame.getInstance();
        cart.setVisible(true);
        dispose();
    }//GEN-LAST:event_ShoppingCartButtonActionPerformed

    private void BasicsPopcornButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasicsPopcornButtonActionPerformed
        // TODO add your handling code here:
        item = new BasicsPopcorn();
        clickButton();
    }//GEN-LAST:event_BasicsPopcornButtonActionPerformed

    private void CaramelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaramelButtonActionPerformed
        // TODO add your handling code here:
         item = new CaramelPopcorn();
        clickButton();
    }//GEN-LAST:event_CaramelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BasicsPopcornButton;
    private javax.swing.JButton CaramelButton;
    private javax.swing.JButton ShoppingCartButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton previousFrameButton;
    private javax.swing.JLabel setCountOrder;
    // End of variables declaration//GEN-END:variables
}
