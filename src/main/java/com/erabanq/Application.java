package com.erabanq;

import com.erabanq.entity.Employee;
import com.erabanq.entity.Item;
import com.erabanq.repo.EmployeeRepository;
import com.erabanq.repo.ItemRepository;
import com.erabanq.utils.InitialData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.annotation.PostConstruct;
import java.util.Arrays;

import static com.erabanq.utils.SecurityUtils.runAs;
import static java.util.Arrays.*;

@SpringBootApplication
public class Application {

    @Autowired
    InitialData initialData;

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ItemRepository itemRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @PostConstruct
    public void init() {

        runAs("system", "system", "ROLE_ADMIN");
        Employee empl = new Employee("nekdo", "nekdo", "bc");
        employeeRepository.save(empl);

        Item item = new Item("description");
        Item item2 = new Item("description2");

        itemRepository.saveAll(asList(item, item2));

        empl.getItems().addAll(asList(item, item2));
        item.setEmployee(empl);
        item2.setEmployee(empl);

        itemRepository.saveAll(asList(item, item2));
        employeeRepository.save(empl);



        employeeRepository.save(new Employee("nekdo", "nekdo", "bc"));
        employeeRepository.save(new Employee("nekdo", "nekdo", "bc"));
        employeeRepository.save(new Employee("nekdo", "nekdo", "bc"));
        SecurityContextHolder.clearContext();

//        initialData.load();
    }
}