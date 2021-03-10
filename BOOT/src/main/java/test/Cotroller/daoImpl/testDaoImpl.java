package test.Cotroller.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
@Repository
public class testDaoImpl implements test.Cotroller.dao.testDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	
	@ModelAttribute
	public void firstValid() {
		System.out.println("123456622");
	}
	
	@Override
	public int getInt() {
		// TODO Auto-generated method stub
		jdbc.update("update house set size=100 where id=2 ");
		return 0;
	}

	@Override
	public List<String> queryHouse() {
		
		return null;
	}

}
