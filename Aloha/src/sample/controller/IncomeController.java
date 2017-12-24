package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class IncomeController {

    @FXML
    private VBox incomeView;

    @FXML
    private TextField aboutIncome;

    @FXML
    private TextField valueIncome;

    @FXML
    private Button sendIncomeButton;

    Controller controller = new Controller();

    @FXML
    void sendIncome(ActionEvent event) {
        sendIncomeButton.setOnAction(e->{
            controller.addToIncome(aboutIncome.getText(), valueIncome.getText());
        });
    }
}
