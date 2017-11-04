package sample.model;

import sample.connection.MySQLConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Query {

    public void insert(){
        Connection connection = null;
        MySQLConnection mysqlConnection = new MySQLConnection();
        Database db = new Database();
        PreparedStatement preparedStatement = null;

        try {
            mysqlConnection.getConnection();

            String sql =
                    "INSERT INTO log (about, incomes, spends) " +
                    "VALUES (?, ?, ?);";

            preparedStatement = mysqlConnection.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, db.getAbout());
            System.out.println(db.getAbout());
            preparedStatement.setDouble(2, db.getIncome());
            System.out.println(db.getIncome());
            preparedStatement.setDouble(3, db.getSpend());
            System.out.println(db.getSpend());
            //preparedStatement.setDate(4, Date.valueOf(db.getCreatedAt()));
            //preparedStatement.setDate(6, Date.valueOf(db.getModifiedAt()));
            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(preparedStatement != null){
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
