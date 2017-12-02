package user.com.repository.ipl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import user.com.atribute.AtributeUser;
import user.com.repository.AtributeUserRepository;
@Service
@Transactional
public class AtributeUserRepositoryIpl implements AtributeUserRepository{
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


	@Override
	public List<AtributeUser> findAll() {
		
		String query = "SELECT * FROM TB_USER";		
		HashMap<String, Object> parameter = new HashMap<String, Object>();
		
		List<AtributeUser> atributeUser = namedParameterJdbcTemplate.query(query, parameter, (rs, rowNum) -> {
			AtributeUser activy = new AtributeUser();
			activy.setId(rs.getLong("id"));
			activy.setName(rs.getString("name"));
			return activy;
		});
		
		
		return atributeUser;
	}

	@Override
	public void saveAtributeUser(AtributeUser atributeUser) {
		
		String insertQuery = "INSERT INTO TB_USER (NAME) VALUES (:name)";		
		HashMap<String, Object> parameter = new HashMap<>();
		parameter.put("name", atributeUser.getName());
		namedParameterJdbcTemplate.update(insertQuery, parameter) ;
		
	}
	
	@Override
	public List<AtributeUser> findById(Long id) {
		
		String query = "SELECT * FROM TB_USER WHERE ID = "+id;		
		HashMap<String, Object> parameter = new HashMap<String, Object>();
		
		List<AtributeUser> atributeUser = namedParameterJdbcTemplate.query(query, parameter, (rs, rowNum) -> {
			AtributeUser activy = new AtributeUser();
			activy.setId(rs.getLong("id"));
			activy.setName(rs.getString("name"));
			return activy;
		});
		
		
		return atributeUser;
	}
	
	@Override
	public void deleteAtributeUser(Long id) {
		
		String deleteQuery = "DELETE FROM TB_USER WHERE ID = "+id;		
		HashMap<String, Object> parameter = new HashMap<>();
		
		namedParameterJdbcTemplate.update(deleteQuery, parameter) ;
		
	}
	
	@Override
	public void updateAtributeUser(AtributeUser atributeUser) {
		
		String updatetQuery = "UPDATE TB_USER  SET NAME =:name WHERE ID =:id";		
		HashMap<String, Object> parameter = new HashMap<>();
		parameter.put("id", atributeUser.getId());
		parameter.put("name", atributeUser.getName());
		
		namedParameterJdbcTemplate.update(updatetQuery, parameter) ;
		
	}
	

}
