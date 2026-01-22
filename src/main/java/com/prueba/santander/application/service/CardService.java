package com.prueba.santander.application.service;

import com.prueba.santander.domain.model.Card;
import com.prueba.santander.domain.service.ICardService;
import com.prueba.santander.infraestructure.repository.CardRepository;
import com.prueba.santander.infraestructure.request.CardRequest;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CardService implements ICardService {
    private CardRepository cardRepository;
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public void create(CardRequest cardRequest) {
        Date createDate = new Date();

        Card card = new Card();
        card.setCardNumber(cardRequest.getCardNumber());
        card.setCardHolderName(cardRequest.getCardHolderName());
        card.setExpirationDate(createDate);
    }
}
