package com.example.model;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class GoogleCurrency{
       public String GetCurrency(String from, String to, String amount) throws IOException{
 
			String googleResults = "http://www.google.com/ig/calculator?hl=en&q=";
			URL link = new URL(googleResults + amount + from + "=?" + to);
			BufferedReader in = new BufferedReader(new InputStreamReader(link.openStream()));

			googleResults=null;
			googleResults= in.readLine();
			in.close();

			int rhs = googleResults.indexOf("rhs",7);
			int emptySt = googleResults.indexOf(" ",rhs+6);
			String result = googleResults.substring(rhs+6,emptySt);
			return(result);

		}
}
