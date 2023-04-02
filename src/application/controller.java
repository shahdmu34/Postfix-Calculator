package application;

import javafx.event.ActionEvent; 
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

//author:Shahd Mustafa

public class controller {
    @FXML
    private Button addition;

    @FXML
    private Button calculate;

    @FXML
    private Button clear;

    @FXML
    private Button division;

    @FXML
    private Button eight;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button multpilcation;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button space;

    @FXML
    private Button subtraction;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private TextField userInput;  //holds the user input

    @FXML
    private Button zero;
    
    private double result; // holds the calculated answer
    
    @FXML
    void calculate(ActionEvent event) {
    	//setting corresponding values to  buttons
    	if(event.getSource() == one) {
    		userInput.appendText("1");   
    	}
    	else if(event.getSource() == two) {
    		userInput.appendText("2");
    		
    	}
    	else if(event.getSource() == three) {
    		userInput.appendText("3");
    		
    	}
    	else if(event.getSource() == four) {
    		userInput.appendText("4");
    		
    	}
    	else if(event.getSource() == five) {
    		userInput.appendText("5");
    		
    	}
    	else if(event.getSource() == six) {
    		userInput.appendText("6");
    		
    	}
    	else if(event.getSource() == seven) {
    		userInput.appendText("7");
    		
    	}else if(event.getSource() == eight) {
    		userInput.appendText("8");
    		
    	}
    	else if(event.getSource() == nine) {
    		userInput.appendText("9");
    		
    	}
    	else if(event.getSource() == zero) {
    		userInput.appendText("0");
    		
    	}
    	else if(event.getSource() == addition) {
    		userInput.appendText("+");
    		
    	}
    	else if(event.getSource() == subtraction) {
    		userInput.appendText("-");
    		
    	}
    	else if(event.getSource() == multpilcation) {
    		userInput.appendText("*");
    		
    	}
    	else if(event.getSource() == division) {
    		userInput.appendText("/");
    		
    	}
    	else if(event.getSource() == space) {
    		userInput.appendText(" ");
    		
    	}
    	else if(event.getSource() == clear) { //clears all values in textfeild
    		userInput.setText(""); 
    		
    	}
    	else if(event.getSource() == calculate) {
    		//link the calculate function
    		result = PostFixCalc.evaluate(userInput.getText());
    		
    		if( result == 9999) { //error is sent back
    			userInput.setText("ERROR");    //display of error message
    		}
    		else {
    		userInput.setText(String.valueOf(result)); //displays the result calculated
    		}
    	}
    	
    	
    	
    }
    
   
    
}
