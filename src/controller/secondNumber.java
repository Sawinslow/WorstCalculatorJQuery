package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculator;

/**
 * Servlet implementation class secondNumber
 */
@WebServlet("/secondNumber")
public class secondNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public secondNumber() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[] c=request.getCookies();
		String FirstNum = c[0].getValue();
		String secondNum = request.getParameter("secondNumber");
		double seperator = 0.0;
		Calculator project = new Calculator(Integer.parseInt(secondNum),Integer.parseInt(FirstNum)); 
		int number = project.getTotalNumber();
		request.setAttribute("Input",project );
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
	}

}
