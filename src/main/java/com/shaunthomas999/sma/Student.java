package com.shaunthomas999.sma;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by shaunthomas on 30/07/2017.
 */
@Entity
public class Student {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private String rollNumber;

    private String className;

    private String rank;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumnber='" + rollNumber + '\'' +
                ", className='" + className + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
