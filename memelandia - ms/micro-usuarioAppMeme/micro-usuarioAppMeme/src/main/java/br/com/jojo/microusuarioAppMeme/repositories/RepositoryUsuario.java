package br.com.jojo.microusuarioAppMeme.repositories;

import br.com.jojo.microusuarioAppMeme.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUsuario extends JpaRepository<Usuario, Long> {

}
