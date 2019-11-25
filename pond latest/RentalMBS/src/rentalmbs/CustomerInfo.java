/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmbs;

import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Asus
 */
public class CustomerInfo {
    JTable customerTB;

    public CustomerInfo() throws ClassNotFoundException, SQLException {
        
        customerTB = new JTable();
        Database d = new Database();
        customerTB = d.getCustomerTB();       
            
        this.customerID = customerID;
        this.name = name;
        this.surname = surname;
        this.idnumber = idnumber;
        this.sex = sex;
        this.nation = nation;
        this.phone = phone;
        this.email = email;
    }

    
    public void getCustomerfromID(String id){
        int row = customerTB.getRowCount();
         for (int i = 0; i < row; i++) {
            this.customerID = GetData(customerTB, i, 0).toString();
            this.name = GetData(customerTB, i, 1).toString();
            this.surname = GetData(customerTB, i, 2).toString();
            this.idnumber = GetData(customerTB, i, 3).toString();
            this.sex = GetData(customerTB, i, 4).toString();
            this.nation = GetData(customerTB, i, 5).toString();
            this.phone = GetData(customerTB, i, 6).toString();
            this.email = GetData(customerTB, i, 7).toString();
        }
    }
     public Object GetData(JTable table, int row_index, int col_index) {
        return table.getModel().getValueAt(row_index, col_index);
    }

    @Override
    public String toString() {
        return "Customer{" + "customerID=" + customerID + ", name=" + name + ", surname=" + surname + ", idnumber=" + idnumber + ", sex=" + sex + ", nation=" + nation + ", phone=" + phone + ", email=" + email + '}';
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    String customerID,name,surname,idnumber,sex,nation,phone,email;
    
}
