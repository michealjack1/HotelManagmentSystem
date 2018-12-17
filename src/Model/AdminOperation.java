/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author micheal
 */
public class AdminOperation {

    public static ArrayList<AdminModel> searchAdmin(Connection con, AdminModel admin) {
        ArrayList<AdminModel> al = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement("SELECT `UserName`, `PassWord` FROM `Admin` WHERE UserName=? AND PassWord = ?");
            ps.setString(1, admin.getUserName());
            ps.setString(2, admin.getPass());
            ResultSet rs  = ps.executeQuery();
            while(rs.next()){
                AdminModel a = new AdminModel();
                a.setUserName(rs.getString("UserName"));
                a.setPass(rs.getString("PassWord"));
                al.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
    
    public static void main(String[] args) {
        ArrayList <AdminModel> al = new ArrayList<>();
        AdminModel admin = new AdminModel();
        admin.setUserName("user");
        admin.setPass("123");
        al = searchAdmin(Connector.getConnection(), admin);
        System.out.println(al.size());
    }
}
