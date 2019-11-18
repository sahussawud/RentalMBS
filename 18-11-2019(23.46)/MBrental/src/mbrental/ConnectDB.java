/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbrental;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class ConnectDB {

    static String db_driver = "com.mysql.jdbc.Driver";
    static String db_name = "it61070203_base";

    public static void main(String[] args) {
        System.out.println("ก่อน");
        showData();
        deleteDB();
        System.out.println("หลัง");
        showData();
    }

    public static Connection connectDB() {
        try {
            Class.forName(db_driver);
            Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");
            System.out.println("Database Connection succesful");
            return con;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void showData() {
        String sql = "select * from ExpenseTB";
        try {
            Connection c = connectDB();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()) {
                System.out.println("เลขที่การชำระ :" + rs.getString(1) + " ณ วันที่ " + rs.getString(2) + " ประเภทค่าใช้จ่าย " + rs.getString(3) + " จ่ายให้ " + rs.getString(4) + " จำนวนเงิน " + rs.getString(5) + " บาท โดยรายละเอียดการชำระ ดังนี้ " + rs.getString(6));
            }
            rs.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertDB() {
        String expense_id, expense_date, expense_type,
                expense_reciever, expense_amount, expense_detail;
        String sql = "insert into ExpenseTB value('10013','19/07/62','อื่นๆ','กรมสรรพกร','2500','ภาษีป้าย','18/07/62')";
        try {
            Connection c = connectDB();
            Statement stm = c.createStatement();//สร้าง statement
            stm.executeUpdate(sql);
            System.out.println("บันทึกข้อมูลเรียบร้อย");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void updateDB(){
        //set ตามด้วย ชื่อ Attribute ที่อยากเเก้ เช่น "id" ='150' 
        String sql = "update ExpenseTB set id_expense='10005',"
                    +"date_expense = '18/08/62',"
                    +"type_expense = 'อื่นๆ',"
                    +"reciever_expense = 'ป้านกเล็ก',"
                    +"amount_expense = '5000',"
                    +"detail_expense = 'สั่งอาหารเลี้ยงพนักงาน' where id_expense = 10005";  
        try { 
            Connection c = connectDB();
            Statement stm = c.createStatement();//สร้าง statement
            stm.executeUpdate(sql);
            System.out.println("เเก้ไข"
                    + "ข้อมูลเรียบร้อย");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void deleteDB(){
        String id_delete = "10010";
        String sql = "delete from ExpenseTB where id_expense = '"+id_delete+"'";
        try { 
            Connection c = connectDB();
            Statement stm = c.createStatement();//สร้าง statement
            stm.executeUpdate(sql);
            System.out.println("ลบ"
                    + "ข้อมูลเรียบร้อย");
            
          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
