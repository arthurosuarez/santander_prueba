package com.prueba.santander.domain.service;

import com.prueba.santander.domain.model.Titular;

public interface ITitularService {
    Titular getTitularByDocumentNumber(String documentNumber);

}
