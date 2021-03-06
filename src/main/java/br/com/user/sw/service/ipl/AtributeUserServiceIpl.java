package br.com.user.sw.service.ipl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.user.sw.atribute.AtributeUser;
import br.com.user.sw.exception.BusinessException;
import br.com.user.sw.repository.AtributeUserRepository;
import br.com.user.sw.service.AtributeUserService;

@Service
@Transactional
public class AtributeUserServiceIpl implements AtributeUserService {

	@Autowired
	private AtributeUserRepository atributeUserRepository;

	@Override
	public List<AtributeUser> findAll() {

		return atributeUserRepository.findAll();
	}

	@Override
	public void saveAtributeUser(AtributeUser atributeUser) throws BusinessException {
		if (atributeUser == null) {

			throw new BusinessException("Campo name não pode estar vazio");
		}
		atributeUserRepository.saveAtributeUser(atributeUser);

	}

	@Override
	public List<AtributeUser> findById(Long id) throws BusinessException {
		if (id == null) {

			throw new BusinessException("Campo name não pode estar vazio");
		}
		return atributeUserRepository.findById(id);
	}

	@Override
	public void deleteAtributeUser(Long id) throws BusinessException {
		if (id == null) {

			throw new BusinessException("Campo name não pode estar vazio");
		}
		atributeUserRepository.deleteAtributeUser(id);

	}

	@Override
	public void updateAtributeUser(AtributeUser atributeUser) throws BusinessException {
		if (atributeUser == null) {

			throw new BusinessException("Campo name não pode estar vazio");
		}
		atributeUserRepository.updateAtributeUser(atributeUser);

	}

}
