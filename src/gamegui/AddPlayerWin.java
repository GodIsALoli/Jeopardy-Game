/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegui;

import java.awt.Color;
import exception.*;
import gamecontroller.*;
import java.util.Observer;
import java.util.Observable;
import java.io.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author iqapp
 */
public class AddPlayerWin extends javax.swing.JFrame implements  Observer{

    /**
     * Creates new form AddPlayerWin
     */
    private int currentIndex;
    private boolean isSettingKey;
    private final String titleMessagePrefix;
    private final String warningMessagePrefix;
    private char presentKey;
    private final JeopardyGame gameCore;
    private final String defaultKeyLabelText = "[Click here to set key]";
    private final Color defaultKeyLabelColor = Color.GRAY;
    
    
    public AddPlayerWin(JeopardyGame gameCore) {
        initComponents();
        currentIndex = -1;
        isSettingKey = false;
        titleMessagePrefix = "Total players: ";
        warningMessagePrefix = "Can't start game: ";
        presentKey = 0;
        this.gameCore = gameCore;
        this.gameCore.addObserver(this);
        JeopardyColors.setComponentColor(this.rootPane);
        this.setTitle(titleMessagePrefix + gameCore.getNumOfCurrentPlayers());
        this.resetNameTextField();
        this.resetKeyLabel();
    }
    
    public void dispose(){
        if(!gameCore.isStarted()){
            gameCore.end();
            new FameHallWin(this.gameCore).setVisible(true);
        }
        
        this.gameCore.deleteObserver(this);
        super.dispose();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nameTextField = new javax.swing.JTextField();
        setKeyLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        prevButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(2, 0, 0, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("key:");
        jPanel1.add(jLabel2);

        jPanel2.setLayout(new java.awt.GridLayout(2, 0, 0, 10));

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });
        nameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameTextFieldMouseClicked(evt);
            }
        });
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTextFieldKeyTyped(evt);
            }
        });
        jPanel2.add(nameTextField);

        setKeyLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        setKeyLabel.setForeground(new java.awt.Color(153, 153, 153));
        setKeyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setKeyLabel.setFocusTraversalPolicyProvider(true);
        setKeyLabel.setFocusable(false);
        setKeyLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setKeyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                setKeyLabelMouseReleased(evt);
            }
        });
        jPanel2.add(setKeyLabel);

        jPanel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel3KeyTyped(evt);
            }
        });
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 50, 0));

        prevButton.setText("Prev");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });
        jPanel3.add(prevButton);

        startButton.setText("Start");
        startButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                startButtonFocusLost(evt);
            }
        });
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        jPanel3.add(startButton);

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel3.add(nextButton);

        warningLabel.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(warningLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(warningLabel)
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void setKeyLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setKeyLabelMouseReleased
        // TODO add your handling code here:
        this.warningLabel.setText("");
        this.resetKeyLabel();
        this.requestFocus();
        this.setKeyLabel.setText("Press a key [A-Z]");
        this.isSettingKey = true;
    }//GEN-LAST:event_setKeyLabelMouseReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void jPanel3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3KeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
        if(this.isSettingKey && Character.isAlphabetic(evt.getKeyChar())){
            this.setKeyLabel.setForeground(JeopardyColors.FONT);
            this.setKeyLabel.setText(Character.toString(evt.getKeyChar()));
            this.presentKey = evt.getKeyChar();
        }
        else if(isSettingKey)
            this.setKeyLabel.setText("[A-Z] only");
    }//GEN-LAST:event_formKeyTyped

    private void nameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTextFieldMouseClicked
        // TODO add your handling code here:
        this.warningLabel.setText("");
    }//GEN-LAST:event_nameTextFieldMouseClicked

    private void nameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusGained
        // TODO add your handling code here:
        this.nameTextField.selectAll();
    }//GEN-LAST:event_nameTextFieldFocusGained
        
    private boolean addNewPlayer(){
        boolean res = false;
        try{
            if(currentIndex == this.gameCore.getNumOfCurrentPlayers() - 1)
                gameCore.addNewPlayer(this.nameTextField.getText(), presentKey);
                
            else
                gameCore.modifyPlayer(currentIndex + 1, this.nameTextField.getText(), presentKey);
            
            currentIndex++;
            res = true;
        }
        catch(DuplicateNameException e){
            this.nameTextField.selectAll();
            this.warningLabel.setText("Name exits, please use a different name");
        }
        catch(DuplicateKeyException e){
            this.resetKeyLabel();
            this.warningLabel.setText("Key exits, please choose a new one");
            this.isSettingKey = true;
            this.requestFocus();
        }
        catch(EmptyPlayerNameException e){
            this.nameTextField.requestFocus();
            this.warningLabel.setText("Please enter your name");
        }
        catch(EmptyPlayerKeyException e){
            this.resetKeyLabel();
            this.warningLabel.setText("Please press a key");
            this.isSettingKey = true;
            this.requestFocus();
        }
        
        return res;
    }
    
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        if(addNewPlayer()){
            if(currentIndex != this.gameCore.getNumOfCurrentPlayers() - 1)
                displayPlayer(currentIndex + 1);
            else{
                this.resetKeyLabel();
                this.resetNameTextField();
            }

            this.isSettingKey = false;
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
        if(this.presentKey == 0)
            this.resetKeyLabel();
    }//GEN-LAST:event_formFocusLost

    private void displayPlayer(int index){
        Player player = this.gameCore.getPlayer(index);
        this.presentKey = player.getKey();
        this.setKeyLabel.setText(Character.toString(presentKey));
        this.nameTextField.setForeground(Color.GRAY);
        String presentName = player.getName();
        this.nameTextField.setText(presentName);
    }
    
    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        // TODO add your handling code here:        
        if(gameCore.getNumOfCurrentPlayers() > 0)
            if(currentIndex >= 0)
                displayPlayer(currentIndex--);
            else
                displayPlayer(0);
    }//GEN-LAST:event_prevButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        try{
            if(!this.nameTextField.getText().equals("") || this.presentKey != 0)
                if(!this.addNewPlayer())
                    return;
        
            gameCore.start("questions.txt");
            new MainWin(gameCore).setVisible(true);
            this.dispose();
        }
        catch(NotEnoughPlayersException | IOException e){
            this.resetKeyLabel();
            this.resetNameTextField();
            warningLabel.setText(this.warningMessagePrefix + e.getMessage());
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void startButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_startButtonFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_startButtonFocusLost

    private void nameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldKeyTyped

    private void resetNameTextField(){
        this.nameTextField.setText(""); 
        this.nameTextField.requestFocus();
        this.nameTextField.setForeground(JeopardyColors.FONT);
    }
    
    private void resetKeyLabel(){
        this.presentKey = 0;
        this.setKeyLabel.setText(this.defaultKeyLabelText);
        this.setKeyLabel.setForeground(this.defaultKeyLabelColor);
    }
    
    @Override
    public void update(Observable o, Object arg){
        this.setTitle(titleMessagePrefix + (int)arg);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JLabel setKeyLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
