package com.ypl.pojo;

import java.util.List;

/**
 * @author
 * @date
 * @description
 * @reviewed_by
 */
public class Department {
    private String departmentId;
    private String name;
    private String address;
    private String type;
    private String maxEmployee;
    private List<Employee> employeeList;

    public String getDepartmentId() {
        return departmentId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", maxEmployee='" + maxEmployee + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaxEmployee() {
        return maxEmployee;
    }

    public void setMaxEmployee(String maxEmployee) {
        this.maxEmployee = maxEmployee;
    }
}
