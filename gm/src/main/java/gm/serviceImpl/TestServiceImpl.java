package gm.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import gm.dao.TestDao;
import gm.service.TestService;

/**
 * @author 15622280315
 *
 */
@Service
public class TestServiceImpl implements TestService {

	@Resource(name = "daoImpl")
	private TestDao testDao;
	
	public String getStr(String mag) {
		// TODO Auto-generated method stub
		return testDao.getStr(mag);
	}

}
