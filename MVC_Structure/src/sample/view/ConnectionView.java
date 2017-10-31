package sample.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import sample.connection.MySQLConnection;
import java.sql.Connection;

public class ConnectionView {
    static Connection connection;
    static MySQLConnection mysql = new MySQLConnection();

    public static GridPane connection(){

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(8);
        layout.setHgap(10);

        Label choiceDatabaseLabel = new Label("Pilih Database");
        GridPane.setConstraints(choiceDatabaseLabel, 0,0);

        ComboBox<String> choiceDatabaseInput = new ComboBox<>();
        choiceDatabaseInput.getItems().addAll("mysql", "MariaDB", "Postgree");
        GridPane.setConstraints(choiceDatabaseInput, 1,0);

        Label nameDatabaseLabel = new Label("Nama Database");
        GridPane.setConstraints(nameDatabaseLabel, 0,1);

        TextField nameDabaseInput = new TextField();
        GridPane.setConstraints(nameDabaseInput, 1,1);

        Label userNameLabel = new Label("Username");
        GridPane.setConstraints(userNameLabel, 0,2);

        TextField userNameInput = new TextField();
        GridPane.setConstraints(userNameInput, 1,2);

        Label passwordLabel = new Label("Password");
        GridPane.setConstraints(passwordLabel, 0,3);

        TextField passwordInput = new TextField();
        GridPane.setConstraints(passwordInput, 1,3);




        Button connectButton = new Button("Connect");
        GridPane.setConstraints(connectButton, 1,4);
        connectButton.setOnAction(e->{
            try{
                mysql.setDriver(choiceDatabaseInput.getValue());
                mysql.setDatabaseName(nameDabaseInput.getText());
                mysql.setUrl();
                mysql.setUsername(userNameInput.getText());
                mysql.setPassword(passwordInput.getText());
                mysql.setConnection(connection);
                mysql.getConnection();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
        });

        layout.getChildren().addAll(
                choiceDatabaseLabel,
                choiceDatabaseInput,
                nameDatabaseLabel,
                nameDabaseInput,
                userNameLabel,
                userNameInput,
                passwordLabel,
                passwordInput,
                connectButton);

        return layout;
    }
}
