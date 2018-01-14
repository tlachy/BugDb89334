package com.erabanq.service;

import com.erabanq.entity.Account;
import com.erabanq.entity.Transfer;
import com.erabanq.repo.AccountRepository;
import com.erabanq.repo.TransferRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.hibernate.StaleStateException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Optional;

import static java.math.BigDecimal.*;
import static javax.transaction.Transactional.TxType.REQUIRES_NEW;

@Service
@AllArgsConstructor
public class TransferService {

    TransferRepository transferRepository;
    AccountRepository accountRepository;


    @Transactional(REQUIRES_NEW)
    public void transfer(Account fromAccount, Account toAccount, BigDecimal amount) throws InterruptedException {

        fromAccount.setBalance(fromAccount.getBalance().subtract(amount));
        accountRepository.save(fromAccount);

        if(fromAccount.getId() == 1L){
            Thread.currentThread().sleep(10000);
        }

        toAccount.setBalance(toAccount.getBalance().add(amount));
        accountRepository.save(toAccount);

        transferRepository.save(new Transfer(fromAccount, toAccount, amount));
    }
}
