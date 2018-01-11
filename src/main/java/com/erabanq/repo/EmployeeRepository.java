package com.erabanq.repo;

import com.erabanq.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {}
