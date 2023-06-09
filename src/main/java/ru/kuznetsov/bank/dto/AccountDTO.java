package ru.kuznetsov.bank.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AccountDTO {

    private Integer id;
    private BigDecimal amount;
    private String currency;
    private String alias;
    private Date createDate;
    private Date updateDate;

}
