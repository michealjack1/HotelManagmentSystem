/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author micheal
 */
public class GuestOperation {

    public ArrayList<GuestModel> selectAllGuest(Connection con) {
        ArrayList<GuestModel> al = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `Guest`");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GuestModel ge = new GuestModel();
                ge.setCountry(rs.getString("Country"));
                ge.setGender(rs.getString("Gender"));
                ge.setId(rs.getString("id"));
                ge.setMail(rs.getString("Email"));
                ge.setName(rs.getString("FullName"));
                ge.setNum_child(rs.getInt("NumberChildren"));
                Date date = rs.getDate("EnterDate");
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                LocalDate l = LocalDate.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
                ge.setLeave_Date(l.plusDays(rs.getInt("duration")));
                ge.setRoom_id(rs.getInt("RoomID"));
                ge.setStatus(rs.getString("Status"));
                ge.setEnter_date(rs.getDate("EnterDate"));
                ge.setPhone(rs.getString("Phone"));
                al.add(ge);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuestOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<GuestModel> Search_guest(Connection con, String Filter, String search) {
        ArrayList<GuestModel> al = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `Guest` WHERE " + Filter + " like ?");
            ps.setString(1, "%" + search + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GuestModel ge = new GuestModel();
                ge.setCountry(rs.getString("Country"));
                ge.setGender(rs.getString("Gender"));
                ge.setId(rs.getString("id"));
                ge.setMail(rs.getString("Email"));
                ge.setName(rs.getString("FullName"));
                ge.setNum_child(rs.getInt("NumberChildren"));
                Date date = rs.getDate("EnterDate");
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                LocalDate l = LocalDate.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
                ge.setLeave_Date(l.plusDays(rs.getInt("duration")));
                ge.setRoom_id(rs.getInt("RoomID"));
                ge.setStatus(rs.getString("Status"));
                ge.setEnter_date(rs.getDate("EnterDate"));
                al.add(ge);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuestOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public void updateGuest(Connection con, GuestModel ge, String search) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE `Guest` SET `FullName`=?,`Phone`=?,`Country`=?,`duration`=?,`Email`=? WHERE id = ?");
            ps.setString(1, ge.getName());
            ps.setString(2, ge.getPhone());
            ps.setString(3, ge.getCountry());
            ps.setInt(4, ge.getDuration());
            ps.setString(5, ge.getMail());
            ps.setString(6, search);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(GuestOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void delete(Connection con, String id) {
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM `Guest` WHERE id = ?");
            ps.setString(1, id);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public static void insertNewGuest(){
         
     }

}
