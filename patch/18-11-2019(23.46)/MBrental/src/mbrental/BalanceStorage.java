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
import java.util.logging.Level;
import java.util.logging.Logger;

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
