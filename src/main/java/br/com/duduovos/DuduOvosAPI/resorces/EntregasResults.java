package br.com.duduovos.DuduOvosAPI.resorces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.duduovos.DuduOvosAPI.models.Entregas;
import br.com.duduovos.DuduOvosAPI.repository.EntregasRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST PathFinder")
public class EntregasResults {
	
	@Autowired
	EntregasRepository entregasRepository;
	
	@ApiOperation(value="Retorna uma Entrega")
	@GetMapping("/entrega/{id}")
	public Entregas entrega(@PathVariable(value="id") long id){
		return entregasRepository.findById(id);
	}
	
	@ApiOperation(value="Retorna todas Entregas")
	@GetMapping("/entregas")
	public List<Entregas> listaEntregas(){
		return entregasRepository.findAll();
	}
	
	@ApiOperation(value = "Insere uma Entrega")
	@PostMapping("/entrega")
	public Entregas salvaEntrega(@RequestBody Entregas entrega) {
		return entregasRepository.save(entrega);
	}
}
		

