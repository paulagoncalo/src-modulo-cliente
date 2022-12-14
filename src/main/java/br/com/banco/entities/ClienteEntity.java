package br.com.banco.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_clientes")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome_correntista", nullable = false)
    private String nomeCliente;

    @Column(name = "sobrenome_correntista", nullable = false)
    private String sobrenomeCliente;

    @Column(name = "tipo_conta", nullable = false)
    private String tipoConta;

    @Column(name = "numero_agencia", nullable = false)
    private Long numeroAgencia;

    @Column(name = "numero_conta", nullable = false)
    private Long numeroConta;

    @Column(name = "cpf_cnpj", nullable = false)
    private String cpfCnpj;

    @Column(name = "tipo_cliente", nullable = false)
    private String tipoCliente;
}
