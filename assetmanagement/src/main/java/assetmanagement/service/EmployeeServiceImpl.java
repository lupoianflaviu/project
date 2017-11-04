package assetmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assetmanagement.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public Employee findOne(Integer integer) {
        return this.employeeService.findOne(integer);
    }
}
