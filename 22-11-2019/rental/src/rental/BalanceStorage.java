/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import rental.carregis;

/**
 *
 * @author LAB207_65
 */
public class BalanceStorage {
    
    public static double getBalance(){
        double balance = 0;
        File f = new File("Balance.dat");
        if (f.exists()) {
            
            try {
                FileInputStream fin = new FileInputStream("Balance.dat");
                DataInputStream din = new DataInputStream(fin);
                balance = din.readDouble();
                din.close();
                fin.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(BalanceStorage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BalanceStorage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
           balance = 9000;
        }
        return balance;

            
    }
     public static void saveBalance(double balance) {
        try {
            FileOutputStream fout = new FileOutputStream("Balance.dat");

            DataOutputStream dout = new DataOutputStream(fout);
            dout.writeDouble(balance);
            fout.close();
            dout.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BalanceStorage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BalanceStorage.class.getName()).log(Level.SEVERE, null, ex);
        }

}
}



 int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://ihost.it.kmitl.ac.th:3306/it61070203_base?useUnicode=true&characterEncoding=utf-8", "it61070203_base", "123456");
            
            PreparedStatement pst;
            pst = con.prepareStatement("select * from Customer");
            ResultSet Rs = pst.executeQuery();
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)Table_cs.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v2 = new Vector();
                for(int i=1;i<=c;i++){
                    v2.add(Rs.getString("id_customer"));
                    v2.add(Rs.getString("name_customer"));
                    v2.add(Rs.getString("lname_customer"));
                    v2.add(Rs.getString("cardid_customer"));
                    v2.add(Rs.getString("nationality_customer"));
                    v2.add(Rs.getString("tel_customer"));
                    v2.add(Rs.getString("email_customer"));
                    v2.add(Rs.getString("sex__customer"));
                    
                }
                df.addRow(v2);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(carregis.class.getName()).log(Level.SEVERE, null, ex);
        } 