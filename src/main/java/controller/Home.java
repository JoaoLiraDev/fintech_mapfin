package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Movimentacoes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.MovimentacoesDAO;

@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MovimentacoesDAO dao = new MovimentacoesDAO();
		String accountID = request.getParameter("account"); 
		System.out.println(accountID);
		ArrayList<Movimentacoes> mov = (ArrayList<Movimentacoes>) dao.listar(accountID);
		request.setAttribute("movs", mov);
		
		request.getRequestDispatcher("home.jsp").forward(request, response);
		
	}

	
	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub doGet(request, response); }
	 */

}
