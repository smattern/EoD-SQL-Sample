package com.mattern.repository;

import com.mattern.domain.Employees;
import com.mattern.repository.dai.EmployeesDAI;
import com.mattern.util.Connection;
import net.lemnik.eodsql.DataSet;
import net.lemnik.eodsql.QueryTool;

/**
 * @author smattern.
 */
public class EmployeesRepository {

    private final Connection conn;

    public EmployeesRepository(Connection conn) {
        this.conn = conn;
    }

    /**
     * Get Persons by first and last name.
     *
     * @param firstname, the first name  of entity "Employees"
     * @param lastname,  the last name of entity "Employees"
     */
    public DataSet<Employees> getUserByFirstAndLastName(String firstname, String lastname) {
        DataSet<Employees> resultSet;
        EmployeesDAI query = QueryTool.getQuery(this.conn.getConection(), EmployeesDAI.class);
        resultSet = query.getUsersByName(lastname, firstname);
        return resultSet;
    }
}
