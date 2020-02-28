/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmbs;

import java.lang.String;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Asus
 */
public class Customer{
    JTable CustomerTB;
    Database d;
    CustomerInfo customer;
    
     
    
    public Customer() throws ClassNotFoundException, SQLException {
            this.CustomerTB  = d.getCustomerTB();
            customer = new CustomerInfo().getCustomerfromID(id);
                   
       
    }
           
  
   
    
    public void registCS() throws SQLException, ClassNotFoundException{
        CustomerInfo c = new CustomerInfo(String customerID,String name,String surname,String idnumber,String sex,String nation,String phone,String email);
        d.addCustomerTB(CustomerTB,customer.customerID,customer.name, customer.surname, customer.idnumber, customer.nation, customer.phone, customer.email, customer.sex);
    
    };
    public void deleteCS() throws SQLException{
        d.deleteCustomerTB(customer.idnumber);
    };
    public void editCS() throws SQLException, ClassNotFoundException{
        d.editCustomerTB(CustomerTB,customer.customerID,customer.name, customer.surname, customer.idnumber, customer.nation, customer.phone, customer.email, customer.sex);
    };
   
}
