package Travel.Dataaccess;

import Travel.Person.Passengers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PassengersAccess extends PersonDataAccess {


    public PassengersAccess() throws ClassNotFoundException, SQLException {
        super();
        if(getConnection()!= null){
            createPassengerTable();
        }
    }
    private void createPassengerTable() throws SQLException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE passenger (" +
                "    username INT NOT NULL ," +
                "    name VARCHAR(25)," +
                "    familyName VARCHAR(25)," +
                "    age INT ," +
                "    PRIMARY KEY (username) " +
                "    )");
    }




    public int save(Passengers passengers) throws SQLException {
        if (getConnection() != null) {
            Statement statement = getConnection().createStatement();
            String sqlQuery = String.format("INSERT INTO student (username ,name, familyName , age) VALUES ('%d','%s','%s','%d' )", passengers.getUsername(),passengers.getName(), passengers.getFamilyName() , passengers.getAge());
            int i = statement.executeUpdate(sqlQuery);
            return i;
        } else {
            return 0;
        }
    }

    public List<Passengers> findAllStudents(int nationalID) throws SQLException {
        if (getConnection() != null) {
            List<Passengers> p = new ArrayList<>();
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");
            while (resultSet.next()) {
                /*Passengers passengers = new Passengers();*//*
                passengers.setUsername(nationalID);
                p.add(passengers);*/
            }
            return p;
        } else {
            return Collections.emptyList();
        }
    }







}
