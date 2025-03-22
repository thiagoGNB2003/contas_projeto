package api.dto;

import java.time.LocalDate;


import api.model.ParcelaModel;
import lombok.Data;

@Data
public class ParcelaDTO {

    private Long idParcela;
    private LocalDate parcelaDataVencimento;
    private Long numeroParcela;
    private double valorParcela;
    private Long idContas;
    private String descricao;
    private float valor;
    private LocalDate  dataVencimento;
    private LocalDate dataPagamento;
    private String tipoConta;
    private boolean statusContas;

    public static ParcelaDTO converter(ParcelaModel parcelaModel){
        var parcela = new ParcelaDTO();
        parcela.setIdParcela(parcelaModel.getIdParcela());
        parcela.setParcelaDataVencimento(parcelaModel.getParcelaVencimento());
        parcela.setNumeroParcela(parcelaModel.getIdParcela());
        parcela.setValorParcela(parcelaModel.getValorParcela());
        parcela.setDescricao(parcelaModel.getIdContas().getDescricao());
        parcela.setValor(parcelaModel.getIdContas().getValor());
        parcela.setDataPagamento(parcelaModel.getIdContas().getDataPagamento());
        parcela.setDataVencimento(parcelaModel.getIdContas().getDataVencimento());
        parcela.setTipoConta(parcelaModel.getIdContas().getTipoConta());
        parcela.setStatusContas(parcelaModel.getIdContas().isStatusContas());
        return parcela;
    }


    public ParcelaDTO(){
        super();
    }

    public ParcelaDTO(long idParcela, LocalDate parcelaDataVencimento, Long numeroParcela, double valorParcela, Long idContas,
    String descricao, float valor, LocalDate  dataVencimento, LocalDate  dataPagamento, String tipoConta, boolean statusContas){
        super();
        this.idParcela = idParcela;
        this.parcelaDataVencimento = parcelaDataVencimento;
        this.numeroParcela = numeroParcela;
        this.valorParcela = valorParcela;
        this.idContas = idContas;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.tipoConta = tipoConta;
        this.statusContas = statusContas;
    }
    
}
