package rental;

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
    String ExpenseDate;
    double cost;
    Database d;
    
    public Expense(JTable ExpenseTB, String ExpenseID, String ExpType, String payee, String detail, Date ExpenseDate, double cost) throws ClassNotFoundException, SQLException {
        this.ExpenseTB = ExpenseTB;
        this.ExpenseID = ExpenseID;
        this.ExpType = ExpType;
        this.payee = payee;
        this.detail = detail;
        
        SimpleDateFormat Date_Format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String Day = Date_Format.format(ExpenseDate);
        this.ExpenseDate = Day;
        this.cost = cost;
        this.d = new Database();
        
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
    public String getExpenseDate() {
        return ExpenseDate;
    }
     public void setExpenseDate(String ExpenseDate) {
        this.ExpenseDate = ExpenseDate;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

   
 
    public JTable updateExpense() throws SQLException{
            return d.getExpenseTB();
    }
    public JTable addExpense() throws ClassNotFoundException, SQLException{
                        
            d.addExpenseTB(ExpenseID, ExpenseDate , ExpType, payee, cost+"", detail);
            return updateExpense();
    
        }
    public JTable editExpense() throws ClassNotFoundException, SQLException{
           
              
           d.editExpenseTB(ExpenseID, ExpenseDate , ExpType, payee, cost+"", detail);
           return updateExpense();
           
    
    }
    public JTable deleteExpense(String expenseID) throws ClassNotFoundException, SQLException{
           
            d.deleteExpenseTB(expenseID);
            return updateExpense();
               
    }
    
    
}

    
   
    

    

   

   

  
 
 

