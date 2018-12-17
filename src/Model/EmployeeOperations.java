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
public class EmployeeOperations {

    public ArrayList selectAllEmp(Connection con) {
        ArrayList<EmpModel> al = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `Employee`");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EmpModel emp = new EmpModel();
                emp.setAge(rs.getInt("Age"));
                emp.setEmail(rs.getString("Email"));
                emp.setGender(rs.getString("Gender"));
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("FullName"));
                emp.setPhone(rs.getString("Phone"));
                emp.setSalary(rs.getInt("Salary"));
                emp.setUserName(rs.getString("UserName"));
                al.add(emp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }

        return al;
    }

    public ArrayList<EmpModel> selectAll(Connection con, String filter, String search) {
        ArrayList<EmpModel> al = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `Employee` WHERE " + filter + " like ? ");
            ps.setString(1, "%" + search + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EmpModel emp = new EmpModel();
                emp.setAge(rs.getInt("Age"));
                emp.setEmail(rs.getString("Email"));
                emp.setGender(rs.getString("Gender"));
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("FullName"));
                emp.setPhone(rs.getString("Phone"));
                emp.setSalary(rs.getInt("Salary"));
                emp.setUserName(rs.getString("UserName"));
                al.add(emp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }

        return al;
    }

    public void update(Connection con, EmpModel em, int search) {
        try {
            PreparedStatement ps = con.prepareCall("UPDATE `Employee` SET `UserName`=?,`Age`=?,`Phone`=?,`Email`=?,`Salary`=? WHERE id = ?");
            ps.setString(1, em.getName());
            ps.setInt(2, em.getAge());
            ps.setString(3, em.getPhone());
            ps.setString(4, em.getEmail());
            ps.setInt(5, em.getSalary());
            ps.setInt(6, search);
            ps.execute();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(Connection con, int id) {
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM `Employee` WHERE id = ?");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertEmp(Connection con, EmpModel emp) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO `Employee`(`id`, `FullName`, `Age`, `Gender`, `Phone`, `Email`, `Salary`, `UserName`) VALUES (?,?,?,?,?,?,?,?)");
            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setInt(3, emp.getAge());
            ps.setString(4, emp.getGender());
            ps.setString(5, emp.getPhone());
            ps.setString(6, emp.getEmail());
            ps.setInt(7, emp.getSalary());
            ps.setString(8, emp.getUserName());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
