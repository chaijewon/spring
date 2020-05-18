package com.sist.dao;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Component;
/*
 *   @Component, : 일반 클래스 
 *   @Repository, : DAO
 *   @Service, : BI => DAO+DAO   ==> Service VS DAO
 *   @Controller,  : Model (JSP파일명)
 *   @RestController, : Restful ==> 필요한 데이터 전송 (AJAX) , XML.JSON
 *   @ControllerAdvice : AOP
 */
@Component("ds")
/*
 *   <bean id="ds" class="org.apache.commons.dbcp.BasicDataSource"
       p:driverClassName="oracle.jdbc.driver.OracleDriver"
       p:url="jdbc:oracle:thin:@localhost:1521:XE"
       p:username="hr"
       p:password="happy"
       p:maxActive="20"
       p:maxIdle="10"
       p:maxWait="-1"
    />
 */
public class MyBasicDataSource extends BasicDataSource{
   public MyBasicDataSource()
   {
	   setDriverClassName("oracle.jdbc.driver.OracleDriver");
	   setUrl("jdbc:oracle:thin:@localhost:1521:XE");
	   setUsername("hr");
	   setPassword("happy");
	   setMaxActive(20);
	   setMaxIdle(10);
	   setMaxWait(-1);
   }
}










