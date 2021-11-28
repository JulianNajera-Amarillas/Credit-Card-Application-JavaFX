package application;

import java.io.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Control {

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField phoneNumber;

    @FXML
    private TextField address;

    @FXML
    private Button cancelbutton;

    @FXML
    private TextField savingsNum;

    @FXML
    private TextField custID;

    @FXML
    private Button saveButton;

    @FXML
    private TextField checkingNum;
    
    @FXML
    private Button quit;

    @FXML
    public void clearText(ActionEvent event) {
    	firstName.clear();
    	lastName.clear();
    	phoneNumber.clear();
    	address.clear();
    	savingsNum.clear();
    	custID.clear();
    	checkingNum.clear();
    	

    }
    
    @FXML
    public void saveApplication(ActionEvent event) {
    	String first_Name = firstName.getText();
    	String last_Name = lastName.getText();
    	String phone_Number = phoneNumber.getText();
    	String cust_address = address.getText();
    	String savingsNumber = savingsNum.getText();
    	String customerID = custID.getText();
    	String checkingNumber = checkingNum.getText();
    	
    	try {
    		BufferedWriter writer = new BufferedWriter(new FileWriter(first_Name + last_Name + ".txt"));	
    		writer.write("Credit Card Application Form: SunDevil Bank");
    		writer.write("\n First Name: " + first_Name);
    		writer.write("\n Last Name: " + last_Name);
    		writer.write("\n Phone Number: " + phone_Number);
    		writer.write("\n Address: " + cust_address);
    		writer.write("\n Customer ID: " + customerID); 
    		writer.write("\n Savings Account Number: " + savingsNumber);
    		writer.write("\n Checking Account Number: " + checkingNumber);
    		
    		writer.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	
    	firstName.clear();
    	lastName.clear();
    	phoneNumber.clear();
    	address.clear();
    	savingsNum.clear();
    	custID.clear();
    	checkingNum.clear();
    	
    	firstName.setText("First Name Saved");
    	lastName.setText("Last Name Saved");
    	phoneNumber.setText("Phone Number Saved");
    	address.setText("Address Saved");
    	savingsNum.setText("Savings Account Number Saved");
    	custID.setText("Customer ID Saved");
    	checkingNum.setText("Checking Account Number Saved");
    	
    	
    }
    
    @FXML
    void quitProgram(ActionEvent event) {
        Stage stage = (Stage) quit.getScene().getWindow();
    	stage.close();
    }

}
