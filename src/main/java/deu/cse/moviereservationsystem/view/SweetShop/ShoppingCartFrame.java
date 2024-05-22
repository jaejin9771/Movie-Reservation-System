/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deu.cse.moviereservationsystem.view.SweetShop;

import deu.cse.moviereservationsystem.DTO.SweetShop.ShoppingCartDTO;
import deu.cse.moviereservationsystem.Pattern.SweetShopObserver.Displayment;
import deu.cse.moviereservationsystem.Pattern.SweetShopObserver.Observer;
import deu.cse.moviereservationsystem.Pattern.SweetShopObserver.OrderList;
import deu.cse.moviereservationsystem.view.Payment.SweetShopPayFrame;
import deu.cse.moviereservationsystem.Pattern.SweetShopFacade;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LG
 */
public class ShoppingCartFrame extends javax.swing.JFrame implements Observer, Displayment {

    /**
     * Creates new form ShoppingCartFrame
     */
    ShoppingCartDTO dto ;
    List<ShoppingCartDTO> orderList = new ArrayList<>();

    private String menu;
    private String size;
    private int cost;

    DefaultTableModel model; //JTable 객체
    private static ShoppingCartFrame instance; // 인스턴스 변수 선언
    private OrderList order; //subject 객체

    private ShoppingCartFrame() {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) shoppingCartTable.getModel();
    }

    public static ShoppingCartFrame getInstance() { //싱글턴 패턴 사용
        if (instance == null) { // 인스턴스가 없는 경우에만 생성
            instance = new ShoppingCartFrame(); // 매개변수 없는 생성자 호출
        }
        return instance;
    }

    public void setOrder(OrderList order) { // 매개변수가 order인 생성자 호출
        this.order = order;
        order.addObserver(this);
    }

    private void requestDeleteObserver() {
        this.menu = "";
        this.size = "";
        this.cost = 0;
        OrderList order = OrderList.getInstance();
        order.receiveOrderList(menu, size, cost);
    }

    private void removeObserver() {
        SweetShopFacade facade = new SweetShopFacade();
        facade.offObserver();
    }

    @Override
    public void updateObserver(String menu, String size, int cost, int CountderOrder) {
        this.menu = menu;
        this.size = size;
        this.cost = cost;

        display();
    }

    @Override
    public void display() {
        inputTable();
    }

    public void inputTable() { //subject로부터 전달받은 주문목록을 테이블에 넣는 메서드
        Object[] rowData = {menu, cost, size};
        model.addRow(rowData);
    }

    private void sendOrderListData() {
        for (int i = 0; i < model.getRowCount(); i++) {
            dto = new ShoppingCartDTO.ShoppingCartBuilder()
                    .menu((String)model.getValueAt(i, 0))
                    .cost((Integer)model.getValueAt(i, 1))
                    .size((String)model.getValueAt(i, 2))
                    .build();

            orderList.add(dto);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        shoppingCartTable = new javax.swing.JTable();
        PaymentFrame = new javax.swing.JButton();

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
        jLabel1.setText("스위트샵 장바구니");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        shoppingCartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "메뉴", "가격", "사이즈"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(shoppingCartTable);

        PaymentFrame.setBackground(new java.awt.Color(204, 204, 204));
        PaymentFrame.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        PaymentFrame.setText("결제");
        PaymentFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PaymentFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PaymentFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PaymentFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentFrameActionPerformed
        sendOrderListData();
        requestDeleteObserver();
        removeObserver();

        SweetShopPayFrame pay = new SweetShopPayFrame(orderList);
        pay.setVisible(true);
        dispose();

        model.setRowCount(0); //장바구니 초기화
    }//GEN-LAST:event_PaymentFrameActionPerformed

    private void previousFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousFrameButtonActionPerformed
        // TODO add your handling code here:
        SweetShopFrame cart = SweetShopFrame.getInstance();
        cart.setVisible(true);
        dispose();
    }//GEN-LAST:event_previousFrameButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PaymentFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton previousFrameButton;
    private javax.swing.JTable shoppingCartTable;
    // End of variables declaration//GEN-END:variables
}
