package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.Cliente;
import core.DBManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO {
    
    private Connection conexao;
  
    public void cadastrar(Cliente cliente) {
      PreparedStatement stmt = null;
  
      try {
    	    	  
        conexao = DBManager.getInstance().obterConexao();
        String sql = "INSERT INTO T_SOF_CLIENTE(ID_CLIENTE, NM_CLIENTE, DS_EMAIL, DS_PASSWORD, DT_NASCIMENTO, NR_TELEFONE, DT_CRIACAO, DT_ATUALIZACAO) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, cliente.getID_CLIENTE());
        stmt.setString(2, cliente.getNM_CLIENTE());
        stmt.setString(3, cliente.getDS_EMAIL());
        stmt.setString(4, cliente.getDS_PASSWORD());
        java.sql.Date data = new java.sql.Date(cliente.getDT_NASCIMENTO().getTimeInMillis());
        stmt.setDate(5, data);
        stmt.setString(6, cliente.getNR_TELEFONE());
        java.sql.Date data2 = new java.sql.Date(cliente.getDT_CRIACAO().getTimeInMillis());
        stmt.setDate(7, data2);
        java.sql.Date data3 = new java.sql.Date(cliente.getDT_ATUALIZACAO().getTimeInMillis());
        stmt.setDate(8, data3);

  
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
    
    public List<Cliente> listar() {
    	
        //Cria uma lista de endereços
        List<Cliente> lista = new ArrayList<Cliente>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
          conexao = DBManager.getInstance().obterConexao();
        stmt = conexao.prepareStatement("SELECT * FROM T_SOF_CLIENTE");
        rs = stmt.executeQuery();
      
        //Percorre todos os registros encontrados
        while (rs.next()) {
        	      	
        String ID_CLIENTE = rs.getString("ID_CLIENTE");
        String NM_CLIENTE = rs.getString("NM_CLIENTE");
        String DS_EMAIL = rs.getString("DS_EMAIL");
        String DS_PASSWORD = rs.getString("DS_PASSWORD");
        java.sql.Date data = rs.getDate("DT_NASCIMENTO");
        Calendar DT_NASCIMENTO = Calendar.getInstance();
        DT_NASCIMENTO.setTimeInMillis(data.getTime());
        String NR_TELEFONE = rs.getString("NR_TELEFONE");
        java.sql.Date data2 = rs.getDate("DT_CRIACAO");
        Calendar DT_CRIACAO = Calendar.getInstance();
        DT_CRIACAO.setTimeInMillis(data2.getTime());
        java.sql.Date data3 = rs.getDate("DT_ATUALIZACAO");
        Calendar DT_ATUALIZACAO = Calendar.getInstance();
        DT_ATUALIZACAO.setTimeInMillis(data3.getTime());
        
        
            
        //Cria um objeto Colaborador com as informações encontradas
         Cliente cliente = new Cliente(ID_CLIENTE, NM_CLIENTE, DS_EMAIL, DS_PASSWORD, DT_NASCIMENTO, NR_TELEFONE, DT_CRIACAO, DT_ATUALIZACAO);
        
         //Adiciona o colaborador na lista
            lista.add(cliente);
          }
        } catch (SQLException e) {
          e.printStackTrace();
        }finally {
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
    
    public boolean validarUsuario(Cliente cliente) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = DBManager.getInstance().obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_SOF_CLIENTE WHERE DS_EMAIL = ? AND DS_PASSWORD = ?");
			stmt.setString(1, cliente.getDS_EMAIL());
			stmt.setString(2, cliente.getDS_PASSWORD());
			rs = stmt.executeQuery();

			if (rs.next()){
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
    
    public Cliente buscarPorEmail(String emailBusca) {
    	Cliente cliente = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = DBManager.getInstance().obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_SOF_CLIENTE WHERE DS_EMAIL = ?");
			stmt.setString(1, emailBusca);
			rs = stmt.executeQuery();

			if (rs.next()) {
				String ID_CLIENTE = rs.getString("ID_CLIENTE");
		        String NM_CLIENTE = rs.getString("NM_CLIENTE");
		        String DS_EMAIL = rs.getString("DS_EMAIL");
		        String DS_PASSWORD = rs.getString("DS_PASSWORD");
		        java.sql.Date data = rs.getDate("DT_NASCIMENTO");
		        Calendar DT_NASCIMENTO = Calendar.getInstance();
		        DT_NASCIMENTO.setTimeInMillis(data.getTime());
		        String NR_TELEFONE = rs.getString("NR_TELEFONE");
		        java.sql.Date data2 = rs.getDate("DT_CRIACAO");
		        Calendar DT_CRIACAO = Calendar.getInstance();
		        DT_CRIACAO.setTimeInMillis(data2.getTime());
		        java.sql.Date data3 = rs.getDate("DT_ATUALIZACAO");
		        Calendar DT_ATUALIZACAO = Calendar.getInstance();
		        DT_ATUALIZACAO.setTimeInMillis(data3.getTime());
				
				try {
					cliente = new Cliente(ID_CLIENTE, NM_CLIENTE, DS_EMAIL, DS_PASSWORD, DT_NASCIMENTO, NR_TELEFONE, DT_CRIACAO, DT_ATUALIZACAO);
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
		return cliente;
	}
    
    
    
  }