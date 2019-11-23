/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmbs;

/**
 *
 * @author Asus
 */
public class CustomerInfo {

    public CustomerInfo(String customerID, String name, String surname, String idnumber, String sex, String nation, String phone, String email) {
        this.customerID = customerID;
        this.name = name;
        this.surname = surname;
        this.idnumber = idnumber;
        this.sex = sex;
        this.nation = nation;
        this.phone = phone;
        this.email = email;
    }

    CustomerInfo() {
         //To change body of generated methods, choose Tools | Templates.
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
