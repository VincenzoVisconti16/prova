package login.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginRegister
 */
@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginRegister() {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String submitType = request.getParameter("submit");
		UtenteDAO userDAO = new UtenteDAOImpl();
		Utente user = userDAO.getUtente(username, password);

		if (submitType.equals("login") && user != null && user.getUsername() != null) {

			request.setAttribute("message", user.getUsername());
			request.getRequestDispatcher("homepage.jsp").forward(request, response);

		} else if (submitType.equals("register")) {

			user.setUsername(username);
			user.setFirstname(request.getParameter("firstname"));
			user.setLastname(request.getParameter("lastname"));
			user.setPassword(password);
			user.setPassword2(request.getParameter("password2"));
			user.setEmail(request.getParameter("email"));
			userDAO.insertUtente(user);

			request.setAttribute("successMessage", "Registration Done! Please, login to continue! ");
			request.getRequestDispatcher("login.jsp").forward(request, response);

		} else {
			request.setAttribute("unsuccessMessage", "Data Not Found, click on Register!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
