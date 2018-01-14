package com.erabanq.controller;


import com.erabanq.dto.TransferDTO;
import com.erabanq.entity.Account;
import com.erabanq.repo.AccountRepository;
import com.erabanq.service.TransferService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Optional;

import static java.math.BigDecimal.ZERO;


@RestController
@AllArgsConstructor
public class TransferController {

    TransferService transferService;
    AccountRepository accountRepository;


    @PostMapping("/transfer")
    public void tranfer(@RequestBody TransferDTO transfer) throws InterruptedException {

        Account fromAccount = check(transfer.fromAccountId);
        Account toAccount = check(transfer.toAccountId);
        checkPositivity(transfer.ammount);

        transferService.transfer(fromAccount, toAccount, transfer.ammount);
    }





    private Account check(long accountId){
        Optional<Account> account = accountRepository.findById(accountId);
        if(account.isPresent()){
            return account.get();
        }
        throw new RuntimeException("Account with id: '" +accountId+ "' does not exists.");
    }

    private void checkPositivity(@NonNull BigDecimal number){
        if(number.compareTo(ZERO) < 0){
            throw new RuntimeException("Number must be greater than ZERO");
        }
    }
}
