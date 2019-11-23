/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;
import javax.swing.*;
/**
 *
 * @author Asus
 */
public interface Register {
    JTable VehicleTB = new JTable();
    
    public void regist();
    public void deleteVH();
    public void editVH();
}
