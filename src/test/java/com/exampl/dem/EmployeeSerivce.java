package com.exampl.dem;

import java.util.List;

public interface EmployeeSerivce {
    String creatEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
} 
