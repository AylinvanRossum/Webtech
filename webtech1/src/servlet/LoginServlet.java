package servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        init();
    }
    
    @Override
    public void init() {

    }
    
    @Override
    public void destroy() {
    	
    }
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String method = request.getMethod();
    	System.out.println("are you called?");
    	if(method.equals("GET")) {
    		doGet(request, response);
    	} else if (method.equals("POST")) {
    		doPost(request,response);
    	} 
    }
    
    
    
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.getParameter("Username");
		getServletContext().getRequestDispatcher("/Login.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext henk = null;
		String name = request.toString();
		System.out.println(name);
		if(name.equals("register")) {
			getServletContext().getRequestDispatcher("/register.html").forward(request, response);
		} else if (name.equals("submit")) {
			System.out.println("niet registreren");
		}
	
	}

}
