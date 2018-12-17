/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author micheal
 */
public class RoomModel {

    private int room_id;
    private int food_cost;
    private int total_cost;
    private String room_type;
    private int available;
    private int drink_cost;
    private int trip_cost;

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public void setFood_cost(int food_cost) {
        this.food_cost = food_cost;
    }

    public void setDrink_cost(int drink_cost) {
        this.drink_cost = drink_cost;
    }

    public void setTrip_cost(int trip_cost) {
        this.trip_cost = trip_cost;
    }

    public void setTotal_cost(int total_cost) {
        this.total_cost = total_cost;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getRoom_id() {
        return room_id;
    }

    public int getFood_cost() {
        return food_cost;
    }

    public int getDrink_cost() {
        return drink_cost;
    }

    public int getTrip_cost() {
        return trip_cost;
    }

    public int getTotal_cost() {
        return total_cost;
    }

    public String getRoom_type() {
        return room_type;
    }

    public int getAvailable() {
        return available;
    }
}
