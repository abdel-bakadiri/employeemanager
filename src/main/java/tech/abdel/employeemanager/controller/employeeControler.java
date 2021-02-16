package tech.abdel.employeemanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.abdel.employeemanager.model.Employee;
import tech.abdel.employeemanager.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("employee")
public class employeeControler {
    private final EmployeeService employeeService;

    public employeeControler(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployer(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.addEmployer(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }
}
