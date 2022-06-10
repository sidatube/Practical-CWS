package com.example.practicalcws.resource;

import com.example.practicalcws.entity.Employee;
import com.example.practicalcws.repository.EmployeeRepository;

import javax.ws.rs.*;
import java.util.List;

@Path("/employees")
@Produces("application/json")
@Consumes("application/json")
public class EmployeeResource {

    private final EmployeeRepository employeeRepository;

    public EmployeeResource(){
        employeeRepository = new EmployeeRepository();
    }

    @GET
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
    @GET
    @Path("{id}")
    public Employee findById(@PathParam("id") Integer id) {
        return employeeRepository.findById(id);
    }
    @POST
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @PUT
    @Path("{id}")
    public Boolean update(@PathParam("id") Integer id, Employee employee) {
        return employeeRepository.update(id, employee);
    }

    @DELETE
    @Path("{id}")
    public Boolean update(@PathParam("id") Integer id) {

        return employeeRepository.delete(id);
    }
}
