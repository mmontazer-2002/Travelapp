package Travel.Dataaccess;

import Travel.Person.Drivers;
import Travel.Person.Passengers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DriverAccess extends PersonDataAccess{
    public DriverAccess() throws ClassNotFoundException, SQLException {
        super();
        if(getConnection()!= null){
            createDriverTable();
        }

    }


    private void createDriverTable() throws SQLException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE driver (" +
                "    username INT NOT NULL ," +
                "    name VARCHAR(25)," +
                "    familyName VARCHAR(25)," +
                "    age INT ," +
                "    PRIMARY KEY (username) " +
                "    )");
    }

    public int save(Drivers drivers) throws SQLException {
        if (getConnection() != null) {
            Statement statement = getConnection().createStatement();
            String sqlQuery = String.format("INSERT INTO student (username ,name, familyName , age) VALUES ('%d','%s','%s','%d' )", drivers.getUsername(),drivers.getName(), drivers.getFamilyName() , drivers.getAge());
            int i = statement.executeUpdate(sqlQuery);
            return i;
        } else {
            return 0;
        }
    }



}
