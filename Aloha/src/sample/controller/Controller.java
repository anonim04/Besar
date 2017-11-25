package sample.controller;

import sample.model.Log;
import sample.model.Query;
import java.time.LocalDate;

public class Controller {

    Log db = new Log();
    Query query = new Query();

    public void add(String about, String income, String spend){
        db.setAbout(about);
        db.setIncome(income);
        db.setSpend(spend);
        db.setCreatedAt(LocalDate.now());
        db.setModifiedAt(LocalDate.now());
        db.insert();
    }
}
