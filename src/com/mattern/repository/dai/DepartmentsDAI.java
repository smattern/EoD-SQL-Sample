package com.mattern.repository.dai;

import net.lemnik.eodsql.Select;

/**
 * @author smattern.
 */
public interface DepartmentsDAI extends net.lemnik.eodsql.BaseQuery{

    @Select("SELECT sum(SENDatabase.salaries.salary)\n" +
            "FROM SENDatabase.departments \n" +
            "INNER JOIN SENDatabase.dept_emp \n" +
            "ON SENDatabase.departments.dept_no = SENDatabase.dept_emp.dept_no\n" +
            "INNER JOIN SENDatabase.employees \n" +
            "ON SENDatabase.employees.emp_no = SENDatabase.dept_emp.emp_no\n" +
            "INNER JOIN SENDatabase.salaries \n" +
            "ON SENDatabase.salaries.emp_no = SENDatabase.dept_emp.emp_no   \n" +
            "where SENDatabase.departments.dept_name=?1;")
    long getSalariesOverviewForOneDepartment(String departmentName);
}
