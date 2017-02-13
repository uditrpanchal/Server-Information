

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class serverinfo
 */
@WebServlet("/serverinfo")
public class serverinfo extends HttpServlet{


	 public String getServerInfoName(String serverInfo){
         
	        int slash = serverInfo.indexOf('/');
	        if(slash==-1)
	            return serverInfo;
	        else
	            return (String) serverInfo.subSequence(0,slash);
	    }
	 
	 public String getServerInfoVersion(String serverInfo){
         
	        int slash = serverInfo.indexOf('/');
	        if(slash==-1)
	            return null;
	        else
	            return serverInfo.substring(slash + 1);
	    }
	 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			// Set response content type
		response.setContentType("text/html");
		
		String title = "Server Information";
		String userServer = request.getParameter("user_server");
		String otherInformation = request.getParameter("other_information");
		String serverName = request.getServerName();
		String serverIP = request.getRequestURI().toString();
		String serverInfrastructure = getServerInfoName(getServletContext().getServerInfo());
		String serverVersion = getServerInfoVersion(getServletContext().getServerInfo());
		
		request.setAttribute("title", title);
		request.setAttribute("userServer", userServer);
		request.setAttribute("otherInformation", otherInformation);
		request.setAttribute("serverName", serverName);
		request.setAttribute("serverIP", serverIP);
		request.setAttribute("serverInfrastructure", serverInfrastructure);
		request.setAttribute("serverVersion", serverVersion);
		
		File file = new File("serverinfo.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
	
	writer.write("User Server Name : "+request.getParameter("user_server")+"\n"+
				 "Other Information : "+request.getParameter("other_information")+"\n"+
				 "Server Name : "+request.getServerName()+"\n"+
				 "Server IP Address : "+request.getRequestURI().toString()+"\n"+
				 "Server Infrastructure : "+getServerInfoName(getServletContext().getServerInfo())+"\n"+
				 "Server Version : "+getServerInfoVersion(getServletContext().getServerInfo()));
	
	writer.flush();
	writer.close();
	
	System.out.println(new File("").getAbsolutePath());
	
	request.getRequestDispatcher("/serverget.jsp").forward(request, response);
	
}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		FileReader fread = new FileReader("serverinfo.txt");
		BufferedReader bufferReader = new BufferedReader(fread);
		String contents;
		
			List<String> list = new ArrayList<String>();
			
			while((contents = bufferReader.readLine()) != null)
			{
				list.add(contents);
			}
			
			String title = "Using POST Method to Read Form Data from text file";
			String username[] = list.get(0).split(":");
			String otherInfo[] = list.get(1).split(":");
			String serverName[] = list.get(2).split(":");
			String serverIP[] = list.get(3).split(":");
			String serverInfra[] = list.get(4).split(":");
			String serverVersion[] = list.get(5).split(":");
			
			request.setAttribute("title", title);
			request.setAttribute("username0", username[0]);
			request.setAttribute("username1", username[1]);
			
			request.setAttribute("otherInfo0", otherInfo[0]);
			request.setAttribute("otherInfo1", otherInfo[1]);
			
			request.setAttribute("serverName0", serverName[0]);
			request.setAttribute("serverName1", serverName[1]);
			
			request.setAttribute("serverIP0", serverIP[0]);
			request.setAttribute("serverIP1", serverIP[1]);
			
			request.setAttribute("serverInfra0", serverInfra[0]);
			request.setAttribute("serverInfra1", serverInfra[1]);
			
			request.setAttribute("serverVersion0", serverVersion[0]);
			request.setAttribute("serverVersion1", serverVersion[1]);
			
		bufferReader.close();
		request.getRequestDispatcher("/serverRead.jsp").forward(request, response);
		
	}
	

}
