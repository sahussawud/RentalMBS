package rentalmbs;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import rentalmbs.Database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 04
 */
public class Expense {
    JTable ExpenseTB;
    
    String ExpenseID,ExpType,payee,detail;
    Date ExpenseDate;
    double cost;

    public Expense(JTable ExpenseTB, String ExpenseID, String ExpType, String payee, String detail, Date ExpenseDate, double cost) {
        this.ExpenseTB = ExpenseTB;
        this.ExpenseID = ExpenseID;
        this.ExpType = ExpType;
        this.payee = payee;
        this.detail = detail;
        this.ExpenseDate = ExpenseDate;
        this.cost = cost;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Expense rr = new Expense();
        rr.setExpenseTB(new Database().getExpenseTB());
        System.out.println(rr.ExpenseTB.getRowCount());
        
    }

    Expense() {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "ExpenseInfo{" + "ExpenseTB=" + ExpenseTB + ", ExpenseID=" + ExpenseID + ", ExpType=" + ExpType + ", payee=" + payee + ", detail=" + detail + ", ExpenseDate=" + ExpenseDate + ", cost=" + cost + '}';
    }

    
    public JTable getExpenseTB() {
        return ExpenseTB;
    }
    public void setExpenseTB(JTable ExpenseTB) {
        this.ExpenseTB = ExpenseTB;
        
    }
    public String getExpenseID() {
        return ExpenseID;
    }
    public void setExpenseID(String ExpenseID) {
        this.ExpenseID = ExpenseID;
    }
    public String getExpType() {
        return ExpType;
    }
    public void setExpType(String ExpType) {
        this.ExpType = ExpType;
    }
    public String getPayee() {
        return payee;
    }
    public void setPayee(String payee) {
        this.payee = payee;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public Date getExpenseDate() {
        return ExpenseDate;
    }
     public void setExpenseDate(Date ExpenseDate) {
        this.ExpenseDate = ExpenseDate;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

   
 
    public void addExpense(){
     if (IDexpense.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลให้ครบทุกช่อง");
        } else {// TODO  add your handling code here:
            String Id = IDexpense.getText();

            SimpleDateFormat Date_Format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            String Day = Date_Format.format(dateeeee.getDate());

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
                table_update3();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    



    

    

   

   

  
 
 
}
