package br.senac.ecommerce.vendas;

import br.senac.ecommerce.cliente.Cliente;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "VENDAS")
public class Vendas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dataVenda")
    @NotNull
    @NotEmpty
    private LocalDate dataVenda;


    @Column(name = "cliente")
    @NotNull
    @NotEmpty
    private String cliente;

    @Column(name = "produto")
    @NotNull
    @NotEmpty
    private String produto;

    @Column(name = "quantidade")
    @NotNull
    @NotEmpty
    private double quantidade;

    @Column(name = "unidadeMedida")
    @NotNull
    @NotEmpty
    private String unidadeMedida;


    @Column(name = "valorTotal")
    @NotNull
    @NotEmpty
    private double valorTotal;

    @Column(name = "observacao")
    @NotNull
    @NotEmpty
    private String observacao;

    @Column(name = "formaPagamento")
    @NotNull
    @NotEmpty
    private String formaPagamento;
}
