package com.senai.produtos;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    private ProdutoRepository pr;

    public ProdutoController(ProdutoRepository pr) {
        this.pr = pr;
    }

    @GetMapping
    public List<Produto> getAll() {
        //SELECT * FROM produtos;
        return this.pr.findAll();
    }

    @GetMapping("/searchName")
    public List<Produto> getAllByName(@RequestParam("nome")String nome) {
        return this.pr.findByNomeContainingIgnoreCase(nome);
    }

    @GetMapping("/searchDescription")
    public List<Produto> getAllByDescription(@RequestParam("descricao")String descricao) {
        return this.pr.findByDescricaoContainingIgnoreCase(descricao);
    }

    @GetMapping("/searchCategory")
    public List<Produto> getAllByCategory(@RequestParam("categoria")String categoria) {
        return this.pr.findByCategoriaContainingIgnoreCase(categoria);
    }

    @GetMapping("/searchCondition")
    public List<Produto> getAllByCondition(@RequestParam("condicao")String condicao) {
        return this.pr.findByCondicaoContainingIgnoreCase(condicao);
    }


    @GetMapping("/byPrice")
    public List<Produto> getByPrice(
            @RequestParam(name="vi") double vi,
            @RequestParam(name="vf") double vf)
    {
        return this.pr.findByValues(vi, vf);
    }

}
