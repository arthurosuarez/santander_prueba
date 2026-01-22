package com.prueba.santander.domain.service;
import com.prueba.santander.infraestructure.request.CardRequest;
import org.springframework.stereotype.Service;

@Service
public interface ICardService {

    void create(CardRequest cardRequest);

}
