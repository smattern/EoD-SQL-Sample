package com.mattern.repository;

import com.mattern.repository.dai.DepartmentsDAI;
import com.mattern.util.Connection;
import net.lemnik.eodsql.QueryTool;

/**
 * @author smattern.
 */
public class DepartmentsRepository {

    private final Connection conn;

    public DepartmentsRepository(Connection conn) {
        this.conn = conn;
    }

    /**
     * Get salary overview.
     *
     * @param departmentName, the department for which the salary survey is to be calculated
     * @return salary overview
     */
    public long getSalariesOverviewForOneDepartment(String departmentName) {
        long resultSet;
        DepartmentsDAI query = QueryTool.getQuery(conn.getConection(), DepartmentsDAI.class);
        resultSet = query.getSalariesOverviewForOneDepartment(departmentName);
        return resultSet;
    }
}
