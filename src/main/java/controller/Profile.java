package controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import util.DateUtil;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.UUID;

import dao.ClienteDAO;
import dao.ContaDAO;
import dao.EnderecoDAO;

@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ClienteDAO daoCliente = new ClienteDAO();
		ServletContext context = getServletContext();
		Cliente cliente = (Cliente) context.getAttribute("cliente");

		String nmCliente = request.getParameter("NM_CLIENTE");
		String dtNascimento = request.getParameter("DT_NASCIMENTO");
		String nrTelefone = request.getParameter("NR_TELEFONE");
		String dsEmail = request.getParameter("DS_EMAIL");
		String dsPassword = request.getParameter("DS_PASSWORD");

		try {
			cliente.setDS_EMAIL(dsEmail);
			cliente.setPASSWORD(dsPassword);
			cliente.setDT_NASCIMENTO(new DateUtil().parseString(dtNascimento));
			cliente.setNM_CLIENTE(nmCliente);
			cliente.setNR_TELEFONE(nrTelefone);
			cliente.setDT_ATUALIZACAO(new Date());
			
			daoCliente.atualizar(cliente);
			request.setAttribute("success", "Dados atualizados com sucesso!");
			request.getRequestDispatcher("profile.jsp").forward(request, response);
		} catch (ParseException e) {
			e.printStackTrace();
			request.setAttribute("erro", "Falha ao atualizar dados");
			request.getRequestDispatcher("profile.jsp").forward(request, response);
		}

	}

}
