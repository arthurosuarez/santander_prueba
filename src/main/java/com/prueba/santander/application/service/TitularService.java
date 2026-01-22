package com.prueba.santander.application.service;

import com.prueba.santander.domain.model.Titular;
import com.prueba.santander.domain.service.ITitularService;
import com.prueba.santander.infraestructure.repository.TitularRepository;


public class TitularService implements ITitularService {

    private TitularRepository titularRepository;
    public TitularService(TitularRepository titularRepository) {
        this.titularRepository = titularRepository;
    }

    @Override
    public Titular getTitularByDocumentNumber(String documentNumber) {
        return titularRepository.getById(documentNumber);
    }
}
