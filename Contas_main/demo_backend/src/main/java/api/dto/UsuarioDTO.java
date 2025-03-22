package api.dto;

import api.model.UsuarioModel;
import lombok.Data;

@Data
public class UsuarioDTO {

    private long idUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String login;
    private String senha;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String cep;
    private String telefoneNumero;
    private String tipoNumero;

    public static UsuarioDTO converter(UsuarioModel usuarioModel) {
        var usuario = new UsuarioDTO();
        usuario.setIdUsuario(usuarioModel.getIdUsuario());
        usuario.setNome(usuarioModel.getNome());
        usuario.setCpf(usuarioModel.getCpf());
        usuario.setEmail(usuarioModel.getEmail());
        usuario.setLogin(usuarioModel.getLogin());
        usuario.setSenha(usuarioModel.getSenha());
    
        if (usuarioModel.getIdEndereco() != null) {
            usuario.setEstado(usuarioModel.getIdEndereco().getEstado());
            usuario.setCidade(usuarioModel.getIdEndereco().getCidade());
            usuario.setBairro(usuarioModel.getIdEndereco().getBairro());
            usuario.setRua(usuarioModel.getIdEndereco().getRua());
            usuario.setNumero(usuarioModel.getIdEndereco().getNumero());
            usuario.setCep(usuarioModel.getIdEndereco().getCep());
        }
    
    
        return usuario;
    }
    

    public UsuarioDTO() {
        super();
    }

    public UsuarioDTO(long idUsuario, String nome, String cpf, String email, String login, String senha, 
    String estado, String cidade, String bairro, String rua, String numero, String cep,
    String telefoneNumero, String tipoNumero) {
        super();
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.telefoneNumero = telefoneNumero;
        this.tipoNumero = tipoNumero;

    }

}
