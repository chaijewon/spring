package com.sist.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import com.sist.dao.*;
@Controller
public class BoardController {
   @Autowired
   private BoardDAO dao;
   
   @GetMapping("board/list.do")
   public String board_list(Model model,String page)
   {
	   // 매개변수 => 사용자의 요청값을 받는다 
	   if(page==null)
		   page="1";
	   int curpage=Integer.parseInt(page);
	   //int curpage=page;
	   int rowSize=10;
	   int start=(rowSize*curpage)-(rowSize-1);
	   int end=rowSize*curpage;
	   
	   Map map=new HashMap();
	   map.put("start", start);
	   map.put("end", end);
	   List<BoardVO> list=dao.boardListData(map);
	   int totalpage=dao.boardTotalPage();
	   //////// 요청에 대한 처리
	   
	   model.addAttribute("list", list);
	   model.addAttribute("curpage", curpage);
	   model.addAttribute("totalpage", totalpage);
	   //// 처리된 결과값 전송 
	   
	   return "board/list";
   }
   // http://localhost/myapp/board/insert.do
   @GetMapping("board/insert.do")
   public String board_insert()
   {
	   return "board/insert";
   }
   
   @PostMapping("board/insert_ok.do")
   public String board_insert_ok(BoardVO vo)
   {
	   // dao연결 
	   dao.boardInsert(vo);
	   return "redirect:../board/list.do";
   }
   
   @GetMapping("board/detail.do")
   public String board_detail(Model model,int no)
   {
	   BoardVO vo=dao.boardDetailData(no);
	   model.addAttribute("vo", vo);
	   return "board/detail";
   }
   
   @GetMapping("board/update.do")
   public String board_update(Model model,int no)
   {
	   BoardVO vo=dao.boardUpdateData(no);
	   model.addAttribute("vo", vo);
	   return "board/update";
   }
   
   @GetMapping("board/delete.do")
   public String board_delete(Model model,int no)
   {
	   model.addAttribute("no", no);
	   return "board/delete";
   }
   
}












