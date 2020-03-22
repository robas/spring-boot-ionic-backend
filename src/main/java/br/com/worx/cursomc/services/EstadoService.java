package br.com.worx.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.worx.cursomc.domain.Estado;
import br.com.worx.cursomc.exceptions.ObjectNotFoundException;
import br.com.worx.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepo;

	public Estado buscar(Integer id) {
		Optional<Estado> obj = estadoRepo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName()));
	}
}
