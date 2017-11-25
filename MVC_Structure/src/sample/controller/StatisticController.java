package sample.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.DateCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.model.Log;

public class StatisticController {

    /*
    @FXML
    private TableView<Log> statisticController;

    @FXML
    private TableColumn<Log, Integer> nomor;

    @FXML
    private TableColumn<Log, DateCell> date;

    @FXML
    private TableColumn<Log, String> about;

    @FXML
    private TableColumn<Log, Integer> income;

    @FXML
    private TableColumn<Log, Integer> spend;
    */

    private final SimpleStringProperty nomor = new SimpleStringProperty("");
    private final SimpleStringProperty tanggal = new SimpleStringProperty("");
    private final SimpleStringProperty about = new SimpleStringProperty("");
    private final SimpleStringProperty income = new SimpleStringProperty("");
    private final SimpleStringProperty spend = new SimpleStringProperty("");

    /*
    public Person() {
        this("", "", "");
    }

    public Person(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }
    */

    public void setNommor(String nomor){
        this.nomor.set(nomor);
    }

    public String getNomor() {
        return nomor.get();
    }

    public void setTanggal(String tanggal){
        this.tanggal.set(tanggal);
    }

    public String getTanggal() {
        return tanggal.get();
    }

    public void setAbout(String about){
        this.about.set(about);
    }

    public String getAbout() {
        return about.get();
    }

    public void setIncome(String income){
        this.income.set(income);
    }

    public String getIncome() {
        return income.get();
    }

    public void setSpend(String spend){
        this.spend.set(spend);
    }

    public String getSpend() {
        return spend.get();
    }
}
