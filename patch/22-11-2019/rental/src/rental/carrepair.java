package rental;


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.*; 
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ter
 */
public class carrepair extends javax.swing.JFrame {
    private String idcar,about,checkBox1,checkBox2,checkBox3,checkBox4,checkBox5;
    

    
    
    
        private static void setModel(TableModel resultSetToTableModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void setAutoCreateRpwSorter(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    /**
     * Creates new form carrepair
     */
     public carrepair() {
      initComponents();
      showData2();
      loadcar3();
   }
    static String db_driver = "com.mysql.jdbc.Driver";
    static String db_name = "it61070203_base";
     Connection con;
    PreparedStatement pst;
    PreparedStatement pst1;
    PreparedStatement pst2;
    PreparedStatement pst3;
    String carbrand,carmodel,cartabian,carcolor;
     String car_id;
     public static Connection connectDB() {
        try {
            Class.forName(db_driver);
            Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");
            System.out.println("Database Connection succesful");
            return con;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
   
    public void showData2() {
//        String sql_read = "select * from carrepair";
//        try {
//            Connection con = connectDB();
//            PreparedStatement pst=con.prepareStatement(sql_read);
//            ResultSet rs=pst.executeQuery();
//            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");
            
            PreparedStatement pst;
            pst = con.prepareStatement("select * from carrepair");
            ResultSet Rs = pst.executeQuery();
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v2 = new Vector();
                for(int i=1;i<=c;i++){
                    v2.add(Rs.getString("carid"));
                    v2.add(Rs.getString("carbrand"));
                    v2.add(Rs.getString("carmodel"));
                    v2.add(Rs.getString("carcolor"));
                    v2.add(Rs.getString("cartabian"));
                    v2.add(Rs.getString("type"));
                    v2.add(Rs.getString("about"));
                    v2.add(Rs.getString("daterepair"));
                    v2.add(Rs.getString("dateprb"));
                }
                df.addRow(v2);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
    public void loadcar3() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");
            pst = con.prepareStatement("select * from carregis");
            ResultSet rs = pst.executeQuery();
            id_car.removeAllItems();
            while (rs.next()) {

                id_car.addItem(rs.getString(1));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(carrepair.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(carrepair.class.getName()).log(Level.SEVERE, null, ex);
        } 
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chkBox4 = new javax.swing.JCheckBox();
        chkBox1 = new javax.swing.JCheckBox();
        chkBox3 = new javax.swing.JCheckBox();
        chkBox2 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtabout = new javax.swing.JTextArea();
        chkBox5 = new javax.swing.JCheckBox();
        id_car = new javax.swing.JComboBox<>();
        daterepair = new com.toedter.calendar.JDateChooser();
        dateprb = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Car Registeration");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 102, 153));

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Repair");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setText("ID รถ");

        jLabel7.setText("ประเภทการซ่อมบำรุง");

        chkBox4.setText("ระบบของเหลว");
        chkBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBox4ActionPerformed(evt);
            }
        });

        chkBox1.setText("ระบบเครื่องยนต์");
        chkBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBox1ActionPerformed(evt);
            }
        });

        chkBox3.setText("ระบบไฟ");
        chkBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBox3ActionPerformed(evt);
            }
        });

        chkBox2.setText("ระบบส่งกำลัง");
        chkBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBox2ActionPerformed(evt);
            }
        });

        jLabel8.setText("รายละเอียด");

        jButton5.setText("เพิ่ม");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("แก้ไข");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("ลบ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("ยกเลิก");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel9.setText("วันที่ซ่อมบำรุง");

        txtabout.setColumns(20);
        txtabout.setRows(5);
        jScrollPane2.setViewportView(txtabout);

        chkBox5.setText("ล้อ/ยาง");
        chkBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBox5ActionPerformed(evt);
            }
        });

        id_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_carActionPerformed(evt);
            }
        });

        jLabel10.setText("วันหมด พรบ.");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID รถ", "ยี่ห้อ", "รุ่น", "สี", "ทะเบียน", "ประเภทการซ่อม", "รายละเอียด", "วันที่ซ่อม", "วันหมดอายุ พรบ."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chkBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkBox2)
                                    .addComponent(chkBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkBox4)
                                    .addComponent(chkBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(id_car, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(daterepair, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateprb, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(id_car, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBox1)
                    .addComponent(jLabel7))
                .addGap(14, 14, 14)
                .addComponent(chkBox2)
                .addGap(18, 18, 18)
                .addComponent(chkBox3)
                .addGap(18, 18, 18)
                .addComponent(chkBox4)
                .addGap(18, 18, 18)
                .addComponent(chkBox5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(daterepair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10))
                    .addComponent(dateprb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBox1ActionPerformed
        repair += "ระบบเครื่องยนต์  \n";
        
    }//GEN-LAST:event_chkBox1ActionPerformed

    private void chkBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBox4ActionPerformed
        repair += "ระบบของเหลว  \n";
        
    }//GEN-LAST:event_chkBox4ActionPerformed
//"UPDATE carrepair SET carbrand=?,carmodel=?,carcolor=?,cartabian=?,type=?,about=?,daterepair=?,dateprb=? WHERE carid=?"
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    if(txtabout.getText().equals("")){
                JOptionPane.showMessageDialog(this, "กรุณากดแถวที่ต้องการแก้ไข");}
            else{
        try{
        
            idcar = id_car.getSelectedItem().toString();
            String about = txtabout.getText();
            String checkBox1 = chkBox1.getText();
            String checkBox2 = chkBox2.getText();
            String checkBox3 = chkBox3.getText();
            String checkBox4 = chkBox4.getText();
            String checkBox5 = chkBox5.getText();
            
            
            SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
            String date = Date_Format.format(daterepair.getDate());
            
            SimpleDateFormat Date_Format1 = new SimpleDateFormat("yyyy-MM-dd");
            String datep = Date_Format1.format(dateprb.getDate());
            
         Class.forName("com.mysql.jdbc.Driver");
               
                Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base","123456");
                
                  pst =con.prepareStatement("update carrepair SET carbrand=?,carmodel=?,carcolor=?,cartabian=?,type=?,about=?,daterepair=?,dateprb=? WHERE carid=?");
            pst.setString(1,carbrand);
            pst.setString(2,carmodel);
            pst.setString(3,carcolor);
            pst.setString(4,cartabian);
            pst.setString(5,repair);
            pst.setString(6,about);
            pst.setString(7,date);
            pst.setString(8,datep);
            pst.setString(9,idcar);
            pst.executeUpdate();           
            JOptionPane.showMessageDialog(this, "Car Update.......");
            showData();
            repair = "";
    }  
    
    catch (ClassNotFoundException ex) {
            Logger.getLogger(carrepair.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(carrepair.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_jButton6ActionPerformed
//java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near '003' at line 1
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectedrow = jTable1.getSelectedRow();
       
       String id = d1.getValueAt(selectedrow, 0).toString();
    
        int dialogResult  = JOptionPane.showConfirmDialog(this, "Do you want to delete your data","Warning",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
           try {
               Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base", "it61070203_base","123456");
                pst=con.prepareStatement("delete from carrepair where carid=?");
                pst.setString(1,id);
                pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Delete");
            showData();
                
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(carrepair.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(carrepair.class.getName()).log(Level.SEVERE, null, ex);
           }
               
            
        }
        else{
            
        }
    }//GEN-LAST:event_jButton7ActionPerformed
//เพิ่ม
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try {
           
            idcar = id_car.getSelectedItem().toString();
            String about = txtabout.getText();
            String checkBox1 = chkBox1.getText();
            String checkBox2 = chkBox2.getText();
            String checkBox3 = chkBox3.getText();
            String checkBox4 = chkBox4.getText();
            String checkBox5 = chkBox5.getText();
            
            
            SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
            String date = Date_Format.format(daterepair.getDate());
            
            SimpleDateFormat Date_Format1 = new SimpleDateFormat("yyyy-MM-dd");
            String datep = Date_Format1.format(dateprb.getDate());
            
            
            
            Class.forName(db_driver);
            Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");
            System.out.println("Database Connection succesful");
            Statement stmt = con.createStatement();
            PreparedStatement pst;
            pst = con.prepareStatement("insert into carrepair(carid,carbrand,carmodel,carcolor,cartabian,type,about,daterepair,dateprb) values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1,idcar);
            pst.setString(2,carbrand);
            pst.setString(3,carmodel);
            pst.setString(4,carcolor);
            pst.setString(5,cartabian);
            pst.setString(6,repair);
            pst.setString(7,about);
            pst.setString(8,date);
            pst.setString(9,datep);
            
            pst.executeUpdate();           
            JOptionPane.showMessageDialog(this, "Car Added.......");
            showData();
            chkBox1.setSelected(false);
            chkBox2.setSelected(false);
            chkBox3.setSelected(false);
            chkBox4.setSelected(false);
            chkBox5.setSelected(false);
            txtabout.setText("");
            repair = "";
 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(carrepair.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(carrepair.class.getName()).log(Level.SEVERE, null, ex);
        }

                                     
    
    

                                     
    }//GEN-LAST:event_jButton5ActionPerformed

    private void chkBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBox5ActionPerformed
        repair += "ล้อ/ยาง  \n";
        
    }//GEN-LAST:event_chkBox5ActionPerformed

    private void chkBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBox2ActionPerformed
        repair += "ระบบส่งกำลัง  \n";
        
    }//GEN-LAST:event_chkBox2ActionPerformed

    private void chkBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBox3ActionPerformed
        repair += "ระบบไฟ  \n";
        
    }//GEN-LAST:event_chkBox3ActionPerformed

    private void id_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_carActionPerformed
        try {
            car_id = id_car.getSelectedItem().toString();
            

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");
            pst1 = con.prepareStatement("select * from carregis where carid = ?");
            pst1.setString(1, car_id);
            ResultSet rs = pst1.executeQuery();

            while (rs.next()) {

                try {
                    carbrand = rs.getString(2);
                    carmodel = rs.getString(3);
                    carcolor = rs.getString(4);
                    cartabian = rs.getString(5);
                } catch (SQLException ex) {
                    Logger.getLogger(carrepair.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(carrepair.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(carrepair.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_id_carActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
           int selectedrow = jTable1.getSelectedRow();
           id_car.setSelectedItem(d1.getValueAt(selectedrow, 0).toString());
           txtabout.setText(d1.getValueAt(selectedrow, 6).toString());
           try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)d1.getValueAt(selectedrow,7).toString());
            daterepair.setDate(date);        
            } 
            catch (ParseException ex) {
                Logger.getLogger(carrepair.class.getName()).log(Level.SEVERE, null, ex);
        }
           try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)d1.getValueAt(selectedrow,8).toString());
            dateprb.setDate(date);        
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
            java.util.logging.Logger.getLogger(carrepair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carrepair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carrepair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carrepair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carrepair().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkBox1;
    private javax.swing.JCheckBox chkBox2;
    private javax.swing.JCheckBox chkBox3;
    private javax.swing.JCheckBox chkBox4;
    private javax.swing.JCheckBox chkBox5;
    private com.toedter.calendar.JDateChooser dateprb;
    private com.toedter.calendar.JDateChooser daterepair;
    private javax.swing.JComboBox<String> id_car;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtabout;
    // End of variables declaration//GEN-END:variables
  private String repair=""; 
  
}
