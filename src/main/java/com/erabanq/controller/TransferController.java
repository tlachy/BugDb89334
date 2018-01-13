package com.erabanq.controller;


import com.erabanq.dto.TransferDTO;
import com.erabanq.service.TransferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class TransferController {

    private TransferService transferService;

    @PostMapping("/kurvaaaa")
    public void tranfer(@RequestBody TransferDTO transfer){
        transferService.transfer(transfer.fromAccountId, transfer.toAccountId, transfer.ammount);
    }

}
