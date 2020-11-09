/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_employee;

import Form_Login.Login;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Nga HIHI
 */
public class Form_employee_main extends javax.swing.JFrame {

  public void clock(){
      Thread t= new Thread(){
          @Override
          public void run() {
              SimpleDateFormat sdf= new SimpleDateFormat("hh:mm:ss aa");
             while(true){
                  try {
                  
                  Date d= new Date();
                  txtTime.setText(sdf.format(d));
                  Thread.sleep(1000);
              } catch (Exception e) {
                  e.printStackTrace();
              }
             }
          }
          
      };
      t.start();
  }
    public Form_employee_main() {
        initComponents();
        setLocationRelativeTo(null);
        clock();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdestopPane = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        btn_logout = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_readCard = new javax.swing.JButton();
        btn_loanCard = new javax.swing.JButton();
        btn_member = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        txtTime = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnu_system = new javax.swing.JMenu();
        mni_login = new javax.swing.JMenuItem();
        mni_logout = new javax.swing.JMenuItem();
        mni_changepsw = new javax.swing.JMenuItem();
        mni_exit = new javax.swing.JMenuItem();
        mnu_manage = new javax.swing.JMenu();
        mni_readCard = new javax.swing.JMenuItem();
        mni_loanCard = new javax.swing.JMenuItem();
        mni_mngMember = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jToolBar1.setBackground(new java.awt.Color(0, 255, 255));
        jToolBar1.setForeground(new java.awt.Color(255, 255, 51));
        jToolBar1.setRollover(true);

        btn_logout.setBackground(new java.awt.Color(153, 153, 255));
        btn_logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 0));
        btn_logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\exit.png")); // NOI18N
        btn_logout.setText("Đăng xuất");
        btn_logout.setFocusable(false);
        btn_logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_logout.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_logout);

        btn_exit.setBackground(new java.awt.Color(153, 153, 255));
        btn_exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 0));
        btn_exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\shut-down-button.png")); // NOI18N
        btn_exit.setText("Thoát");
        btn_exit.setFocusable(false);
        btn_exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exit.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_exit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_exit);

        btn_readCard.setBackground(new java.awt.Color(153, 153, 255));
        btn_readCard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_readCard.setForeground(new java.awt.Color(255, 255, 0));
        btn_readCard.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\id-card.png")); // NOI18N
        btn_readCard.setText("Quản lý thẻ đọc");
        btn_readCard.setFocusable(false);
        btn_readCard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_readCard.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_readCard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_readCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_readCardActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_readCard);

        btn_loanCard.setBackground(new java.awt.Color(153, 153, 255));
        btn_loanCard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_loanCard.setForeground(new java.awt.Color(255, 255, 0));
        btn_loanCard.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\id-card2.png")); // NOI18N
        btn_loanCard.setText("Quản lý thẻ mượn");
        btn_loanCard.setFocusable(false);
        btn_loanCard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_loanCard.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_loanCard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_loanCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loanCardActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_loanCard);

        btn_member.setBackground(new java.awt.Color(153, 153, 255));
        btn_member.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_member.setForeground(new java.awt.Color(255, 255, 0));
        btn_member.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\read.png")); // NOI18N
        btn_member.setText("Quản lý người đọc");
        btn_member.setFocusable(false);
        btn_member.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_member.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_member.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_memberActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_member);

        jdestopPane.add(jToolBar1);
        jToolBar1.setBounds(-10, 0, 1280, 70);

        jToolBar2.setRollover(true);

        txtTime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTime.setForeground(new java.awt.Color(255, 0, 51));
        txtTime.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\clock.png")); // NOI18N
        txtTime.setText("time");
        jToolBar2.add(txtTime);

        jdestopPane.add(jToolBar2);
        jToolBar2.setBounds(-10, 680, 1280, 30);

        mnu_system.setMnemonic('f');
        mnu_system.setText("Hệ thống");
        mnu_system.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mni_login.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mni_login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_login.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\home (2).png")); // NOI18N
        mni_login.setMnemonic('o');
        mni_login.setText("Đăng nhập");
        mni_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_loginActionPerformed(evt);
            }
        });
        mnu_system.add(mni_login);

        mni_logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mni_logout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\exit.png")); // NOI18N
        mni_logout.setMnemonic('s');
        mni_logout.setText("Đăng xuất");
        mni_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_logoutActionPerformed(evt);
            }
        });
        mnu_system.add(mni_logout);

        mni_changepsw.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mni_changepsw.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_changepsw.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\update.png")); // NOI18N
        mni_changepsw.setMnemonic('a');
        mni_changepsw.setText("Đổi mật khẩu");
        mnu_system.add(mni_changepsw);

        mni_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mni_exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\shut-down-button.png")); // NOI18N
        mni_exit.setMnemonic('x');
        mni_exit.setText("Thoát");
        mni_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_exitActionPerformed(evt);
            }
        });
        mnu_system.add(mni_exit);

        menuBar.add(mnu_system);

        mnu_manage.setMnemonic('e');
        mnu_manage.setText("Quản lý");
        mnu_manage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mni_readCard.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_readCard.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\id-card.png")); // NOI18N
        mni_readCard.setMnemonic('t');
        mni_readCard.setText("Quản lý thẻ đọc");
        mni_readCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_readCardActionPerformed(evt);
            }
        });
        mnu_manage.add(mni_readCard);

        mni_loanCard.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_loanCard.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\id-card2.png")); // NOI18N
        mni_loanCard.setMnemonic('y');
        mni_loanCard.setText("Quản lý thẻ mượn");
        mni_loanCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_loanCardActionPerformed(evt);
            }
        });
        mnu_manage.add(mni_loanCard);

        mni_mngMember.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_mngMember.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\read.png")); // NOI18N
        mni_mngMember.setMnemonic('d');
        mni_mngMember.setText("Quản lý độc giả");
        mni_mngMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_mngMemberActionPerformed(evt);
            }
        });
        mnu_manage.add(mni_mngMember);

        menuBar.add(mnu_manage);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdestopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdestopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mni_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_exitActionPerformed
         int chon = JOptionPane.showConfirmDialog(this, "bạn có muốn thoát?");
        if (chon != JOptionPane.YES_OPTION) {
            return;
        }
        System.exit(0);
    }//GEN-LAST:event_mni_exitActionPerformed

    private void mni_loanCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_loanCardActionPerformed
      Manage_loanCardEmployee FrLoan= new Manage_loanCardEmployee();
      jdestopPane.add(FrLoan);
      FrLoan.setVisible(true);
    }//GEN-LAST:event_mni_loanCardActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        int chon = JOptionPane.showConfirmDialog(this, "bạn có muốn đăng xuất?");
        if (chon != JOptionPane.YES_OPTION) {
            return;
        }
        Login lg= new Login();
       lg.setVisible(true);
       dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        int chon = JOptionPane.showConfirmDialog(this, "bạn có muốn thoát?");
        if (chon != JOptionPane.YES_OPTION) {
            return;
        }
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void mni_readCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_readCardActionPerformed
       Manage_readCardEmployee FrRead= new Manage_readCardEmployee();
       jdestopPane.add(FrRead);
       FrRead.setVisible(true);
    }//GEN-LAST:event_mni_readCardActionPerformed

    private void mni_mngMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_mngMemberActionPerformed
      Manage_memberEmployee FrMember= new Manage_memberEmployee();
      jdestopPane.add(FrMember);
      FrMember.setVisible(true);
    }//GEN-LAST:event_mni_mngMemberActionPerformed

    private void btn_readCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_readCardActionPerformed
         Manage_readCardEmployee FrRead= new Manage_readCardEmployee();
       jdestopPane.add(FrRead);
       FrRead.setVisible(true);
    }//GEN-LAST:event_btn_readCardActionPerformed

    private void btn_loanCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loanCardActionPerformed
        Manage_loanCardEmployee FrLoan= new Manage_loanCardEmployee();
      jdestopPane.add(FrLoan);
      FrLoan.setVisible(true);
    }//GEN-LAST:event_btn_loanCardActionPerformed

    private void btn_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_memberActionPerformed
       Manage_memberEmployee FrMember= new Manage_memberEmployee();
      jdestopPane.add(FrMember);
      FrMember.setVisible(true);
    }//GEN-LAST:event_btn_memberActionPerformed

    private void mni_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_logoutActionPerformed
        int chon = JOptionPane.showConfirmDialog(this, "bạn có muốn đăng xuất không??");
        if (chon != JOptionPane.YES_OPTION) {
            return;
        }
        Login lg= new Login();
       lg.setVisible(true);
       dispose();
    }//GEN-LAST:event_mni_logoutActionPerformed

    private void mni_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mni_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Form_employee_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_employee_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_employee_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_employee_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_employee_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_loanCard;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_member;
    private javax.swing.JButton btn_readCard;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JDesktopPane jdestopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mni_changepsw;
    private javax.swing.JMenuItem mni_exit;
    private javax.swing.JMenuItem mni_loanCard;
    private javax.swing.JMenuItem mni_login;
    private javax.swing.JMenuItem mni_logout;
    private javax.swing.JMenuItem mni_mngMember;
    private javax.swing.JMenuItem mni_readCard;
    private javax.swing.JMenu mnu_manage;
    private javax.swing.JMenu mnu_system;
    private javax.swing.JLabel txtTime;
    // End of variables declaration//GEN-END:variables

}
