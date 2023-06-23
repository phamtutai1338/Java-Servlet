package com.example.employeemanager.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;
    @Column(name= "email")
    private String email;

    public Employee(String firstname, String lastname,String email){
    this.firstname=firstname;
    this.lastname = lastname;
    this.email=email;
    }
    public Employee(int id, String firstname, String lastname, String email){

        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Employee [id=" +id+",firstname="+firstname+",lastName="+lastname+",email="+email+"]";
    }
}
