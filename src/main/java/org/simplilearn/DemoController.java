package org.simplilearn;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoController {


	                              // We will be changing the datatype from String to ModelAndView datatype and 
	                              //the ResponseBody will be removed when using datatype ModelAndView

	@RequestMapping("/add")       
public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
ModelAndView mv=new ModelAndView();
int result=Integer.parseInt(request.getParameter("no.1"))+Integer.parseInt(request.getParameter("no.2"));
mv.setViewName("display.jsp");
mv.addObject("result",result);	
	return mv;
	}
	



@ResponseBody                     //ResponseBody is used to get the response on the virtual page
    @RequestMapping("/sub")
public String sub(HttpServletRequest request,HttpServletResponse response) {
int result=Integer.parseInt(request.getParameter("no.1"))-Integer.parseInt(request.getParameter("no.2"));
return "the sub is" +result;
}

  }
