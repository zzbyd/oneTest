package gm.daoImpl;

import org.springframework.stereotype.Repository;

import gm.dao.TestDao;

/**
 * ≤‚ ‘¿‡.
 * @author 15622280315
 *
 */
@Repository("daoImpl")
public class TestDaoImpl implements TestDao {

	/* (non-Javadoc)
	 * @see gm.dao.
	 * TestDao#getStr(java.lang.String).
	 */
	public String getStr(String mag) {
		String  str="";
		if(mag.equals("zzb")) {
			str = "zzbToYd";
		}  else {
			str = "zzbForYd";
		}
		return str;
	}

}
