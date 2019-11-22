/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 04
 */
public class Database {

    public String nameDB;
    public String[] TableDB;
    public String hostURL;
    protected String username;
    protected String password;
    public Connection con;
    int c;

    public Database() {

       
            this.nameDB = "it61070203_base";
            this.TableDB = new String[]{"carregis", "carrepair", "Customer", "ExpenseTB", "Rental", "ReturnCar"};
            this.hostURL = "jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8";
            this.username = "it61070203_base";
            this.password = "123456";
            
        try {     
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(hostURL, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    

    //table in Register panal
    public JTable getjTable1_update(){
        
        JTable j = new JTable();
        try {
            PreparedStatement pst;
            pst = con.prepareStatement("select * from carregis");
            ResultSet Rs = pst.executeQuery();
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) j.getModel();
            df.setRowCount(0);

            while (Rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(Rs.getString("carid"));
                    v2.add(Rs.getString("carbrand"));
                    v2.add(Rs.getString("carmodel"));
                    v2.add(Rs.getString("carcolor"));
                    v2.add(Rs.getString("cartabian"));
                    v2.add(Rs.getString("carprice"));
                    v2.add(Rs.getString("carpriceday"));
                    v2.add(Rs.getString("carstatus"));
                    v2.add(Rs.getString("date"));
                }
                df.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return j;
    }

    //status dashboard in Dashboard Panal
    public JTable getDashboardTB() {
        JTable dashboard = new JTable();
        try {

            PreparedStatement pst = con.prepareStatement("select * from carregis");
            ResultSet Rs = pst.executeQuery();
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) dashboard.getModel();
            df.setRowCount(0);

            while (Rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(Rs.getString("carid"));
                    v2.add(Rs.getString("carbrand"));
                    v2.add(Rs.getString("carmodel"));
                    v2.add(Rs.getString("carcolor"));
                    v2.add(Rs.getString("cartabian"));
                    v2.add(Rs.getString("carstatus"));
                    v2.add(Rs.getString("date"));

                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dashboard;
    }

    public JTable getCheckTB() {
        JTable CheckTB = new JTable();
        try {

            PreparedStatement pst = con.prepareStatement("select * from carrepair");
            ResultSet Rs = pst.executeQuery();
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) CheckTB.getModel();

            df.setRowCount(0);

            while (Rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(Rs.getString("carid"));
                    v2.add(Rs.getString("carbrand") + " " + Rs.getString("carmodel") + " " + Rs.getString("carcolor"));
                    v2.add(Rs.getString("cartabian"));
                    v2.add(Rs.getString("type"));
                    v2.add(Rs.getString("about"));
                    v2.add(Rs.getString("daterepair"));
                    v2.add(Rs.getString("dateprb"));
                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CheckTB;
    }

    public JTable getTransTB() {
        JTable transactionTB = new JTable();
        int count = 0;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");
            PreparedStatement pst = con.prepareStatement("select * from ExpenseTB");
            ResultSet Rs = pst.executeQuery();
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) transactionTB.getModel();
      
            df.setRowCount(0);
            
            
            while (Rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(Rs.getString("date_expense"));
                    v2.add(Rs.getString("type_expense"));
                    v2.add("รายจ่าย");
                    v2.add(Rs.getString("amount_expense"));
                    v2.add("-");
                    
                }
                df.addRow(v2);
                count++;
            }
            
            pst = con.prepareStatement("select * from Rental");
            Rs = pst.executeQuery();
            rd = Rs.getMetaData();
            c = rd.getColumnCount();
            df = (DefaultTableModel) transactionTB.getModel();
            
            df.setRowCount(count);
            
            while (Rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(Rs.getString("due"));
                    v2.add("ให้เช่า " + Rs.getString("car_id"));
                    v2.add("รายรับ");
                    v2.add(Rs.getString("fee"));
                    v2.add(Rs.getString("date"));
                    
                }
                df.addRow(v2);
                count++;
            }
            
            pst = con.prepareStatement("select * from ReturnCar");
            Rs = pst.executeQuery();
            rd = Rs.getMetaData();
            c = rd.getColumnCount();
            df = (DefaultTableModel) transactionTB.getModel();
            
            df.setRowCount(count);
            
            while (Rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(Rs.getString("Return_Date"));
                    v2.add("ค่าปรับจากรถ " + Rs.getString("ID_Car"));
                    v2.add("รายรับ");
                    v2.add(Rs.getString("Total"));
                    v2.add("-");
                    
                }
                df.addRow(v2);
                count++;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return transactionTB;
    }


}


