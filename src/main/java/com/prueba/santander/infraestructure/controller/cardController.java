package com.prueba.santander.infraestructure.controller;

import com.prueba.santander.application.service.CardService;
import com.prueba.santander.infraestructure.request.CardRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class cardController {

    private CardService cardService;
    public cardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping("card")
    public ResponseEntity<?> post(@RequestBody CardRequest cardRequest){
        cardService.create(cardRequest);
        return ResponseEntity.ok().build();

    }
}
