package api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.CategoriaModel;


public interface CategoriaRepository 
    extends JpaRepository<CategoriaModel, Long>
{

    List<CategoriaModel> findByCategoriadescricao(String categoriadescricao);
    List <CategoriaModel> findByTipo(String tipo);
    Optional<CategoriaModel> findById(Long id);
}
