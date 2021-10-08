package Travel.Person;


import Travel.Person.Vehicle.Car;
import Travel.Person.Vehicle.Color;
import Travel.Person.Vehicle.Vehicle;
import Travel.Person.gender.Gender;

public class Drivers extends Person{
    private Vehicle vehicle;
    private Color color;
    private int vehicleID;
    private Car carsModel;


    private int driverID;


    public Drivers(int username, String name, String familyName, int age, Gender persons, int phoneNumber, Vehicle vehicle, int driverID) {
        super(username, name, familyName, age, persons, phoneNumber);
        this.vehicle = vehicle;
        this.driverID = driverID;
    }
}
