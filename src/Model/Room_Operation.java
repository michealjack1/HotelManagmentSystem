/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author micheal
 */
public class Room_Operation {

    public ArrayList<RoomModel> search(Connection con, String filter, String key) {
        int i = 0;
        ArrayList<RoomModel> al = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `Room` WHERE " + filter + " like ?");
            ps.setString(1, "%" + key + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RoomModel rm = new RoomModel();
                rm.setAvailable(rs.getInt("available"));
                rm.setDrink_cost(rs.getInt("DrinkCost"));
                rm.setFood_cost(rs.getInt("FoodCost"));
                rm.setRoom_id(rs.getInt("RoomID"));
                rm.setRoom_type(rs.getString("room_type"));
                rm.setTotal_cost(rs.getInt("Payment"));
                rm.setTrip_cost(rs.getInt("TripCost"));
                al.add(rm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Room_Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<RoomModel> selectAll(Connection con) {
        int i = 0;
        ArrayList<RoomModel> al = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `Room`");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RoomModel rm = new RoomModel();
                rm.setAvailable(rs.getInt("available"));
                rm.setDrink_cost(rs.getInt("DrinkCost"));
                rm.setFood_cost(rs.getInt("FoodCost"));
                rm.setRoom_id(rs.getInt("RoomID"));
                rm.setRoom_type(rs.getString("room_type"));
                rm.setTotal_cost(rs.getInt("Payment"));
                rm.setTrip_cost(rs.getInt("TripCost"));
                al.add(rm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Room_Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public void update(Connection con, RoomModel room) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE `Room` SET `Payment`=?,`available`=? WHERE RoomID = ?");
            ps.setInt(1, room.getTotal_cost());
            ps.setInt(2, room.getAvailable());
            ps.setInt(3, room.getRoom_id());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Room_Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
