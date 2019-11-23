package rentalmbs;

import java.sql.SQLException;
import java.util.Date;
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
    String repairID,aboutrepair;
    JCheckBox checkBoxEngine,checkBoxPower,checkBoxElectric,checkBoxLiquid,checkBoxwheel;
    Date dateRepair,dateArt;

    public Repair(String repairID, String aboutrepair, JCheckBox checkBoxEngine, JCheckBox checkBoxPower, JCheckBox checkBoxElectric, JCheckBox checkBoxLiquid, JCheckBox checkBoxwheel, JTable RepairTB,Date dateRepair, Date dateArt) {
        this.repairID = repairID;
        this.aboutrepair = aboutrepair;
        this.checkBoxEngine = checkBoxEngine;
        this.checkBoxPower = checkBoxPower;
        this.checkBoxElectric = checkBoxElectric;
        this.checkBoxLiquid = checkBoxLiquid;
        this.checkBoxwheel = checkBoxwheel;
        this.RepairTB = RepairTB;
        this.dateRepair = dateRepair;
        this.dateArt = dateArt;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Repair rr = new Repair();
        rr.setRepairTB(new Database().getRepairTB());
        System.out.println(rr.RepairTB.getRowCount());
        
    }
    

    public JTable getRepairTB() {
        return RepairTB;
    }

    public void setRepairTB(JTable RepairTB) {
        this.RepairTB = RepairTB;
    }

   Repair() {
         //To change body of generated methods, choose Tools | Templates.
    } 
   

    @Override
    public String toString() {
        return "RepairInfo{" + "repairID=" + repairID + ", aboutrepair=" + aboutrepair + ", checkBoxEngine=" + checkBoxEngine + ", checkBoxPower=" + checkBoxPower + ", checkBoxElectric=" + checkBoxElectric + ", checkBoxLiquid=" + checkBoxLiquid + ", checkBoxwheel=" + checkBoxwheel + '}';
    }
   

    public String getRepairID() {
        return repairID;
    }
    
    public void setRepairID(String repairID) {
        this.repairID = repairID;
    }
    
    public String getAboutrepair() {
        return aboutrepair;
    }
    
    public void setAboutrepair(String aboutrepair) {
        this.aboutrepair = aboutrepair;
    }
    
    public JCheckBox getCheckBoxEngine() {
        return checkBoxEngine;
    }
    
    public void setCheckBoxEngine(JCheckBox checkBoxEngine) {
        this.checkBoxEngine = checkBoxEngine;
    }

    public JCheckBox getCheckBoxPower() {
        return checkBoxPower;
    }
    
    public void setCheckBoxPower(JCheckBox checkBoxPower) {
        this.checkBoxPower = checkBoxPower;
    }
    
    public JCheckBox getCheckBoxElectric() {
        return checkBoxElectric;
    }
    
    public void setCheckBoxElectric(JCheckBox checkBoxElectric) {
        this.checkBoxElectric = checkBoxElectric;
    }

    public JCheckBox getCheckBoxLiquid() {
        return checkBoxLiquid;
    }
    
    public void setCheckBoxLiquid(JCheckBox checkBoxLiquid) {
        this.checkBoxLiquid = checkBoxLiquid;
    }

    public JCheckBox getCheckBoxwheel() {
        return checkBoxwheel;
    }
  
    public void setCheckBoxwheel(JCheckBox checkBoxwheel) {
        this.checkBoxwheel = checkBoxwheel;
    }

    public Date getDateRepair() {
        return dateRepair;
    }

    public Date getDateArt() {
        return dateArt;
    }

    public void setDateRepair(Date dateRepair) {
        this.dateRepair = dateRepair;
    }

    public void setDateArt(Date dateArt) {
        this.dateArt = dateArt;
    }
   
    

    

   
   

    
  
    
    
    
    
    
    
    
    
    
    
    
    
}
