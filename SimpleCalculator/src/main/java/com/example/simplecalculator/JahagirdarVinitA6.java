//This is a JavaFX program to create a Simple Calculator
package com.example.simplecalculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class JahagirdarVinitA6 extends Application {

    //Class Variables
    TextField display = new TextField();
    String operatorValue = "";
    String num1 = "";
    String num2 = "";
    double result = 0;


    //Main function to launch the Calculator application
    public static void main(String[] args) {
        launch(args);
    }


    //Start function to start and call init method
    @Override
    public void start(Stage myStage) {
        myStage.setTitle("Vinit's Calculator");

        //Defining GridPane as the rootNode for the graph
        GridPane rootNode = new GridPane();

        //Formatting textField
        display.setPrefWidth(220);
        display.setPrefHeight(50);
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setPadding(new Insets(20, 20, 20, 20));
        display.setEditable(false);

        //Creating Number buttons
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        //Creating Operation buttons
        Button btnAdd = new Button("+");
        Button btnSub = new Button("-");
        Button btnDiv = new Button("/");
        Button btnMul = new Button("x");
        Button btnClear = new Button("C");
        Button btnEqual = new Button("=");

        //Sizing the buttons
        buttonSizing(btn0);
        buttonSizing(btn1);
        buttonSizing(btn2);
        buttonSizing(btn3);
        buttonSizing(btn4);
        buttonSizing(btn5);
        buttonSizing(btn6);
        buttonSizing(btn7);
        buttonSizing(btn8);
        buttonSizing(btn9);
        buttonSizing(btnAdd);
        buttonSizing(btnSub);
        buttonSizing(btnMul);
        buttonSizing(btnDiv);
        buttonSizing(btnEqual);
        buttonSizing(btnClear);

        //Creating horizontal boxes to hold 4 buttons in each row
        HBox box1 = new HBox(4);
        HBox box2 = new HBox(4);
        HBox box3 = new HBox(4);
        HBox box4 = new HBox(4);

        //Formatting the GridPane
        rootNode.setAlignment(Pos.TOP_CENTER);
        rootNode.setVgap(5);
        rootNode.setHgap(5);
        rootNode.setPadding(new Insets(10, 10, 10, 10));

        //Adding the textField to the rootNode
        rootNode.add(display, 0, 0, 4, 1);

        //Adding buttons to the rootNode
        //Assigning particular row and column index to each button
        rootNode.add(btn7, 0, 3);
        rootNode.add(btn8, 1, 3);
        rootNode.add(btn9, 2, 3);
        rootNode.add(btnAdd, 3, 3);

        rootNode.add(btn4, 0, 4);
        rootNode.add(btn5, 1, 4);
        rootNode.add(btn6, 2, 4);
        rootNode.add(btnSub, 3, 4);

        rootNode.add(btn1, 0, 5);
        rootNode.add(btn2, 1, 5);
        rootNode.add(btn3, 2, 5);
        rootNode.add(btnMul, 3, 5);

        rootNode.add(btnClear, 0, 6);
        rootNode.add(btn0, 1, 6);
        rootNode.add(btnEqual, 2, 6);
        rootNode.add(btnDiv, 3, 6);

        //Event handlers for numbers
        btn0.setOnAction(this::setNumber);
        btn1.setOnAction(this::setNumber);
        btn2.setOnAction(this::setNumber);
        btn3.setOnAction(this::setNumber);
        btn4.setOnAction(this::setNumber);
        btn5.setOnAction(this::setNumber);
        btn6.setOnAction(this::setNumber);
        btn7.setOnAction(this::setNumber);
        btn8.setOnAction(this::setNumber);
        btn9.setOnAction(this::setNumber);

        //Event handlers for operators
        btnAdd.setOnAction(e ->{
            setOperator(btnAdd);
        });

        btnSub.setOnAction(e ->{
            setOperator(btnSub);
        });

        btnDiv.setOnAction(e ->{
            setOperator(btnDiv);
        });

        btnMul.setOnAction(e ->{
            setOperator(btnMul);
        });

        btnEqual.setOnAction(event ->{
            calculation();
        });

        btnClear.setOnAction(event ->{
            num1 = "";
            num2 = "";
            operatorValue = "";
            display.setText("");
        });

        //Setting the scene on the stage and showing the same
        Scene scene = new Scene(rootNode, 260, 300);
        myStage.setScene(scene);
        myStage.show();
    }

    //Method to change the size of the buttons
    public void buttonSizing(Button button){
        button.setPrefSize(55, 45);
    }

    //Event handler when a number button is clicked
    public void setNumber(ActionEvent event) {
        String buttonValue = ((Button) event.getSource()).getText();
        num2 += buttonValue;  //Appends the number buttons string value to get multiple digits
        display.setText(num2);
    }

    //Event handler when an operator button is pressed
    public void setOperator(Button button){
        String buttonValue = button.getText();  //Getting the text value of the operator button

        //conditions that enables the calculator to perform multiple arithmetic operations on multiple numbers
        if(num1!="" && num2!="" && operatorValue!=""){
            calculation();
            num1 = num2;
            num2 = "";
            operatorValue = buttonValue;  //Setting the operatorValue to the obtained operator string
        }
        else if (num2==String.valueOf(result) && num1==""){
            num1=num2;
            num2="";
            operatorValue = buttonValue;
        }
        else if (num1!="" && num2=="" && operatorValue!="") {
            operatorValue=buttonValue;
        }
        else{
            num1 = num2;
            num2 = "";
            operatorValue = buttonValue;}
        }

    //Performs the calculations in the calculator
    public void calculation() {
        double x = Double.parseDouble(num1); //conversion from string to double data type
        double y = Double.parseDouble(num2); //of both  num1 and num2

        //switch statements for calculating result
        switch (operatorValue) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "x":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
        }
        display.setText(String.valueOf(result));  //displaying the result in the textField
        num2 = String.valueOf(result);  //storing the result in num2 to perform further operations
        num1 = "";
    }
}

