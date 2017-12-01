package user.com.repository;

import java.util.List;

import user.com.atribute.AtributeUser;

public interface AtributeUserRepository {
	
	List<AtributeUser> findAll();	
	void saveAtributeUser(AtributeUser atributerUser);

}
