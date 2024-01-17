package br.com.gt.crud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "MARCA")
    private String marca;
    @Column(name="VALOR")
    private BigDecimal valor;
    @Column(name = "VALIDADE")
    private String validade;

    public Produto() {
    }
}
