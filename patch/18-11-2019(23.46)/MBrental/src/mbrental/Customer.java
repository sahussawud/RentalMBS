/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author big
 */
public class Customer extends javax.swing.JFrame {

    private static void setModel(TableModel resultSetToTableModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void setAutoCreateRpwSorter(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
  
    public Customer() {
        initComponents();
        showData();
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
        jLabel1 = new javax.swing.JLabel();
        Nationality = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IDCustomer = new javax.swing.JTextField();
        CardID = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        textLName = new javax.swing.JTextField();
        Tel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        date_chooser = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        Nationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalityActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ลูกค้า", "ชื่อ", "นามสกุล", "สัญชาติ", "รหัสบัตรประชาชน", "เบอร์โทรศํพท์", "email", "sexl"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jLabel4.setText("นามสกุล");

        jLabel5.setText("ID ลูกค้า");

        jLabel6.setText("ชื่อ");

        jLabel7.setText("รหัสบัตรประชาชน");

        jLabel8.setText("สัญชาติ");

        IDCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDCustomerActionPerformed(evt);
            }
        });

        CardID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardIDActionPerformed(evt);
            }
        });

        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        textLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLNameActionPerformed(evt);
            }
        });

        Tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelActionPerformed(evt);
            }
        });

        jLabel9.setText("เบอร์โทรติดต่อ");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel10.setText("e-mail");

        jButton1.setText("ย้อนกลับ");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("เพิ่ม");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("ลบ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 204, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        jLabel11.setText("เพศ");

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ชาย", "หญิง" }));

        jButton5.setText("แก้ไข");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setText("date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(IDCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(CardID, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textLName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IDCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11)
                                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textLName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(CardID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalityActionPerformed

    private void IDCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDCustomerActionPerformed

    private void CardIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CardIDActionPerformed

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

    private void textLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLNameActionPerformed

    private void TelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO  add your handling code here:
//        String id = IDCustomer.getText();
//        String name = textName.getText();
//        String lname = textLName.getText();
//        String cid = CardID.getText();
//        String nation = Nationality.getText();
//        String tels = Tel.getText();
//        String mail = Email.getText();
//        String Sex = sex.getSelectedItem().toString();
//        System.out.println(id);
//        System.out.println(name);
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root","root");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM carregis;");
//
//            System.out.println("success");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//        } 

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id = IDCustomer.getText();
        String name = textName.getText();
        String lname = textLName.getText();
        String cid = CardID.getText();
        String nation = Nationality.getText();
        String tels = Tel.getText();
        String mail = Email.getText();
        String Sex = sex.getSelectedItem().toString();
        
     
        String sql = "insert into Customer value('"+id+"','"+name+"','"+lname+"','"+cid+"','"+nation+"','"+tels+"','"+mail+"','"+Sex+"')";
        String sql_read = "select * from Customer";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            pst=con.prepareStatement(sql_read);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            ///ResultSet rs = stmt.executeQuery("SELECT * FROM carregis;");

            System.out.println("add success");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }//GEN-LAST:event_jButton2ActionPerformed
//    public void DeleteDb() throws SQLException{
//        String sql = "delete form Customer";
//        Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");
//        Statement stmt = con.createStatement();
//        stmt.executeUpdate(sql);
//    }
    public void showData(){
        String sql_read = "select * from Customer";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.util.Properties prop = new java.util.Properties();
            prop.put("charSet", "UTF-8");
            Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base", "it61070203_base","123456");
            pst=con.prepareStatement(sql_read);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setAutoCreateRowSorter(true);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//        public void table_update(){
//        int c;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root","root");
//            
//            PreparedStatement pst;
//            pst = con.prepareStatement("select * from carregis");
//            ResultSet Rs = pst.executeQuery();
//            ResultSetMetaData rd = Rs.getMetaData();
//            c = rd.getColumnCount();
//            DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
//            df.setRowCount(0);
//            
//            while(Rs.next()){
//                Vector v2 = new Vector();
//                for(int i=1;i<=c;i++){
//                    v2.add(Rs.getString("carid"));
//                    v2.add(Rs.getString("carbrand"));
//                    v2.add(Rs.getString("carmodel"));
//                    v2.add(Rs.getString("carcolor"));
//                    v2.add(Rs.getString("cartabian"));
//                    v2.add(Rs.getString("carprice"));
//                    v2.add(Rs.getString("carstatus"));
//                }
//                df.addRow(v2);
//            }
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        catch (SQLException ex) {
//            Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
       DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectedrow = jTable1.getSelectedRow();
       
       String id = d1.getValueAt(selectedrow, 0).toString();
    
        int dialogResult  = JOptionPane.showConfirmDialog(this, "Do you want to delete your data","Warning",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
           try {
               Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base", "it61070203_base","123456");
                pst=con.prepareStatement("delete from Customer where id_customer=?");
                pst.setString(1,id);
                pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Delete");
            showData();
                
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
           }
               
            
        }
        else{
            
        }
               
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
           int selectedrow = jTable1.getSelectedRow();
           IDCustomer.setText(d1.getValueAt(selectedrow, 0).toString());
          textName.setText(d1.getValueAt(selectedrow, 1).toString());
           textLName.setText(d1.getValueAt(selectedrow, 2).toString());
           Nationality.setText(d1.getValueAt(selectedrow, 3).toString());
           CardID.setText(d1.getValueAt(selectedrow, 4).toString());
            Tel.setText(d1.getValueAt(selectedrow, 5).toString());
            Email.setText(d1.getValueAt(selectedrow, 6).toString());
           sex.setSelectedItem(d1.getValueAt(selectedrow, 7).toString());
           
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectedrow = jTable1.getSelectedRow();
           
            try {
        String id = IDCustomer.getText();
        String name = textName.getText();
        String lname = textLName.getText();
        String cid = CardID.getText();
        String nation = Nationality.getText();
        String tels = Tel.getText();
        String mail = Email.getText();
        String Sex = sex.getSelectedItem().toString();

                Class.forName("com.mysql.jdbc.Driver");
               
                Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base","123456");
                
                  pst =con.prepareStatement("update  Customer set name_customer=?,lname_customer=?,cardid_customer=?,nationality_customer=?,tel_customer=?,email_customer=?,sex_customer=?,date=? where id_customer=? ");
                  
                  System.out.println(".");
            pst.setString(1,name);
            pst.setString(2,lname);
            pst.setString(3,cid);
            pst.setString(4,nation);
            pst.setString(5,tels);
            pst.setString(6,mail);
            pst.setString(7,Sex);
            pst.setString(8,id);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(date_chooser.getData());
            pst.setString(7,date);
            pst.executeUpdate();
            showData();
            JOptionPane.showMessageDialog(this, "Data Updated");
            
           
             

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
             catch (SQLException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
          

        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CardID;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField IDCustomer;
    private javax.swing.JTextField Nationality;
    private javax.swing.JTextField Tel;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JTextField textLName;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables
}
