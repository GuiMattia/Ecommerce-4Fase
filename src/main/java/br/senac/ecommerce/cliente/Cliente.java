package br.senac.ecommerce.cliente;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "CLIENTE")
public class Cliente {

    @Id
    private Integer id;
    private String nomeSocial;
    private String cpfCnpj;
    private String endereco;
    private String email;
    private String tipo;



}
