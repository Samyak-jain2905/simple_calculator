package mypackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class myservletpro
 */
@WebServlet("/myservletpro")
public class myservletpro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
	        "Why do Java developers wear glasses? Because they don't C#!",
	        "I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
	        "Why don't programmers like nature? It has too many bugs.",
	        "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
	        // Add more jokes here
	    };
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myservletpro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str1=request.getParameter("num1");
		String str2=request.getParameter("num2");
		String str3=request.getParameter("bt1");
		
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int ans;
        if(str3.equals("1")) ans= a+b;
        else if(str3.equals("2")) ans= a-b;
        else if(str3.equals("3")) ans= a*b;
        else ans=a/b;
		// TODO Auto-generated method stub
        int randomidx=(int) (Math.random()*jokes.length);
        String randomjoke=jokes[randomidx];
		response.sendRedirect("newFile.jsp?ans="+ans+" &joke = "+ randomjoke);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
