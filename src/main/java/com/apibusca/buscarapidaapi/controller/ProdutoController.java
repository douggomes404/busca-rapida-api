package com.apibusca.buscarapidaapi.controller;

import com.apibusca.buscarapidaapi.model.Produto;
import com.apibusca.buscarapidaapi.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value = "/buscar")
@Api(value="Api para buscar Calçados")
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    @ApiOperation("Retorna uma lista com todos os produtos da loja")
    public List<Produto> listarProdutos(){
        return (List<Produto>) produtoRepository.findAll();
    }

    @GetMapping("/produto/{id}")
    @ApiOperation("Retorna uma produto unico pelo ID")
    public Produto listarProdutoUnico(@PathVariable(value = "id") long id){
        return produtoRepository.findById(id);
    }

    @PostMapping("/produto")
    @ApiOperation("Salva um novo produto para a loja")
    public Produto salvaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto/{id}")
    @ApiOperation("Deleta um produto da loja pelo ID")
    public void deleteProduto(@PathVariable(value = "id") long id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("/produto")
    @ApiOperation("Atualiza os dados do produto")
    public Produto atualizaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
}
