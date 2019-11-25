package rental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author denpoom
 */
public class Repair {
    JTable RepairTB;    
    JComboBox<String> repairID;
    JCheckBox checkBoxEngine,checkBoxPower,checkBoxElectric,checkBoxLiquid,checkBoxwheel;
    JTextArea detail;
    Date dateRepair,datePRB;
    
    Database d;

    public Repair(JTable RepairTB, JComboBox<String> repairID, JCheckBox checkBoxEngine, JCheckBox checkBoxPower, JCheckBox checkBoxElectric, JCheckBox checkBoxLiquid, JCheckBox checkBoxwheel, JTextArea detail, Date dateRepair, Date datePRB) throws ClassNotFoundException, SQLException {
        this.RepairTB = RepairTB;
        this.repairID = repairID;
        this.checkBoxEngine = checkBoxEngine;
        this.checkBoxPower = checkBoxPower;
        this.checkBoxElectric = checkBoxElectric;
        this.checkBoxLiquid = checkBoxLiquid;
        this.checkBoxwheel = checkBoxwheel;
        this.detail = detail;
        this.dateRepair = dateRepair;
        this.datePRB = datePRB;
        
        this.d = new Database();
    }

    
    private String idcar4, about, checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;
    String car_id, brand, model, tabian, color;
    
    public String[] getIDonJCombobox() throws SQLException{
            car_id = repairID.getSelectedItem().toString();

            String []data_set = d.getRepairID(repairID);
            brand = data_set[1];
            model = data_set[2];
            tabian = data_set[3];
            color = data_set[4];
            
            return data_set;
    }
    
    
    
    public JTable update() throws SQLException{
            return d.getRepairTB();
    }
    public JTable add() throws ClassNotFoundException, SQLException{   
            d.addRepairTB(repairID.toString(), brand, model, color, plate, repair, about, datePRB, datePRB);
            return updateExpense();
    
        }
    public JTable edit() throws ClassNotFoundException, SQLException{
           
              
           d.editExpenseTB(ExpenseID, ExpenseDate , ExpType, payee, cost+"", detail);
           return updateExpense();
           
    
    }
    public JTable delete(String expenseID) throws ClassNotFoundException, SQLException{
           
            d.deleteExpenseTB(expenseID);
            return updateExpense();
               
    }
   

   
   

    
  
    
    
    
    
    
    
    
    
    
    
    
    
}
