package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Conta;
import model.Endereco;
import util.AccountNumberGenerator;
import util.DateUtil;

import java.io.IOException;
import java.text.ParseException;
import java.util.UUID;

import dao.ClienteDAO;
import dao.ContaDAO;
import dao.EnderecoDAO;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClienteDAO daoCliente = new ClienteDAO();
		EnderecoDAO daoEndereco = new EnderecoDAO();
		ContaDAO daoConta= new ContaDAO();

		String nmCliente = request.getParameter("NM_CLIENTE");
		String dtNascimento = request.getParameter("DT_NASCIMENTO");
		String nrTelefone = request.getParameter("NR_TELEFONE");
		String dsEmail = request.getParameter("DS_EMAIL");
		String dsPassword = request.getParameter("DS_PASSWORD");
		String cep = request.getParameter("CEP");
		String cidade = request.getParameter("CIDADE");
		String estado = request.getParameter("ESTADO");
		String bairro = request.getParameter("BAIRRO");
		String numero = request.getParameter("NUMERO");
		String referencia = request.getParameter("REFERENCIA");
		String complemento = request.getParameter("COMPLEMENTO");

		try {
			Cliente cliente = new Cliente(nmCliente, dsEmail, dsPassword, new DateUtil().parseString(dtNascimento),
					nrTelefone);
			Endereco endereco = new Endereco(cep, cidade, estado, bairro, numero, referencia, complemento,
					UUID.fromString(cliente.getID_CLIENTE()));
			
			Conta conta = new Conta(new AccountNumberGenerator().generate(), UUID.fromString(cliente.getID_CLIENTE()));
			
			
			daoCliente.cadastrar(cliente);
			daoEndereco.cadastrar(endereco);
			daoConta.cadastrar(conta);
			
			response.sendRedirect("Login.jsp");
		} catch (ParseException e) {
			e.printStackTrace();
			request.setAttribute("erro", "Falha ao criar cadastro");
			request.getRequestDispatcher("register.jsp").forward(request, response);
			
		}

	}

}
