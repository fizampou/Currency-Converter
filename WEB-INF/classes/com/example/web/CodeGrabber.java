package com.example.web;
import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;

public class CodeGrabber extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException {
					
		response.setContentType("application/zip");
		ServletContext ctx = getServletContext();
		InputStream is = ctx.getResourceAsStream("/Project2.zip");
		int read = 0;
		byte[] bytes = new byte[1024];

		OutputStream os = response.getOutputStream();
		while((read = is.read(bytes)) != -1){
			os.write(bytes,0,read);
		}
		os.flush();
		os.close();
	}
}
