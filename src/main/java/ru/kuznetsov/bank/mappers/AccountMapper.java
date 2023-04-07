package ru.kuznetsov.bank.mappers;

import org.mapstruct.Mapper;
import ru.kuznetsov.bank.dto.AccountDTO;
import ru.kuznetsov.bank.model.Account;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountDTO toDTO(Account account);

    Account toEntity(AccountDTO accountDTO);
}
