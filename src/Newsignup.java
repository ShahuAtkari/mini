/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author S R COMPUTER
 */
public class Newsignup extends javax.swing.JFrame {

    /**
     * Creates new form Newsignup
     */
    public Newsignup() {
        initComponents();
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
        Tusername = new javax.swing.JTextField();
        Tphone = new javax.swing.JTextField();
        Temail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        Tpassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tusername.setBackground(new java.awt.Color(0, 0, 0));
        Tusername.setForeground(new java.awt.Color(255, 255, 255));
        Tusername.setBorder(null);
        Tusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TusernameActionPerformed(evt);
            }
        });
        Tusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TusernameKeyPressed(evt);
            }
        });
        jPanel1.add(Tusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 390, 30));

        Tphone.setBackground(new java.awt.Color(0, 0, 0));
        Tphone.setForeground(new java.awt.Color(255, 255, 255));
        Tphone.setBorder(null);
        Tphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TphoneActionPerformed(evt);
            }
        });
        jPanel1.add(Tphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 400, 30));

        Temail.setBackground(new java.awt.Color(0, 0, 0));
        Temail.setForeground(new java.awt.Color(255, 255, 255));
        Temail.setBorder(null);
        Temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemailActionPerformed(evt);
            }
        });
        Temail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TemailKeyPressed(evt);
            }
        });
        jPanel1.add(Temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 400, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Signup Now");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 300, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Creating an account is free...");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 330, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Phone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 80, -1));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 153, 0));
        jCheckBox1.setText("I accept to the Terms & Conditions");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, 20));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 420, 50));

        Tpassword.setBackground(new java.awt.Color(0, 0, 0));
        Tpassword.setForeground(new java.awt.Color(255, 255, 255));
        Tpassword.setText("jPasswordField1");
        Tpassword.setBorder(null);
        Tpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TpasswordActionPerformed(evt);
            }
        });
        Tpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TpasswordKeyPressed(evt);
            }
        });
        jPanel1.add(Tpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 400, 30));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 880, -1, -1));

        jLabel11.setToolTipText("");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 880, -1, -1));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 880, -1, -1));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 880, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 80, 20));

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 100, 20));

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 90, 20));

        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 190, 20));

        jLabel18.setForeground(new java.awt.Color(153, 255, 153));
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, 40));

        jLabel19.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 50, 40));

        jLabel20.setForeground(new java.awt.Color(204, 51, 0));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 50, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 390, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 400, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 400, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 410, 10));

        jLabel21.setIcon(new javax.swing.ImageIcon("F:\\netbean\\netbean project\\mini_project\\src\\mini_project\\icons8-close-window-48.png")); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 50, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon("F:\\netbean\\netbean project\\mini_project\\src\\mini_project\\icons8-restore-window-48.png")); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, 40));

        jLabel23.setIcon(new javax.swing.ImageIcon("F:\\netbean\\netbean project\\mini_project\\src\\mini_project\\icons8-minimize-window-48.png")); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 490, 770));

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 900, 1230, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\netbean\\netbean project\\mini_project\\src\\mini_project\\2.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        { 
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_projectorganization","root","");
			Statement st=con.createStatement();
                        String i=Tusername.getText();
			String n=Tphone.getText();
			String c=Temail.getText();
                        String p=Tpassword.getText();
			st.executeUpdate("insert into sign_up1 values('"+i+"','"+n+"','"+c+"','"+p+"')");
			con.close();
                        JOptionPane.showConfirmDialog(null,"sucessfully signup");
		}
		catch (SQLException e)
        {
			System.out.println(e);
        }
// TODO add your handling code here:
         new home().setVisible(true);
                               this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TusernameKeyPressed
      String m=Tusername.getText();
      boolean b=m.contains("@");
if(b)
{
jLabel14.setText("valid");
}
else
{
jLabel14.setText("invalid");
}  // TODO add your handling code here:
    }//GEN-LAST:event_TusernameKeyPressed

    private void TpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TpasswordActionPerformed

    private void TpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TpasswordKeyPressed
    String value = Tpassword.getText();
				int l = value.length();
				if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
					
					jLabel17.setText("");
				} else {
					jLabel17.setText("* Enter only number(0-9)");
					
				}
    // TODO add your handling code here:
    }//GEN-LAST:event_TpasswordKeyPressed

    private void TemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TemailKeyPressed
     String mail=Temail.getText();
        Boolean b2=mail.contains("@")&&mail.contains(".");
	if(b2)
		{   
		jLabel16.setText("valid");
		}
		else
		{

			jLabel16.setText("invalid");
	}     
   // TODO add your handling code here:
    }//GEN-LAST:event_TemailKeyPressed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
      System.exit(0);  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
       this.setState(this.ICONIFIED); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void TphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TphoneActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void TusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TusernameActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
       Newlogin av =new Newlogin();
        av.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel21MouseClicked

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
            java.util.logging.Logger.getLogger(Newsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Newsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Newsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Newsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Newsignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Temail;
    private javax.swing.JPasswordField Tpassword;
    private javax.swing.JTextField Tphone;
    private javax.swing.JTextField Tusername;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
