package com.exampl.dem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class EmpController {

    // List<Employee> employees = new ArrayList<>();
    // EmployeeSerivce employeeSerivce = new EmployeeSerivceImpl();

    //Dependcy Injection
    @Autowired
    EmployeeSerivce employeeSerivce;

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {        
        return employeeSerivce.readEmployees();
    }
    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        // employees.add(employee); 
        return employeeSerivce.creatEmployee(employee);
        
    }
    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(employeeSerivce.deleteEmployee(id))
            return "Delete Succesfully ";
        return "Not found";
    }
    
    
}
