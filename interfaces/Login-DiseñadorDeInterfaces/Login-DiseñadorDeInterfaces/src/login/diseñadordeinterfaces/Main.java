/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.diseĆ±adordeinterfaces;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Genarogg
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtUser = new javax.swing.JTextField();
        jpswPss = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLFacebook = new javax.swing.JLabel();
        jLYoutube = new javax.swing.JLabel();
        jLTwitter = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLIniciarSecion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(900, 630));
        setMaximumSize(new java.awt.Dimension(900, 630));
        setMinimumSize(new java.awt.Dimension(900, 630));
        setUndecorated(true);
        setSize(new java.awt.Dimension(900, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/diseĆ±adordeinterfaces/img/OFICIALMENU.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(16, 16, 16));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(78, 34, 88));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(78, 34, 88));
        jLabel2.setText(" x");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(78, 34, 88));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(78, 34, 88));
        jLabel3.setText(" -");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ContraseĆ±a:");

        jLabel5.setBackground(new java.awt.Color(78, 34, 88));
        jLabel5.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(78, 34, 88));
        jLabel5.setText("Login_");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario:");

        jtxtUser.setBackground(new java.awt.Color(16, 16, 16));
        jtxtUser.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 18)); // NOI18N
        jtxtUser.setForeground(new java.awt.Color(78, 34, 88));
        jtxtUser.setText("Ingrese su usuario...");
        jtxtUser.setBorder(null);
        jtxtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtUserMouseClicked(evt);
            }
        });
        jtxtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUserActionPerformed(evt);
            }
        });

        jpswPss.setBackground(new java.awt.Color(16, 16, 16));
        jpswPss.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jpswPss.setForeground(new java.awt.Color(78, 34, 88));
        jpswPss.setText("*****************");
        jpswPss.setBorder(null);
        jpswPss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpswPssMouseClicked(evt);
            }
        });
        jpswPss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpswPssActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(16, 16, 16));
        jSeparator1.setForeground(new java.awt.Color(78, 34, 88));

        jSeparator2.setBackground(new java.awt.Color(16, 16, 16));
        jSeparator2.setForeground(new java.awt.Color(78, 34, 88));

        jSeparator3.setBackground(new java.awt.Color(16, 16, 16));
        jSeparator3.setForeground(new java.awt.Color(78, 34, 88));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sing up");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/diseĆ±adordeinterfaces/img/facebook_OFF.png"))); // NOI18N
        jLFacebook.setText("jLabel9");
        jLFacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLFacebook.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLFacebookMouseMoved(evt);
            }
        });
        jLFacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLFacebookMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLFacebookMouseExited(evt);
            }
        });

        jLYoutube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/diseĆ±adordeinterfaces/img/YOUTUBE.PNG"))); // NOI18N
        jLYoutube.setText("jLabel9");
        jLYoutube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLYoutube.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLYoutubeMouseMoved(evt);
            }
        });
        jLYoutube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLYoutubeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLYoutubeMouseExited(evt);
            }
        });

        jLTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/diseĆ±adordeinterfaces/img/twitter_OFF.png"))); // NOI18N
        jLTwitter.setText("jLabel9");
        jLTwitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLTwitter.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLTwitterMouseMoved(evt);
            }
        });
        jLTwitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLTwitterMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLTwitterMouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(78, 34, 88));
        jPanel2.setForeground(new java.awt.Color(78, 34, 88));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });

        jLIniciarSecion.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 16)); // NOI18N
        jLIniciarSecion.setForeground(new java.awt.Color(255, 255, 255));
        jLIniciarSecion.setText("Iniciar Sesion");
        jLIniciarSecion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLIniciarSecion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLIniciarSecionMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLIniciarSecion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLIniciarSecion, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLYoutube, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jLTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtUser)
                                    .addComponent(jpswPss)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(jSeparator3))
                                .addGap(107, 107, 107))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(67, 67, 67))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpswPss, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLYoutube, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 500, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUserActionPerformed

    private void jpswPssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpswPssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpswPssActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(Main.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        /*
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir del login?", "EXIT", dialogButton);
        if(result == 0){
            System.exit(0);
        }
        */
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jtxtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtUserMouseClicked
        jtxtUser.setText("");
    }//GEN-LAST:event_jtxtUserMouseClicked

    private void jpswPssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpswPssMouseClicked
        jpswPss.setText("");
    }//GEN-LAST:event_jpswPssMouseClicked

    private void jLIniciarSecionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLIniciarSecionMouseMoved
        
    }//GEN-LAST:event_jLIniciarSecionMouseMoved

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        
        
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        jPanel2.setBackground(new Color(54, 6, 55));
    }//GEN-LAST:event_jPanel2MouseMoved

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        jPanel2.setBackground(new Color(78,34,88));
    }//GEN-LAST:event_jPanel1MouseExited

    private void jLYoutubeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLYoutubeMouseMoved
        jLYoutube.setIcon(new ImageIcon(getClass().getResource("/login/diseĆ±adordeinterfaces/img/YOUTUBE_ON.png")));
    }//GEN-LAST:event_jLYoutubeMouseMoved

    private void jLYoutubeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLYoutubeMouseExited
        jLYoutube.setIcon(new ImageIcon(getClass().getResource("/login/diseĆ±adordeinterfaces/img/YOUTUBE.png")));
    }//GEN-LAST:event_jLYoutubeMouseExited

    private void jLFacebookMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLFacebookMouseMoved
        jLFacebook.setIcon(new ImageIcon(getClass().getResource("/login/diseĆ±adordeinterfaces/img/facebook_ON.png")));
    }//GEN-LAST:event_jLFacebookMouseMoved

    private void jLFacebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLFacebookMouseExited
        jLFacebook.setIcon(new ImageIcon(getClass().getResource("/login/diseĆ±adordeinterfaces/img/facebook_OFF.png")));
    }//GEN-LAST:event_jLFacebookMouseExited

    private void jLTwitterMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLTwitterMouseMoved
        jLTwitter.setIcon(new ImageIcon(getClass().getResource("/login/diseĆ±adordeinterfaces/img/twitter_ON.png")));
    }//GEN-LAST:event_jLTwitterMouseMoved

    private void jLTwitterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLTwitterMouseExited
        jLTwitter.setIcon(new ImageIcon(getClass().getResource("/login/diseĆ±adordeinterfaces/img/twitter_OFF.png")));
    }//GEN-LAST:event_jLTwitterMouseExited

    private void jLYoutubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLYoutubeMouseClicked
        try {
            Desktop.getDesktop().browse(URI.create("www.youtube.com"));
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No funciona", "Login", 0);
        }
    }//GEN-LAST:event_jLYoutubeMouseClicked

    private void jLFacebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLFacebookMouseClicked
        try {
            Desktop.getDesktop().browse(URI.create("www.facebook.com"));
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No funciona", "Login", 0);
        }
    }//GEN-LAST:event_jLFacebookMouseClicked

    private void jLTwitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLTwitterMouseClicked
        try {
            Desktop.getDesktop().browse(URI.create("www.twitter.com"));
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No funciona", "Login", 0);
        }
    }//GEN-LAST:event_jLTwitterMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLFacebook;
    private javax.swing.JLabel jLIniciarSecion;
    private javax.swing.JLabel jLTwitter;
    private javax.swing.JLabel jLYoutube;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField jpswPss;
    private javax.swing.JTextField jtxtUser;
    // End of variables declaration//GEN-END:variables
}
