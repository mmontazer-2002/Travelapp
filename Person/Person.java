package Travel.Person;

import Travel.Person.gender.Gender;

public abstract class Person {
    private long username; // nationalID
    private String name;
    private String familyName;
    private  int age;
    private Gender persons;
    private long phoneNumber;

    public Person(int username, String name, String familyName, int age, Gender persons, int phoneNumber) {
        this.username = username;
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.persons = persons;
        this.phoneNumber = phoneNumber;
    }

    public long getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
