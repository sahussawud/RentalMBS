/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

import java.sql.SQLException;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class Register {

    String state_rentST;
    JTable RegisTB = new JTable();
    Database db = new Database();
    Vehicle vehicle = new Vehicle();

    public Register() throws ClassNotFoundException, SQLException {
            
        this.RegisTB = db.getRegisTB();
        System.out.println(RegisTB.getRowCount());
    }

    public void regist() throws SQLException {
        if (vehicle.state_rent == true) {
            state_rentST = "true";
        } else {
            state_rentST = "false";
        }

        db.addregisTB(vehicle.id, vehicle.brand, vehicle.type, vehicle.color, vehicle.plate_no, "" + vehicle.price_month, state_rentST, "" + vehicle.price_day, vehicle.date_reg);

    }


    public void deleteVH() throws SQLException {
        db.deleteRegisTB(vehicle.id);
    }

    ;
    public void editVH() throws SQLException {
        if (vehicle.state_rent == true) {
            state_rentST = "true";
        } else {
            state_rentST = "false";
        }
        db.editRegisTB(vehicle.id, vehicle.brand, vehicle.type, vehicle.color, vehicle.plate_no, "" + vehicle.price_month, state_rentST, "" + vehicle.price_day, vehicle.date_reg);
    }
;
}
