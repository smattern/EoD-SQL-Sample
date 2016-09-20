package com.mattern.domain;

import net.lemnik.eodsql.ResultColumn;

/**
 * @author smattern.
 */
public class Departments {
    private int id;
    private String departmantName;

    public int getId() {
        return id;
    }

    @ResultColumn("dept_no")
    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmantName() {
        return departmantName;
    }

    @ResultColumn("dept_name")
    public void setDepartmantName(String departmantName) {
        this.departmantName = departmantName;
    }
}
