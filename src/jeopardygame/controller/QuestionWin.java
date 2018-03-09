/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeopardygame.controller;

import jeopardygame.visualeffect.JeopardyColors;
import jeopardygame.model.JeopardyGame;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
/**
 *
 * @author student
 */

public class QuestionWin extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form QuestionWin
     */
    private final MainWin theMainWindow;
    private final String answer;
    private final int credits;
    private final Timer answerTimer;
    private final Timer waitTimer;
    private final int maxAnswerTime = 30;
    private final int maxWaitTime = 10;
    private int timeRemaining;
    private boolean ignoreInput;
    private boolean isShowingAnswer;
    private final boolean isDoubleJeopardy;
    private final JeopardyGame gameCore;
    private Clip thinkingClip;
    
    public QuestionWin(int categoryIndex, int questionIndex, JeopardyGame gameCore, MainWin theMainWindow, boolean isDoubleJeopardy) {
        initComponents();
        gameCore.clearForbiddenPlayers();
        this.theMainWindow = theMainWindow;
        this.gameCore = gameCore;
        this.qaTextArea.setText(gameCore.getQuestion(categoryIndex, questionIndex).questionText);
        this.answer = this.gameCore.getQuestion(categoryIndex, questionIndex).answerText;
        this.credits = gameCore.getQuestion(categoryIndex, questionIndex).getCredits();
        this.answerTimer = new Timer(1000, this);
        this.waitTimer = new Timer(1000, new WaitTimerListener(this));
        isShowingAnswer = false;
        JeopardyColors.setComponentColor(this.rootPane);
        this.isDoubleJeopardy = isDoubleJeopardy;
        if(!isDoubleJeopardy)
            this.startToWait();
        else
            this.startToAnswer();
        this.setLocationRelativeTo(null);
        this.backButton.setVisible(false);
    }

    private void playThinkingMusic(){
        try{
            thinkingClip = AudioSystem.getClip();

            AudioInputStream themeStream = AudioSystem.getAudioInputStream(new File("theme.wav"));
            thinkingClip.open(themeStream);
            thinkingClip.start();
            
        }
        catch(LineUnavailableException | UnsupportedAudioFileException | IOException e){
            System.err.println("Can't play theme music");
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

        jScrollPane2 = new javax.swing.JScrollPane();
        qaTextArea = new javax.swing.JTextArea();
        timeLabel = new javax.swing.JLabel();
        answeringName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        wrongButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        qaTextArea.setColumns(20);
        qaTextArea.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        qaTextArea.setLineWrap(true);
        qaTextArea.setRows(5);
        qaTextArea.setFocusable(false);
        jScrollPane2.setViewportView(qaTextArea);

        timeLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("Time");

        answeringName.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        answeringName.setText("Please type your key");

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 200, 5));

        wrongButton.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        wrongButton.setText("Wrong");
        wrongButton.setToolTipText("");
        wrongButton.setPreferredSize(new java.awt.Dimension(200, 66));
        wrongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrongButtonActionPerformed(evt);
            }
        });
        jPanel1.add(wrongButton);

        rightButton.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        rightButton.setText("Right");
        rightButton.setPreferredSize(new java.awt.Dimension(200, 66));
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });
        jPanel1.add(rightButton);

        backButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(answeringName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1573, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(answeringName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(timeLabel)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private class WaitTimerListener implements ActionListener{
//<editor-fold defaultstate="collapsed" desc="comment">
        private final QuestionWin theQuestionWin;
//</editor-fold>
        public WaitTimerListener(QuestionWin theQuestionWin){
            this.theQuestionWin = theQuestionWin;
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
        if(timeRemaining == 1)
            waitTimeUp();
        else
            timeLabel.setText(Integer.toString(--timeRemaining));
        }
        
        private void waitTimeUp(){
            waitTimer.stop();
            timeLabel.setText("Sorry, time is up. The answer is: ");
            this.theQuestionWin.showAnswer();
            
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(this.timeRemaining == 1)
            AnswerTimeUp();
        else
            this.timeLabel.setText(Integer.toString(--this.timeRemaining));
    }
    
    private void AnswerTimeUp(){
        this.answerTimer.stop();
        this.timeLabel.setText("Sorry, time is up.");
        this.wrongButtonActionPerformed(null);
    }
    
    private void showAnswer(){
        this.isShowingAnswer = true;
        this.qaTextArea.setText(this.answer + "\n[Click Back to go back]");
        this.rightButton.setVisible(false);
        this.wrongButton.setVisible(false);
        this.backButton.setVisible(true);
    }
    
    private void showMainWindow(){
        this.gameCore.clearForbiddenPlayers();
        theMainWindow.setVisible(true);
        this.dispose();
    }
    
    private void stopAnswer(){
        this.answerTimer.stop();
        this.thinkingClip.stop();
    }
    
    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButtonActionPerformed
        // TODO add your handling code here:
        this.stopAnswer();
        this.gameCore.changeCredit(credits);
        this.showAnswer();
    }//GEN-LAST:event_rightButtonActionPerformed

    private void startToAnswer(){
        this.waitTimer.stop();
        this.playThinkingMusic();
        this.ignoreInput = true;
        this.timeRemaining = this.maxAnswerTime;
        this.timeLabel.setText(Integer.toString(this.timeRemaining));
        this.rightButton.setVisible(true);
        this.wrongButton.setVisible(true);
        int answeringPlayerIndex = gameCore.getAnsweringPlayerIndex();
        this.answeringName.setText(answeringPlayerIndex == -1 ? "Unknown player" : this.gameCore.getPlayer(answeringPlayerIndex).getName());
        this.answerTimer.start();
    }
    
    private void startToWait(){
        this.ignoreInput = false;
        this.timeRemaining = this.maxWaitTime;
        this.timeLabel.setText(Integer.toString(this.timeRemaining));
        this.rightButton.setVisible(false);
        this.wrongButton.setVisible(false);
        this.requestFocus();
        this.waitTimer.start();
    }
    
    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
        if(!this.isShowingAnswer && !ignoreInput && this.gameCore.setAnsweringPlayer(evt.getKeyChar()))
            startToAnswer();
    }//GEN-LAST:event_formKeyTyped
  
    private void wrongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrongButtonActionPerformed
        // TODO add your handling code here:
        this.stopAnswer();

        this.gameCore.changeCredit(-credits);
        if(isDoubleJeopardy){
            this.answeringName.setText("Sorry, that is wrong.");
            this.showAnswer();
        }
        else if(this.gameCore.numberOfAllowablePlayers() == 0){
            this.answeringName.setText("Sorry, nobody got it right");
            this.showAnswer();
        }
        else{
            this.answeringName.setText("Sorry, that is wrong.\nAnyone else?");
            this.startToWait();
        }
    }//GEN-LAST:event_wrongButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.showMainWindow();
    }//GEN-LAST:event_backButtonActionPerformed
  
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answeringName;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea qaTextArea;
    private javax.swing.JButton rightButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JButton wrongButton;
    // End of variables declaration//GEN-END:variables
}
