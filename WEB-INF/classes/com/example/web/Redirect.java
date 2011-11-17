package com.example.web;
import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.io.Reader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStreamReader;

public class Redirect extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException {
			response.sendRedirect(getServletContext().getInitParameter("report"));
	}
}
