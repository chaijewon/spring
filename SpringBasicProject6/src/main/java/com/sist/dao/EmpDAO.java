package com.sist.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmpDAO extends SqlSessionDaoSupport{
   
    @Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}
   
   public List<EmpVO> empAllData()
   {
	   return getSqlSession().selectList("empAllData");
	   /*
	    *    try
	    *    {
	    *       session=ssf.openSession();
	    *       session.selectList("")
	    *    }catch(Exception ex)
	    *    {
	    *    }
	    *    finally
	    *    {
	    *        if(session!=null)
	    *           session.close();
	    *    }
	    */
   }
   public EmpVO empFindData(int empno)
   {
	   return getSqlSession().selectOne("empFindData", empno);
   }
}
