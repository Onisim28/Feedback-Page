package com.oni;

	import java.sql.SQLException;

	import javax.servlet.http.HttpServletRequest;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;
	
@Controller
public class Big_Controller {

		
	
		
		@RequestMapping("/addFeedback")
		public String addFeed(HttpServletRequest request, HttpServletRequest response) throws ClassNotFoundException, SQLException {
			
			String rate = request.getParameter("rating");
			
			int int_rate=Integer.parseInt(rate);
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String regarding=request.getParameter("regarding");
			String feedback_message=request.getParameter("msg");
			
			FeedbackDao dao=new FeedbackDao();
			
			dao.insert_information(name,email,regarding,feedback_message,int_rate);
			
			return "index.jsp";
			
		}
		
		
		
		
		
	}

