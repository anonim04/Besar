package sample.controller;

import sample.model.Log;
import sample.model.Query;
import java.time.LocalDate;

public class Controller {

    Log db = new Log();
    Query query = new Query();

    public void addToIncome(String about, String income){
        db.setAbout(about);
        db.setIncome(income);
        db.setCreatedAt(LocalDate.now());
        db.setModifiedAt(LocalDate.now());
        db.insert();
    }

    public void addToSpend(String about, String spend){
        db.setAbout(about);
        db.setSpend(spend);
        db.setCreatedAt(LocalDate.now());
        db.setModifiedAt(LocalDate.now());
        db.insert();
    }
}
