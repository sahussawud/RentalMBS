/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author 04
 */
public class Database {

    public String nameDB;
    public String[] TableDB;
    public String hostURL;
    protected String username;
    protected String password;
    public Connection con;
    int c;

    public Database() throws ClassNotFoundException, SQLException {

        this.nameDB = "it61070203_base";
        this.TableDB = new String[]{"carregis", "carrepair", "Customer", "ExpenseTB", "Rental", "ReturnCar"};
        this.hostURL = "jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8";
        this.username = "it61070203_base";
        this.password = "123456";

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(hostURL, username, password);

    }

    //table in Register panal-------------------------------------------------------------------
    public JTable getRegisTB() throws SQLException {

        JTable j = new JTable();

        PreparedStatement pst;
        pst = con.prepareStatement("select * from carregis");
        ResultSet Rs = pst.executeQuery();
        ResultSetMetaData rd = Rs.getMetaData();
        c = rd.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) j.getModel();
        df.setRowCount(0);

        while (Rs.next()) {
            Vector v2 = new Vector();
            for (int i = 1; i <= c; i++) {
                v2.add(Rs.getString("carid"));
                v2.add(Rs.getString("carbrand"));
                v2.add(Rs.getString("carmodel"));
                v2.add(Rs.getString("carcolor"));
                v2.add(Rs.getString("cartabian"));
                v2.add(Rs.getString("carprice"));
                v2.add(Rs.getString("carpriceday"));
                v2.add(Rs.getString("carstatus"));
                v2.add(Rs.getString("date"));
            }
            df.addRow(v2);
        }

        return j;
    }

    public void addregisTB(String idrod, String band, String type, String color, String tabian, String cost, String status, String costd,Date day) throws SQLException {

        Statement stmt = con.createStatement();
        PreparedStatement pst;
        pst = con.prepareStatement("insert into carregis(carid,carbrand,carmodel,carcolor,cartabian,carprice,carstatus,carpriceday,date) values(?,?,?,?,?,?,?,?,?)");
        pst.setString(1, idrod);
        pst.setString(2, band);
        pst.setString(3, type);
        pst.setString(4, color);
        pst.setString(5, tabian);
        pst.setString(6, cost);
        pst.setString(7, status);
        pst.setString(8, costd);

        SimpleDateFormat Date_Format = new SimpleDateFormat("dd-MM-yyyy");
        String date = Date_Format.format(day);

        pst.setString(9, date);

        pst.executeUpdate();

    }

    public void editRegisTB(String id, String band, String type, String color, String tabian, String cost, String status, String costd, Date day) throws SQLException {

        PreparedStatement pst = con.prepareStatement("update carregis set carbrand=?,carmodel=?,carcolor=?,cartabian=?,carprice=?,carstatus=?,carpriceday=?,date=? where carid=? ");
        pst.setString(1, band);
        pst.setString(2, type);
        pst.setString(3, color);
        pst.setString(4, tabian);
        pst.setString(5, cost);
        pst.setString(6, status);
        pst.setString(7, costd);
        
        SimpleDateFormat Date_Format = new SimpleDateFormat("dd-MM-yyyy");
        String date = Date_Format.format(day);
        pst.setString(8, date);
        pst.setString(9, id);
        pst.executeUpdate();
        
     

        

    }

    public void deleteRegisTB(String id) throws SQLException {

        PreparedStatement pst = con.prepareStatement("delete from carregis where carid=?");
        pst.setString(1, id);
        pst.executeUpdate();

    }

    //from  showData();----------------------------------------------------------------------------
    public JTable getCustomerTB() throws ClassNotFoundException, SQLException {
        JTable j = new JTable();

        PreparedStatement pst;
        pst = con.prepareStatement("select * from Customer");
        ResultSet Rs = pst.executeQuery();
        ResultSetMetaData rd = Rs.getMetaData();
        c = rd.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) j.getModel();
        df.setRowCount(0);

        while (Rs.next()) {
            Vector v2 = new Vector();
            for (int i = 1; i <= c; i++) {
                v2.add(Rs.getString("id_customer"));
                v2.add(Rs.getString("name_customer"));
                v2.add(Rs.getString("lname_customer"));
                v2.add(Rs.getString("cardid_customer"));
                v2.add(Rs.getString("nationality_customer"));
                v2.add(Rs.getString("tel_customer"));
                v2.add(Rs.getString("email_customer"));
                v2.add(Rs.getString("sex_customer"));

            }
            df.addRow(v2);
        }

        return j;

    }

    public void addCustomerTB(JTable Table_cs, String id, String name, String lname, String cid, String nation, String tels, String mail, String sex) throws SQLException, ClassNotFoundException {

        String sql = "insert into Customer value('" + id + "','" + name + "','" + lname + "','" + cid + "','" + nation + "','" + tels + "','" + mail + "','" + sex + "')";
        String sql_read = "select * from Customer";

        Statement stmt = con.createStatement();
        stmt.executeUpdate(sql);
        PreparedStatement pst = con.prepareStatement(sql_read);
        ResultSet rs = pst.executeQuery();
        Table_cs.setModel(DbUtils.resultSetToTableModel(rs));
        ///ResultSet rs = stmt.executeQuery("SELECT * FROM carregis;");
        getCustomerTB();
        System.out.println("add success");

    }

    public void editCustomerTB(JTable Table_cs, String id, String name, String lname, String cid, String nation, String tels, String mail, String sex) throws SQLException, ClassNotFoundException {
        DefaultTableModel d1 = (DefaultTableModel) Table_cs.getModel();

        int selectedrow = Table_cs.getSelectedRow();

        PreparedStatement pst = con.prepareStatement("update  Customer set name_customer=?,lname_customer=?,cardid_customer=?,nationality_customer=?,tel_customer=?,email_customer=?,sex_customer=? where id_customer=? ");

        pst.setString(1, name);
        pst.setString(2, lname);
        pst.setString(3, cid);
        pst.setString(4, nation);
        pst.setString(5, tels);
        pst.setString(6, mail);
        pst.setString(7, sex);
        pst.setString(8, id);
       pst.executeUpdate();
        getCustomerTB();
       
        System.out.println("เเก้ไข CustomerTB ดาต้าเบส");

    }

    public void deleteCustomerTB(String id) throws SQLException {

        PreparedStatement pst = con.prepareStatement("delete from Customer where id_customer=?");
        pst.setString(1, id);
        pst.executeUpdate();
System.out.println("เเก้ไข CustomerTB ดาต้าเบส");
    }

    //status dashboard in Dashboard Panal--------------------------------------------------------
    public JTable getDashboardTB() throws SQLException {
        JTable dashboard = new JTable();

        PreparedStatement pst = con.prepareStatement("select * from carregis");
        ResultSet Rs = pst.executeQuery();
        ResultSetMetaData rd = Rs.getMetaData();
        c = rd.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) dashboard.getModel();
        df.setRowCount(0);

        while (Rs.next()) {
            Vector v2 = new Vector();
            for (int i = 1; i <= c; i++) {
                v2.add(Rs.getString("carid"));
                v2.add(Rs.getString("carbrand"));
                v2.add(Rs.getString("carmodel"));
                v2.add(Rs.getString("carcolor"));
                v2.add(Rs.getString("cartabian"));
                v2.add(Rs.getString("carstatus"));
                v2.add(Rs.getString("date"));

            }
            df.addRow(v2);
        }

        return dashboard;
    }

//    public void addDashboardTB(){
//        
//    }
//
//    public void editDashboardTB() {
//    }
//
//    public void deleteDashboardTB() {
//    }

    public JTable getCheckTB() throws SQLException {
        JTable CheckTB = new JTable();

        PreparedStatement pst = con.prepareStatement("select * from carrepair");
        ResultSet Rs = pst.executeQuery();
        ResultSetMetaData rd = Rs.getMetaData();
        c = rd.getColumnCount();
        c = rd.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) CheckTB.getModel();

        df.setRowCount(0);

        while (Rs.next()) {
            Vector v2 = new Vector();
            for (int i = 1; i <= c; i++) {
                v2.add(Rs.getString("carid"));
                v2.add(Rs.getString("carbrand") + " " + Rs.getString("carmodel") + " " + Rs.getString("carcolor"));
                v2.add(Rs.getString("cartabian"));
                v2.add(Rs.getString("type"));
                v2.add(Rs.getString("about"));
                v2.add(Rs.getString("daterepair"));
                v2.add(Rs.getString("dateprb"));
            }
            df.addRow(v2);
        }

        return CheckTB;
    }
//     public void addCheck() {
//    }
//
//    public void editCheckTB() {
//    }
//
//    public void deleteCheckTB() {
//    }
    

    public JTable getTransTB() throws SQLException {
        JTable transactionTB = new JTable();
        int count = 0;

        PreparedStatement pst = con.prepareStatement("select * from ExpenseTB");
        ResultSet Rs = pst.executeQuery();
        ResultSetMetaData rd = Rs.getMetaData();
        c = rd.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) transactionTB.getModel();

        df.setRowCount(0);

        while (Rs.next()) {
            Vector v2 = new Vector();
            for (int i = 1; i <= c; i++) {
                v2.add(Rs.getString("date_expense"));
                v2.add(Rs.getString("type_expense"));
                v2.add("รายจ่าย");
                v2.add(Rs.getString("amount_expense"));
                v2.add("-");

            }
            df.addRow(v2);
            count++;
        }

        pst = con.prepareStatement("select * from Rental");
        Rs = pst.executeQuery();
        rd = Rs.getMetaData();
        c = rd.getColumnCount();
        df = (DefaultTableModel) transactionTB.getModel();

        df.setRowCount(count);

        while (Rs.next()) {
            Vector v2 = new Vector();
            for (int i = 1; i <= c; i++) {
                v2.add(Rs.getString("due"));
                v2.add("ให้เช่า " + Rs.getString("car_id"));
                v2.add("รายรับ");
                v2.add(Rs.getString("fee"));
                v2.add(Rs.getString("date"));

            }
            df.addRow(v2);
            count++;
        }

        pst = con.prepareStatement("select * from ReturnCar");
        Rs = pst.executeQuery();
        rd = Rs.getMetaData();
        c = rd.getColumnCount();
        df = (DefaultTableModel) transactionTB.getModel();

        df.setRowCount(count);

        while (Rs.next()) {
            Vector v2 = new Vector();
            for (int i = 1; i <= c; i++) {
                v2.add(Rs.getString("Return_Date"));
                v2.add("ค่าปรับจากรถ " + Rs.getString("ID_Car"));
                v2.add("รายรับ");
                v2.add(Rs.getString("Total"));
                v2.add("-");

            }
            df.addRow(v2);
            count++;
        }
        return transactionTB;
    }

    //----------------------------------------------------------------------------------

    //update Table2 in repairPanel--------------------------------------------------------
    public JTable getRepairTB() throws SQLException {
        JTable repairtable = new JTable();

        PreparedStatement pst;
        pst = con.prepareStatement("select * from carrepair");
        ResultSet Rs = pst.executeQuery();
        ResultSetMetaData rd = Rs.getMetaData();
        c = rd.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) repairtable.getModel();
        df.setRowCount(0);

        while (Rs.next()) {
            Vector v2 = new Vector();
            for (int i = 1; i <= c; i++) {
                v2.add(Rs.getString("carid"));
                v2.add(Rs.getString("carbrand"));
                v2.add(Rs.getString("carmodel"));
                v2.add(Rs.getString("carcolor"));
                v2.add(Rs.getString("cartabian"));
                v2.add(Rs.getString("type"));
                v2.add(Rs.getString("about"));
                v2.add(Rs.getString("daterepair"));
                v2.add(Rs.getString("dateprb"));
            }
            df.addRow(v2);
        }
        return repairtable;

    }

    public void addRepairTB(String id_mb, String brand, String model, String color, String plate, String repair, String about, Date dateRe, Date datePRB) throws SQLException {
         SimpleDateFormat Date_Format = new SimpleDateFormat("dd-MM-yyyy");
           String date = Date_Format.format(dateRe);

           SimpleDateFormat Date_Format1 = new SimpleDateFormat("dd-MM-yyyy");
            String datep = Date_Format1.format(datePRB);

        System.out.println("Database Connection succesful");
        Statement stmt = con.createStatement();
        PreparedStatement pst;
        pst = con.prepareStatement("insert into carrepair(carid,carbrand,carmodel,carcolor,cartabian,type,about,daterepair,dateprb) values(?,?,?,?,?,?,?,?,?)");
        pst.setString(1, id_mb);
        pst.setString(2, brand);
        pst.setString(3, model);
        pst.setString(4, color);
        pst.setString(5, plate);
        pst.setString(6, repair);
        pst.setString(7, about);
        pst.setString(8, date);
        pst.setString(9, datep);

        pst.executeUpdate();
    }

    public void editRepairTB(String brand, String model, String color, String plate, String repair, String about, Date dateRe, Date datePRB, String id_mb) throws SQLException {
        SimpleDateFormat Date_Format = new SimpleDateFormat("dd-MM-yyyy");
        String date = Date_Format.format(dateRe);
        String datep = Date_Format.format(datePRB);

        PreparedStatement pst = con.prepareStatement("update carrepair SET carbrand=?,carmodel=?,carcolor=?,cartabian=?,type=?,about=?,daterepair=?,dateprb=? WHERE carid=?");
        pst.setString(1, brand);
        pst.setString(2, model);
        pst.setString(3, color);
        pst.setString(4, plate);
        pst.setString(5, repair);
        pst.setString(6, about);
        pst.setString(7, date);
        pst.setString(8, datep);
        pst.setString(9, id_mb);
        pst.executeUpdate();
    }

    public void deleteRepairTB(String id) throws SQLException {
        PreparedStatement pst = con.prepareStatement("delete from carrepair where carid=?");
        pst.setString(1, id);
        pst.executeUpdate();
    }

    //--------------------------------------Expense----------------------------
    public JTable getExpenseTB() throws SQLException {

        JTable Expensetable = new JTable();
        PreparedStatement pst = con.prepareStatement("select * from ExpenseTB");
        ResultSet Rs = pst.executeQuery();
        ResultSetMetaData rd = Rs.getMetaData();
        c = rd.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) Expensetable.getModel();
        df.setRowCount(0);

        while (Rs.next()) {
            Vector v2 = new Vector();
            for (int i = 1; i <= c; i++) {
                v2.add(Rs.getString("id_expense"));
                v2.add(Rs.getString("date_expense"));
                v2.add(Rs.getString("type_expense"));
                v2.add(Rs.getString("reciever_expense"));
                v2.add(Rs.getString("amount_expense"));
                v2.add(Rs.getString("detail_expense"));
           

            }
            df.addRow(v2);
        }
        return Expensetable;
    }

    public void addExpenseTB(String Id,String Day,String type, String Reciver,String Amount,String Detail) throws SQLException {
       
        Statement stmt = con.createStatement();
        PreparedStatement pst = con.prepareStatement("insert into ExpenseTB(id_expense,date_expense,type_expense,reciever_expense,amount_expense,detail_expense) values(?,?,?,?,?,?)");
        pst.setString(1, Id);
        pst.setString(2, Day);
        pst.setString(3, type);
        pst.setString(4, Reciver);
        pst.setString(5, Amount);
        pst.setString(6, Detail);      
        pst.executeUpdate();
        
    }

    public void editExpenseTB(String id,String Day,String type, String Reciver,String Amount,String Detail) throws SQLException{
        System.out.println("sss");
            PreparedStatement pst = con.prepareStatement("update ExpenseTB set date_expense=?,type_expense=?,reciever_expense=?,amount_expense=?,detail_expense=? where id_expense=? ");

            pst.setString(1, Day);
            pst.setString(2, type);
            pst.setString(3, Reciver);
            pst.setString(4, Amount);
            pst.setString(5, Detail);
         
            pst.setString(6, id);
            pst.executeUpdate();
    }

    public void deleteExpenseTB(String id) throws SQLException{
         PreparedStatement pst = con.prepareStatement("delete from ExpenseTB where id_expense=?");
         pst.setString(1, id);
         pst.executeUpdate();
    }

// id car update
    public JComboBox<String> loadcar() throws ClassNotFoundException, SQLException {

        JComboBox idcar = new JComboBox();
        PreparedStatement pst = con.prepareStatement("select * from carregis");
        ResultSet rs = pst.executeQuery();
        idcar.removeAllItems();
        while (rs.next()) {

            idcar.addItem(rs.getString(1));
        }

        return idcar;
    }

    public void rentUpdate(String rent_id,String mb_id,String cus_id,String date2,String due2,String fee,String binder,String Mile) throws SQLException{
        
            PreparedStatement pst3 = con.prepareStatement("insert into Rental(RentalNum,car_id,cust_id,due,date,fee,mudjum,mile,rentstatus) values(?,?,?,?,?,?,?,?,?)");
            pst3.setString(1, rent_id);
            pst3.setString(2, mb_id);
            pst3.setString(3, cus_id);
            pst3.setString(4, date2);
            pst3.setString(5, due2);
            pst3.setString(6, fee);
            pst3.setString(7, binder);
            pst3.setString(8, Mile);
            pst3.setString(9, "ยังไม่คืน");
            pst3.executeUpdate();
            PreparedStatement pst2 = con.prepareStatement("update carregis set carstatus = 'ไม่ว่าง' where carid = ?");
            pst2.setString(1, mb_id);
            pst2.executeUpdate();
    }
    
     public String[] getRepairID(JComboBox<String> repairID) throws SQLException{
         
            // [id,carbrand, carmodel, cartabian, carcolor]
            String [] data_set = new String[]{"","","",""};
            String car_id = repairID.getSelectedItem().toString();

            PreparedStatement pst1 = con.prepareStatement("select * from carregis where carid = ?");
            pst1.setString(1, car_id);
            data_set[0] = car_id;
            ResultSet rs = pst1.executeQuery();
            while (rs.next()) {
                    data_set[1] = rs.getString(2);
                    data_set[2] = rs.getString(3);
                    data_set[3] = rs.getString(4);
                    data_set[4] = rs.getString(5);
            }
          
            return data_set;        
    }
}
