package com.prueba.santander.infraestructure.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class CardRequest implements Serializable {

        private Integer productId;
        private String holdername;
}
