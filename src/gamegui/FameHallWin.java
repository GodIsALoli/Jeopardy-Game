/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegui;

import javax.swing.*;
import gamemodal.*;
import java.util.Iterator;

/**
 *
 * @author student
 */
public class FameHallWin extends javax.swing.JFrame {

    /**
     * Creates new form FrameHall
     */
    private JeopardyGame gameCore;
    private JLabel[] nameLabels;
    
    public FameHallWin(JeopardyGame gameCore) {
        initComponents();
        
        this.gameCore = gameCore;
        nameLabels = new JLabel[5];
        initLabelArray();
    }

    private void initLabelArray(){
        nameLabels[0] = top1Label;
        nameLabels[1] = top2Label;
        nameLabels[2] = top3Label;
        nameLabels[3] = top4Label;
        nameLabels[4] = top5Label;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        t1NameLabel = new javax.swing.JLabel();
        t2NameLabel = new javax.swing.JLabel();
        t3NameLabel = new javax.swing.JLabel();
        t4NameLabel = new javax.swing.JLabel();
        t5NameLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        top1Label = new javax.swing.JLabel();
        top2Label = new javax.swing.JLabel();
        top3Label = new javax.swing.JLabel();
        top4Label = new javax.swing.JLabel();
        top5Label = new javax.swing.JLabel();
        challengeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 100)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("FameHall");

        jPanel4.setLayout(new java.awt.GridLayout(5, 1, 0, 30));

        t1NameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        t1NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        t1NameLabel.setText("Challenger:");
        t1NameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(t1NameLabel);

        t2NameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        t2NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        t2NameLabel.setText("Master:");
        t2NameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(t2NameLabel);

        t3NameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        t3NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        t3NameLabel.setText("Diamond:");
        t3NameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(t3NameLabel);

        t4NameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        t4NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        t4NameLabel.setText("Platinum:");
        t4NameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(t4NameLabel);

        t5NameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        t5NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        t5NameLabel.setText("Gold:");
        t5NameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(t5NameLabel);

        jPanel5.setLayout(new java.awt.GridLayout(5, 1, 0, 30));

        top1Label.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jPanel5.add(top1Label);

        top2Label.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jPanel5.add(top2Label);

        top3Label.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jPanel5.add(top3Label);

        top4Label.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jPanel5.add(top4Label);

        top5Label.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jPanel5.add(top5Label);

        challengeButton.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        challengeButton.setText("Challenge");
        challengeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                challengeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(454, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(challengeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(455, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(challengeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void challengeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_challengeButtonActionPerformed
        // TODO add your handling code here:
        new AddPlayerWin(gameCore).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_challengeButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Iterator<Player> playerIterator = gameCore.getPlayerManager().getOrderedPlayers().iterator();
        
        for(int index = 0; index < 5 && playerIterator.hasNext(); index++){
            Player thePlayer = playerIterator.next();
            String displayString = thePlayer.name + " " + thePlayer.mark; 
            nameLabels[index].setText(displayString);
        }
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FameHallWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FameHallWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FameHallWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FameHallWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JeopardyGame gameCore = new JeopardyGame();
                new FameHallWin(gameCore).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton challengeButton;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel t1NameLabel;
    private javax.swing.JLabel t2NameLabel;
    private javax.swing.JLabel t3NameLabel;
    private javax.swing.JLabel t4NameLabel;
    private javax.swing.JLabel t5NameLabel;
    private javax.swing.JLabel top1Label;
    private javax.swing.JLabel top2Label;
    private javax.swing.JLabel top3Label;
    private javax.swing.JLabel top4Label;
    private javax.swing.JLabel top5Label;
    // End of variables declaration//GEN-END:variables
}