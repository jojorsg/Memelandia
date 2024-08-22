package br.com.jojo.microusuarioAppMeme.controllers;

import br.com.jojo.microusuarioAppMeme.entities.CategoriaMeme;
import br.com.jojo.microusuarioAppMeme.services.ServiceCategoriaMeme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/categorias")

public class ControllerCategoriaMemelandia {
    private ServiceCategoriaMeme serviceCategoriaMeme;
    private ControllerMeme controllerMeme;

    public ControllerCategoriaMemelandia(ServiceCategoriaMeme serviceCategoriaMeme, ControllerMeme controllerMeme) {
        this.serviceCategoriaMeme = serviceCategoriaMeme;
        this.controllerMeme = controllerMeme;
    }

    @GetMapping("categoria_meme")
    public List<CategoriaMeme> buscaCategoria() {
        return serviceCategoriaMeme.listarTodosUsuarios();
    }

    @PostMapping(path = "nova-categoria")
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return serviceCategoriaMeme.novaCategoriaMeme(categoriaMeme);
    }

}
