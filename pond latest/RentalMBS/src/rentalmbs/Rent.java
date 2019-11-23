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
    
   Rent() {
         //To change body of generated methods, choose Tools | Templates.
    } 
}
