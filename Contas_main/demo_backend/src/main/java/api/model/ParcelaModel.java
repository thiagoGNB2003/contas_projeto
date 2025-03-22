package api.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "parcela")
public class ParcelaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idParcela")
    private long idParcela;

    @Column(name = "data_vencimento", nullable = false)
    private LocalDate  parcelaVencimento;

    @Column(name = "numero_parcela", nullable = false)
    private Long numeroParcela;

    @Column(name = "valor_parcela", nullable = false)
    private double valorParcela;

    @ManyToOne
    @JoinColumn(name = "idContas", nullable = false, referencedColumnName = "idContas")
    private ContasModel idContas;

    public ParcelaModel(){
        super();
    }

    public ParcelaModel(long idParcela, LocalDate parcelaVencimento, Long numeroParcela, double valorParcela, ContasModel idContas){
        super();
        this.idParcela = idParcela;
        this.parcelaVencimento = parcelaVencimento;
        this.numeroParcela = numeroParcela;
        this.valorParcela = valorParcela;
        this.idContas = idContas;
    }

}

