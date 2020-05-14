package com.sist.spring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.*;
public class MainClass {
  public static void main(String[] args) {
	  AnnotationConfigApplicationContext ctx=
			  new AnnotationConfigApplicationContext(Config.class);
	  EmpDAO dao=ctx.getBean("empDAO",EmpDAO.class);
	  EmpDAO dao1=ctx.getBean("empDAO",EmpDAO.class);
	  System.out.println("dao="+dao);
	  System.out.println("dao1="+dao1);
	  List<EmpVO> list=dao.empAllData();
	  for(EmpVO vo:list)
	  {
		  System.out.println(vo.getEname()+" "+vo.getJob()+" "+vo.getSal());
	  }
  }
} 
