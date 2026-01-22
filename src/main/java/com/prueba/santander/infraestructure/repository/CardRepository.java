package com.prueba.santander.infraestructure.repository;

import com.prueba.santander.domain.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card , String> {

}
