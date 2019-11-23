/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmbs;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Asus
 */
public class Customer{
    Database db = new Database();
    CustomerInfo customer = new CustomerInfo();
    public Customer() throws ClassNotFoundException, SQLException {
        
        
        this.CustomerTB  = db.getCustomerTB();
        System.out.println(CustomerTB);
        System.out.println(CustomerTB.getRowCount());
    }
     JTable CustomerTB = new JTable();
    
  
    public static void main(String[] args) {
        try {
            new Customer();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void registCS() throws SQLException, ClassNotFoundException{
        db.addCustomerTB(CustomerTB,customer.customerID,customer.name, customer.surname, customer.idnumber, customer.nation, customer.phone, customer.email, customer.sex);
    
    };
    public void deleteCS() throws SQLException{
        db.deleteCustomerTB(customer.idnumber);
    };
    public void editCS() throws SQLException, ClassNotFoundException{
        db.editCustomerTB(CustomerTB,customer.customerID,customer.name, customer.surname, customer.idnumber, customer.nation, customer.phone, customer.email, customer.sex);
    };
   
}
