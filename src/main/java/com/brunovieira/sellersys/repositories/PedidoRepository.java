package com.brunovieira.sellersys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.brunovieira.sellersys.domains.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
