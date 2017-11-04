package sample.model;

import sample.connection.MySQLConnection;

import java.sql.*;
import java.time.LocalDate;


public class Database {
    int id;
    String about;
    double income;
    double spend;
    LocalDate createdAt;
    int createBy;
    LocalDate modifiedAt;
    int modifiedBy;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setIncome(String income) {
        this.income = Double.parseDouble(income);
    }

    public double getIncome() {
        return income;
    }

    public void setSpend(String spend) {
        this.spend = Double.parseDouble(spend);
    }

    public double getSpend() {
        return spend;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt.now();
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    public int getCreateBy() {
        return createBy;
    }

    public void setModifiedAt(LocalDate modifiedAt) {
        this.modifiedAt = modifiedAt.now();
    }

    public LocalDate getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void insert(){
        Connection connection = null;
        MySQLConnection mysqlConnection = new MySQLConnection();
        PreparedStatement preparedStatement = null;

        try {
            connection = mysqlConnection.getConnection();
            String sql =
                    "INSERT INTO log (about, incomes, spends, created_at, created_by, modified_at, modified_by) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?);";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, getAbout());
            preparedStatement.setDouble(2, getIncome());
            preparedStatement.setDouble(3, getSpend());
            preparedStatement.setDate(4, Date.valueOf(getCreatedAt()));
            preparedStatement.setInt(5, getCreateBy());
            preparedStatement.setDate(6, Date.valueOf(getModifiedAt()));
            preparedStatement.setInt(7, getModifiedBy());
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

    public void show(){
        Connection connection = null;
        MySQLConnection mysqlConnection = new MySQLConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet;

        try {
            connection = mysqlConnection.getConnection();

            String sql =
                    "SELECT about, incomes, spends " +
                    "FROM log " +
                    "WHERE id = ?;";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, getId());

            resultSet = preparedStatement.executeQuery(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
