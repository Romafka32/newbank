package ru.kuznetsov.bank.dto;


import lombok.Data;

import java.util.Date;

@Data
public class CardDTO {

    private Integer id;
    private Integer accountID;
    private String system;
    private String cardNumber;
    private String CVV;
    private Date expYear;
    private Date expMonth;

}
