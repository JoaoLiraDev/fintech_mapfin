package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.Movimentacoes;
import core.DBManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MovimentacoesDAO {
    
    private Connection conexao;
  
    public void cadastrar(Movimentacoes movimentacoes) {
      PreparedStatement stmt = null;
  
      try {  	  
        conexao = DBManager.getInstance().obterConexao();
        String sql = "INSERT INTO T_SOF_MOVIMENTACOES(ID_MOV, IN_TIPO, DS_DESCRICAO, DT_VIGENCIA, VL_MOVIMENTACAO, T_SOF_CONTA_ID_CONTA, T_SOF_CATEGORIA_ID_CATEG) VALUES (?, ?, ?, ?, ?, ?, ?)";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, movimentacoes.getID_MOV());
        stmt.setString(2, movimentacoes.getIN_TIPO());
        stmt.setString(3, movimentacoes.getDS_DESCRICAO());
        java.sql.Date data = new java.sql.Date(movimentacoes.getDT_VIGENCIA().getTimeInMillis());
        stmt.setDate(4, data);
        stmt.setFloat(5, movimentacoes.getVL_MOVIMENTACAO());
        stmt.setString(6, movimentacoes.getT_SOF_CONTA_ID_CONTA());
        stmt.setString(7, movimentacoes.getT_SOF_CATEGORIA_ID_CATEG());

  
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
    
    public List<Movimentacoes> listar(String id) {
    	
        //Cria uma lista de endereços
        List<Movimentacoes> lista = new ArrayList<Movimentacoes>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
          conexao = DBManager.getInstance().obterConexao();
        stmt = conexao.prepareStatement("SELECT * FROM T_SOF_MOVIMENTACOES WHERE T_SOF_CONTA_ID_CONTA = ?");
        stmt.setString(1, id);
        rs = stmt.executeQuery();
      
        //Percorre todos os registros encontrados
        while (rs.next()) {
        	      	
        String ID_MOV = rs.getString("ID_MOV");
        String IN_TIPO = rs.getString("IN_TIPO");
        String DS_DESCRICAO = rs.getString("DS_DESCRICAO");
        java.sql.Date data = rs.getDate("DT_VIGENCIA");
        Calendar DT_VIGENCIA = Calendar.getInstance();
        DT_VIGENCIA.setTimeInMillis(data.getTime());
        float VL_MOVIMENTACAO = rs.getFloat("VL_MOVIMENTACAO");
        String T_SOF_CONTA_ID_CONTA = rs.getString("T_SOF_CONTA_ID_CONTA");
        String T_SOF_CATEGORIA_ID_CATEG = rs.getString("T_SOF_CATEGORIA_ID_CATEG");
        
        //Cria um objeto Colaborador com as informações encontradas
         Movimentacoes movimentacoes = new Movimentacoes(ID_MOV, IN_TIPO, DS_DESCRICAO, DT_VIGENCIA, VL_MOVIMENTACAO, T_SOF_CONTA_ID_CONTA, T_SOF_CATEGORIA_ID_CATEG);
        
         //Adiciona o colaborador na lista
            lista.add(movimentacoes);
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