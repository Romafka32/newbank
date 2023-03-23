package ru.kuznetsov.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kuznetsov.bank.model.Account;

public interface AccountRepository extends JpaRepository<Account,Integer> {
}
