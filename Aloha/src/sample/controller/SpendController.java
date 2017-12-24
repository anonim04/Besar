package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SpendController  {

    @FXML
    private VBox spendView;

    @FXML
    private TextField aboutSpend;

    @FXML
    private TextField valueSpend;

    @FXML
    private Button sendSpendButton;

    Controller controller = new Controller();

    @FXML
    void sendSpend(ActionEvent event) {
        sendSpendButton.setOnAction(e->{
            controller.addToIncome(aboutSpend.getText(), valueSpend.getText());
        });
    }
}
