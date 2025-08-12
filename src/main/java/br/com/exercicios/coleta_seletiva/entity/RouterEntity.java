package br.com.exercicios.coleta_seletiva.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class RouterEntity {

    private static Long nextId = 1L;

    @Setter(AccessLevel.PRIVATE) private Long id;
    private String description;
    private String coverageArea;
    private BigDecimal pcEfficiency;

    private static Long getNextId() {
        return nextId++;
    }
}
