package com.sist.dao;
import java.util.*;
/*
 *  NO        NOT NULL NUMBER         
	NAME      NOT NULL VARCHAR2(34)   
	SUBJECT   NOT NULL VARCHAR2(1000) 
	CONTENT   NOT NULL CLOB           
	PWD       NOT NULL VARCHAR2(10)   
	REGDATE            DATE           
	HIT                NUMBER         
	FILENAME           VARCHAR2(1000) 
	FILESIZE           VARCHAR2(1000) 
	FILECOUNT          NUMBER  
 */

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
/*
 *    <input type="text" name="names[0]"/>
 *    <input type="text" name="names[1]"/>
 *    <input type="text" name="names[2]"/>
 *    <input type="text" name="names[3]"/>
 *    <input type="text" name="names[4]"/>
 *    
 *    <input type="text" name="names"/>
 *    <input type="text" name="names"/>
 *    <input type="text" name="names"/>
 *    <input type="text" name="names"/>
 *    <input type="text" name="names"/>
 *    
 *    ==> List<String> names;
 *    
 *    Arrays.asList(¹è¿­)
 */
public class DataBoardVO {
   private int no;
   private String name;
   private String subject;
   private String content;
   private String pwd;
   private Date regdate;
   private int hit;
   private String filename;
   private String filesize;
   private int filecount;
   private List<MultipartFile> files;
}








