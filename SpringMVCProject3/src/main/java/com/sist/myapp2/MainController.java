package com.sist.myapp2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main/")
// [{키:값,키:값},{}...]
public class MainController {
   @RequestMapping("main.do")
   // http://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do
   public String main_main(Model model)
   {
	   
	   model.addAttribute("main_jsp", "default.jsp");
	   return "main/main";
   }
}
