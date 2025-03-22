package api.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "contas")
public class ContasModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContas")
    private Long idContas;

    @Column(name = "descricao", nullable = true)
    private String descricao;

    @Column(name = "valor", nullable = false)
    private Float valor;

    @Column(name = "data_vencimento", nullable = false)
    private LocalDate  dataVencimento;

    @Column(name = "data_pagamento", nullable = true)
    private LocalDate  dataPagamento;

    @Column(name = "tipo_conta", nullable = false)
    private String tipoConta;

    @Column(name = "status_contas", nullable = false)
    private boolean statusContas;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private UsuarioModel idUsuario;

    @ManyToOne
    @JoinColumn(name = "idCategoria", nullable = false)
    private CategoriaModel idCategoria;

    public ContasModel(){
        super();
    }

    public ContasModel(long idContas, String descricao, float valor, LocalDate  dataVencimento, 
    LocalDate dataPagamento, String tipoConta, boolean statusContas, UsuarioModel idUsuario, CategoriaModel idCategoria){
        super();
        this.idContas = idContas;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.tipoConta = tipoConta;
        this.statusContas = statusContas;
        this.idUsuario = idUsuario;
        this.idCategoria = idCategoria;
    }

}
