package com.prueba.santander.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "card")
public class Card {
    @Id
    @Column(name = "cardid", nullable = false, length = Integer.MAX_VALUE)
    private String cardid;

    @Column(name = "cardnumber", nullable = false, length = Integer.MAX_VALUE)
    private String cardnumber;

    @Column(name = "holdername", nullable = false, length = Integer.MAX_VALUE)
    private String holdername;

    @Column(name = "issuedat", nullable = false)
    private LocalTime issuedat;

    @Column(name = "expiresat", nullable = false)
    private LocalTime expiresat;

    @Column(name = "status", nullable = false, length = Integer.MAX_VALUE)
    private String status;

    @Column(name = "blockedat")
    private LocalTime blockedat;

    @Column(name = "blockedreason")
    private LocalTime blockedreason;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "currency", length = Integer.MAX_VALUE)
    private String currency;


}