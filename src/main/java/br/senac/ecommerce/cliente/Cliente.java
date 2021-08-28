package br.senac.ecommerce.cliente;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    @Column(name = "nomeSocial")
    @NotNull
    @NotEmpty
    private String nomeSocial;

    @Column(name = "cpfCnpj")
    @NotNull
    @NotEmpty
    private String cpfCnpj;

    @Column(name = "endereco")
    @NotNull
    @NotEmpty
    private String endereco;

    @Column(name = "email")
    @NotNull
    @NotEmpty
    private String email;

    @Column(name = "tipo")
    @NotNull
    @NotEmpty
    private String tipo;



}
