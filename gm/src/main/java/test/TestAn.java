package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import gm.controller.TestController;
import gm.start.startAn;

public class TestAn {
   public static void main(String[] args) {
	   AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(startAn.class);
	   TestController tec = appCon.getBean(TestController.class);
	  final String str =  tec.getMag("zzbd");
	  System.out.println(str);
	   //tec.
	   appCon.close();
}
}
