package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Cliente;
import model.Conta;
import model.Movimentacoes;

import java.io.IOException;
import java.util.ArrayList;

import dao.ClienteDAO;
import dao.ContaDAO;
import dao.MovimentacoesDAO;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClienteDAO daoCliente = new ClienteDAO();
		ContaDAO daoConta = new ContaDAO();
		MovimentacoesDAO dao = new MovimentacoesDAO();
		
		String email = request.getParameter("email");
		String senha = request.getParameter("password");
		
		Cliente usuario = new Cliente(email, senha);
		
		if (daoCliente.validarUsuario(usuario)) {
			HttpSession session = request.getSession();
			Cliente cliente = daoCliente.buscarPorEmail(email);
			Conta conta = daoConta.buscarPorId(cliente.getID_CLIENTE());
			
			ArrayList<Movimentacoes> mov = (ArrayList<Movimentacoes>) dao.listar(conta.getID_CONTA());
			session.setAttribute("movs", mov);
			session.setAttribute("cliente", cliente);
			session.setAttribute("conta", conta);
			response.sendRedirect("home.jsp?customer=" + cliente.getID_CLIENTE() + "&account=" + conta.getID_CONTA());
		}else {
			request.setAttribute("erro", "Usuário e/ou senha inválidos");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	
	}

}