package com.brunovieira.sellersys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.brunovieira.sellersys.domains.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
