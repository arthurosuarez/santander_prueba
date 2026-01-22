package com.prueba.santander.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "titular")
public class Titular {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "documento", nullable = false)
    private Integer documento;

    @Column(name = "tipo_documento", length = Integer.MAX_VALUE)
    private String tipoDocumento;

    @Column(name = "nombres", length = Integer.MAX_VALUE)
    private String nombres;

    @Column(name = "apellidos", length = Integer.MAX_VALUE)
    private String apellidos;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;


}