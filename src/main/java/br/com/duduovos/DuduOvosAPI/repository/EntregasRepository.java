package br.com.duduovos.DuduOvosAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.duduovos.DuduOvosAPI.models.Entregas;

public interface EntregasRepository extends JpaRepository<Entregas, Long>{
	
	Entregas findById(long id);

}
