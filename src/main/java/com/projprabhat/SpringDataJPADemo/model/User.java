package com.projprabhat.SpringDataJPADemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//to make sure that a particular class maps to an entity ,i.e. it becomes JPA entity,so that it is candidate
//for being persistent persisted into Relational DB-@Entity(javax.persistence)
@Entity
public class User {
    //to make Long id our primary key we use annotation @Id(javax.persistence)
    //@GeneratedValue means that a value will be automatically generated for that field.
    //(startegy=GenerationType.AUTO) means that value is automatically generated/ strategy is just a field in javax.persistence
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
