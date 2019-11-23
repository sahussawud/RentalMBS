package rentalmbs;



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
public class Rent {
    JTable RentTB;
    String RentID,CustomerID,VehicleID,CustomerName,TotalTime;
    int Mail;
    double Cost,Deposit;
    Date StartDate,Expire;
    


    public Rent(String RentID, String CustomerID, String VehicleID, String CustomerName, String TotalTime, int Mail, double Cost, double Deposit, Date StartDate, Date Expire) {
        this.RentID = RentID;
        this.CustomerID = CustomerID;
        this.VehicleID = VehicleID;
        this.CustomerName = CustomerName;
        this.TotalTime = TotalTime;
        this.Mail = Mail;
        this.Cost = Cost;
        this.Deposit = Deposit;
        this.StartDate = StartDate;
        this.Expire = Expire;
    }

    public Rent(JTable RentTB) {
        this.RentTB = RentTB;
    }

    public JTable getRentTB() {
        return RentTB;
    }

    public void setRentTB(JTable RentTB) {
        this.RentTB = RentTB;
    }
    
    
   Rent() {
         //To change body of generated methods, choose Tools | Templates.
    }

    public String getRentID() {
        return RentID;
    }
    public void setRentID(String RentID) {
        this.RentID = RentID;
    }
    public String getCustomerID() {
        return CustomerID;
    }
    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getVehicleID() {
        return VehicleID;
    }
    public void setVehicleID(String VehicleID) {
        this.VehicleID = VehicleID;
    }
    public String getCustomerName() {
        return CustomerName;
    }
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }
    public String getTotalTime() {
        return TotalTime;
    }
    public void setTotalTime(String TotalTime) {
        this.TotalTime = TotalTime;
    }

    public int getMail() {
        return Mail;
    }
    public void setMail(int Mail) {
        this.Mail = Mail;
    }
    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }
    public double getDeposit() {
        return Deposit;
    }
    public void setDeposit(double Deposit) {
        this.Deposit = Deposit;
    }
    public Date getStartDate() {
        return StartDate;
    }
    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public Date getExpire() {
        return Expire;
    }
    public void setExpire(Date Expire) {
        this.Expire = Expire;
    }
    

    

    

    

    
   


    

    
  
   
    
}
