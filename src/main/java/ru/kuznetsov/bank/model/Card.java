package ru.kuznetsov.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cardId;

    @OneToMany (mappedBy = "id", fetch = FetchType.EAGER, orphanRemoval = true)
    private Integer accountId;

    private String system;

    private String cardNumber;

    private Date expMonth;

    private Date expYear;

    private String CVV;
}
