package com.estudosJava.api1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudosJava.api1.model.Cliente;
/*Repository interage com o BD*/
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
}
