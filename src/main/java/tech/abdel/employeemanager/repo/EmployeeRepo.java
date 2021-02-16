package tech.abdel.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.abdel.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
