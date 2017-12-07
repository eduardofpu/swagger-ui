package br.com.user.sw.service;

import java.util.List;

import br.com.user.sw.atribute.AtributeUser;
import br.com.user.sw.exception.BusinessException;

public interface AtributeUserService {
	List<AtributeUser> findAll();
	void saveAtributeUser(AtributeUser atributeUser) throws BusinessException;
	List<AtributeUser> findById(Long id) throws BusinessException;
	void deleteAtributeUser(Long id) throws BusinessException;
	void updateAtributeUser(AtributeUser atributeUser) throws BusinessException;

}
