package api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class CategoriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategoria")
    private long idCategoria;

    @Column(name = "descricao", nullable = false)
    private String categoriaDescricao;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    public CategoriaModel(){
        super();
    }

    public CategoriaModel(long idCategoria, String categoriaDescricao, String tipo){
        super();
        this.idCategoria = idCategoria;
        this.categoriaDescricao = categoriaDescricao;
        this.tipo = tipo;
    }
}
