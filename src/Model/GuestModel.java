/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.time.LocalDate;


/**
 *
 * @author micheal
 */
public class GuestModel {

    private String id;
    private String name;
    private String gender;
    private String mail;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEnter_date(Date enter_date) {
        this.enter_date = enter_date;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNum_child(int num_child) {
        this.num_child = num_child;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLeave_Date(LocalDate Leave_Date) {
        this.Leave_Date = Leave_Date;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMail() {
        return mail;
    }

    public int getRoom_id() {
        return room_id;
    }

    public String getStatus() {
        return status;
    }

    public Date getEnter_date() {
        return enter_date;
    }

    public int getDuration() {
        return duration;
    }

    public String getCountry() {
        return country;
    }

    public int getNum_child() {
        return num_child;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getLeave_Date() {
        return Leave_Date;
    }
    private int room_id;
    private String status;
    private Date enter_date;
    private int duration;
    private String country;
    private int num_child;
    private String phone;
    private LocalDate Leave_Date;

    

}
