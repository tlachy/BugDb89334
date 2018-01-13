package com.erabanq.dto;

import java.math.BigDecimal;


public class TransferDTO {

    public long fromAccountId; //later probably uuid

    public long toAccountId;

    public BigDecimal ammount;
}
