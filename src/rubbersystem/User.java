/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubbersystem;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.print.*;
import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Image;
import javax.swing.JFileChooser;
/**
 *
 * @author Admin
 */

public class User extends javax.swing.JFrame {
    DefaultTableModel model=new DefaultTableModel();
    Object[]data=new Object[0];
    Connection connect = null;
     PreparedStatement pst = null;
     ResultSet rs = null;







   
    public User() {
        initComponents();
        model=(DefaultTableModel)TU.getModel();
        setResizable(false);
        connect=Database.connectDB();
        Show();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        SU = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        typeuser = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        image = new javax.swing.JLabel();
        attach = new javax.swing.JButton();
        path = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TU = new javax.swing.JTable();
        txt = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        search1 = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("การจัดการข้อมูลผู้ใช้งาน");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ชื่อผู้ใช้งาน");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("รหัสผู้ใช้งาน");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("รหัสผ่าน");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ประเภทผู้ใช้งาน");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, -1, 30));

        ID.setEditable(false);
        ID.setBackground(new java.awt.Color(204, 204, 255));
        ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel3.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 190, -1));

        name.setEditable(false);
        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 210, -1));

        address.setEditable(false);
        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 210, -1));

        SU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/004-save.png"))); // NOI18N
        SU.setText("บันทึกข้อมูลผู้ใช้งาน");
        SU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUActionPerformed(evt);
            }
        });
        jPanel3.add(SU, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/cancle.png"))); // NOI18N
        jButton2.setText("ยกเลิก");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 176, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ที่อยู่ผู้ใช้งาน");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        typeuser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));
        jPanel3.add(typeuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 290, -1));

        jDesktopPane1.setLayer(image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 170, 210));

        attach.setText("Attach");
        attach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachActionPerformed(evt);
            }
        });
        jPanel3.add(attach, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 90, -1));
        jPanel3.add(path, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 130, -1));
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, -1));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ข้อมูลผู้ใช้งาน");

        TU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "UserID", "UserName", "PassWord", "UserAddress", "TypeUser", "Image"
            }
        ));
        TU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TUMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TU);

        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKeyReleased(evt);
            }
        });

        search.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/008-magnifier.png"))); // NOI18N
        search.setText("ค้นหา");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("รหัสผู้ใช้");

        search1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        search1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/008-magnifier.png"))); // NOI18N
        search1.setText("ดูข้อมูลลูกค้าทั้งหมด");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(search)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Add.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/add.png"))); // NOI18N
        Add.setText("เพิ่มข้อมูล");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/011-rubbish-bin.png"))); // NOI18N
        Delete.setText("ลบข้อมูล");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/010-edit.png"))); // NOI18N
        Update.setText("แก้ไขข้อมูล");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/clear.png"))); // NOI18N
        Clear.setText("เคลียร์ข้อมูล");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/009-printer.png"))); // NOI18N
        jButton7.setText("พิมพ์ใบเสร็จ");

        Exit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/exit.png"))); // NOI18N
        Exit.setText("ออก");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/ผุ้ใช้งาน.png"))); // NOI18N
        jMenu1.setText("ตั้งค่าผู้ใช้งาน");
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/cuttomer.png"))); // NOI18N
        jMenu2.setText("ตั้งค่าลูกค้า");
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/007-gears-couple.png"))); // NOI18N
        jMenu3.setText("ตั้งค่าราคายาง");
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/รับซื้อ.png"))); // NOI18N
        jMenu4.setText("รับซื้อยางพารา");

        jMenuItem2.setText("รับซื้อน้ำยางพารา");
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("รับซื้อแผ่นยางพารา");
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("รับซื้อเศษยางพารา");
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/รายงาน.png"))); // NOI18N
        jMenu6.setText("รายงาน");

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/กราฟ.png"))); // NOI18N
        jMenu5.setText("รายงาน");
        jMenu6.add(jMenu5);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/002-banknote.png"))); // NOI18N
        jMenu7.setText("ชำระเงิน");
        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/car.png"))); // NOI18N
        jMenu8.setText("การขายยางออก");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Clear, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add)
                            .addComponent(Update))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Delete)
                            .addComponent(Clear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(Exit))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
       
        pass.setEditable(true);
        name.setEditable(true);
        address.setEditable(true);
        
        
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        delete();
        Show();
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        update();
        
        pass.setEditable(false);
        name.setEditable(false);
        address.setEditable(false);
        
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        clearTextBox();
        
        pass.setEditable(false);
        name.setEditable(false);
        address.setEditable(false);
      
    }//GEN-LAST:event_ClearActionPerformed

    private void SUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUActionPerformed
        // TODO add your handling code here:
       
        try{
            
            String sql = "insert into user(UserName,PassWord,UserAddress,Typeuser,image)values(?,?,?,?,?)";
            pst=connect.prepareStatement(sql);
           
            pst.setString(1,name.getText());
            pst.setString(2,pass.getText());
            pst.setString(3,address.getText());
            String value=typeuser.getSelectedItem().toString();
            pst.setString(4,value);
            pst.setBytes(5,person_image);
            
            
 
            pst.execute();
            JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อย");
             clearTextBox();
              Show();
        }
        catch(Exception e){
       JOptionPane.showMessageDialog(null, "ตรวจสอบการใส่ข้อมูล");
        pass.setEditable(false);
        name.setEditable(false);
        address.setEditable(false);
        
       }
        
       Show();
    }//GEN-LAST:event_SUActionPerformed
    
    private void TUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TUMouseClicked
        // TODO add your handling code here:
        int row=TU.getSelectedRow();
        String Table_click=(TU.getModel().getValueAt(row, 0).toString());
        try{
            String sql="select Image from user where UserID='"+Table_click+"'";
            pst = connect.prepareStatement(sql);
            rs= pst.executeQuery();
            if(rs.next()){
                byte[]imagedata=rs.getBytes("Image");
                format = new ImageIcon(imagedata);
                image.setIcon(format);
            
            }
        
        }catch(Exception e){
        }
                
                
                
         int select=TU.getSelectedRow();
            ID.setText(TU.getValueAt(select,0).toString());
            name.setText(TU.getValueAt(select,1).toString());
            pass.setText(TU.getValueAt(select,2).toString());
            address.setText(TU.getValueAt(select,3).toString());
            typeuser.setSelectedItem(TU.getValueAt(select,4).toString());
        
        
       
        
       
        pass.setEditable(true);
        name.setEditable(true);
        address.setEditable(true);
      
        
    }//GEN-LAST:event_TUMouseClicked

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    private void txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        SHData();
        Show();
        clearTextBox();
        
    }//GEN-LAST:event_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
        SHData();
        Show();
        
    }//GEN-LAST:event_search1ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here
        setVisible(false);
        Home C = new Home();
        C.setVisible(true);
    }//GEN-LAST:event_ExitActionPerformed

    private void attachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachActionPerformed
        // TODO add your handling code here:
      JFileChooser ch =new JFileChooser();
      ch.showOpenDialog(null);
      File f=ch.getSelectedFile();
      filename =f.getAbsolutePath();
      path.setText(filename);
      try{
          File image= new File(filename);
          FileInputStream fs = new FileInputStream(image);
          ByteArrayOutputStream bos= new ByteArrayOutputStream();
          byte[] buf = new byte[1024];
          for(int readNum; (readNum=fs.read(buf))!=-1;){
          bos.write(buf,0,readNum);
          
          }
          person_image=bos.toByteArray();
      }catch(Exception e){
      
        JOptionPane.showMessageDialog(null,e);      
      }
    }//GEN-LAST:event_attachActionPerformed

    /**
     * @param args the command line arguments
     */
    

public void Show(){
        clearRow();
        String sql="Select * from user";
        try {
            Connection c=Database.connectDB();
            ResultSet rs=c.createStatement().executeQuery(sql);
            int row=0;
            while (rs.next()){
                model.addRow(data);
                model.setValueAt(rs.getString(1), row, 0);
                model.setValueAt(rs.getString(2), row, 1);
                model.setValueAt(rs.getString(3), row, 2);
                model.setValueAt(rs.getString(4), row, 3);
                model.setValueAt(rs.getString(5), row, 4);
                model.setValueAt(rs.getString(6), row, 5);
                 row++;
        }
        }catch (Exception e){
                e.printStackTrace();
                }
    }

public void clearTextBox(){
        ID.setText("");
        name.setText("");
        pass.setText("");
        address.setText("");
        txt.setText("");
        path.setText("");
        image.setText("");
        ID.setEnabled(true);
        
    }

public void clearRow(){
        int row=model.getRowCount()-1;
        while (row>-1){
            model.removeRow(row);
            row--;
        }
       
        }
private void SHData() {
    
       
        TU.setModel(new DefaultTableModel());

        DefaultTableModel model = (DefaultTableModel) TU.getModel();
        model.addColumn("UserID");
        model.addColumn("UserName");
        model.addColumn("Password");
        model.addColumn("UserAddress");
        model.addColumn("TypeUser");
        model.addColumn("Image");

       // Connection connect = null;
        Statement s = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/rubberdata" +"?user=root&password=");
            s = connect.createStatement();
             String sql = "SELECT * FROM  user "
                    + "WHERE UserID like '%" + txt.getText() + "%'"
                    + "or UserName like '%" + txt.getText() + "%'"
                    + "ORDER BY UserID ASC";
             
             ResultSet rec = s.executeQuery(sql);
            int row = 0;
            while ((rec != null) && (rec.next())) {
                model.addRow(new Object[0]);
                model.setValueAt(rec.getString(1), row, 0);
                model.setValueAt(rec.getString(2), row, 1);
                model.setValueAt(rec.getString(3), row, 2);
                model.setValueAt(rec.getString(4), row, 3);
                model.setValueAt(rec.getString(5), row, 4);
                model.setValueAt(rec.getString(6), row, 5);
                row++;
            }

            rec.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }

    }

public void update(){
        String UserID=ID.getText();
        String PassWord=pass.getText();
        String UserName=name.getText();
        String UserAddress=address.getText();
        String value=typeuser.getSelectedItem().toString();
        String Image=image.getIcon().toString();
        
        String query1 ="UPDATE user Set UserName ='"+UserName+"'"
                + ",PassWord='"+PassWord+"'"
                + ",UserAddress='"+UserAddress+"'"
                + ",TypeUser='"+value+"'"
                + ",Image='"+Image+"' where UserID='"+UserID+"'";
           
         
        try{
        Connection c=Database.connectDB();
        PreparedStatement stm=c.prepareStatement(query1);
            stm.executeUpdate(query1);
                JOptionPane.showMessageDialog(this, "อัพเดตข้อมูลพนักงานสำเร็จ");
                Show();
                clearTextBox();
                    
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "อัพเดตข้อมูลพนักงานไม่สำเร็จ");
            e.printStackTrace();
        }
}
public void delete(){
       String UserID=ID.getText();
        String PassWord=pass.getText();
        String UserName=name.getText();
        String Usercontext=address.getText();
         
        

        String query = "DELETE FROM user WHERE UserID = '"+UserID+"'";

        try{
            Connection c=Database.connectDB();
            PreparedStatement stm=c.prepareStatement(query);
            stm.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "ลบข้อมูลพนักงานสำเร็จ");
            Show();
            clearTextBox();
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "ลบข้อมูลพนักงานไม่สำเร็จ");
            e.printStackTrace();
        }
    
    }
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
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField ID;
    private javax.swing.JButton SU;
    private javax.swing.JTable TU;
    private javax.swing.JButton Update;
    private javax.swing.JTextField address;
    private javax.swing.JButton attach;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField path;
    private javax.swing.JButton search;
    private javax.swing.JButton search1;
    private javax.swing.JTextField txt;
    private javax.swing.JComboBox<String> typeuser;
    // End of variables declaration//GEN-END:variables
    private ImageIcon format= null;
    String filename=null;
    int s=0;
    byte[] person_image=null;
}
