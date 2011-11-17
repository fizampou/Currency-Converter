package com.example.web;
import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class listener extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{

			Direct direct = (Direct)getServletContext().getAttribute("direct");
			response.sendRedirect(direct.getReport());
	}
}
