package org.tp24;

import java.time.LocalDate;

public class Person {

    private Double personId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String address;
    private Double maximumQuota;

    public Person(double personId, String firstName, String lastName, LocalDate dateOfBirth, String address, double maximumQuota) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.maximumQuota = maximumQuota;
    }

    public Double getPersonId() {
        return personId;
    }

    public void setPersonId(Double personId) {
        this.personId = personId;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getMaximumQuota() {
        return maximumQuota;
    }

    public void setMaximumBalance(Double maximumQuota) {
        this.maximumQuota = maximumQuota;
    }

    public void printPerson() {
        System.out.println("Person [ID: " + personId +
                ", First Name: " + firstName +
                ", Last Name: " + lastName +
                ", Birth Date: " + dateOfBirth +
                ", Address: " + address +
                ", Salary: $" + maximumQuota + "]");
    }

    /*Something to push*/
}
