package com.apibusca.buscarapidaapi.repository;

import com.apibusca.buscarapidaapi.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

    Produto findById(long id);

}
