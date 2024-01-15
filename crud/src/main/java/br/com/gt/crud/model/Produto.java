package br.com.gt.crud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class Produto {

    private Long id;
    private String descricao;
    private String marca;
    private BigDecimal valor;
    private LocalDate validade;

}
