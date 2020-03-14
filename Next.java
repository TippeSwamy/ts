package e1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Next extends HttpServlet {
	
String id1;
String name1;
String role1;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			response.sendRedirect("/employee/back.html");
		 id1=request.getParameter("id");
		name1=request.getParameter("name");
	  role1=request.getParameter("role");
		
		demo d=new demo();
		d.insertion(id1,name1,role1);
	}

}
