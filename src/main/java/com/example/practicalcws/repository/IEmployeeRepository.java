package com.example.practicalcws.repository;

import com.example.practicalcws.entity.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findAll();
    Employee save(Employee employee);
    Boolean update(Integer id, Employee employee);
    Boolean delete(Integer id);
    Employee findById(Integer id);
}
