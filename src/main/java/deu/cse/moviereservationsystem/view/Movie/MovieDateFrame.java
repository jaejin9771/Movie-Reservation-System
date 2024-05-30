/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deu.cse.moviereservationsystem.view.Movie;

import deu.cse.moviereservationsystem.Controller.ScheduleController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.ListSelectionModel;

/**
 *
 * @author LG
 */
public class MovieDateFrame extends javax.swing.JFrame {

    private String title;
    ScheduleController scheduleController = ScheduleController.getInstance();

    /**
     * Creates new form MovieDateFrame
     */
    public MovieDateFrame(String title) {
        initComponents();
        onlySingleColumn();
        setLocationRelativeTo(null);
        this.title = title;
        movieDateTable.setModel(scheduleController.updateTable(title));
    }

    private void onlySingleColumn() {
        movieDateTable.setCellSelectionEnabled(true);
        ListSelectionModel cellSelectionModel = movieDateTable.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        movieDateTable.setColumnSelectionAllowed(true);
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
        textLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        movieDateTable = new javax.swing.JTable();
        selectedDateButton = new javax.swing.JButton();

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
        jLabel1.setText("날짜 선택");

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

        textLabel.setBackground(new java.awt.Color(229, 229, 229));
        textLabel.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        textLabel.setText("예매할 날짜를 선택해주세요.");

        movieDateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "제목", "상영관", "상영날짜", "상영시간(분)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(movieDateTable);

        selectedDateButton.setBackground(new java.awt.Color(204, 204, 204));
        selectedDateButton.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        selectedDateButton.setText("선택");
        selectedDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedDateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(textLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(selectedDateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedDateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousFrameButtonActionPerformed
        // TODO add your handling code here:
        MovieScreeningFrame movie = new MovieScreeningFrame();
        movie.setVisible(true);
        dispose();
    }//GEN-LAST:event_previousFrameButtonActionPerformed

    private void selectedDateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedDateButtonActionPerformed
        // TODO add your handling code here:
        //선택된 영화정보와 날짜정보를 가지고 와야 함
        int row = movieDateTable.getSelectedRow();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        String title = (String) movieDateTable.getValueAt(row, 0);
        String theater = (String) movieDateTable.getValueAt(row, 1);
        String str = (String) movieDateTable.getValueAt(row, 2);
        int duration = Integer.parseInt(String.valueOf(movieDateTable.getValueAt(row, 3)));
        try {
            LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

            System.out.println("Result: " + dateTime.toString());
            scheduleController.delete(title, theater, dateTime, duration);
            MovieSeatFrame seat = new MovieSeatFrame(title, theater, dateTime, duration);
            seat.setVisible(true);
            dispose();
        } catch (DateTimeParseException ex) {

            ex.printStackTrace();
        }

    }//GEN-LAST:event_selectedDateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable movieDateTable;
    private javax.swing.JButton previousFrameButton;
    private javax.swing.JButton selectedDateButton;
    private javax.swing.JLabel textLabel;
    // End of variables declaration//GEN-END:variables
}
