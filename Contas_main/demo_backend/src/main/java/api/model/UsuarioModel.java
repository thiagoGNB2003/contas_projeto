package api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private long idUsuario;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "telefone", nullable = true)
    private Integer telefone;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEndereco", nullable = false)
    private EnderecoModel idEndereco;


    public UsuarioModel() {
        super();
    }

    public UsuarioModel(long idUsuario, String nome, String cpf, String email, String login, String senha, EnderecoModel idEndereco, Integer telefone) {
        super();
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.idEndereco = idEndereco;
        this.telefone = telefone;
        
    }

}
