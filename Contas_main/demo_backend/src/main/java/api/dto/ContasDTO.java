package api.dto;

import java.time.LocalDate;

import api.model.ContasModel;
import api.model.CategoriaModel;
import api.model.UsuarioModel;
import lombok.Data;

@Data
public class ContasDTO {

    private String descricao;
    private float valor;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private String tipoConta;
    private boolean statusContas;
    private Long idUsuario;
    private Long idCategoria;

    public ContasModel toEntity(UsuarioModel usuario, CategoriaModel categoria) {
        ContasModel conta = new ContasModel();
        conta.setDescricao(this.descricao);
        conta.setValor(this.valor);
        conta.setDataPagamento(this.dataVencimento);
        conta.setDataPagamento(this.dataPagamento);
        conta.setTipoConta(this.tipoConta);
        conta.setStatusContas(this.statusContas);
        conta.setIdUsuario(usuario);
        conta.setIdCategoria(categoria);
        return conta;
    }
}
