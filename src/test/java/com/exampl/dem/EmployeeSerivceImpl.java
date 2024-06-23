package com.exampl.dem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSerivceImpl implements EmployeeSerivce {

    List<Employee> employees = new ArrayList<>();
  
    @Override
    public String creatEmployee(Employee employee) {
        employee.add(employee);
        return "Saved Successfully";    
    }

    @Override
    public List<Employee> readEmployees() {
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
    employees.remove(id);
    return true;    
    }

}
