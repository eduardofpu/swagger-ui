package user.com.service;

import java.util.List;


import user.com.atribute.AtributeUser;
import user.com.exception.BusinessException;

public interface AtributeUserService {
	List<AtributeUser> findAll();
	void saveAtributeUser(AtributeUser atributeUser) throws BusinessException;
	List<AtributeUser> findById(Long id);
	void deleteAtributeUser(Long id) throws BusinessException;
	void updateAtributeUser(AtributeUser atributeUser) throws BusinessException;

}
