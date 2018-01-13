package com.erabanq.controller;


import com.erabanq.dto.TransferDTO;
import com.erabanq.entity.Transfer;
import com.erabanq.repo.TransferRepository;
import com.erabanq.service.TransferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@RestController
@AllArgsConstructor
public class TransferController {

    private TransferService transferService;

    @PostMapping("/transfer")
    public void tranfer(@RequestBody TransferDTO transfer){
        transferService.transfer(transfer.fromAccountId, transfer.toAccountId, transfer.ammount);
    }

}
