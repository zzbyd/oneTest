package gm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import gm.service.TestService;

/**
 * @author 15622280315
 *
 */
@Controller
public class TestController {
	@Autowired
   private TestService testService;
	
	public String getMag(final String mag) {
		return testService.getStr(mag);
	}
}
