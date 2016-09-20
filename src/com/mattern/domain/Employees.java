package com.mattern.domain;

import net.lemnik.eodsql.ResultColumn;

import java.util.Date;

/**
 * @author smattern.
 *
 * Sample entity.
 */
public class Employees {

    private int id;
    private String lastName;
    private String firstName;
    private Date birthDate;
    private Date hireDate;
    private String gender;

    public String getLastName() {
        return lastName;
    }

    @ResultColumn("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    @ResultColumn("emp_no")
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    @ResultColumn("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @ResultColumn("birth_date")
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    @ResultColumn("hire_date")
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getGender() {
        return gender;
    }

    @ResultColumn("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }
}
