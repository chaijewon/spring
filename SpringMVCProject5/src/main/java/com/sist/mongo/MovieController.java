package com.sist.mongo;

import org.rosuda.REngine.Rserve.RConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.dao.*;
import java.util.*;
@Controller
public class MovieController {
   @Autowired
   private MovieDAO dao;
   
   @RequestMapping("movie/list.do")
   public String movie_list(Model model,String page)
   {
	   if(page==null)
		   page="1";
	   int curpage=Integer.parseInt(page);
	   List<MovieVO> list=dao.movieListData(curpage);
	   int totalpage=dao.movieTotalPage();
	   
	   model.addAttribute("list", list);
	   model.addAttribute("curpage", curpage);
	   model.addAttribute("totalpage", totalpage);
	   return "movie/list";
   }
   @PostMapping("movie/find.do")
   public String movie_find(Model model,String fd)
   {
	   // DAO연결
	   List<MovieVO> list=dao.movieFindData(fd);
	   model.addAttribute("list", list);//request.setAttribute()
	   return "movie/find";
   }
   @GetMapping("movie/detail.do")
   public String movie_detail(Model model,int mno)
   {
	   // DAO연결 
	   // 결과값 => model(request)
	   MovieVO vo=dao.movieDetailData(mno);
	   model.addAttribute("vo", vo);
	   return "movie/detail";
   }
   
   // C:\springDev\springStudy\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\SpringMVCProject6\main
   
   
}







