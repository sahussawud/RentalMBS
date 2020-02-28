/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbrental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
class Expense_s {
    private int amount_expense;
    private String id_expense,type_expense,reciver_expense,detail_expense;
    private Date date_expense;

public Expense_s(int amount_expense, String id_expense, String type_expense, String reciver_expense, String detail_expense, Date date_expense) {
        this.amount_expense = amount_expense;
        this.id_expense = id_expense;
        this.type_expense = type_expense;
        this.reciver_expense = reciver_expense;
        this.detail_expense = detail_expense;
        this.date_expense = date_expense;
    }

    public int getAmount_expense() {
        return amount_expense;
    }

    public void setAmount_expense(int amount_expense) {
        this.amount_expense = amount_expense;
    }

    public String getId_expense() {
        return id_expense;
    }

    public void setId_expense(String id_expense) {
        this.id_expense = id_expense;
    }

    public String getType_expense() {
        return type_expense;
    }

    public void setType_expense(String type_expense) {
        this.type_expense = type_expense;
    }

    public String getReciver_expense() {
        return reciver_expense;
    }

    public void setReciver_expense(String reciver_expense) {
        this.reciver_expense = reciver_expense;
    }

    public String getDetail_expense() {
        return detail_expense;
    }

    public void setDetail_expense(String detail_expense) {
        this.detail_expense = detail_expense;
    }

    public Date getDate_expense() {
        return date_expense;
    }

    public void setDate_expense(Date date_expense) {
        this.date_expense = date_expense;
    }
    
    public void table_update1() {
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");

            PreparedStatement pst;
            pst = con.prepareStatement("select * from ExpenseTB");
            ResultSet Rs = pst.executeQuery();
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
                DefaultTableModel df = (DefaultTableModel)Expense.getjTable1().getModel();
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
