package com.brunovieira.sellersys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.brunovieira.sellersys.domains.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
