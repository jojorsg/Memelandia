package br.com.jojo.microusuarioAppMeme.controllers;

import br.com.jojo.microusuarioAppMeme.entities.Meme;
import br.com.jojo.microusuarioAppMeme.services.ServiceMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/memes")
public class ControllerMeme {
    @Autowired
    private ServiceMeme serviceMeme;

    @GetMapping
    private List<Meme> listarMemes(){
        return serviceMeme.listarTodosMemes();
    }
    @PostMapping
    private Meme criarMeme(@RequestBody Meme meme){
        return serviceMeme.salvarMemes(meme);
    }

    @GetMapping("aleatorios")
    private List<Meme> buscarMemesAleatorios(){
        return serviceMeme.buscarMemesAleatorios();
    }
}
