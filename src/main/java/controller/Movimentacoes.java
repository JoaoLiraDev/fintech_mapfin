package controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Cliente;
import model.Conta;
import util.DateUtil;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import dao.ContaDAO;
import dao.MovimentacoesDAO;

@WebServlet("/Movimentacoes")
public class Movimentacoes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		MovimentacoesDAO daoMov = new MovimentacoesDAO();
		ContaDAO daoConta = new ContaDAO();
		ServletContext context = getServletContext();

		String type = request.getParameter("type");
		String valor_mov = request.getParameter("valor_mov");
		String categoria = request.getParameter("categoria");
		String dt_vigencia = request.getParameter("dt_vigencia");
		String descricao = request.getParameter("descricao");
		Cliente cliente = (Cliente) context.getAttribute("cliente");
		Conta conta = (Conta) context.getAttribute("conta");

		model.Movimentacoes mov;
		try {
			mov = new model.Movimentacoes(type, descricao, new DateUtil().parseString(dt_vigencia),
					Float.parseFloat(valor_mov), UUID.fromString(conta.getID_CONTA()), UUID.fromString(categoria));
			conta.setSALDO(Float.parseFloat(valor_mov), type);
			daoMov.cadastrar(mov);
			daoConta.atualizarSaldo(conta);
		} catch (NumberFormatException | ParseException e) {
			e.printStackTrace();
		}

		List<model.Movimentacoes> movs = daoMov.listar(conta.getID_CONTA());
		session.setAttribute("movs", movs);

		response.sendRedirect("home.jsp?customer=" + cliente.getID_CLIENTE() + "&account=" + conta.getID_CONTA());

	}

}
