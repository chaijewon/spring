package com.sist.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.*;
public class EmpDAO extends SqlSessionDaoSupport{
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
