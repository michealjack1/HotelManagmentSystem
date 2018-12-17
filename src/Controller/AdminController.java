/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Connector;
import Model.EmpModel;
import Model.EmployeeOperations;
import Model.GuestModel;
import Model.GuestOperation;
import Model.RoomModel;
import Model.Room_Operation;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author micheal
 */
public class AdminController implements Initializable {
    
    @FXML
    private ImageView emp_img;
    @FXML
    private ImageView guest_img;
    @FXML
    private ImageView room_img;
    @FXML
    private ImageView add_emp_img;
    @FXML
    private Pane emp_pane;
    @FXML
    private Pane guest_pane;
    @FXML
    private Pane room_pane;
    @FXML
    private Pane new_emp_pane;
    @FXML
    private Pane pane1;
    @FXML
    private Pane pane2;
    @FXML
    private Pane pane3;
    @FXML
    private Pane pane4;
    @FXML
    private ImageView back_img;
    @FXML
    private TableView<EmpModel> tv_emp;
    @FXML
    private TableColumn<EmpModel, String> name_emp;
    @FXML
    private TableColumn<EmpModel, Integer> id_emp;
    @FXML
    private TableColumn<EmpModel, Integer> salary_emp;
    @FXML
    private TableColumn<EmpModel, Integer> age_emp;
    @FXML
    private TableColumn<EmpModel, String> phone_emp;
    @FXML
    private TableColumn<EmpModel, String> email_emp;
    @FXML
    private TableColumn<EmpModel, String> gender_emp;
    @FXML
    private TableColumn<EmpModel, String> username_emp;
    @FXML
    private JFXTextField search_emp;
    @FXML
    private JFXComboBox<String> cmb_emp;
    @FXML
    private JFXTextField name_update_emp;
    @FXML
    private JFXTextField age_update_emp;
    @FXML
    private JFXTextField email_update_emp;
    @FXML
    private JFXTextField salary_update_emp;
    @FXML
    private JFXTextField phone__update_emp;
    @FXML
    private JFXButton btn_update_emp;
    @FXML
    private JFXButton btn_delete_emp;
    
    
    Connection con = null;
    
    EmpModel em = null;
    GuestModel ge = null;
    RoomModel rm = null;
    
    
    EmployeeOperations emp_op;
    @FXML
    private JFXTextField id_update_emp;
    @FXML
    private TableView<GuestModel> tv_guest;
    @FXML
    private TableColumn<GuestModel, Integer> tc_guest_id;
    @FXML
    private TableColumn<GuestModel, String> tc_guest_name;
    @FXML
    private TableColumn<GuestModel, String> tc_guest_phone;
    @FXML
    private TableColumn<GuestModel, Integer> tc_guest_num_child;
    @FXML
    private TableColumn<GuestModel, String> tc_guest_status;
    @FXML
    private TableColumn<GuestModel, String> tc_guest_email;
    @FXML
    private TableColumn<GuestModel, String> tc_guest_gender;
    @FXML
    private TableColumn<GuestModel, String> tc_guest_country;
    @FXML
    private TableColumn<GuestModel, Integer> tc_guest_room_id;
    @FXML
    private TableColumn<GuestModel, Integer> tc_guest_stay;
    @FXML
    private JFXTextField tf_search_guest;
    @FXML
    private JFXComboBox<String> cmb_filter_guest;
    @FXML
    private JFXButton btn_update_guest;
    @FXML
    private JFXTextField tf_guest_name;
    @FXML
    private JFXTextField tf_guest_phone;
    @FXML
    private JFXTextField tf_guest_email;
    @FXML
    private JFXTextField tf_guest_id;
    @FXML
    private JFXTextField tf_guest_country;
    @FXML
    private JFXTextField tf_guest_num_child;
    @FXML
    private JFXButton btn_delete_guest;
    
    GuestOperation guestOperation = null;
    @FXML
    private TableColumn<RoomModel, Integer> ct_room_num;
    @FXML
    private TableColumn<RoomModel, String> ct_room_type;
    @FXML
    private TableColumn<RoomModel, Integer> ct_room_food;
    @FXML
    private TableColumn<RoomModel, Integer> ct_room_drink;
    @FXML
    private TableColumn<RoomModel, Integer> trip;
    @FXML
    private TableColumn<RoomModel, Integer> ct_room_total;
    @FXML
    private TableColumn<RoomModel, Integer> ct_room_available;
    @FXML
    private JFXComboBox<String> cmb_filter_room;
    @FXML
    private JFXTextField tf_search_room;
    @FXML
    private JFXTextField tf_room_cost;
    @FXML
    private JFXButton btn_update_room;
    @FXML
    private TableView<RoomModel> tv_room;
    @FXML
    private JFXTextField tf_room_available;
    @FXML
    private JFXTextField tf_room_id;

    Room_Operation room_Operation = null;
    @FXML
    private JFXTextField emp_first_name;
    @FXML
    private JFXTextField emp_last_name;
    @FXML
    private JFXTextField emp_phone;
    @FXML
    private JFXTextField emp_email;
    @FXML
    private JFXTextField emp_age;
    @FXML
    private JFXTextField emp_user_name;
    @FXML
    private JFXTextField emp_id;
    @FXML
    private JFXButton addEmp;
    @FXML
    private JFXComboBox<String> cmb_gender_emb;
    @FXML
    private JFXTextField emp_salary;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        con = Connector.getConnection();
        emp_op = new EmployeeOperations();
        guestOperation = new GuestOperation();
        rm = new RoomModel();
        room_Operation = new Room_Operation();
    }
    
    private void selectAllEmp(){
        ArrayList<EmpModel> al = new ArrayList<>();
        al = emp_op.selectAllEmp(con);
        ObservableList<EmpModel> ob = FXCollections.observableArrayList(al);
        tv_emp.setItems(ob);
    }
    
    private void selectAllGuest(){
        ArrayList<GuestModel> al = new ArrayList<>();
        al = guestOperation.selectAllGuest(con);
        ObservableList<GuestModel> ob = FXCollections.observableArrayList(al);
        tv_guest.setItems(ob);
    }
    
    
    @FXML
    private void emp_pane(MouseEvent event) {
        emp_table();
        emp_pane.setVisible(true);
        guest_pane.setVisible(false);
        room_pane.setVisible(false);
        new_emp_pane.setVisible(false);
        pane1.setStyle("-fx-background-color: white");
        pane2.setStyle("-fx-background-color: #3f4144");
        pane3.setStyle("-fx-background-color: #3f4144");
        pane4.setStyle("-fx-background-color: #3f4144");
        selectAllEmp();
    }
    
    @FXML
    private void guest_pane(MouseEvent event) {
        guest_table();
        emp_pane.setVisible(false);
        guest_pane.setVisible(true);
        room_pane.setVisible(false);
        new_emp_pane.setVisible(false);
        pane1.setStyle("-fx-background-color: #3f4144");
        pane2.setStyle("-fx-background-color: white");
        pane3.setStyle("-fx-background-color: #3f4144");
        pane4.setStyle("-fx-background-color: #3f4144");
        selectAllGuest();
    }
    
    @FXML
    private void room_pane(MouseEvent event) {
        room_table();
        emp_pane.setVisible(false);
        guest_pane.setVisible(false);
        room_pane.setVisible(true);
        new_emp_pane.setVisible(false);
        pane1.setStyle("-fx-background-color: #3f4144");
        pane2.setStyle("-fx-background-color: #3f4144");
        pane3.setStyle("-fx-background-color: white");
        pane4.setStyle("-fx-background-color: #3f4144");
        selectAllRooms();
    }
    
    @FXML
    private void add_emp(MouseEvent event) {
        cmb_gender_emb.getItems().addAll("Male", "Female");
        emp_pane.setVisible(false);
        guest_pane.setVisible(false);
        room_pane.setVisible(false);
        new_emp_pane.setVisible(true);
        pane1.setStyle("-fx-background-color: #3f4144");
        pane2.setStyle("-fx-background-color: #3f4144");
        pane3.setStyle("-fx-background-color: #3f4144");
        pane4.setStyle("-fx-background-color: white");
    }
    
    @FXML
    private void backSS(MouseEvent event) {
        Pane p = new Pane();
        try {
            p = FXMLLoader.load(getClass().getResource("../View/start.fxml"));
            Scene scene = new Scene(p);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    @FXML
    private void search_emp(KeyEvent event) {
        String s = search_emp.getText();
        ObservableList<EmpModel> ob;
        ArrayList<EmpModel> al = new ArrayList<>();
        if (cmb_emp.getValue().equals("ID")) {
            al = emp_op.selectAll(con, "id", s);
        } else if (cmb_emp.getValue().equals("Name")) {
            al = emp_op.selectAll(con, "FullName", s);
        } else if (cmb_emp.getValue().equals("Age")) {
            al = emp_op.selectAll(con, "Age", s);
        } else {
            al = emp_op.selectAll(con, "UserName", s);
        }
        ob = FXCollections.observableArrayList(al);
        tv_emp.setItems(ob);
    }
    
    @FXML
    private void update_emp(ActionEvent event) {
        EmpModel em = new EmpModel();
        em.setName(name_update_emp.getText());
        em.setAge(Integer.parseInt(age_update_emp.getText()));
        em.setEmail(email_update_emp.getText());
        em.setSalary(Integer.parseInt(salary_update_emp.getText()));
        em.setPhone(phone__update_emp.getText());
        emp_op.update(con, em, Integer.parseInt(id_update_emp.getText()));
        selectAllEmp();
        name_update_emp.setText("");
        age_update_emp.setText("");
        salary_update_emp.setText("");
        id_update_emp.setText("");
        phone__update_emp.setText("");
        email_update_emp.setText("");
        btn_update_emp.setDisable(false);
    }
    
    @FXML
    private void delete_emp(ActionEvent event) {
        EmpModel em = new EmpModel();
        em = tv_emp.getSelectionModel().getSelectedItem();
        emp_op.delete(con , em.getId());
         btn_delete_guest.setDisable(true);
        selectAllEmp();
    }
    
    @FXML
    private void combo_action(ActionEvent event) {
        selectAllEmp();
    }
    
    private void emp_table() {
        cmb_emp.getItems().addAll("ID", "Name", "Age", "User Name");
        cmb_emp.getSelectionModel().select(0);
        name_emp.setCellValueFactory(new PropertyValueFactory("name"));
        id_emp.setCellValueFactory(new PropertyValueFactory("id"));
        salary_emp.setCellValueFactory(new PropertyValueFactory("salary"));
        age_emp.setCellValueFactory(new PropertyValueFactory("age"));
        phone_emp.setCellValueFactory(new PropertyValueFactory("phone"));
        email_emp.setCellValueFactory(new PropertyValueFactory("email"));
        gender_emp.setCellValueFactory(new PropertyValueFactory("gender"));
        username_emp.setCellValueFactory(new PropertyValueFactory("userName"));
        tv_emp.setRowFactory(t -> {
            TableRow<EmpModel> r = new TableRow<>();
            r.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && r.getItem() != null) {
                    btn_update_emp.setDisable(false);
                    btn_delete_emp.setDisable(true);
                    name_update_emp.setEditable(true);
                    age_update_emp.setEditable(true);
                    email_update_emp.setEditable(true);
                    salary_update_emp.setEditable(true);
                    phone__update_emp.setEditable(true);
                    em = r.getItem();
                    name_update_emp.setText(em.getUserName());
                    age_update_emp.setText(Integer.toString(em.getAge()));
                    email_update_emp.setText(em.getEmail());
                    salary_update_emp.setText(Integer.toString(em.getSalary()));
                    phone__update_emp.setText(em.getPhone());
                    id_update_emp.setText(Integer.toString(em.getId()));
                }else if (event.getClickCount()==1){
                    btn_delete_emp.setDisable(false);
                }
            });
            return r;
        });
        
    }

    @FXML
    private void search_guest(KeyEvent event) {
        String s = tf_search_guest.getText();
        ObservableList<GuestModel> ob;
        ArrayList<GuestModel> al = new ArrayList<>();
        if(cmb_filter_guest.getValue().equals("ID")){
          al =  guestOperation.Search_guest(con, "id", tf_search_guest.getText());
        }else if(cmb_filter_guest.getValue().equals("Room ID")){
          al =  guestOperation.Search_guest(con, "RoomID", tf_search_guest.getText());
        }else{
           al = guestOperation.Search_guest(con, "FullName", tf_search_guest.getText());
        }
        ob = FXCollections.observableArrayList(al);
        tv_guest.setItems(ob);
    }

    @FXML
    private void Combo_guest_action(ActionEvent event) {
        selectAllGuest();
    }

    @FXML
    private void update_guest(ActionEvent event) {
        GuestModel ge = new GuestModel();
        ge.setDuration(Integer.parseInt(tf_guest_num_child.getText()));
        ge.setMail(tf_guest_email.getText());
        ge.setId(tf_guest_id.getText());
        ge.setCountry(tf_guest_country.getText());
        ge.setName(tf_guest_name.getText());
        ge.setPhone(tf_guest_phone.getText());
        guestOperation.updateGuest(con, ge, tf_guest_id.getText());
        selectAllGuest();
        tf_guest_country.setText("");
        tf_guest_email.setText("");
        tf_guest_id.setText("");
        tf_guest_name.setText("");
        tf_guest_num_child.setText("");
        tf_guest_phone.setText("");
        btn_update_guest.setDisable(true);
    }

    @FXML
    private void delete_guest(ActionEvent event) {
        GuestModel ge = new GuestModel();
        ge = tv_guest.getSelectionModel().getSelectedItem();
        guestOperation.delete(con, ge.getId());
        btn_delete_guest.setDisable(true);
        selectAllGuest();
    }
    
    private void guest_table(){
        cmb_filter_guest.getItems().addAll("ID" , "Room ID" , "Name");
        cmb_filter_guest.getSelectionModel().select(0);
        tc_guest_id.setCellValueFactory(new PropertyValueFactory("id"));
        tc_guest_country.setCellValueFactory(new PropertyValueFactory("country"));
        tc_guest_email.setCellValueFactory(new PropertyValueFactory("mail"));
        tc_guest_gender.setCellValueFactory(new PropertyValueFactory("gender"));
        tc_guest_name.setCellValueFactory(new PropertyValueFactory("name"));
        tc_guest_num_child.setCellValueFactory(new PropertyValueFactory("num_child"));
        tc_guest_phone.setCellValueFactory(new PropertyValueFactory("phone"));
        tc_guest_room_id.setCellValueFactory(new PropertyValueFactory("room_id"));
        tc_guest_status.setCellValueFactory(new PropertyValueFactory("status"));
        tc_guest_stay.setCellValueFactory(new PropertyValueFactory("Leave_Date"));
        tv_guest.setRowFactory(t -> {
            TableRow<GuestModel> r = new TableRow<>();
            r.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && r.getItem() != null) {
                    btn_delete_guest.setDisable(true);
                    btn_update_guest.setDisable(false);
                    tf_guest_country.setEditable(true);
                    tf_guest_email.setEditable(true);
                    tf_guest_name.setEditable(true);
                    tf_guest_num_child.setEditable(true);
                    tf_guest_phone.setEditable(true);
                    ge = r.getItem();
                    tf_guest_country.setText(ge.getCountry());
                    tf_guest_email.setText(ge.getMail());
                    tf_guest_id.setText(ge.getId());
                    tf_guest_name.setText(ge.getName());
                    tf_guest_num_child.setText(Integer.toString(ge.getNum_child()));
                    tf_guest_phone.setText(ge.getPhone());
                }else if (event.getClickCount()==1){
                    btn_delete_guest.setDisable(false);
                }
            });
            return r;
        });
        
        
    }

    @FXML
    private void combo_action_room(ActionEvent event) {
        selectAllRooms();
    }

    @FXML
    private void tf_room_search(KeyEvent event) {
        String s = tf_search_room.getText();
        ObservableList<RoomModel> ob ;
        ArrayList<RoomModel> al = new ArrayList<>();
        if(cmb_filter_room.getValue().equals("Room ID")){
           al = room_Operation.search(con, "RoomID", s);
            
        }else {
            al = room_Operation.search(con, "room_type", s);
        }
        
        ob = FXCollections.observableArrayList(al);
        tv_room.setItems(ob);
    }

    @FXML
    private void btn_update_room_action(ActionEvent event) {
        RoomModel room = new RoomModel();
        room.setRoom_id(Integer.parseInt(tf_room_id.getText()));
        room.setTotal_cost(Integer.parseInt(tf_room_cost.getText()));
        room.setAvailable(Integer.parseInt(tf_room_available.getText()));
        room_Operation.update(con, room);
        selectAllRooms();
    }
    
    private void room_table(){
        cmb_filter_room.getItems().addAll("Room ID" , "Room Type");
        cmb_filter_room.getSelectionModel().select(0);
        ct_room_available.setCellValueFactory(new PropertyValueFactory("available"));
        ct_room_drink.setCellValueFactory(new PropertyValueFactory("drink_cost"));
        ct_room_food.setCellValueFactory(new PropertyValueFactory("food_cost"));
        ct_room_num.setCellValueFactory(new PropertyValueFactory("room_id"));
        ct_room_total.setCellValueFactory(new PropertyValueFactory("total_cost"));
        ct_room_type.setCellValueFactory(new PropertyValueFactory("room_type"));
        trip.setCellValueFactory(new PropertyValueFactory("trip_cost"));
        tv_room.setRowFactory(t -> {
            TableRow<RoomModel> r = new TableRow<>();
            r.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && r.getItem() != null) {
                    btn_update_room.setDisable(false);
                    tf_room_cost.setEditable(true);
                    tf_guest_email.setEditable(true);
                    tf_room_available.setEditable(true);
                    rm = r.getItem();
                    tf_room_id.setText(Integer.toString(rm.getRoom_id()));
                    tf_room_cost.setText(Integer.toString(rm.getTotal_cost()));
                    tf_room_available.setText(Integer.toString(rm.getAvailable()));
                }
            });
            return r;
        });
    }
    
    
    private void selectAllRooms(){
        ArrayList <RoomModel> al = new ArrayList<>();
        al = room_Operation.selectAll(con);
        ObservableList<RoomModel> ob = FXCollections.observableArrayList(al);
        tv_room.setItems(ob);
    }

    @FXML
    private void AddEmp(ActionEvent event) {
        EmpModel emp = new EmpModel();
        emp.setAge(Integer.parseInt(emp_age.getText()));
        emp.setEmail(emp_email.getText());
        emp.setGender((String) cmb_gender_emb.getValue());
        emp.setId(Integer.parseInt(emp_id.getText()));
        emp.setName(emp_first_name.getText());
        emp.setPhone(emp_phone.getText());
        emp.setSalary(Integer.parseInt(emp_salary.getText()));
        emp.setUserName(emp_user_name.getText());
        emp_op.insertEmp(con, emp);
    }
    
}
