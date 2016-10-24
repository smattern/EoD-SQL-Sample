package com.mattern.repository.dai;

import com.mattern.domain.Employees;
import net.lemnik.eodsql.Select;

import java.util.ArrayList;

/**
 * @author smattern.
 */
public interface EmployeesDAI extends net.lemnik.eodsql.BaseQuery{

    @Select("SELECT * FROM employees WHERE emp_no=?{1}")
    Employees getUserByID(int id);

    @Select("SELECT * FROM employees WHERE last_name=?{1} AND first_name=?{2}")
    ArrayList<Employees> getUsersByName(String last, String first);

    @Select("SELECT count(*) FROM employees")
    int getNumberOfUsers();
}
