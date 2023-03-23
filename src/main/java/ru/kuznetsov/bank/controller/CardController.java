package ru.kuznetsov.bank.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.kuznetsov.bank.model.Card;
import ru.kuznetsov.bank.service.BankService;

import java.math.BigDecimal;

@Slf4j
@RestController("/card")
@AllArgsConstructor
public class CardController {


    private final BankService bankService;

    //http://localhost:8080/kuzoff/card?id=1
    @GetMapping
    public String getBalance(@RequestParam Integer id) throws IllegalAccessException {
        return bankService.getAllInfo(id);
    }

    @PostMapping("/")
    public BigDecimal addMoney(@RequestBody Card card) {
        return null;
    }

    @PatchMapping("/{accountID}")
    public void transfer(@RequestBody Card card) throws IllegalAccessException {

    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handle(IllegalArgumentException e) {
        log.error(e.getMessage());
        return "Card Error!";
    }

}