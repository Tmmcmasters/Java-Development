package com.example.exercise15dot5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
//    IMPORT ALL FXML
    @FXML TextField investmentAmountTextField;
    @FXML TextField numberOfYearsTextField;
    @FXML TextField annualInterestRateTextField;
    @FXML TextField futureValueTextField;
    @FXML Button calculateButton;


//    INITIALIZE THE CONTROLLER
    public void initialize() {
        calculateButton.setOnAction(e -> calculateFutureValue()); // CALL THE METHOD
    }

    private void calculateFutureValue() { //CREATING THE METHOD THAT CALCULATES THE FUTURE VALUE
        double investmentAmount = Double.parseDouble(investmentAmountTextField.getText()); // GET THE VALUE
        int years = Integer.parseInt(numberOfYearsTextField.getText()); // GET THE VALUE
        double monthlyInterestRate = Double.parseDouble(annualInterestRateTextField.getText()) / 1200; // GET THE VALUE

        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12); // CALCULATE THE FUTURE VALUE
        futureValueTextField.setText(String.format("$%.2f", futureValue)); // SET THE VALUE
    }
}
