package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        stmt.setInt(3, conta.getACTIVE());
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
    
    public List<Conta> listar() {
    	
        //Cria uma lista de endereços
        List<Conta> lista = new ArrayList<Conta>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
          conexao = DBManager.getInstance().obterConexao();
        stmt = conexao.prepareStatement("SELECT * FROM T_SOF_CONTA");
        rs = stmt.executeQuery();
      
        //Percorre todos os registros encontrados
        while (rs.next()) {
        	      	
        String ID_CONTA = rs.getString("ID_CONTA");
        String NM_CONTA = rs.getString("NM_CONTA");
        int ACTIVE = rs.getInt("ACTIVE");
        float SALDO = rs.getFloat("SALDO");
        String T_SOF_CLIENTE_ID_CLIENTE = rs.getString("T_SOF_CLIENTE_ID_CLIENTE");
        
        //Cria um objeto Colaborador com as informações encontradas
         Conta conta = new Conta(ID_CONTA, NM_CONTA, ACTIVE, SALDO, T_SOF_CLIENTE_ID_CLIENTE);
        
         //Adiciona o colaborador na lista
            lista.add(conta);
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
    
  }