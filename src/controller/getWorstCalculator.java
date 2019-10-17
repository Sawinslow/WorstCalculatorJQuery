package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Calculator;

/**
 * Servlet implementation class getWorstCalculator
 */
@WebServlet("/getWorstCalculator")
public class getWorstCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getWorstCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstNum = request.getParameter("firstNumber");
		Cookie c1=new Cookie("firstNumber", firstNum);
		response.addCookie(c1);

		getServletContext().getRequestDispatcher("/SecondNumber.jsp").forward(request, response);

	}

}
