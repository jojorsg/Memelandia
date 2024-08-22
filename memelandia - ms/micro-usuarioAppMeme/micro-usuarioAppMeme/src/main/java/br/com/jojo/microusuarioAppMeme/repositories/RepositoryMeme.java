package br.com.jojo.microusuarioAppMeme.repositories;

import br.com.jojo.microusuarioAppMeme.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryMeme extends JpaRepository<Meme, Long> {
}
