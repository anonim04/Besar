package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController{


    @FXML
    private Parent root;

    @FXML
    private Button incomeButton;

    @FXML
    private Button spendButton;

    @FXML
    private Button statistikButton;

    @FXML
    private Button laporanButton;

    @FXML
    public void moveToIncome(ActionEvent event) throws IOException {
        Stage stage;
        if(event.getSource()==incomeButton){
            //get reference to the button's stage
            stage=(Stage) incomeButton.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getResource("/sample/view/IncomeView.fxml"));
        }
        else{
            stage=(Stage) incomeButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/sample/view/MainView.fxml"));
        }
        //create a new scene with root and set the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void moveToSpend(ActionEvent event) throws IOException {
        Stage stage;
        if(event.getSource()==spendButton){
            //get reference to the button's stage
            stage=(Stage) spendButton.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getResource("/sample/view/SpendView.fxml"));
        }
        else{
            stage=(Stage) spendButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/sample/view/MainView.fxml"));
        }
        //create a new scene with root and set the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
