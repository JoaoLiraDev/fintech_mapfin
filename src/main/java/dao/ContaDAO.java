package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import model.Conta;
import core.DBManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ContaDAO {

	private Connection conexao;

	public void cadastrar(Conta conta) {
		PreparedStatement stmt = null;

		try {

			conexao = DBManager.getInstance().obterConexao();
			String sql = "INSERT INTO T_SOF_CONTA(ID_CONTA, NM_CONTA, ACTIVE, SALDO, T_SOF_CLIENTE_ID_CLIENTE) VALUES (?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, conta.getID_CONTA());
			stmt.setString(2, conta.getNM_CONTA());
			stmt.setBoolean(3, conta.getACTIVE());
			stmt.setFloat(4, conta.getSALDO());
			stmt.setString(5, conta.getT_SOF_CLIENTE_ID_CLIENTE());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void atualizarSaldo(Conta conta) {
		PreparedStatement stmt = null;

		try {
			conexao = DBManager.getInstance().obterConexao();
			String sql = "UPDATE T_SOF_CONTA SET SALDO=? WHERE ID_CONTA=?";
			stmt = conexao.prepareStatement(sql);
			stmt.setFloat(1, conta.getSALDO());
			stmt.setString(2, conta.getID_CONTA());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<Conta> listar() {

		List<Conta> lista = new ArrayList<Conta>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conexao = DBManager.getInstance().obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_SOF_CONTA");
			rs = stmt.executeQuery();

			while (rs.next()) {

				String ID_CONTA = rs.getString("ID_CONTA");
				String NM_CONTA = rs.getString("NM_CONTA");
				Boolean ACTIVE = rs.getBoolean("ACTIVE");
				float SALDO = rs.getFloat("SALDO");
				String T_SOF_CLIENTE_ID_CLIENTE = rs.getString("T_SOF_CLIENTE_ID_CLIENTE");

				Conta conta = new Conta(UUID.fromString(ID_CONTA), NM_CONTA, ACTIVE, SALDO,
						UUID.fromString(T_SOF_CLIENTE_ID_CLIENTE));

				lista.add(conta);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}

	public Conta buscarPorId(String codigoBusca) {
		Conta Conta = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = DBManager.getInstance().obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_SOF_CONTA WHERE T_SOF_CLIENTE_ID_CLIENTE = ?");
			stmt.setString(1, codigoBusca);
			rs = stmt.executeQuery();

			if (rs.next()) {
				String ID_CONTA = rs.getString("ID_CONTA");
				String NM_CONTA = rs.getString("NM_CONTA");
				Boolean ACTIVE = rs.getBoolean("ACTIVE");
				float SALDO = rs.getFloat("SALDO");
				String T_SOF_CLIENTE_ID_CLIENTE = rs.getString("T_SOF_CLIENTE_ID_CLIENTE");

				// Cria um objeto Colaborador com as informações encontradas
				try {
					Conta = new Conta(UUID.fromString(ID_CONTA), NM_CONTA, ACTIVE, SALDO,
							UUID.fromString(T_SOF_CLIENTE_ID_CLIENTE));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return Conta;
	}
}