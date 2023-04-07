package ru.kuznetsov.bank.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.kuznetsov.bank.dto.AccountDTO;
import ru.kuznetsov.bank.model.Account;
import ru.kuznetsov.bank.service.BankService;

import java.math.BigDecimal;
@Slf4j
@RestController("/account")
@RequiredArgsConstructor
public class AccountController {


    private final BankService bankService;

    //http://localhost:8080/kuzoff/account?id=1
    @GetMapping
    public AccountDTO getBalance(@RequestParam Integer id) throws IllegalAccessException {
        return new AccountDTO();
    }

    //http://localhost:8080/kuzoff/account
    @PostMapping
    public AccountDTO addMoney(@RequestBody Account account) {
        return new AccountDTO();
    }

    //http://localhost:8080/kuzoff/account?id=1
    @PatchMapping("/{id}")
    public void transfer(@RequestBody Account account) throws IllegalAccessException {

    }

    @ExceptionHandler (IllegalArgumentException.class)
    public String handle(IllegalArgumentException e) {
        log.error(e.getMessage());
        return "Account Error!";
    }


}