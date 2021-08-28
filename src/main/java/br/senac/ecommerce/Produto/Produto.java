package br.senac.ecommerce.Produto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Produto {
    private Integer id;
    private String descricao;
    private String categoria;
    private double Valor;
    private double peso;




}
