package com.mattern.service;

import com.mattern.domain.Employees;
import com.mattern.repository.DepartmentsRepository;
import com.mattern.repository.EmployeesRepository;
import com.mattern.util.Connection;
import net.lemnik.eodsql.DataSet;

/**
 * @author smattern.
 *
 * Sample service to show EoD-SQL.
 */
public class Service {

    private EmployeesRepository employeesRepository;
    private DepartmentsRepository departmentsRepository;

    public Service() {

        Connection conn = new Connection();
        conn.beginConnection();// begin connection

        employeesRepository = new EmployeesRepository(conn);
        departmentsRepository = new DepartmentsRepository(conn);

        task(); // some action

        conn.endConnection();// close connection
    }

    /**
     * Sample action.
     */
    private void task(){
        // get User
        DataSet<Employees> resultSet = employeesRepository.getUserByFirstAndLastName("first-test", "last-test");

        // sample output
        for (Employees employeesObj : resultSet) {
            System.out.println(employeesObj.getLastName());
            System.out.println(employeesObj.getFirstName());
        }

        // get salary overview for a department
        long salary = departmentsRepository.getSalariesOverviewForOneDepartment("Development");
        System.out.println(salary);
    }
}
