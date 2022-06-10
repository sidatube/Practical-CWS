package com.example.practicalcws.repository;

import com.example.practicalcws.entity.Employee;
import com.example.practicalcws.model.UltraModel;

import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final UltraModel<Employee> ultraModel = new UltraModel<>(Employee.class);

    @Override
    public List<Employee> findAll() {
        return ultraModel.getList();
    }

    @Override
    public Employee save(Employee employee) {
        ultraModel.save(employee);
        return employee;
    }

    @Override
    public Boolean update(Integer id, Employee employee) {
        Employee exist = ultraModel.findByPF(id);

        exist.setName(employee.getName());
        exist.setSalary(employee.getSalary());
        return ultraModel.update(id,employee);
    }

    @Override
    public Boolean delete(Integer id) {
        return ultraModel.remove(id);

    }

    @Override
    public Employee findById(Integer id) {
        return ultraModel.findByPF(id);
    }
}
