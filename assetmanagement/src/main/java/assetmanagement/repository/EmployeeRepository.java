package assetmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import assetmanagement.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
