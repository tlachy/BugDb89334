package com.erabanq.service;

import com.erabanq.entity.Account;
import com.erabanq.entity.Transfer;
import com.erabanq.repo.AccountRepository;
import com.erabanq.repo.TransferRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Optional;

import static java.math.BigDecimal.*;

@Service
@AllArgsConstructor
public class TransferService {

    TransferRepository transferRepository;

    AccountRepository accountRepository;

    public void transfer(long fromAccountId, long toAccountId, @NonNull BigDecimal amount){

        Optional<Account> fromAccount = accountRepository.findById(fromAccountId);
        Optional<Account> toAccount = accountRepository.findById(toAccountId);

        if(fromAccount.isPresent()
                && toAccount.isPresent()
                && amount.compareTo(ZERO) > 0){


        } else {
            //some exception
        }

    }

    @Transactional
    public void transfer(Account fromAccount, Account toAccount, BigDecimal amount){

        fromAccount.setBalance(fromAccount.getBalance().subtract(amount));
        accountRepository.save(fromAccount);

        toAccount.setBalance(toAccount.getBalance().add(amount));
        accountRepository.save(toAccount);

        transferRepository.save(new Transfer(fromAccount, toAccount, amount));

    }




}
