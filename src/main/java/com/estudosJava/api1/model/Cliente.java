package com.estudosJava.api1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//mapeada com entity é tratada como entidade e logo vai para o BD, tabela cliente
@Entity
public class Cliente {
	//@id = primary key @generate = da a responsabilidade de incremento ao BD
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	/*GET e SET metodos de acessibilidade para as propriedades, ja que são privadas*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
