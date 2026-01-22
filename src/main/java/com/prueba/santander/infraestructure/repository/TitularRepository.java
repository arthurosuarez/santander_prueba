package com.prueba.santander.infraestructure.repository;

import com.prueba.santander.domain.model.Titular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitularRepository extends JpaRepository<Titular, String> {

}