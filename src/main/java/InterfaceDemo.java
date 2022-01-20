

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InterfaceDemo
 */
@WebServlet("/InterfaceDemo")
public class InterfaceDemo implements Servlet {
    
    ServletConfig config=null;
      public void init(ServletConfig config){
          this.config=config;
          System.out.println("Initialization complete");
       }

       public void service1(ServletRequest req,ServletResponse res) throws IOException{
           res.setContentType("text/html");
           PrintWriter pwriter=res.getWriter();
           pwriter.print("<html>");
           pwriter.print("<body>");
           pwriter.print("In the service() method<br>");
           pwriter.print("</body>");
           pwriter.print("</html>");
       }
       public void destroy(){
           System.out.println("In destroy() method");
       }
       public ServletConfig getServletConfig(){
           return config;
       }
       public String getServletInfo(){
           return "This is a sample servlet info";
       }

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}
