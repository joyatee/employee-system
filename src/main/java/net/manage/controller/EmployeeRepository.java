package net.manage.controller;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    
    @Query(value="select e from Employee e where e.name LIKE '%' || :keyword || '%'"
            +"OR e.emailId LIKE '%' || :keyword || '%'")
    public List<Employee> search(@Param("keyword") String keyword);

}
