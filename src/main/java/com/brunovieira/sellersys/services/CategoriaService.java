package com.brunovieira.sellersys.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunovieira.sellersys.domains.Categoria;
import com.brunovieira.sellersys.repositories.CategoriaRepository;
import com.brunovieira.sellersys.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + 
																 ", Tipo: " + Categoria.class.getName()));
	}
}
