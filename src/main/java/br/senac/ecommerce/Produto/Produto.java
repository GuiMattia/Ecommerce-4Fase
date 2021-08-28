package br.senac.ecommerce.Produto;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descricao")
    @NotNull
    @NotEmpty
    private String descricao;

    @Column(name = "categoria")
    @NotNull
    @NotEmpty
    private String categoria;

    @Column(name = "valor")
    @NotNull
    @NotEmpty
    private double valor;

    @Column(name = "peso")
    @NotNull
    @NotEmpty
    private double peso;


}
