package user.com.service;

import java.util.List;


import user.com.atribute.AtributeUser;
import user.com.exception.BusinessException;

public interface AtributeUserService {
	List<AtributeUser> findAll();
	void saveAtributeUser(AtributeUser atributeUser) throws BusinessException;

}
