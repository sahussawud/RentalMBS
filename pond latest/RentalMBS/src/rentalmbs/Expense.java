
import java.sql.Date;
import java.sql.SQLException;
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
        return "ExpenseInfo{" + "RepairTB=" + RepairTB + ", ExpenseID=" + ExpenseID + ", ExpType=" + ExpType + ", payee=" + payee + ", detail=" + detail + ", ExpenseDate=" + ExpenseDate + ", cost=" + cost + '}';
    }

    
    public JTable getExpenseTB() {
        return ExpenseTB;
    }
    public void setRepairTB(JTable RepairTB) {
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
 
 
    



    

    

   

   

  
 
 
}
