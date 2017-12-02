package user.com.repository;

import java.util.List;

import user.com.atribute.AtributeUser;

public interface AtributeUserRepository {
	
	List<AtributeUser> findAll();	
	void saveAtributeUser(AtributeUser atributerUser);
	List<AtributeUser> findById(Long id);
	void deleteAtributeUser(Long id);
	void updateAtributeUser(AtributeUser atributerUser);
	
}
