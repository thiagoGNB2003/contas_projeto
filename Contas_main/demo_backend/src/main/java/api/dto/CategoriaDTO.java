package api.dto;

import api.model.CategoriaModel;
import lombok.Data;

@Data
public class CategoriaDTO {
    private Long idCategoria;
    private String categoriaDescricao;
    private String tipo;

    public static CategoriaDTO converter(CategoriaModel categoriaModel){
        CategoriaDTO categoria = new CategoriaDTO();
        categoria.setIdCategoria(categoriaModel.getIdCategoria());
        categoria.setCategoriaDescricao(categoriaModel.getCategoriaDescricao());
        categoria.setTipo(categoriaModel.getTipo());
        return categoria;
    }
}
