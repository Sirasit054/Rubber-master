/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubbersystem;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Admin
 */
public class Home extends javax.swing.JFrame {
    DefaultTableModel model=new DefaultTableModel();
    Object[]data=new Object[0];
    Connection connect = null;
    private ResultSet rs = null;
    private String sql;
    






   
    public Home() {
        initComponents();
       
        setResizable(false);
        showPriceDate();
    
    }

   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtsheet = new javax.swing.JTextField();
        txtlatex = new javax.swing.JTextField();
        txtscrap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtdte = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        User = new javax.swing.JMenu();
        Cus = new javax.swing.JMenu();
        set = new javax.swing.JMenu();
        buy = new javax.swing.JMenu();
        latex = new javax.swing.JMenuItem();
        scrap = new javax.swing.JMenuItem();
        sheet = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/ราคายาง.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 260, 160));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("ยินดีต้อนรับ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 248, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/internet.png"))); // NOI18N
        jButton1.setText("เช็คราคาตลาดกลางยางพารา");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 320, -1));
        jPanel2.add(txtsheet, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 90, -1));

        txtlatex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlatexActionPerformed(evt);
            }
        });
        jPanel2.add(txtlatex, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 100, -1));
        jPanel2.add(txtscrap, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 90, -1));

        jLabel3.setText("น้ำยางพารา");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jLabel4.setText("แผ่นยางพารา");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jLabel5.setText("เศษยางพารา");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        logout.setText("ออกจากระบบ");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 20, 120, 30));

        jLabel6.setText("วันที่");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));
        jPanel2.add(txtdte, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 110, -1));

        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/ผุ้ใช้งาน.png"))); // NOI18N
        User.setText("ตั้งค่าผู้ใช้งาน");
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
        });
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        jMenuBar1.add(User);

        Cus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/cuttomer.png"))); // NOI18N
        Cus.setText("ตั้งค่าลูกค้า");
        Cus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CusMouseClicked(evt);
            }
        });
        jMenuBar1.add(Cus);

        set.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/007-gears-couple.png"))); // NOI18N
        set.setText("ตั้งค่าราคายาง");
        set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setMouseClicked(evt);
            }
        });
        set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setActionPerformed(evt);
            }
        });
        jMenuBar1.add(set);

        buy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/รับซื้อ.png"))); // NOI18N
        buy.setText("รับซื้อยางพารา");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });

        latex.setText("รับซื้อน้ำยางพารา");
        latex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                latexMouseClicked(evt);
            }
        });
        latex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latexActionPerformed(evt);
            }
        });
        buy.add(latex);

        scrap.setText("รับซื้อเศษยางพารา");
        scrap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scrapMouseClicked(evt);
            }
        });
        scrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrapActionPerformed(evt);
            }
        });
        buy.add(scrap);

        sheet.setText("รับซื้อแผ่นยางพารา");
        sheet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sheetMouseClicked(evt);
            }
        });
        sheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sheetActionPerformed(evt);
            }
        });
        buy.add(sheet);

        jMenuBar1.add(buy);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/รายงาน.png"))); // NOI18N
        jMenu6.setText("รายงาน");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/002-banknote.png"))); // NOI18N
        jMenu7.setText("ชำระเงิน");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/car.png"))); // NOI18N
        jMenu1.setText("การขายยางออก");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_UserActionPerformed

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        User C = new User();
        C.setVisible(true);
        
    }//GEN-LAST:event_UserMouseClicked

    private void CusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CusMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        Customer C = new Customer();
        C.setVisible(true);
    }//GEN-LAST:event_CusMouseClicked

    private void sheetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sheetMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_sheetMouseClicked

    private void sheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sheetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        rubbersheet C = new rubbersheet();
        C.setVisible(true);
    }//GEN-LAST:event_sheetActionPerformed

    private void latexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latexMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_latexMouseClicked

    private void scrapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrapMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_scrapMouseClicked

    private void latexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latexActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        rubberlatex C = new rubberlatex();
        C.setVisible(true);
    }//GEN-LAST:event_latexActionPerformed

    private void scrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrapActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        rubberscrap C = new rubberscrap();
        C.setVisible(true);
    }//GEN-LAST:event_scrapActionPerformed

    private void setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_setActionPerformed

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyActionPerformed

    private void setMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        Setprice C = new Setprice();
        C.setVisible(true);
    }//GEN-LAST:event_setMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
         setVisible(false);
        Saleout C = new Saleout();
        C.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        report C = new report();
        C.setVisible(true);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        payment C = new payment();
        C.setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void txtlatexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlatexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlatexActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login C = new Login();
        C.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(Desktop.isDesktopSupported())
{
            try {
                Desktop.getDesktop().browse(new URI("http://www.raot.co.th/ewtadmin/ewt/rubber_web/rubber2012/menu5.php"));
            } catch (URISyntaxException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
private  void showPriceDate() {
 
String sql="Select Date,P_Latex,P_RubberSheet,P_RubberScraps	 from rubberprice";
        try {
           Connection c=Database.connectDB();
            ResultSet rs=c.createStatement().executeQuery(sql);
            //rs.last();
            while (rs.next()){
              String Date = rs.getString("Date");  
           String Pricelatex = rs.getString("P_Latex");
           String Pricesheet = rs.getString("P_RubberSheet");
           String Pricescrap = rs.getString("P_RubberScraps");
           txtdte.setText( Date);
            txtlatex.setText(Pricelatex);
            txtsheet.setText(Pricesheet);
            txtscrap.setText(Pricescrap);
            
               
            }
          
        }catch (Exception e){
                e.printStackTrace();
                }
       
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cus;
    private javax.swing.JMenu User;
    private javax.swing.JMenu buy;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem latex;
    private javax.swing.JButton logout;
    private javax.swing.JMenuItem scrap;
    private javax.swing.JMenu set;
    private javax.swing.JMenuItem sheet;
    private javax.swing.JTextField txtdte;
    private javax.swing.JTextField txtlatex;
    private javax.swing.JTextField txtscrap;
    private javax.swing.JTextField txtsheet;
    // End of variables declaration//GEN-END:variables
}
