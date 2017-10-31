package sample.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    Connection connection = null;
    String driver;
    String databaseName;
    String url;
    String username;
    String password;

    public void setConnection(Connection connection) throws ClassNotFoundException {
        try {
            Class.forName(getDriver());
            connection = DriverManager.getConnection(url,getUsername(),getPassword());
            System.out.println("Connected to database : " + getDatabaseName());
        } catch (SQLException e) {
            System.out.println("SQLException: "+e.getMessage());
            System.out.println("SQLState: "+e.getSQLState());
            System.out.println("VendorError: "+e.getErrorCode());
        }
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDriver(String driver) {
        this.driver = "com."+driver+".jdbc.Driver";
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
        this.url = "jdbc:mysql://localhost/" + getDatabaseName();
    }

    public String getUrl() {
        return url;
    }
}
