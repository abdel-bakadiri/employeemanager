package tech.abdel.employeemanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.abdel.employeemanager.model.Employee;
import tech.abdel.employeemanager.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class employeeControler {
    private final EmployeeService employeeService;

    public employeeControler(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployer(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.addEmployer(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }
}
