package com.example.app.dao;

import com.example.app.model.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
