/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//import static mbrental.ConnectDB.connectDB;

/**
 *
 * @author User
 */
public class Expense extends javax.swing.JFrame {

    /**
     * Creates new form Expense
     */
    private String user = "sahussawud";

    public Expense() {
        initComponents();
        table_update();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        sidebar = new javax.swing.JPanel();
        Dashboard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mb_reg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        maintainance = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rent = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Expensepanel = new javax.swing.JPanel();
        Summary1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Type = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        detail = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        addExpense = new javax.swing.JButton();
        deleteExpense = new javax.swing.JButton();
        editExpense = new javax.swing.JButton();
        clearExpense = new javax.swing.JButton();
        IDexpense = new javax.swing.JTextField();
        reciever = new javax.swing.JTextField();
        amount_exp = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        sidebar.setBackground(new java.awt.Color(255, 255, 255));
        sidebar.setFocusTraversalPolicyProvider(true);

        Dashboard.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("Summary");

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mb_reg.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Registeration");

        javax.swing.GroupLayout mb_regLayout = new javax.swing.GroupLayout(mb_reg);
        mb_reg.setLayout(mb_regLayout);
        mb_regLayout.setHorizontalGroup(
            mb_regLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mb_regLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mb_regLayout.setVerticalGroup(
            mb_regLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mb_regLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mb_regLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        maintainance.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Maintainace/Expense");

        javax.swing.GroupLayout maintainanceLayout = new javax.swing.GroupLayout(maintainance);
        maintainance.setLayout(maintainanceLayout);
        maintainanceLayout.setHorizontalGroup(
            maintainanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maintainanceLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        maintainanceLayout.setVerticalGroup(
            maintainanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maintainanceLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(maintainanceLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rent.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setText("Rent Transaction");

        javax.swing.GroupLayout rentLayout = new javax.swing.GroupLayout(rent);
        rent.setLayout(rentLayout);
        rentLayout.setHorizontalGroup(
            rentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rentLayout.setVerticalGroup(
            rentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(rentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("RentalMB ");

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(maintainance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mb_reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(65, 65, 65))))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(93, 93, 93)
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mb_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(maintainance, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rent, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        Expensepanel.setBackground(new java.awt.Color(204, 204, 204));

        Summary1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 255));
        jLabel16.setText("Expense");

        jLabel17.setForeground(new java.awt.Color(153, 153, 255));
        jLabel17.setText("welcome back mr.sahussawud");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("วันที่ชำระ :");

        jLabel20.setText("ประเภทค่าใช้จ่าย : ");

        Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ค่าซ่อมบำรุง", "ค่าคอมมิสชั่น", "เงินเดือนพนักงาน", "ชำระหนี้", "อื่นๆ" }));
        Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeActionPerformed(evt);
            }
        });

        jLabel21.setText("ผู้รับการชำระ : ");

        jLabel22.setText("จำนวนเงิน :");

        jLabel23.setText("รายละเอียดการชำระ :");

        detail.setColumns(20);
        detail.setRows(5);
        jScrollPane9.setViewportView(detail);

        jLabel24.setText("รายจ่ายเลขที่ :");

        addExpense.setText("เพิ่ม");
        addExpense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addExpenseMouseClicked(evt);
            }
        });
        addExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExpenseActionPerformed(evt);
            }
        });

        deleteExpense.setText("ลบ");
        deleteExpense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteExpenseMouseClicked(evt);
            }
        });
        deleteExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteExpenseActionPerformed(evt);
            }
        });

        editExpense.setText("เเก้ไข");
        editExpense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editExpenseMouseClicked(evt);
            }
        });
        editExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editExpenseActionPerformed(evt);
            }
        });

        clearExpense.setText("ล้าง");
        clearExpense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearExpenseMouseClicked(evt);
            }
        });
        clearExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearExpenseActionPerformed(evt);
            }
        });

        IDexpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDexpenseActionPerformed(evt);
            }
        });

        reciever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recieverActionPerformed(evt);
            }
        });

        amount_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_expActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "รายจ่ายเลขที่", "วันชำระ", "ประเภท", "ผู้รับ", "จำนวน", "รายละเอียด"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable1);

        javax.swing.GroupLayout Summary1Layout = new javax.swing.GroupLayout(Summary1);
        Summary1.setLayout(Summary1Layout);
        Summary1Layout.setHorizontalGroup(
            Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Summary1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Summary1Layout.createSequentialGroup()
                .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Summary1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDexpense)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Summary1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Summary1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Summary1Layout.createSequentialGroup()
                                .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Type, javax.swing.GroupLayout.Alignment.LEADING, 0, 136, Short.MAX_VALUE)
                                    .addComponent(reciever, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(amount_exp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                            .addComponent(jLabel23)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        Summary1Layout.setVerticalGroup(
            Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Summary1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Summary1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane6))
                    .addGroup(Summary1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Summary1Layout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE))
                            .addGroup(Summary1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(IDexpense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Summary1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel19))
                                    .addGroup(Summary1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Summary1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel21))
                                    .addGroup(Summary1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(reciever, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(amount_exp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Summary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(clearExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout ExpensepanelLayout = new javax.swing.GroupLayout(Expensepanel);
        Expensepanel.setLayout(ExpensepanelLayout);
        ExpensepanelLayout.setHorizontalGroup(
            ExpensepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpensepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Summary1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ExpensepanelLayout.setVerticalGroup(
            ExpensepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpensepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Summary1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 350, Short.MAX_VALUE)
                .addComponent(Expensepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 987, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Expensepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amount_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_expActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amount_expActionPerformed

    private void recieverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recieverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recieverActionPerformed

    private void IDexpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDexpenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDexpenseActionPerformed

    private void clearExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearExpenseActionPerformed
        // TODO add your handling code here:
        IDexpense.setText("");
        jDateChooser1.setDate(null);
        reciever.setText("");
        amount_exp.setText("");
        detail.setText("");
        Type.setSelectedIndex(-1);

    }//GEN-LAST:event_clearExpenseActionPerformed

    private void clearExpenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearExpenseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearExpenseMouseClicked

    private void editExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editExpenseActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel) jTable1.getModel();
        int selectedrow = jTable1.getSelectedRow();
        if (IDexpense.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากดแถวที่ต้องการแก้ไข");
        }
        try {
            String id = d1.getValueAt(selectedrow, 0).toString();

            SimpleDateFormat Date_Format = new SimpleDateFormat("dd-MM-yyyy");
            String Day = Date_Format.format(jDateChooser1.getDate());

            String type = Type.getSelectedItem().toString();
            String Reciver = reciever.getText();
            String Amount = amount_exp.getText();
            String Detail = detail.getText();
            System.out.println(IDexpense.getText());
            System.out.println(type);

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");
            pst = con.prepareStatement("update ExpenseTB set date_expense=?,type_expense=?,reciever_expense=?,amount_expense=?,detail_expense=?,least_editor=? where id_expense=? ");

            pst.setString(1, Day);
            pst.setString(2, type);
            pst.setString(3, Reciver);
            pst.setString(4, Amount);
            pst.setString(5, Detail);
            pst.setString(6, this.user);
            pst.setString(7, id);

            pst.executeUpdate();

            table_update();
            JOptionPane.showMessageDialog(this, "Data Updated");
            IDexpense.setText("");
            jDateChooser1.setDate(new Date());
            Type.setSelectedIndex(-1);
            reciever.setText("");
            amount_exp.setText("");
            detail.setText("");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editExpenseActionPerformed

    private void editExpenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editExpenseMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_editExpenseMouseClicked

    private void deleteExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteExpenseActionPerformed
        // TODO add your handling code here:

        if (IDexpense.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากดแถวที่ต้องการแก้ไข");
        } else {
            DefaultTableModel d1 = (DefaultTableModel) jTable1.getModel();
            int selectedrow = jTable1.getSelectedRow();

            String id = d1.getValueAt(selectedrow, 0).toString();
            int yesno = JOptionPane.showConfirmDialog(this, "คุณต้องการจะลบข้อมูลนี้?", "Warning", JOptionPane.YES_NO_OPTION);
            if (yesno == JOptionPane.YES_OPTION) {
                try {

                    System.out.println("Yess");
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");

                    pst = con.prepareStatement("delete from ExpenseTB where id_expense=?");
                    pst.setString(1, id);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");

                    table_update();

                    IDexpense.setText("");

                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH);
                    Date date = new Date();
               
                    jDateChooser1.setDate(date);
                    reciever.setText("");
                    amount_exp.setText("");
                    detail.setText("");
                    Type.setSelectedIndex(-1);

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                IDexpense.setText("");
                jDateChooser1.setDate(null);
                reciever.setText("");
                amount_exp.setText("");
                detail.setText("");
                Type.setSelectedIndex(-1);

            }

        }

    }//GEN-LAST:event_deleteExpenseActionPerformed

    private void deleteExpenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteExpenseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteExpenseMouseClicked

    private void addExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExpenseActionPerformed
        // TODO add your handling code here:
        if (IDexpense.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลให้ครบทุกช่อง");
        } else {// TODO  add your handling code here:
            String Id = IDexpense.getText();

            SimpleDateFormat Date_Format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            String Day = Date_Format.format(jDateChooser1.getDate());

            String type = Type.getSelectedItem().toString();
            String Reciver = reciever.getText();
            String Amount = amount_exp.getText();
            String Detail = detail.getText();

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");
                Statement stmt = con.createStatement();
                PreparedStatement pst;
                pst = con.prepareStatement("insert into ExpenseTB(id_expense,date_expense,type_expense,reciever_expense,amount_expense,detail_expense,least_editor) values(?,?,?,?,?,?,?)");
                pst.setString(1, Id);
                pst.setString(2, Day);
                pst.setString(3, type);
                pst.setString(4, Reciver);
                pst.setString(5, Amount);
                pst.setString(6, Detail);
                pst.setString(7, this.user);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Car Added.......");

                IDexpense.setText("");
                //jDateChooser1.setDate(null);
                Type.setSelectedIndex(-1);
                reciever.setText("");
                amount_exp.setText("");
                detail.setText("");
                table_update();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_addExpenseActionPerformed

    private void addExpenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addExpenseMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_addExpenseMouseClicked

    private void TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel) jTable1.getModel();
        int selectedrow = jTable1.getSelectedRow();
        IDexpense.setText(d1.getValueAt(selectedrow, 0).toString());

        //jDateChooser1.setDate.(d1.getValueAt(selectedrow, 1));
        Type.setSelectedItem(d1.getValueAt(selectedrow, 2).toString());
        reciever.setText(d1.getValueAt(selectedrow, 3).toString());
        amount_exp.setText(d1.getValueAt(selectedrow, 4).toString());
        detail.setText(d1.getValueAt(selectedrow, 5).toString());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)d1.getValueAt(selectedrow,6).toString());
            jDateChooser1.setDate(date);        
            } 
            catch (ParseException ex) {
                Logger.getLogger(carrepair.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expense().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel Expensepanel;
    private javax.swing.JTextField IDexpense;
    private javax.swing.JPanel Summary1;
    private javax.swing.JComboBox<String> Type;
    private javax.swing.JButton addExpense;
    private javax.swing.JTextField amount_exp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton clearExpense;
    private javax.swing.JButton deleteExpense;
    private javax.swing.JTextArea detail;
    private javax.swing.JButton editExpense;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel maintainance;
    private javax.swing.JPanel mb_reg;
    private javax.swing.JTextField reciever;
    private javax.swing.JPanel rent;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables

    Connection con;
    PreparedStatement pst;

    public void table_update() {
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");

            pst = con.prepareStatement("select * from ExpenseTB");
            ResultSet Rs = pst.executeQuery();
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            df.setRowCount(0);

            while (Rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(Rs.getString("id_expense"));
                    v2.add(Rs.getString("date_expense"));
                    v2.add(Rs.getString("type_expense"));
                    v2.add(Rs.getString("reciever_expense"));
                    v2.add(Rs.getString("amount_expense"));
                    v2.add(Rs.getString("detail_expense"));
                    v2.add(Rs.getString("least_editor"));

                }
                df.addRow(v2);
            }
            
         

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Expense.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Expense.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
