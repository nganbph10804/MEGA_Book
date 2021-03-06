/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_admin;

import Form_Login.Login;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Nga HIHI
 */
public class Form_admin_main extends javax.swing.JFrame {

   public void clock(){
    Thread t = new Thread(){
        @Override
        public void run() {
            SimpleDateFormat sdf= new SimpleDateFormat("hh:mm:ss aa");
            while(true){
                try {
                    Date d=new Date();
                txttime.setText(sdf.format(d));
                Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        
    };
    t.start();
}
    public Form_admin_main() {
        initComponents();
        setLocationRelativeTo(null);
        clock();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        Jdesktop = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        btn_logout = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_staff = new javax.swing.JButton();
        btn_book = new javax.swing.JButton();
        btn_cardLoan = new javax.swing.JButton();
        btn_receipt = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        txttime = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mni_login = new javax.swing.JMenuItem();
        mni_logout = new javax.swing.JMenuItem();
        mni_changepsw = new javax.swing.JMenuItem();
        mni_exit = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        mni_mng_book = new javax.swing.JMenuItem();
        mni_mng_staff = new javax.swing.JMenuItem();
        mni_mng_receipt = new javax.swing.JMenuItem();
        mni_mng_bill = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mni_static_book = new javax.swing.JMenuItem();
        mni_count_book = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý thư viện - QUẢN LÝ");
        setResizable(false);

        jToolBar1.setBackground(new java.awt.Color(0, 255, 255));
        jToolBar1.setForeground(new java.awt.Color(255, 255, 51));
        jToolBar1.setRollover(true);

        btn_logout.setBackground(new java.awt.Color(153, 204, 255));
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

        btn_exit.setBackground(new java.awt.Color(153, 204, 255));
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

        btn_staff.setBackground(new java.awt.Color(153, 204, 255));
        btn_staff.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_staff.setForeground(new java.awt.Color(255, 255, 0));
        btn_staff.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\staff.png")); // NOI18N
        btn_staff.setText("Quản lý nhân viên");
        btn_staff.setFocusable(false);
        btn_staff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_staff.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_staff.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_staffActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_staff);

        btn_book.setBackground(new java.awt.Color(153, 204, 255));
        btn_book.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_book.setForeground(new java.awt.Color(255, 255, 0));
        btn_book.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\book.png")); // NOI18N
        btn_book.setText("Quản lý sách");
        btn_book.setFocusable(false);
        btn_book.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_book.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_book.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_book);

        btn_cardLoan.setBackground(new java.awt.Color(153, 204, 255));
        btn_cardLoan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_cardLoan.setForeground(new java.awt.Color(255, 255, 0));
        btn_cardLoan.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\invoice.png")); // NOI18N
        btn_cardLoan.setText("Quán lý phiếu mượn");
        btn_cardLoan.setFocusable(false);
        btn_cardLoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cardLoan.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_cardLoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cardLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cardLoanActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_cardLoan);

        btn_receipt.setBackground(new java.awt.Color(153, 204, 255));
        btn_receipt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_receipt.setForeground(new java.awt.Color(255, 255, 0));
        btn_receipt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\inventory.png")); // NOI18N
        btn_receipt.setText("Quán lý nhập sách ");
        btn_receipt.setFocusable(false);
        btn_receipt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_receipt.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_receipt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_receiptActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_receipt);

        Jdesktop.add(jToolBar1);
        jToolBar1.setBounds(-10, 0, 1280, 80);

        jToolBar2.setBackground(new java.awt.Color(51, 255, 255));
        jToolBar2.setEnabled(false);

        txttime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txttime.setForeground(new java.awt.Color(255, 0, 51));
        txttime.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\clock.png")); // NOI18N
        txttime.setText("TIME");
        txttime.setAlignmentY(0.0F);
        jToolBar2.add(txttime);

        Jdesktop.setLayer(jToolBar2, javax.swing.JLayeredPane.PALETTE_LAYER);
        Jdesktop.add(jToolBar2);
        jToolBar2.setBounds(-10, 800, 1490, 30);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Hệ thống");
        fileMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mni_login.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mni_login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_login.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\home (2).png")); // NOI18N
        mni_login.setMnemonic('o');
        mni_login.setText("Đăng nhập");
        fileMenu.add(mni_login);

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
        fileMenu.add(mni_logout);

        mni_changepsw.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mni_changepsw.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_changepsw.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\update.png")); // NOI18N
        mni_changepsw.setMnemonic('a');
        mni_changepsw.setText("Đổi mật khẩu");
        fileMenu.add(mni_changepsw);

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
        fileMenu.add(mni_exit);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Quản lý");
        editMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mni_mng_book.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_mng_book.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\book.png")); // NOI18N
        mni_mng_book.setMnemonic('t');
        mni_mng_book.setText("Quản lý sách");
        mni_mng_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_mng_bookActionPerformed(evt);
            }
        });
        editMenu.add(mni_mng_book);

        mni_mng_staff.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_mng_staff.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\staff.png")); // NOI18N
        mni_mng_staff.setMnemonic('y');
        mni_mng_staff.setText("Quản lý nhân viên");
        mni_mng_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_mng_staffActionPerformed(evt);
            }
        });
        editMenu.add(mni_mng_staff);

        mni_mng_receipt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_mng_receipt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\import.png")); // NOI18N
        mni_mng_receipt.setMnemonic('p');
        mni_mng_receipt.setText("Quản lý nhập sách");
        mni_mng_receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_mng_receiptActionPerformed(evt);
            }
        });
        editMenu.add(mni_mng_receipt);

        mni_mng_bill.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_mng_bill.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\name.png")); // NOI18N
        mni_mng_bill.setText("Quản lý phiếu mượn");
        mni_mng_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_mng_billActionPerformed(evt);
            }
        });
        editMenu.add(mni_mng_bill);

        menuBar.add(editMenu);

        jMenu2.setText("Thống kê");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mni_static_book.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_static_book.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\search (1).png")); // NOI18N
        mni_static_book.setText("Đầu sách mượn nhiều nhất");
        jMenu2.add(mni_static_book);

        mni_count_book.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mni_count_book.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nga HIHI\\Desktop\\PRO1014_DA1\\MEGA_BOOK\\src\\Icon\\book-shelf.png")); // NOI18N
        mni_count_book.setText("Lượng sách còn trong thư viện");
        jMenu2.add(mni_count_book);

        menuBar.add(jMenu2);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Trợ giúp");
        helpMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        contentMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Hướng dẫn");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Về chúng tôi");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Jdesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1274, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jdesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    private void mni_mng_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_mng_bookActionPerformed
        Manage_book_adminForm mngBook = new Manage_book_adminForm();
        Jdesktop.add(mngBook);
        mngBook.setVisible(true);
    }//GEN-LAST:event_mni_mng_bookActionPerformed

    private void mni_mng_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_mng_staffActionPerformed
        Manage_employee_adminForm mngEmployee = new Manage_employee_adminForm();
        Jdesktop.add(mngEmployee);
        mngEmployee.setVisible(true);
    }//GEN-LAST:event_mni_mng_staffActionPerformed

    private void mni_mng_receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_mng_receiptActionPerformed
        Manage_receipt_book_adminForm mngReceipt = new Manage_receipt_book_adminForm();
        Jdesktop.add(mngReceipt);
        mngReceipt.setVisible(true);
    }//GEN-LAST:event_mni_mng_receiptActionPerformed

    private void mni_mng_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_mng_billActionPerformed
        Manage_cardLoan_adminForm mngCardloan = new Manage_cardLoan_adminForm();
        Jdesktop.add(mngCardloan);
        mngCardloan.setVisible(true);
    }//GEN-LAST:event_mni_mng_billActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        int chon = JOptionPane.showConfirmDialog(this, "bạn có muốn thoát?");
        if (chon != JOptionPane.YES_OPTION) {
            return;
        }
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
      int chon = JOptionPane.showConfirmDialog(this, "bạn có muốn đăng xuất?");
        if (chon != JOptionPane.YES_OPTION) {
            return;
        }
        Login lg= new Login();
       lg.setVisible(true);
       dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_staffActionPerformed
        Manage_employee_adminForm mngEmployee = new Manage_employee_adminForm();
        Jdesktop.add(mngEmployee);
        mngEmployee.setVisible(true);
    }//GEN-LAST:event_btn_staffActionPerformed

    private void btn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookActionPerformed
        Manage_book_adminForm mngBook = new Manage_book_adminForm();
        Jdesktop.add(mngBook);
        mngBook.setVisible(true);
    }//GEN-LAST:event_btn_bookActionPerformed

    private void btn_cardLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cardLoanActionPerformed
        Manage_receipt_book_adminForm mngReceipt = new Manage_receipt_book_adminForm();
        Jdesktop.add(mngReceipt);
        mngReceipt.setVisible(true);
    }//GEN-LAST:event_btn_cardLoanActionPerformed

    private void btn_receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_receiptActionPerformed
        Manage_receipt_book_adminForm mngReceipt = new Manage_receipt_book_adminForm();
        Jdesktop.add(mngReceipt);
        mngReceipt.setVisible(true);
    }//GEN-LAST:event_btn_receiptActionPerformed

    private void mni_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_logoutActionPerformed
       int chon = JOptionPane.showConfirmDialog(this, "bạn có muốn đăng xuất?");
        if (chon != JOptionPane.YES_OPTION) {
            return;
        }
        Login lg= new Login();
       lg.setVisible(true);
       dispose();
    }//GEN-LAST:event_mni_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Form_admin_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_admin_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_admin_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_admin_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_admin_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Jdesktop;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton btn_book;
    private javax.swing.JButton btn_cardLoan;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_receipt;
    private javax.swing.JButton btn_staff;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mni_changepsw;
    private javax.swing.JMenuItem mni_count_book;
    private javax.swing.JMenuItem mni_exit;
    private javax.swing.JMenuItem mni_login;
    private javax.swing.JMenuItem mni_logout;
    private javax.swing.JMenuItem mni_mng_bill;
    private javax.swing.JMenuItem mni_mng_book;
    private javax.swing.JMenuItem mni_mng_receipt;
    private javax.swing.JMenuItem mni_mng_staff;
    private javax.swing.JMenuItem mni_static_book;
    private javax.swing.JLabel txttime;
    // End of variables declaration//GEN-END:variables

}
