package com.brunovieira.sellersys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.brunovieira.sellersys.domains.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
