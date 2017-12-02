package user.com.repository.ipl;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import user.com.AbstractTest;
import user.com.atribute.AtributeUser;
import user.com.repository.AtributeUserRepository;



@Transactional
public class AtributeUserRepositoryTestIpl extends AbstractTest{
	private static final Logger LOGGER = Logger.getLogger(AtributeUserRepositoryTestIpl.class);
	@Autowired
	private AtributeUserRepository repository;
	
	@Test
	public void testFindAll() {
		
		List<AtributeUser> atributeUser = repository.findAll();
		LOGGER.info("Listar todos: ");
		atributeUser.forEach(res -> {
			LOGGER.info(res.getId());
			LOGGER.info(res.getName());
			LOGGER.info("----------------------");
		});
		
		
	}
	
	@Test
	public void saveAtributeUser() {
		AtributeUser atributeUser = new AtributeUser();
		atributeUser.setName("Arnold Schwarzenegger");		
		repository.saveAtributeUser(atributeUser);
		LOGGER.info("Save novo name");

	}
	
	@Test
	public void testFindById() {
		
		List<AtributeUser> atributeUser = repository.findById(5l);
		LOGGER.info("Id encontrado ");
		atributeUser.forEach(res -> {
			LOGGER.info(res.getId());
			LOGGER.info(res.getName());
			
		});
		
		
	}	
	
	@Test
	public void deleteAtributeUser() {						
		repository.deleteAtributeUser(5l);
		LOGGER.info("Id Deletado");

	}
	
	@Test
	public void updateAtributeUser() {
		AtributeUser atributeUser = new AtributeUser();
		atributeUser.setId(4l);
		atributeUser.setName("Sonja");		
		repository.updateAtributeUser(atributeUser);
		LOGGER.info("Editado novo name");

	}


}
