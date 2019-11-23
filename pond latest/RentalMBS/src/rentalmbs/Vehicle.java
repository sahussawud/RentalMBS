/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalMBS;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class Vehicle {

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", brand=" + brand + ", type=" + type + ", color=" + color + ", plate_no=" + plate_no + ", price_day=" + price_day + ", price_month=" + price_month + ", date_reg=" + date_reg + ", state_rent=" + state_rent + '}';
    }

    public Vehicle(String id, String brand, String type, String color, String plate_no, int price_day, int price_month, Date date_reg, boolean state_rent) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.plate_no = plate_no;
        this.price_day = price_day;
        this.price_month = price_month;
        this.date_reg = date_reg;
        this.state_rent = state_rent;
    }
    String id,brand,type,color,plate_no;
    int price_day,price_month;
    Date date_reg;
    boolean state_rent;
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isState_rent() {
        return state_rent;
    }

    public void setState_rent(boolean state_rent) {
        this.state_rent = state_rent;
    }

    
     

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate_no() {
        return plate_no;
    }

    public void setPlate_no(String plate_no) {
        this.plate_no = plate_no;
    }

    public int getPrice_day() {
        return price_day;
    }

    public void setPrice_day(int price_day) {
        this.price_day = price_day;
    }

    public int getPrice_month() {
        return price_month;
    }

    public void setPrice_month(int price_month) {
        this.price_month = price_month;
    }

    public Date getDate_reg() {
        return date_reg;
    }

    public void setDate_reg(Date date_reg) {
        this.date_reg = date_reg;
    }
  
}
