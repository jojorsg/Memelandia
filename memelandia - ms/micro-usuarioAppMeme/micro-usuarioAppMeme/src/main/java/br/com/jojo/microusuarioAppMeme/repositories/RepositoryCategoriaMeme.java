package br.com.jojo.microusuarioAppMeme.repositories;

import br.com.jojo.microusuarioAppMeme.entities.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCategoriaMeme extends JpaRepository<CategoriaMeme, Long> {
}
