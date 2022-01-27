package com.ypl.mapper;

import com.ypl.pojo.Department;
import com.ypl.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author
 * @date
 * @description
 * @reviewed_by
 */
public interface DepartmentMapper {
    public Department queryBean(String name);

    public List<Department> queryList(Department department);

    public int insert(Department department);

    public int update(Department department);

    public int delete(String departmentId);
}
