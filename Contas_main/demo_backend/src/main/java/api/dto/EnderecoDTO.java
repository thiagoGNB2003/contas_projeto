package api.dto;

import api.model.EnderecoModel;
import lombok.Data;

@Data
public class EnderecoDTO {
    private Long idEndereco;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String cep;

    public static EnderecoDTO converter(EnderecoModel generoModel) {
        EnderecoDTO genero = new EnderecoDTO();
        genero.setIdEndereco(generoModel.getIdEndereco());
        genero.setEstado(generoModel.getEstado());
        genero.setCidade(generoModel.getCidade());
        genero.setBairro(generoModel.getBairro());
        genero.setRua(generoModel.getRua());
        genero.setNumero(generoModel.getNumero());
        genero.setCep(generoModel.getCep());
        return genero;
    }
}