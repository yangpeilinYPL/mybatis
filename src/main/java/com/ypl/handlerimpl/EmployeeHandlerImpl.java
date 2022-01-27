package com.ypl.handlerimpl;

import com.ypl.pojo.Employee;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;

/**
 * @author
 * @date
 * @description
 * @reviewed_by
 */
public class EmployeeHandlerImpl implements TypeHandler<Employee> {


    @Override
    public void setParameter(PreparedStatement ps, int i, Employee parameter, JdbcType jdbcType) throws SQLException {
        System.out.println(jdbcType);
    }

    @Override
    public Employee getResult(ResultSet rs, String columnName) throws SQLException {
        return new Employee();
    }

    @Override
    public Employee getResult(ResultSet rs, int columnIndex) throws SQLException {
        return new Employee();
    }

    @Override
    public Employee getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return new Employee();
    }
}
