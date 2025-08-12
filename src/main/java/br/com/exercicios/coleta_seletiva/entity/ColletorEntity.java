package br.com.exercicios.coleta_seletiva.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class ColletorEntity {

    private static Long nextId = 1L;

    @Setter(AccessLevel.PRIVATE) private Long id;
    private String name;
    private String description;

    private static Long getNextId() {
        return nextId++;
    }
}
