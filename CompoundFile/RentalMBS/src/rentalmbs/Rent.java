package rentalmbs;



import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
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
public class Rent {
    JTable RentTB;
    String RentID,CustomerID,VehicleID,CustomerName,TotalTime;
    int Mail;
    double Cost,Deposit;
    Date StartDate,Expire;
    int[] l_month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    

    public Rent(String RentID, String CustomerID, String VehicleID, String CustomerName, String TotalTime, int Mail, double Cost, double Deposit, Date StartDate, Date Expire) throws ClassNotFoundException, SQLException {
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
        Database db = new Database();
        
    }
 public Rent() throws ClassNotFoundException, SQLException{
     Database db = new Database();
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
    
     public String[] CalculateRent() throws ParseException, ClassNotFoundException, SQLException{
            int monthcost = 0;
            int daycost = 0;
            String[] a = new String[2];
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
                String timeString = formatter.format(StartDate);
                
                int m = Integer.parseInt(timeString.substring(3, 5));
                String timeString2 = formatter.format(Expire);
                
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
                java.util.Date firstDate = sdf.parse(timeString);
                java.util.Date secondDate = sdf.parse(timeString2);
                
              //l_month[m-1];
               double day_diff = (secondDate.getTime() - firstDate.getTime())/(1000*60*60*24)+1;
               int year3 = (int)Math.floor(day_diff/365);
               int month2 = (int)(day_diff%365)/l_month[m-1];
               int day2 = (int)((day_diff%365)%l_month[m-1]);
            System.out.println("day different**"+day2+"**month diff***"+month2+"*ปี***"+year3+"****จำนวนวันของเดือนเช่า ="+m+"****เริ่มเช่า = "+timeString+" ถึง "+timeString2);
            
            Database db = new Database();
           
            
            PreparedStatement pst4 = db.con.prepareStatement("select * from carregis where carid = ?");
            pst4.setString(1, VehicleID);
            ResultSet rs = pst4.executeQuery();

            while (rs.next()) {

                try {
                    monthcost = rs.getInt(6);
                    daycost = rs.getInt(8);
                } catch (SQLException ex) {
                    Logger.getLogger(Rent.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            a[0] = ""+month2;
            a[1] = ""+day2;
            
           
            if (month2 != 0 && day2 != 0) {
              a[2]= "" + (monthcost * month2 + daycost * day2);

            } else if (month2 == 0 && day2 != 0) {
                a[2]="" + (daycost * day2);

            } else if (month2 != 0 && day2 == 0) {
               a[2]="" + (monthcost * month2);

            }
            return a;
     }
     public void addRent() throws ClassNotFoundException, SQLException{
          Database db = new Database();
         db.rentUpdate(RentID,VehicleID,CustomerID,""+StartDate,""+Expire,""+Cost,""+Deposit,""+Mail);
         
     }
    public JComboBox loadcarRent() throws ClassNotFoundException, SQLException{
        Database db = new Database();
        JComboBox d = db.loadcar();
        return d;
    }

    

    

    
   


    

    
  
   
    
}
