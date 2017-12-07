package br.com.user.sw.atribute;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class AtributeUser {
	
	private Long id;	
	@NotNull
	@NotBlank
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
