package com.sist.spring2;

import org.apache.ibatis.annotations.Select;
import java.util.*;
/*
 *    class EmpDAO implements EmpMapper 
 *    {
 *        public List<EmpVO> empAllData()
 *        {
 *           getCo..
 *           
 *           disCo..
 *        }
 *    }
 */
public interface EmpMapper {
   @Select("SELECT * FROM dept")
   public List<DeptVO> empAllData();
   // <select id="empAllData" resultType="EmpVO">SELECT * FROM emp</select>
}
