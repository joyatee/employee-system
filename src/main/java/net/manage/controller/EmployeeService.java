package net.manage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;
    
    public List<Employee> showAllEmployee()
    {
        return (List<Employee>)repo.findAll();
    }
    
    public void saveEmployee(Employee emp)
    {
        repo.save(emp);
    }
    
    public Employee findEmployee(long id)
    {
        Optional<Employee> result=repo.findById(id);
        return result.get();
    }
    
    public void deleteEmployee(long id)
    {
        repo.deleteById(id);
        
    }
    
    public List<Employee> searchEmployee(String keyword)
    {
        return repo.search(keyword);
        
    }
}
