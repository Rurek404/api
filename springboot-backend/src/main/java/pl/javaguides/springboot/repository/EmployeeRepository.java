package pl.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.javaguides.springboot.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // all crud database methods

}
