package com.ypl.mapper;

import com.ypl.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * @author
 * @date
 * @description
 * @reviewed_by
 */
public interface EmployeeMapper {
    public Employee queryBean(Employee employee);

    public List<Employee> queryList(Employee employee);

    public int insert(Employee employee);

    public int update(Employee employee);

    public int delete(@Param("employeeId") String employeeId);
}
