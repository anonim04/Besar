package sample.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    Connection connection = null;
    String driver = "com.mysql.jdbc.Driver";
    String databaseName = "log_bendahara";
    String url = "jdbc:mysql://localhost/" + databaseName;
    String username = "root";
    String password = "";

    public Connection getConnection() throws ClassNotFoundException {
        try {
            Class.forName(getDriver());
            this.connection = DriverManager.getConnection(url,getUsername(),getPassword());
            System.out.println("Connected to database : " + getDatabaseName());
        } catch (SQLException e) {
            System.out.println("SQLException: "+e.getMessage());
            System.out.println("SQLState: "+e.getSQLState());
            System.out.println("VendorError: "+e.getErrorCode());
        }
        return this.connection;
    }

    public void closeConnection(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDriver() {
        return driver;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUrl() {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
