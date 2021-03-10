package test.Cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.Cotroller.dao.testDao;



@RestController
@RequestMapping("/test")
public class testController {
   
	@Autowired
	private testDao test;
	@RequestMapping("/testOne")
	public String testOne() {
		test.getInt();
		return "one--tesssst";
	}
}
