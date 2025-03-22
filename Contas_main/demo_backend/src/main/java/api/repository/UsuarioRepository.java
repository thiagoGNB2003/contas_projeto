package api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

    Optional<UsuarioModel> findByNome(String nome);
    Optional<UsuarioModel> findByCpf(String cpf);
    Optional<UsuarioModel> findByEmail(String email);
    Optional<UsuarioModel> findByLogin(String login);
    boolean existsByEmail(String email);
    boolean existsByCpf(String cpf);
    boolean existsByLogin(String login);
    Optional<UsuarioModel> findById(Long id);


}
