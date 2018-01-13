package com.erabanq.data;

import com.erabanq.entity.Account;
import com.erabanq.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@Component
@Order(1)
public class AccountData {

    @Autowired
    AccountRepository repository;

    @PostConstruct
    void load(){

        repository.save(new Account(new BigDecimal(100)));
        repository.save(new Account(new BigDecimal(100)));
    }



}
