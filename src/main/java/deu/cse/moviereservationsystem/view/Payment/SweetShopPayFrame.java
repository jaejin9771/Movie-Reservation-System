/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deu.cse.moviereservationsystem.view.Payment;

import deu.cse.moviereservationsystem.Controller.SweetShop.SweetShopController;
import deu.cse.moviereservationsystem.DTO.SweetShop.ShoppingCartDTO;
import deu.cse.moviereservationsystem.Entity.SweetShopEntity.SweetShop;
import deu.cse.moviereservationsystem.view.User.UserMainFrame;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author LG
 */
public final class SweetShopPayFrame extends javax.swing.JFrame {

    /**
     * Creates new form SweetShopPayFrame
     */
    StringBuilder orderStringBuilder = new StringBuilder();
    private List<ShoppingCartDTO> dto;
    private SweetShop shop;
    boolean clickPaymentMethod = false;
    String clickPayMT;

    public SweetShopPayFrame(List<ShoppingCartDTO> dto) {
        this.dto = dto;
        initComponents();
        setLocationRelativeTo(null);

        setTextArea();
        setTotalCost();
    }

    public void setTextArea() {
        for (ShoppingCartDTO item : this.dto) {
            orderStringBuilder.append(item).append("\n");
        }
        orderTextArea.setText(orderStringBuilder.toString());
    }

    public int setTotalCost() {
        int totalPrice = 0;
        for (ShoppingCartDTO item : this.dto) {
            totalPrice += ((Number) item.getCost()).intValue();
        }
        inputTotalCost.setText(String.valueOf(totalPrice));
        return totalPrice;
    }

    public String getCombinedArray() { //List<ShoppingCartDTO> dto를 주문내역별 String 배열로 변환하고 String으로 반환
        String[] combinedArray = new String[dto.size()];
        for (int i = 0; i < dto.size(); i++) {
            ShoppingCartDTO item = dto.get(i);
            combinedArray[i] = item.getMenu() + "|" + item.getSize() + "|" + item.getCost();
        }
        String combinedOrderList = String.join(";", combinedArray);
        return combinedOrderList;
    }

    private void sendPayDetailsData() { //엔티티 SweetShop에 값을 입력한다.
        LocalDate date = LocalDate.now();
        String dateString = date.toString();

        this.shop = new SweetShop.SweetShopBuilder()
                .user("이지민") //로그인싱글턴 가져오기
                .orderList(getCombinedArray())
                .date(dateString)
                .PaymentMethod(clickPayMT)
                .Payment(setTotalCost())
                .build();
    }

    private void successPay() { //entity에 입력한 값들을 파일로 업데이트한다.
        SweetShopController controller = new SweetShopController();
        controller.createSweetShopFile(shop);
    }

    private void confirmMessage() {
        int response = JOptionPane.showConfirmDialog(this, "영수증을 출력하시겠습니까?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            ReceiptFrame receipt = new ReceiptFrame(shop);
            receipt.setVisible(true);
            dispose();
        }
        else if(response == JOptionPane.NO_OPTION){
            UserMainFrame frame = new UserMainFrame();
            frame.setVisible(true);
            dispose();
        }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputTotalCost = new javax.swing.JTextField();
        cashButton = new javax.swing.JButton();
        cardButton = new javax.swing.JButton();
        payButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));

        previousFrameButton.setBackground(new java.awt.Color(204, 204, 204));
        previousFrameButton.setText("결제취소");
        previousFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousFrameButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel1.setText("결제하기");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(previousFrameButton))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousFrameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)))
        );

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel3.setText("결제수단 :");

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel2.setText("결제가격 :");

        inputTotalCost.setEditable(false);
        inputTotalCost.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N

        cashButton.setBackground(new java.awt.Color(229, 229, 229));
        cashButton.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        cashButton.setText("현금");
        cashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashButtonActionPerformed(evt);
            }
        });

        cardButton.setBackground(new java.awt.Color(229, 229, 229));
        cardButton.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        cardButton.setText("카드");
        cardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardButtonActionPerformed(evt);
            }
        });

        payButton.setBackground(new java.awt.Color(204, 204, 204));
        payButton.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        payButton.setText("결제");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel4.setText("주문내역");

        orderTextArea.setColumns(20);
        orderTextArea.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        orderTextArea.setRows(5);
        orderTextArea.setEnabled(false);
        jScrollPane1.setViewportView(orderTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(236, 236, 236))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousFrameButtonActionPerformed
        UserMainFrame frame = new UserMainFrame();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_previousFrameButtonActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        if (clickPaymentMethod) {
            sendPayDetailsData();
            successPay();
            dto.clear();
            confirmMessage();
        } else
            JOptionPane.showMessageDialog(null, "결제수단을 선택해주세요.");
    }//GEN-LAST:event_payButtonActionPerformed

    private void cashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashButtonActionPerformed
        clickPayMT = "현금";
        clickPaymentMethod = true;
    }//GEN-LAST:event_cashButtonActionPerformed

    private void cardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardButtonActionPerformed
        clickPayMT = "카드";
        clickPaymentMethod = true;
    }//GEN-LAST:event_cardButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cardButton;
    private javax.swing.JButton cashButton;
    private javax.swing.JTextField inputTotalCost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea orderTextArea;
    private javax.swing.JButton payButton;
    private javax.swing.JButton previousFrameButton;
    // End of variables declaration//GEN-END:variables
}
