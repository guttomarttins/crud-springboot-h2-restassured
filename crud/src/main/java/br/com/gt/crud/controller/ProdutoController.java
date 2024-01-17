package br.com.gt.crud.controller;

import br.com.gt.crud.model.Produto;
import br.com.gt.crud.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public Produto cadastro(@RequestBody Produto obj){
       return repository.save(obj);
    }

    @GetMapping
    public List<Produto> obtemTodos() {
        return repository.findAll();
    }
}
