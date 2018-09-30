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
public class rubberlatex1 extends javax.swing.JFrame {
    DefaultTableModel model=new DefaultTableModel();
    DefaultTableModel model1=new DefaultTableModel();
    DefaultTableModel model2=new DefaultTableModel();
    Object[]data=new Object[0];
    Object[]data1=new Object[1];
    Object[]data2=new Object[2];
    Connection connect = null;
    ResultSet rs = null;
    String sql;
    PreparedStatement pst=null;


       



   
    public rubberlatex1() {
        initComponents();
        model=(DefaultTableModel)tbcustomer.getModel();
        setResizable(false);
       
       
        model2=(DefaultTableModel)tbsheet.getModel();
  
     Show();
     Showorder();
        ShowEmp();
        ShowPriceDate();
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
        www = new javax.swing.JTextField();
        SAVE = new javax.swing.JButton();
        cancle = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        idcus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        Bsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcustomer = new javax.swing.JTable();
        date = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mount = new javax.swing.JTextField();
        idem = new javax.swing.JLabel();
        idemp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        num = new javax.swing.JButton();
        percent = new javax.swing.JTextField();
        sale = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
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
        jLabel4.setText("น้ำหนักยางและ%");

        price.setEditable(false);
        price.setBackground(new java.awt.Color(204, 204, 255));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        idprice.setEditable(false);
        idprice.setBackground(new java.awt.Color(204, 204, 255));

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

        id.setEditable(false);
        id.setBackground(new java.awt.Color(204, 204, 255));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
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

        date.setEditable(false);
        date.setBackground(new java.awt.Color(204, 204, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("วันที่");

        mount.setEditable(false);
        mount.setBackground(new java.awt.Color(204, 204, 255));

        idem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idem.setText("รหัสพนักงาน");

        idemp.setEditable(false);
        idemp.setBackground(new java.awt.Color(204, 204, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("สถานะ");

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No payment", "payment" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        num.setText("คำนวณเงิน");
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });

        sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleActionPerformed(evt);
            }
        });

        jLabel11.setText("รอบที่ขาย");

        javax.swing.GroupLayout txt_sh_wwLayout = new javax.swing.GroupLayout(txt_sh_ww);
        txt_sh_ww.setLayout(txt_sh_wwLayout);
        txt_sh_wwLayout.setHorizontalGroup(
            txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_sh_wwLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_sh_wwLayout.createSequentialGroup()
                                .addComponent(SAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txt_sh_wwLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txt_sh_wwLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(22, 22, 22)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txt_sh_wwLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(idprice, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txt_sh_wwLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(idcus, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46)))
                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txt_sh_wwLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(www, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_sh_wwLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel5)))
                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                        .addComponent(idem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idemp, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bsearch)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_sh_wwLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(jLabel12)
                        .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(idprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(www, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txt_sh_wwLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(idcus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num))))
                        .addGap(18, 18, 18)
                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(txt_sh_wwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SAVE)
                            .addComponent(cancle))
                        .addGap(14, 14, 14))
                    .addGroup(txt_sh_wwLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                {"", null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "รหัสการซื้อ", "วันที่", "รหัสราคายาง", "รหัสลูกค้า", "ราคายาง", "น้ำหนักยาง", "จำนวนเงิน", "สถานะ", "รหัสพนักงาน"
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
                        .addGap(0, 45, Short.MAX_VALUE)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addContainerGap(44, Short.MAX_VALUE))
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
        
        id.setEditable(true);
        idprice.setEditable(true);
        price.setEditable(true);
        www.setEditable(true);
        
        
    }//GEN-LAST:event_tbcustomerMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here: 
        
        id.setEditable(true);
        idprice.setEditable(true);
        price.setEditable(true);
        www.setEditable(true);
        
       
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        delete();
        clearTextBox();
              Showorder();
    }//GEN-LAST:event_DeleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
         //TODO add your handling code here:
         clearTextBox();
        id.setEditable(false);
        idprice.setEditable(false);
        price.setEditable(false);
        www.setEditable(false);
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
        Home C = new Home();
        C.setVisible(true);
    }//GEN-LAST:event_ExitActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        // TODO add your handling code here:

        try{
            
            //String sql = "insert into buyrubbersheet(Date_SH,DatePrice_ID,CustomerID,P_RubberSheet,Weight_SH,Amount_SH,BuyStatus_SH,UserID)values(?,?,?,?,?,?,?,?)";
            String sql = "INSERT INTO `buylatex`( `Date_LA`, `DatePrice_ID`, `CustomerID`, `P_Latex`, `Weight_LA`, `Percent_LA`, `Amount_LA`, `BuyStatus`, `UserID`, `SaleID`)  VALUES (?,?,?,?,?,?,?,?,?,?)";
            pst=connect.prepareStatement(sql);
            pst.setString(1,date.getText());
            pst.setString(2,idprice.getText());
            pst.setString(3,idcus.getText());
            pst.setString(4,price.getText());
            pst.setString(5,www.getText());
            pst.setString(6,mount.getText());
            pst.setString(7,percent.getText());
            String value=type.getSelectedItem().toString();
            pst.setString(8,value);
            pst.setString(9,idemp.getText());
            pst.setString(10,sale.getText());

            
            pst.execute();
            JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อย");
           clearTextBox();
              Showorder();
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null, "ตรวจสอบการใส่ข้อมูล");
        }

        id.setEditable(false);
        idprice.setEditable(false);
        price.setEditable(false);
        www.setEditable(false);
        
        
    }//GEN-LAST:event_SAVEActionPerformed
public void insertData(){
        String CustomerID=date.getText();
        String CustomerName=idprice.getText();
        String CustomerLastname=idcus.getText();
        String CustomerNickname=price.getText();
        String CustomerAddress=www.getText();
       // String CustomerA=mount.getText();
        String sql="INSERT into buyrubbersheet value("
                 +"'"+CustomerID+"',"
                +"'"+CustomerName+"','"+CustomerLastname+"','"+CustomerNickname+"','"+CustomerAddress+"')";
        try{
      
        Connection c=Database.connectDB();
       Statement stm=c.createStatement();
        
        if (stm.executeUpdate(sql)!=-1){
            JOptionPane.showMessageDialog(this,"บันทีกข้อมูลลูกค้าเรียบร้อยแล้ว","แจ้งเตือน",JOptionPane.INFORMATION_MESSAGE);
        
        Show();
        }
       
    }catch (Exception e){
        e.printStackTrace();
         JOptionPane.showMessageDialog(this,"รหัสลูกค้าซ้ำ","แจ้งเตือน",JOptionPane.INFORMATION_MESSAGE);
    }
    }
    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        update();

        id.setEditable(false);
        idprice.setEditable(false);
        price.setEditable(false);
        www.setEditable(false);
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void tbsheetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbsheetMouseClicked
        // TODO add your handling code here:
        int select=tbsheet.getSelectedRow();

        id.setText(tbsheet.getValueAt(select,0).toString());
        date.setText(tbsheet.getValueAt(select,1).toString());
        idprice.setText(tbsheet.getValueAt(select,2).toString());
        idcus.setText(tbsheet.getValueAt(select,3).toString());
        price.setText(tbsheet.getValueAt(select,4).toString());
        www.setText(tbsheet.getValueAt(select,5).toString());
        mount.setText(tbsheet.getValueAt(select,6).toString());
        percent.setText(tbsheet.getValueAt(select,7).toString());
        type.setSelectedItem(tbsheet.getValueAt(select,8).toString());
        idemp.setText(tbsheet.getValueAt(select,9).toString());
       
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

    private void Bsearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bsearch3ActionPerformed
        // TODO add your handling code here:
        //SHData();
        Showorder();
    }//GEN-LAST:event_Bsearch3ActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
        
        Integer weight,percentrubber,latexprice;
        Integer amountmoney;
        weight=Integer.valueOf(www.getText());
        percentrubber=Integer.valueOf(percent.getText());
        latexprice=Integer.valueOf(price.getText());
         amountmoney=weight*latexprice*percentrubber/100;

        mount.setText(""+amountmoney);
    }//GEN-LAST:event_numActionPerformed

    private void saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saleActionPerformed

private  void ShowPriceDate() {
 
String sql="Select DatePrice_ID,P_Latex,Date,SaleID from rubberprice";
        try {
           Connection c=Database.connectDB();
            ResultSet rs=c.createStatement().executeQuery(sql);
            //rs.last();
            while (rs.next()){
           String Price = rs.getString("P_Latex");
           String Date = rs.getString("Date");
           String Dateid = rs.getString("DatePrice_ID");
           String saleid = rs.getString("SaleID");
            price.setText(Price);
            date.setText(Date);
            idprice.setText(Dateid);
               sale.setText(saleid);
            }
          
        }catch (Exception e){
                e.printStackTrace();
                }
       
}

    
private  void ShowEmp() {
 
String sql="Select UserName from login";
        try {
           Connection c=Database.connectDB();
            ResultSet rs=c.createStatement().executeQuery(sql);
            //rs.last();
            while (rs.next()){
           String User = rs.getString("UserName");
           
           
            idemp.setText(User);
          
            
               
            }
          
        }catch (Exception e){
                e.printStackTrace();
                }
       
}



public void Show(){
       
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
public void Showorder(){
        
        String sql="Select * from buylatex";
        try {
            Connection c=Database.connectDB();
            ResultSet rs=c.createStatement().executeQuery(sql);
            int row=0;
            while (rs.next()){
                model2.addRow(data2);
                
                model2.setValueAt(rs.getString(1), row, 0);
                model2.setValueAt(rs.getString(2), row, 1);
                model2.setValueAt(rs.getString(3), row, 2);
                model2.setValueAt(rs.getString(4), row, 3);
                model2.setValueAt(rs.getString(5), row, 4);
                model2.setValueAt(rs.getString(6), row, 5);
                model2.setValueAt(rs.getString(7), row, 6);
                model2.setValueAt(rs.getString(8), row, 7);
                model2.setValueAt(rs.getString(9), row, 8);
                model2.setValueAt(rs.getString(10), row, 9);
                 row++;
        }
        }catch (Exception e){
                e.printStackTrace();
                }
    }                          
public void Showprice(){
      
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

public void delete(){
      
        String BuyLatexID=id.getText();
        String Date_SH=date.getText();
        String DatePrice_ID=idprice.getText();
        String CustomerID=idcus.getText();
        String P_RubberSheet=price.getText();
        String Weight_SH=www.getText();
        String Amount_SH=mount.getText();
        String Percen=percent.getText();
        String value=type.getSelectedItem().toString();   
        String UserID=idemp.getText();
        
       
        String query = "DELETE FROM buyrubbersheet WHERE BuySheetID = '"+BuyLatexID+"'";

        try{
            Connection c=Database.connectDB();
            PreparedStatement stm=c.prepareStatement(query);
            stm.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "DELETE COMPLETE");
           Showorder();
            clearTextBox();
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "NO DELETE COMPLETE");
            e.printStackTrace();
        }
    
    }
public void update(){
        String BuyLatexID=id.getText();
        String Date_LA=date.getText();
        String DatePrice_ID=idprice.getText();
        String CustomerID=idcus.getText();
        String P_Latex=price.getText();
        String Weight_LA=www.getText();
         String Percent_LA=www.getText();
        String Amount_LA=mount.getText();
        String BuyStatus=type.getSelectedItem().toString();   
        String UserID = idemp.getText();
        
        String query2 ="UPDATE buylatex Set BuyLatexID ='"+BuyLatexID+"'"
                + ",Date_LA='"+Date_LA+"'"
                + ",DatePrice_ID='"+DatePrice_ID+"'"
                + ",CustomerID='"+CustomerID+"'"
                + ",P_Latex='"+P_Latex+"'"
                + ",Weight_LA='"+Weight_LA+"'"
                + ",Percent_LA='"+Percent_LA+"'"
                + ",Amount_LA='"+Amount_LA+"'"
                + ",BuyStatus='"+BuyStatus+"'"
                + ",UserID='"+UserID+"' where BuyLatexID='"+BuyLatexID+"'";
           
         
        try{
        Connection c=Database.connectDB();
        PreparedStatement stm=c.prepareStatement(query2);
            stm.executeUpdate(query2);
                JOptionPane.showMessageDialog(this, "อัพเดตข้อมูลเรียบร้อย");
                Show();
                clearTextBox();
                    
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "อัพเดตข้อมูลลูกค้าไม่สำเร็จ");
            e.printStackTrace();
        }
}


public void clearTextBox(){
        id.setText("");
        date.setText("");
        idcus.setText("");
        idprice.setText("");
        price.setText("");
        www.setText("");
        mount.setText("");
        type.setSelectedItem("");
        percent.setText("");
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
                new rubberlatex1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Bsearch;
    private javax.swing.JButton Bsearch1;
    private javax.swing.JButton Bsearch3;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JButton SAVE;
    private javax.swing.JButton Update;
    private javax.swing.JButton cancle;
    private javax.swing.JButton clear;
    private javax.swing.JTextField date;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idcus;
    private javax.swing.JLabel idem;
    private javax.swing.JTextField idemp;
    private javax.swing.JTextField idprice;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField mount;
    private javax.swing.JButton num;
    private javax.swing.JTextField percent;
    private javax.swing.JTextField price;
    private javax.swing.JTextField sale;
    private javax.swing.JTable tbcustomer;
    private javax.swing.JTable tbsheet;
    private javax.swing.JPanel txt_sh_ww;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsearch1;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField www;
    // End of variables declaration//GEN-END:variables
}
