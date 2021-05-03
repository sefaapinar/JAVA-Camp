package Entities;

import Abstract.Entity;

import java.time.LocalDate;

public class Customer implements Entity {
    private int id;
    private String FirstName;
    private String LastName;
    private LocalDate dateOfBirth;
    private String NationalityId;


    public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.dateOfBirth = dateOfBirth;
        NationalityId = nationalityId;
    }

    public Customer(int id, String sefa, String pınar, LocalDate of, Game league_of_legends, Campaign black_friday) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }
}
