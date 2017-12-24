package sample.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import sample.controller.Controller;

public class AddListDatabase {

    static Controller controller = new Controller();

    public static GridPane add(){

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(8);
        layout.setHgap(10);

        Label aboutLabel = new Label("About");
        GridPane.setConstraints(aboutLabel, 0,0);

        TextField aboutInput = new TextField();
        GridPane.setConstraints(aboutInput, 1,0);

        Label incomeLabel = new Label("Income");
        GridPane.setConstraints(incomeLabel, 0,1);

        TextField incomeInput = new TextField();
        GridPane.setConstraints(incomeInput, 1,1);

        Label spendLabel = new Label("Spend");
        GridPane.setConstraints(spendLabel, 0,2);

        TextField spendInput = new TextField();
        GridPane.setConstraints(spendInput, 1,2);


        Button connectButton = new Button("Send");
//        GridPane.setConstraints(connectButton, 1,4);
//        connectButton.setOnAction(e->{
//            controller.add(aboutInput.getText(), incomeInput.getText(), spendInput.getText());
//        });

        layout.getChildren().addAll(
                aboutLabel,
                aboutInput,
                incomeLabel,
                incomeInput,
                spendLabel,
                spendInput,
                connectButton);

        return layout;
    }
}
