package br.com.user.sw.repository;

import java.util.List;

import br.com.user.sw.atribute.AtributeUser;

public interface AtributeUserRepository {
	
	List<AtributeUser> findAll();	
	void saveAtributeUser(AtributeUser atributerUser);
	List<AtributeUser> findById(Long id);
	void deleteAtributeUser(Long id);
	void updateAtributeUser(AtributeUser atributerUser);
	
}
