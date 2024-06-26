/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deu.cse.moviereservationsystem.view.SweetShop;

import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Items;
import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Popcorn.PopcornDecorator.*;
import deu.cse.moviereservationsystem.Pattern.SweetShopObserver.OrderList;
import deu.cse.moviereservationsystem.Pattern.SweetShopStrategy.SizeStratrgy.SizeOptions;
import deu.cse.moviereservationsystem.view.InputImage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LG
 */
public class AddSeasoningFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddSeasoningFrame
     */
    InputImage input = new InputImage();
    Items item;
    boolean clickSize = false; //사이즈 클릭 감지

    private String menu;
    private String size;
    private int cost;

    SizeOptions s = new SizeOptions("S");
    SizeOptions m = new SizeOptions("M");
    SizeOptions l = new SizeOptions("L");

    public AddSeasoningFrame(Items item) {
        this.item = item;
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //창 숨김
        inputImage();
    }

    private void inputImage() {
        input.imageLabel("/image/Cheese.png", jLabel2);
        input.imageLabel("/image/chili.png", jLabel4);
        input.imageLabel("/image/Garlic.png", jLabel3);
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
        CheeseSeasoningButton = new javax.swing.JButton();
        ChiliSeasoningButton = new javax.swing.JButton();
        GarlicSeasoningButton = new javax.swing.JButton();
        SizeS_Button = new javax.swing.JButton();
        SizeM_Button = new javax.swing.JButton();
        SizeL_Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addOrderButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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
        jLabel1.setText("팝콘 옵션 추가");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
                .addComponent(previousFrameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousFrameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)))
        );

        CheeseSeasoningButton.setBackground(new java.awt.Color(224, 224, 224));
        CheeseSeasoningButton.setText("담기");
        CheeseSeasoningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheeseSeasoningButtonActionPerformed(evt);
            }
        });

        ChiliSeasoningButton.setBackground(new java.awt.Color(224, 224, 224));
        ChiliSeasoningButton.setText("담기");
        ChiliSeasoningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChiliSeasoningButtonActionPerformed(evt);
            }
        });

        GarlicSeasoningButton.setBackground(new java.awt.Color(224, 224, 224));
        GarlicSeasoningButton.setText("담기");
        GarlicSeasoningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GarlicSeasoningButtonActionPerformed(evt);
            }
        });

        SizeS_Button.setBackground(new java.awt.Color(224, 224, 224));
        SizeS_Button.setText("S");
        SizeS_Button.setToolTipText("");
        SizeS_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeS_ButtonActionPerformed(evt);
            }
        });

        SizeM_Button.setBackground(new java.awt.Color(224, 224, 224));
        SizeM_Button.setText("M");
        SizeM_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeM_ButtonActionPerformed(evt);
            }
        });

        SizeL_Button.setBackground(new java.awt.Color(224, 224, 224));
        SizeL_Button.setText("L");
        SizeL_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeL_ButtonActionPerformed(evt);
            }
        });

        addOrderButton.setBackground(new java.awt.Color(204, 204, 204));
        addOrderButton.setText("담기");
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("$ 0");

        jLabel5.setText("$ 500");

        jLabel6.setText("$ 1000");

        jLabel8.setText("$ 500");

        jLabel9.setText("$ 500");

        jLabel10.setText("$ 500");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SizeS_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(SizeM_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(SizeL_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheeseSeasoningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChiliSeasoningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(GarlicSeasoningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChiliSeasoningButton)
                    .addComponent(GarlicSeasoningButton)
                    .addComponent(CheeseSeasoningButton))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SizeS_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SizeM_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SizeL_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousFrameButtonActionPerformed
        // TODO add your handling code here:
        PopcornFrame popcorn = PopcornFrame.getInstance();
        popcorn.setVisible(true);
        dispose();
    }//GEN-LAST:event_previousFrameButtonActionPerformed

    private void CheeseSeasoningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheeseSeasoningButtonActionPerformed
        // TODO add your handling code here:
        this.item = new CheeseSeasoning(item);
    }//GEN-LAST:event_CheeseSeasoningButtonActionPerformed

    private void ChiliSeasoningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChiliSeasoningButtonActionPerformed
        // TODO add your handling code here:
        this.item = new ChiliSeasoning(item);
    }//GEN-LAST:event_ChiliSeasoningButtonActionPerformed

    private void GarlicSeasoningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GarlicSeasoningButtonActionPerformed
        // TODO add your handling code here:
        this.item = new GarlicSeasoning(item);
    }//GEN-LAST:event_GarlicSeasoningButtonActionPerformed

    private void SizeS_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeS_ButtonActionPerformed
        // TODO add your handling code here:
        if (!clickSize) {
            size = s.getSize();
            cost += s.getCost();
            clickSize = true;
        } else
            JOptionPane.showMessageDialog(null, "이미 선택하신 사이즈는 " + size + "입니다.", "정보", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_SizeS_ButtonActionPerformed

    private void SizeM_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeM_ButtonActionPerformed
        // TODO add your handling code here:
        if (!clickSize) {
            size = m.getSize();
            cost += m.getCost();
            clickSize = true;
        } else
            JOptionPane.showMessageDialog(null, "이미 선택하신 사이즈는 " + size + "입니다.", "정보", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_SizeM_ButtonActionPerformed

    private void SizeL_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeL_ButtonActionPerformed
        // TODO add your handling code here:
        if (!clickSize) {
            size = l.getSize();
            cost += l.getCost();
            clickSize = true;
        } else
            JOptionPane.showMessageDialog(null, "이미 선택하신 사이즈는 " + size + "입니다.", "정보", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_SizeL_ButtonActionPerformed

    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        // TODO add your handling code here:
        if (clickSize) {
            menu = item.getDescription();
            cost = item.cost();
            OrderList order = OrderList.getInstance();
            order.receiveOrderList(menu, size, cost);
            PopcornFrame popcorn = PopcornFrame.getInstance();
            popcorn.setVisible(true);
            dispose();
        } else {
            System.out.println("사이즈를 선택해주세요");
        }

    }//GEN-LAST:event_addOrderButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheeseSeasoningButton;
    private javax.swing.JButton ChiliSeasoningButton;
    private javax.swing.JButton GarlicSeasoningButton;
    private javax.swing.JButton SizeL_Button;
    private javax.swing.JButton SizeM_Button;
    private javax.swing.JButton SizeS_Button;
    private javax.swing.JButton addOrderButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton previousFrameButton;
    // End of variables declaration//GEN-END:variables
}
