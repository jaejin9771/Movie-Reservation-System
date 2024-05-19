/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deu.cse.moviereservationsystem.view.SweetShop;

import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Beverage.BeverageDecorator.*;
import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Items;
import deu.cse.moviereservationsystem.Pattern.SweetShopObserver.OrderList;
import deu.cse.moviereservationsystem.Pattern.SweetShopStrategy.SizeStratrgy.SizeOptions;
import deu.cse.moviereservationsystem.view.InputImage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LG
 */
public class AddOptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form addOptionButton
     */
    InputImage input = new InputImage();
    Items item;
    boolean clickSize = false; //사이즈 클릭 감지
    boolean clickOption = false; //옵션 클릭 감지

    private String menu;
    private String size;
    private int cost;

    SizeOptions s = new SizeOptions("S");
    SizeOptions m = new SizeOptions("M");
    SizeOptions l = new SizeOptions("L");

    public AddOptionFrame(Items item) {
        this.item = item;
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //창 숨김
        inputImage();
    }

    private void inputImage() {
        input.imageLabel("/image/Ice.png", jLabel3);
        input.imageLabel("/image/NoIce.png", jLabel2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        previousFrameButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        IceOptionButton = new javax.swing.JButton();
        noIceOptionButton = new javax.swing.JButton();
        SizeS_button = new javax.swing.JButton();
        SizeM_button = new javax.swing.JButton();
        SizeL_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addOrderButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel5.setText("jLabel4");

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
        jLabel1.setText("음료 옵션 추가");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
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

        IceOptionButton.setBackground(new java.awt.Color(224, 224, 224));
        IceOptionButton.setText("담기");
        IceOptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IceOptionButtonActionPerformed(evt);
            }
        });

        noIceOptionButton.setBackground(new java.awt.Color(224, 224, 224));
        noIceOptionButton.setText("담기");
        noIceOptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noIceOptionButtonActionPerformed(evt);
            }
        });

        SizeS_button.setBackground(new java.awt.Color(224, 224, 224));
        SizeS_button.setText("S");
        SizeS_button.setToolTipText("");
        SizeS_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeS_buttonActionPerformed(evt);
            }
        });

        SizeM_button.setBackground(new java.awt.Color(224, 224, 224));
        SizeM_button.setText("M");
        SizeM_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeM_buttonActionPerformed(evt);
            }
        });

        SizeL_button.setBackground(new java.awt.Color(224, 224, 224));
        SizeL_button.setText("L");
        SizeL_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeL_buttonActionPerformed(evt);
            }
        });

        addOrderButton.setBackground(new java.awt.Color(204, 204, 204));
        addOrderButton.setText("담기");
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("$ 500");

        jLabel6.setText("$ 1000");

        jLabel7.setText("$ 0");

        jLabel8.setText("$ 0");

        jLabel9.setText("$ 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SizeS_button, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SizeM_button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(SizeL_button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(IceOptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(174, 174, 174)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(noIceOptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IceOptionButton)
                    .addComponent(noIceOptionButton))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SizeL_button, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SizeM_button, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SizeS_button, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11)
                .addComponent(addOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        if (clickSize) {
            OrderList order = OrderList.getInstance();
            order.receiveOrderList(menu, size, cost);
            
            BeverageFrame beverage = BeverageFrame.getInstance();
            beverage.setVisible(true);
            dispose();
        } else
            JOptionPane.showMessageDialog(null, "사이즈를 선택해주세요.");
    }//GEN-LAST:event_addOrderButtonActionPerformed

    private void previousFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousFrameButtonActionPerformed
        // TODO add your handling code here:
        BeverageFrame beverage = BeverageFrame.getInstance();
        beverage.setVisible(true);
        dispose();
    }//GEN-LAST:event_previousFrameButtonActionPerformed

    private void IceOptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IceOptionButtonActionPerformed
        // TODO add your handling code here:
        item = new IceOption(item);
        menu = item.getDescription();
        cost = item.cost();
        clickOption = true;
    }//GEN-LAST:event_IceOptionButtonActionPerformed

    private void noIceOptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noIceOptionButtonActionPerformed
        // TODO add your handling code here:
        item = new NoIceOption(item);
        menu = item.getDescription();
        cost = item.cost();
        clickOption = true;
    }//GEN-LAST:event_noIceOptionButtonActionPerformed

    private void SizeS_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeS_buttonActionPerformed
        // TODO add your handling code here:
        if (!clickSize && clickOption) {
            size = s.getSize();
            cost += s.getCost();
            clickSize = true;
        } else
            JOptionPane.showMessageDialog(null, "옵션을 선택해주세요.");
    }//GEN-LAST:event_SizeS_buttonActionPerformed

    private void SizeM_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeM_buttonActionPerformed
        // TODO add your handling code here:
        if (!clickSize && clickOption) {
            size = m.getSize();
            cost += m.getCost();
            clickSize = true;
        } else
           JOptionPane.showMessageDialog(null, "옵션을 선택해주세요.");
    }//GEN-LAST:event_SizeM_buttonActionPerformed

    private void SizeL_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeL_buttonActionPerformed
        // TODO add your handling code here:
        if (!clickSize && clickOption) {
            size = l.getSize();
            cost += l.getCost();
            clickSize = true;
        } else
            JOptionPane.showMessageDialog(null, "옵션을 선택해주세요.");
    }//GEN-LAST:event_SizeL_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IceOptionButton;
    private javax.swing.JButton SizeL_button;
    private javax.swing.JButton SizeM_button;
    private javax.swing.JButton SizeS_button;
    private javax.swing.JButton addOrderButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton noIceOptionButton;
    private javax.swing.JButton previousFrameButton;
    // End of variables declaration//GEN-END:variables
}
