/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubbersystem;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;



/**
 *
 * @author Home
 */
public class report_customer extends javax.swing.JFrame {
DefaultTableModel model=new DefaultTableModel();
    Object[]data=new Object[0];
    Connection connect = null;
    private ResultSet rs = null;
    private String sql;
    /**
    
     */
    public report_customer() {
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

        sale = new javax.swing.JTextField();
        p = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleActionPerformed(evt);
            }
        });

        p.setText("พิมพ์ รายงาน");
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        cancel.setText("ยกเลิก");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel2.setText("หมายเลขลูกค้า");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("รายงานซื้อยาง (ลูกค้า)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(p)
                        .addGap(18, 18, 18)
                        .addComponent(cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saleActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
setVisible(false);       
    }//GEN-LAST:event_cancelActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
    
        
        
            try {

                    Class.forName("com.mysql.jdbc.Driver");

                    connect = DriverManager.getConnection("jdbc:mysql://localhost/rubberdata"+ "?user=root&password=");

                } catch (ClassNotFoundException e1) {

                    e1.printStackTrace();

                } catch (SQLException e) {

                    e.printStackTrace();

                }

                String report = null;

                try {

                    report = new File("C:\\Users\\benzz\\Documents\\NetBeansProjects\\Rubber1\\src\\report").getCanonicalPath() + "\\ScrapsReport.jrxml";

                } catch (IOException e1) {

                    e1.printStackTrace();
                }
                   int am = Integer.parseInt(sale.getText());
                try {
                    JasperReport ir = JasperCompileManager.compileReport(report);
                     Map m = new HashMap();
                m.put("IDcus", am);
                    JasperPrint ip = JasperFillManager.fillReport(ir, m, connect);


                    JFrame frame = new JFrame();

                    frame.setTitle("Report");

                    frame.setBounds(100, 100, 850, 1800);

                    frame.getContentPane().add(new JRViewer(ip));

                    frame.setVisible(true);

                } catch (JRException e) {


                    e.printStackTrace();

                }

                try {

                    connect.close();

                } catch (SQLException e) {


                    e.printStackTrace();

                }    
                
                // Connection

				/*Connection connect = null;
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					connect =  DriverManager.getConnection("jdbc:mysql://localhost/rubberdata" +
							"?user=root&password=");
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// Application path
				String report = null;
				try {
					report = new File(".").getCanonicalPath()+ "C:\\Users\\Home\\Documents\\NetBeansProjects\\Rubber1\\src\\report\\saleout.jrxml";
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					
					// Parameters
                                        int amount = Integer.parseInt(sale.getText());
					Map param = new HashMap();
                                         param.put("Saleid", amount);
					//param.put("sCountryCode", "US");
					
					// Report Viewer
					JasperReport ir = JasperCompileManager.compileReport(report);
					JasperPrint ip = JasperFillManager.fillReport(ir, param,connect);
					
					
					
				} catch (JRException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
                
                // Connection

				/*Connection connect = null;
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					connect =  DriverManager.getConnection("jdbc:mysql://localhost/rubberdata" +
							"?user=root&password=");
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// Application path
				String report = null;
				try {
					report = new File(".").getCanonicalPath()+ "C:\\Users\\Home\\Documents\\NetBeansProjects\\Rubber1\\src\\report\\saleout.jrxml";
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					
					// Parameters
                                        int amount = Integer.parseInt(sale.getText());
					Map param = new HashMap();
                                         param.put("Saleid", amount);
					//param.put("sCountryCode", "US");
					
					// Report Viewer
					JasperReport ir = JasperCompileManager.compileReport(report);
					JasperPrint ip = JasperFillManager.fillReport(ir, param,connect);
					
					
					
				} catch (JRException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
                
                // Connection

				/*Connection connect = null;
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					connect =  DriverManager.getConnection("jdbc:mysql://localhost/rubberdata" +
							"?user=root&password=");
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// Application path
				String report = null;
				try {
					report = new File(".").getCanonicalPath()+ "C:\\Users\\Home\\Documents\\NetBeansProjects\\Rubber1\\src\\report\\saleout.jrxml";
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					
					// Parameters
                                        int amount = Integer.parseInt(sale.getText());
					Map param = new HashMap();
                                         param.put("Saleid", amount);
					//param.put("sCountryCode", "US");
					
					// Report Viewer
					JasperReport ir = JasperCompileManager.compileReport(report);
					JasperPrint ip = JasperFillManager.fillReport(ir, param,connect);
					
					
					
				} catch (JRException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
                
                // Connection

				/*Connection connect = null;
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					connect =  DriverManager.getConnection("jdbc:mysql://localhost/rubberdata" +
							"?user=root&password=");
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// Application path
				String report = null;
				try {
					report = new File(".").getCanonicalPath()+ "C:\\Users\\Home\\Documents\\NetBeansProjects\\Rubber1\\src\\report\\saleout.jrxml";
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					
					// Parameters
                                        int amount = Integer.parseInt(sale.getText());
					Map param = new HashMap();
                                         param.put("Saleid", amount);
					//param.put("sCountryCode", "US");
					
					// Report Viewer
					JasperReport ir = JasperCompileManager.compileReport(report);
					JasperPrint ip = JasperFillManager.fillReport(ir, param,connect);
					
					
					
				} catch (JRException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				
            		
				
			
		
    }//GEN-LAST:event_pActionPerformed

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
            java.util.logging.Logger.getLogger(report_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report_customer().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton p;
    private javax.swing.JTextField sale;
    // End of variables declaration//GEN-END:variables
}
