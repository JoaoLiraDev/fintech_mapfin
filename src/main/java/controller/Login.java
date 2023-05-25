package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Cliente;
import model.Conta;

import java.io.IOException;

import dao.ClienteDAO;
import dao.ContaDAO;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClienteDAO daoCliente = new ClienteDAO();
		ContaDAO daoConta = new ContaDAO();
		
		String email = request.getParameter("email");
		String senha = request.getParameter("password");
		
		Cliente usuario = new Cliente(email, senha);
		
		if (daoCliente.validarUsuario(usuario)) {
			HttpSession session = request.getSession();
			Cliente cliente = daoCliente.buscarPorEmail(email);
			Conta conta = daoConta.buscarPorId(cliente.getID_CLIENTE());
			
			session.setAttribute("cliente", cliente);
			session.setAttribute("conta", conta);
			response.sendRedirect("home.jsp?customer=" + cliente.getID_CLIENTE() + "&account=" + conta.getID_CONTA());
		}else {
			request.setAttribute("erro", "Usuário e/ou senha inválidos");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	
	}

}