package ru.kuznetsov.bank.mappers;

import org.mapstruct.Mapper;
import ru.kuznetsov.bank.dto.CardDTO;
import ru.kuznetsov.bank.model.Card;

@Mapper(componentModel = "spring")
public interface CardMapper {

    CardDTO toDTO(Card card);

    Card toEntity(CardDTO cardDTO);

}
