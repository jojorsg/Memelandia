package br.com.jojo.microusuarioAppMeme.services;

import br.com.jojo.microusuarioAppMeme.entities.CategoriaMeme;
import br.com.jojo.microusuarioAppMeme.repositories.RepositoryCategoriaMeme;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategoriaMeme {

    private RepositoryCategoriaMeme categoriaMemeRepository;

    public ServiceCategoriaMeme(RepositoryCategoriaMeme categoriaMemeRepository) {
        this.categoriaMemeRepository = categoriaMemeRepository;
    }

    public List<CategoriaMeme> listarTodosUsuarios() {
        return categoriaMemeRepository.findAll();
    }

    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        return categoriaMemeRepository.save(categoriaMeme);
    }

    public void deletarCategoriaMeme(Long id) {
        categoriaMemeRepository.deleteById(id);
    }

    public CategoriaMeme buscarCategoriaMemePorId(Long id) {
        return categoriaMemeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria de Meme não encontrada com o ID: " + id));
    }

}
