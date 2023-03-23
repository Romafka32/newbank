package ru.kuznetsov.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kuznetsov.bank.model.Card;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
