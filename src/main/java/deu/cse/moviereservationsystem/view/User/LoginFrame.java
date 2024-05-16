/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deu.cse.moviereservationsystem.view.User;

import deu.cse.moviereservationsystem.view.MainFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LG
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        inputPW = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        foundIDFrameButton = new javax.swing.JButton();
        foundPWFrameButton = new javax.swing.JButton();

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
        jLabel1.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(previousFrameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousFrameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)))
        );

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 0, 20)); // NOI18N
        jLabel2.setText("ID :");

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 0, 20)); // NOI18N
        jLabel3.setText("PW :");

        inputID.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N

        inputPW.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N

        loginButton.setBackground(new java.awt.Color(204, 204, 204));
        loginButton.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        loginButton.setText("로그인");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        foundIDFrameButton.setBackground(new java.awt.Color(204, 204, 204));
        foundIDFrameButton.setText("ID찾기");
        foundIDFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foundIDFrameButtonActionPerformed(evt);
            }
        });

        foundPWFrameButton.setBackground(new java.awt.Color(204, 204, 204));
        foundPWFrameButton.setText("PW 찾기");
        foundPWFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foundPWFrameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputID)
                    .addComponent(inputPW, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foundIDFrameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foundPWFrameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(inputPW, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(foundIDFrameButton)
                        .addComponent(foundPWFrameButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousFrameButtonActionPerformed
        // TODO add your handling code here:
        MainFrame main = new MainFrame();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_previousFrameButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        //만약 입력된 회원정보가 맞다면
        UserMainFrame user = new UserMainFrame();
        user.setVisible(true);
        dispose();
        //아니라면
        //JOptionPane.showMessageDialog(null, "로그인 정보가 맞지 않습니다.");
    }//GEN-LAST:event_loginButtonActionPerformed

    private void foundIDFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foundIDFrameButtonActionPerformed
        // TODO add your handling code here:
        FoundIDFrame id = new FoundIDFrame();
        id.setVisible(true);
        dispose();
    }//GEN-LAST:event_foundIDFrameButtonActionPerformed

    private void foundPWFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foundPWFrameButtonActionPerformed
        // TODO add your handling code here:
        FoundPWFrame pw = new FoundPWFrame();
        pw.setVisible(true);
        dispose();
    }//GEN-LAST:event_foundPWFrameButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton foundIDFrameButton;
    private javax.swing.JButton foundPWFrameButton;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputPW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton previousFrameButton;
    // End of variables declaration//GEN-END:variables
}