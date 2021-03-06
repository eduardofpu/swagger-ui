package br.com.user.sw.repository.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.com.user.sw.AbstractTest;
import br.com.user.sw.atribute.AtributeUser;
import br.com.user.sw.repository.ipl.AtributeUserRepositoryIpl;

@Transactional
public class AtributeUserRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(AtributeUserRepositoryTest.class);
	
	@Autowired
	private AtributeUserRepositoryIpl repository;
	
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
