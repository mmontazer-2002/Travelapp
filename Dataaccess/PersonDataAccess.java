package Travel.Dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public  class PersonDataAccess {
    private Connection connection;

    public PersonDataAccess() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "library*");


    }

    public Connection getConnection() {
        return connection;
    }




}
