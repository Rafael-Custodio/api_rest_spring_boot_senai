package br.sp.senai.PrimeiraAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sp.senai.PrimeiraAPI.dao.BancoDeDados;
import br.sp.senai.PrimeiraAPI.model.Carro;
import br.sp.senai.PrimeiraAPI.model.dto.CarroDTO;

@RestController
@RequestMapping("/api/carro")
public class CarroController {
	
	@GetMapping
	public List<CarroDTO> buscar() {
		return BancoDeDados.lista;
	}
	
	@PostMapping
	public CarroDTO novo(@RequestBody CarroDTO carrodto) {
		Carro c = new Carro(
				carrodto.getChassi(),
				carrodto.getModelo(),
				carrodto.getAno(),
				carrodto.getMarca());
		
		BancoDeDados.lista.add(c);
		return carrodto;
	}
	
	@PutMapping("/{id}")
	public CarroDTO edita(@PathVariable Long id
			, @RequestBody CarroDTO carro) {
		System.err.println(id);
		carro.setAno(2024);
		return carro;
	}
	
	@DeleteMapping("/{id}")
	public boolean exclui(@PathVariable Long id) {
		System.err.println(id);
		return true;
	}
	
	

}
