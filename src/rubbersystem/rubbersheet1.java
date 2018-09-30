/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubbersystem;
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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Admin
 */
public class rubbersheet1 extends javax.swing.JFrame {
    DefaultTableModel model=new DefaultTableModel();
    DefaultTableModel model1=new DefaultTableModel();
    Object[]data=new Object[0];
    Object[]data1=new Object[1];
    Connection connect = null;
    ResultSet rs = null;
    String sql;
    PreparedStatement pst=null;


       



   
    public rubbersheet1() {
        initComponents();
        model=(DefaultTableModel)tbcustomer.getModel();
        setResizable(false);
        
        model1=(DefaultTableModel)tbprice1.getModel();
        Showprice();
        Show();
        connect=Database.connectDB();
    }

   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        txt_sh_ww = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        idprice = new javax.swing.JTextField();
        CUA = new javax.swing.JTextField();
        SAVE = new javax.swing.JButton();
        cancle = new javax.swing.JButton();
        txt_sh_id = new javax.swing.JTextField();
        idcus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_sh_disc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        Bsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcustomer = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtsearch2 = new javax.swing.JTextField();
        Bsearch2 = new javax.swing.JButton();
        date = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbprice1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtsearch1 = new javax.swing.JTextField();
        Bsearch1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbsheet = new javax.swing.JTable();
        Bsearch3 = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
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
        setBackground(new java.awt.Color(102, 255, 102));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txt_sh_ww.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("รับซื้อยางแผ่น");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("รหัสราคายาง");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("รหัสลูกค้า");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("น้ำหนักยาง");

        price.setEditable(false);
        price.setBackground(new java.awt.Color(204, 204, 255));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        idprice.setEditable(false);
        idprice.setBackground(new java.awt.Color(204, 204, 255));

        CUA.setEditable(false);
        CUA.setBackground(new java.awt.Color(204, 204, 255));

        SAVE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SAVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/004-save.png"))); // NOI18N
        SAVE.setText("บันทึกข้อมูลลูกค้า");
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });

        cancle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/cancle.png"))); // NOI18N
        cancle.setText("ยกเลิก");

        txt_sh_id.setEditable(false);
        txt_sh_id.setBackground(new java.awt.Color(204, 204, 255));
        txt_sh_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sh_idActionPerformed(evt);
            }
        });

        idcus.setEditable(false);
        idcus.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("รหัสการซื้อ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ราคายาง");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("จำนวนเงิน");

        txt_sh_disc.setEditable(false);
        txt_sh_disc.setBackground(new java.awt.Color(204, 204, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("รหัสลูกค้า");

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        Bsearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/008-magnifier.png"))); // NOI18N
        Bsearch.setText("ค้นหา");
        Bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsearchActionPerformed(evt);
            }
        });

        tbcustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CustomerID", "CustomerName", "CustomerLastname"
            }
        ));
        tbcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbcustomer);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("รหัสการตั้งค่าราคายาง");

        txtsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearch2ActionPerformed(evt);
            }
        });
        txtsearch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearch2KeyReleased(evt);
            }
        });

        Bsearch2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bsearch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/008-magnifier.png"))); // NOI18N
        Bsearch2.setText("ค้นหา");
        Bsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bsearch2ActionPerformed(evt);
            }
        });

        date.setEditable(false);
        date.setBackground(new java.awt.Color(204, 204, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("วันที่");

        tbprice1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DatePrice_ID", "Date", "P_Rubbersheet"
            }
        ));
        tbprice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbprice1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbprice1);

        javax.swing.GroupLayout txt_sh_wwLayout = new javax.swing.GroupLayout(txt_sh_ww);
        txt_sh_ww.setLayout(txt_sh_wwLayout);
        txt_sh_wwLayout.setHorizontalGroup(
            txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_sh_wwLayout.createSequentialGroup()
                .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(22, 22, 22)
                                                .addComponent(txt_sh_id, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(idprice, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(idcus, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(46, 46, 46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_sh_wwLayout.createSequentialGroup()
                                        .addComponent(SAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)))
                                .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)
                                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                            .addComponent(CUA)
                                            .addComponent(txt_sh_disc)
                                            .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING))))))
                        .addGap(29, 29, 29)
                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bsearch)
                                .addGap(28, 28, 28))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(txt_sh_wwLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                            .addComponent(txtsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        txt_sh_wwLayout.setVerticalGroup(
            txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_sh_wwLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bsearch)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_sh_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CUA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(idprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sh_disc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(idcus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancle)
                            .addComponent(SAVE))
                        .addGap(47, 47, 47))
                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bsearch2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ข้อมูลการซื้อยางแผ่น");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("รหัสลูกค้า");

        txtsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearch1ActionPerformed(evt);
            }
        });
        txtsearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearch1KeyReleased(evt);
            }
        });

        Bsearch1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bsearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/008-magnifier.png"))); // NOI18N
        Bsearch1.setText("ค้นหา");
        Bsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bsearch1ActionPerformed(evt);
            }
        });

        tbsheet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "รหัสการซื้อ", "รหัสราคายาง", "รหัสลูกค้า", "ราคายาง", "น้ำหนักยาง", "จำนวนเงิน", "สถานะ", "รหัสพนักงาน"
            }
        ));
        tbsheet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbsheetMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbsheet);

        Bsearch3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bsearch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/008-magnifier.png"))); // NOI18N
        Bsearch3.setText("ดูข้อมูลทั้งหมด");
        Bsearch3.setActionCommand("");
        Bsearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bsearch3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(179, 179, 179)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bsearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bsearch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bsearch3)
                .addContainerGap(46, Short.MAX_VALUE))
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

        clear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/clear.png"))); // NOI18N
        clear.setText("เคลียร์ข้อมูล");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/009-printer.png"))); // NOI18N
        jButton7.setText("พิมพ์ใบเสร็จ");

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/exit.png"))); // NOI18N
        Exit.setText("ออก");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbersystem/ผุ้ใช้งาน.png"))); // NOI18N
        jMenu1.setText("ตั้งค่าผู้ใช้งาน");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
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
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("รับซื้อแผ่นยางพารา");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("รับซื้อเศษยางพารา");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
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
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addComponent(txt_sh_ww, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_sh_ww, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add)
                            .addComponent(Update))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Delete)
                            .addComponent(clear))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(Exit))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcustomerMouseClicked
        // TODO add your handling code here: int select=tb.getSelectedRow();
        int select=tbcustomer.getSelectedRow();
        idcus.setText(tbcustomer.getValueAt(select,0).toString());
        
        txt_sh_id.setEditable(true);
        idprice.setEditable(true);
        price.setEditable(true);
        CUA.setEditable(true);
        
        
    }//GEN-LAST:event_tbcustomerMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here: 
        
        txt_sh_id.setEditable(true);
        idprice.setEditable(true);
        price.setEditable(true);
        CUA.setEditable(true);
        
       
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_DeleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
         //TODO add your handling code here:
        clearTextBox();
        txt_sh_id.setEditable(false);
        idprice.setEditable(false);
        price.setEditable(false);
        CUA.setEditable(false);
    }//GEN-LAST:event_clearActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtsearchKeyReleased

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void BsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsearchActionPerformed
        // TODO add your handling code here:
      SHData();
      clearTextBox();
       
    }//GEN-LAST:event_BsearchActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login C = new Login();
        C.setVisible(true);
    }//GEN-LAST:event_ExitActionPerformed

    private void txt_sh_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sh_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sh_idActionPerformed

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        // TODO add your handling code here:
       
           try{
            
            String sql = "insert into 	buyrubbersheet(Date_SH,DatePrice_ID,CustomerID,P_RubberSheet)values(?,?,?,?)";
            pst=connect.prepareStatement(sql);
            pst.setString(1,date.getText());
            pst.setString(2,idprice.getText());
            pst.setString(3,idcus.getText());
            pst.setString(4,price.getText());
            
               System.out.println(date.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อย");
             clearTextBox();
              Show();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "รหัสการตั้งค่าซ้ำ");
        }
        txt_sh_id.setEditable(false);
        idprice.setEditable(false);
        price.setEditable(false);
        CUA.setEditable(false);
        
        
    }//GEN-LAST:event_SAVEActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        
        update();
        txt_sh_id.setEditable(false);
        idprice.setEditable(false);
        price.setEditable(false);
        CUA.setEditable(false);
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void tbsheetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbsheetMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbsheetMouseClicked

    private void txtsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch1ActionPerformed

    private void txtsearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch1KeyReleased

    private void Bsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bsearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bsearch1ActionPerformed

    private void txtsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch2ActionPerformed

    private void txtsearch2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch2KeyReleased

    private void Bsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bsearch2ActionPerformed
        // TODO add your handling code here:
        SHData1();
        txtsearch2.setText("");
    }//GEN-LAST:event_Bsearch2ActionPerformed

    private void tbprice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbprice1MouseClicked
        // TODO add your handling code here:
        int select=tbprice1.getSelectedRow();

        idprice.setText(tbprice1.getValueAt(select,0).toString());
        price.setText(tbprice1.getValueAt(select,2).toString());
        date.setText(tbprice1.getValueAt(select,1).toString());
    }//GEN-LAST:event_tbprice1MouseClicked

    private void Bsearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bsearch3ActionPerformed
        // TODO add your handling code here:
        //SHData();
    }//GEN-LAST:event_Bsearch3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        rubberlatex1 C = new rubberlatex1();
        C.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        rubbersheet1 C = new rubbersheet1();
        C.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        rubberscrap1 C = new rubberscrap1();
        C.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        // TODO add your handling code here:
         setVisible(false);
        Saleout1 C = new Saleout1();
        C.setVisible(true);
    }//GEN-LAST:event_jMenu8MouseClicked

    
    
public void insertData(){
    
    String sql = "INSERT INTO buyrubbersheet ( DatePrice_ID ) VALUES ( ? )";

        
        try{
        pst=connect.prepareStatement(sql);
        
       
        PreparedStatement statement = ( PreparedStatement ) connect.prepareStatement ( sql );

						statement.setString ( 1, idprice.getText ( ) );

						statement.executeUpdate ( );


						connect.close ( );
        
        } 
					catch ( SQLException error ) 
					{

					}
				}

public void Show(){
        clearRow();
        String sql="Select * from customer";
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
                 row++;
        }
        }catch (Exception e){
                e.printStackTrace();
                }
    }
                          
public void Showprice(){
        clearRow();
        String sql="Select DatePrice_ID,Date,P_RubberSheet from rubberprice";
        try {
            Connection c=Database.connectDB();
            ResultSet rs=c.createStatement().executeQuery(sql);
            int row=0;
            while (rs.next()){
                model1.addRow(data1);
                model1.setValueAt(rs.getString(1), row, 0);
                 model1.setValueAt(rs.getString(2), row, 1);
                 model1.setValueAt(rs.getString(3), row, 2);
             
                 row++;
        }
        }catch (Exception e){
                e.printStackTrace();
                }
    }
private void SHData() {
    
       
        tbcustomer.setModel(new DefaultTableModel());

        DefaultTableModel model = (DefaultTableModel) tbcustomer.getModel();
        model.addColumn("CustomerID");
        model.addColumn("CustomerName");
        model.addColumn("CustomerLastname");
        
        Connection connect = null;
        Statement s = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/rubberdata" +"?user=root&password=");
            s = connect.createStatement();
             String sql = "SELECT * FROM  customer "
                    + "WHERE CustomerID like '%" + txtsearch.getText() + "%'"
                    + "or CustomerName like '%" + txtsearch.getText() + "%'"
                    + "ORDER BY CustomerID ASC";
             
             ResultSet rec = s.executeQuery(sql);
            int row = 0;
            while ((rec != null) && (rec.next())) {
                model.addRow(new Object[0]);
                model.setValueAt(rec.getString("CustomerID"), row, 0);
                model.setValueAt(rec.getString("CustomerName"), row, 1);
                model.setValueAt(rec.getString("CustomerLastname"), row, 2);
                
                row++;
            }

            rec.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }

    }
private void SHData1() {
    
       
        tbprice1.setModel(new DefaultTableModel());

        DefaultTableModel model1 = (DefaultTableModel) tbprice1.getModel();
        model1.addColumn("DatePrice_ID");
        model1.addColumn("Date");
        model1.addColumn("P_Rubbersheet");
        
        Connection connect = null;
        Statement s = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/rubberdata" +"?user=root&password=");
            s = connect.createStatement();
             String sql = "SELECT * FROM  rubberprice "
                    + "WHERE DatePrice_ID like '%" + txtsearch2.getText() + "%'"
                    + "or Date like '%" + txtsearch2.getText() + "%'"
                    + "ORDER BY DatePrice_ID ASC";
             
             ResultSet rec = s.executeQuery(sql);
            int row = 0;
            while ((rec != null) && (rec.next())) {
                model1.addRow(new Object[0]);
                model1.setValueAt(rec.getString("DatePrice_ID"), row, 0);
                model1.setValueAt(rec.getString("Date"), row, 1);
                model1.setValueAt(rec.getString("P_Rubbersheet"), row, 2);
                
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
        String CustomerID=txt_sh_id.getText();
        String CustomerName=idprice.getText();
        String CustomerNickname=price.getText();
        String CustomerAddress=CUA.getText();
        
        String query1 ="UPDATE customer Set CustomerName ='"+CustomerName+"'"
                + ",CustomerNickname='"+CustomerNickname+"'"
                + ",CustomerAddress='"+CustomerAddress+"' where CustomerID='"+CustomerID+"'";
           
         
        try{
        Connection c=Database.connectDB();
        PreparedStatement stm=c.prepareStatement(query1);
            stm.executeUpdate(query1);
                JOptionPane.showMessageDialog(this, "อัพเดตข้อมูลยางเเผ่นสำเร็จ");
                Show();
                clearTextBox();
                    
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "อัพเดตข้อมูลยางเเผ่นไม่สำเร็จ");
            e.printStackTrace();
        }
}
public void clearTextBox(){
       txt_sh_id.setText("");
        idprice.setText("");
        price.setText("");
        CUA.setText("");
        txtsearch.setText("");
        idprice.setEnabled(true);
    }

public void clearRow(){
        int row=model.getRowCount()-1;
        while (row>-1){
            model.removeRow(row);
            row--;
        }
       
        }

public void delete(){
       String CustomerID=txt_sh_id.getText();
        String CustomerName=idprice.getText();
        String CustomerNickname=price.getText();
        String CustomerAddress=CUA.getText();
        

        String query = "DELETE FROM customer WHERE CustomerID = '"+CustomerID+"'";

        try{
            Connection c=Database.connectDB();
            PreparedStatement stm=c.prepareStatement(query);
            stm.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "ลบข้อมูลยางเเผ่นสำเร็จ");
            Show();
            clearTextBox();
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "ลบข้อมูลยางเเผ่นไม่สำเร็จ");
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
                new rubbersheet1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Bsearch;
    private javax.swing.JButton Bsearch1;
    private javax.swing.JButton Bsearch2;
    private javax.swing.JButton Bsearch3;
    private javax.swing.JTextField CUA;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JButton SAVE;
    private javax.swing.JButton Update;
    private javax.swing.JButton cancle;
    private javax.swing.JButton clear;
    private javax.swing.JTextField date;
    private javax.swing.JTextField idcus;
    private javax.swing.JTextField idprice;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField price;
    private javax.swing.JTable tbcustomer;
    private javax.swing.JTable tbprice1;
    private javax.swing.JTable tbsheet;
    private javax.swing.JTextField txt_sh_disc;
    private javax.swing.JTextField txt_sh_id;
    private javax.swing.JPanel txt_sh_ww;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsearch1;
    private javax.swing.JTextField txtsearch2;
    // End of variables declaration//GEN-END:variables
}
