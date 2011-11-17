package com.example.web;
import com.example.model.*;
import java.io.*;
import javax.servlet.*;
import java.io.InputStream;
import javax.servlet.http.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.lang.*;
import java.util.*;

public class currencyconverter extends HttpServlet{

        public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
			//response.setContentType("text;charset=UTF-8");
           	//response.setContentType("text/html;charset=UTF-8");
			String amount = request.getParameter("amount");
           	String from = request.getParameter("from");
			String to = request.getParameter("to");


			GoogleCurrency result = new GoogleCurrency();

			String results = result.GetCurrency(from,to,amount);	

			//out.println(results);
		
			//response.getWriter().println("H timi pou valate einai : "+results);
			
			request.setAttribute("currency", results);
			request.setAttribute("value", amount);
			request.setAttribute("from", from);
			request.setAttribute("to", to);
			
			
			//ayto gia na pairno tin timi stin index kai na min allazo selida//
			//akoma xreiazete na pernao ola ta inputs giati ousiastika kanei refresh i arxiki prin ta tiposei//
			RequestDispatcher view = request.getRequestDispatcher("index.jsp");
			view.forward(request,response);


			//return(results);
			//request.setAttribute("currency",results);
			//RequestDispatcher view = request.getRequestDispatcher("index.jsp");
			//view.forward(request,response);
			
}

}
