package user.com.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import user.com.atribute.AtributeUser;
import user.com.exception.BusinessException;
import user.com.service.AtributeUserService;

@RestController
@RequestMapping(value = "api/user")
public class AtributeUserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AtributeUserController.class);

	@Autowired
	private AtributeUserService atributeUserService;

	@GetMapping
	@ResponseBody
	public List<AtributeUser> findAll() {
		LOGGER.info("Pesquisando os Users");
		return atributeUserService.findAll();
	}

	@PostMapping
	public ResponseEntity saveAtributeUser(@Valid @RequestBody AtributeUser atributeUser) throws BusinessException {
		
		LOGGER.info("Salvando users na base de dados");
		atributeUserService.saveAtributeUser(atributeUser);
		return new ResponseEntity<>(HttpStatus.CREATED);

	}
	@GetMapping("/buscarId")
	@ResponseBody
	public List<AtributeUser> findById(Long id) {
		LOGGER.info("Pesquisando os Users pelo id");
		return atributeUserService.findById(id);
	}
	
	
	@DeleteMapping("/deletarId")
	public ResponseEntity deleteAtributeUser(Long id) throws BusinessException {
		
		LOGGER.info("Deletando pelo id");
		atributeUserService.deleteAtributeUser(id);
		return new ResponseEntity<>(HttpStatus.CREATED);

	}
	
	@PutMapping
	public ResponseEntity updateAtributeUser(@Valid @RequestBody AtributeUser atributeUser) throws BusinessException {
		
		LOGGER.info("Editando users na base de dados");
		atributeUserService.updateAtributeUser(atributeUser);
		return new ResponseEntity<>(HttpStatus.CREATED);

	}
	
}
