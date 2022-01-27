package com.ypl.test;

import com.ypl.mapper.DepartmentMapper;
import com.ypl.mapper.EmployeeMapper;
import com.ypl.pojo.Department;
import com.ypl.pojo.Employee;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

/**
 * @author
 * @date
 * @description
 * @reviewed_by
 */
public class TestMybatis {


    @Test
    public void queryTest(){
        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();
        employee.setName("邓梦蕾");
        employee = mapper.queryBean(employee);

        System.out.println("涨薪之前"+employee);

        employee.setSalary(Integer.valueOf(Integer.parseInt(employee.getSalary())+500).toString());
        mapper.update(employee);

        System.out.println("涨薪之后"+employee);
    }

    @Test
    public void insertTest(){
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(ClassLoader.getSystemClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();
        employee.setName("邓祥瑞");
        employee.setSalary("6000");
        mapper.insert(employee);
        System.out.println("新增的员工id为："+employee.getEmployeeId());
        //mapper.delete(employee.getEmployeeId());
        sqlSession.close();
    }

    @Test
    public void queryListTest(){
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ClassLoader.getSystemClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();
       // employee.setName("%杨沛霖%");
        //employee.setEmployeeId("2");
        List<Employee> employees = mapper.queryList(employee);
        System.out.println(employees);

    }

    @Test
    public void queryDepartmentBeanTest(){
        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        Department department = mapper.queryBean("研发部");

        System.out.println("涨薪之前"+department);


    }
}
