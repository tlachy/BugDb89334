package com.erabanq.utils;

import com.erabanq.data.CurrencyData;
import com.erabanq.entity.Employee;
import com.erabanq.entity.Item;
import com.erabanq.repo.EmployeeRepository;
import com.erabanq.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import static com.erabanq.utils.SecurityUtils.runAs;

@Component
public class InitialData {

    @Autowired
    CurrencyData currencyData;

    public void load(){

        currencyData.initializeStaticData();


        /**
         * Due to method-level protections on {@link example.company.ItemRepository}, the security context must be loaded
         * with an authentication token containing the necessary privileges.
         */


//        itemRepository.save(new Item("Sting"));
//        itemRepository.save(new Item("the one ring"));


    }
}
