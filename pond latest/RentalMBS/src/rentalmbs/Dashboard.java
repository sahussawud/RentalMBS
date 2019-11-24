

import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JTable;
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
public class Dashboard {
    JTable DashboardTB;
    JTable CheckTB;
    JTable TransTB;
    int Available, Busy,Check,Transaaction;
    String MouthSelect,YearSelect;
    double WholeSale,Revenue,expense;
    Date DateToday;

    public Dashboard(int Available, int Busy, int Check, int Transaaction, String MouthSelect, String YearSelect, double WholeSale, double Revenue, double expense, Date DateToday) {
        this.Available = Available;
        this.Busy = Busy;
        this.Check = Check;
        this.Transaaction = Transaaction;
        this.MouthSelect = MouthSelect;
        this.YearSelect = YearSelect;
        this.WholeSale = WholeSale;
        this.Revenue = Revenue;
        this.expense = expense;
        this.DateToday = DateToday;
    }

    public Dashboard(JTable DashboardTB) {
        this.DashboardTB = DashboardTB;
    }

    public JTable getDashboardTB() {
        return DashboardTB;
    }

    public void setDashboardTB(JTable DashboardTB) {
        this.DashboardTB = DashboardTB;
    }
    
   Dashboard() {
         //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Dashboard rr = new Dashboard();
        rr.setDashboardTB(new Database().getDashboardTB());
        System.out.println(rr.DashboardTB.getRowCount());
        
    }
    @Override
    public String toString() {
        return "Dashboard{" + "Available=" + Available + ", Busy=" + Busy + ", Check=" + Check + ", Transaaction=" + Transaaction + ", MouthSelect=" + MouthSelect + ", YearSelect=" + YearSelect + ", WholeSale=" + WholeSale + ", Revenue=" + Revenue + ", expense=" + expense + ", DateToday=" + DateToday + '}';
    }

   
    public int getAvailable() {
        return Available;
    }

    public void setAvailable(int Available) {
        this.Available = Available;
    }

    public int getBusy() {
        return Busy;
    }

    public void setBusy(int Busy) {
        this.Busy = Busy;
    }
  public void setCheck(int Check) {
        this.Check = Check;
    }

    public int getCheck() {
        return Check;
    }

    public void setTransaaction(int Transaaction) {
        this.Transaaction = Transaaction;
    }

    public void setYearSelect(String YearSelect) {
        this.YearSelect = YearSelect;
    }

    public void setWholeSale(double WholeSale) {
        this.WholeSale = WholeSale;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }
    public int getTransaaction() {
        return Transaaction;
    }
    public String getMouthSelect() {
        return MouthSelect;
    }
   public void setMouthSelect(String MouthSelect) {
        this.MouthSelect = MouthSelect;
    }
    public String getYearSelect() {
        return YearSelect;
    }

    public double getWholeSale() {
        return WholeSale;
    }
 public void setRevenue(double Revenue) {
        this.Revenue = Revenue;
    }

    public double getRevenue() {
        return Revenue;
    }
 
    public double getExpense() {
        return expense;
    }

    public Date getDateToday() {
        return DateToday;
    }
    public void setDateToday(Date DateToday) {
        this.DateToday = DateToday;
    }
    
    
    
    
    
    
}
