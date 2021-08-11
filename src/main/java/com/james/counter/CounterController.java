package com.james.counter;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String home(HttpSession session){
		if(session.getAttribute("count") ==null) {
			session.setAttribute("count", 0);
		}
		int x = (int)session.getAttribute("count");
		session.setAttribute("count", ++x);
		
		return "home.jsp";
	}
	@RequestMapping("/counter")
	public String counter() {
		return "counter.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.removeAttribute("count");
		return "home.jsp";
	}

}
