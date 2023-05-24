package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Categoria;
import core.DBManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CategoriaDAO {
    
    private Connection conexao;
  
    public void cadastrar(Categoria categoria) {
      PreparedStatement stmt = null;
  
      try {
    	    	  
        conexao = DBManager.getInstance().obterConexao();
        String sql = "INSERT INTO T_SOF_CATEGORIA(ID_CATEGORIA, NM_CATEGORIA) VALUES (?, ?)";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, categoria.getID_CATEGORIA());
        stmt.setString(2, categoria.getNM_CATEGORIA());

  
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
    
    public List<Categoria> listar() {
    	
        //Cria uma lista de endereços
        List<Categoria> lista = new ArrayList<Categoria>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
          conexao = DBManager.getInstance().obterConexao();
        stmt = conexao.prepareStatement("SELECT * FROM T_SOF_CATEGORIA");
        rs = stmt.executeQuery();
      
        //Percorre todos os registros encontrados
        while (rs.next()) {
        	      	
        String ID_CATEGORIA = rs.getString("ID_CATEGORIA");
        String NM_CATEGORIA = rs.getString("NM_CATEGORIA");
        
        //Cria um objeto Colaborador com as informações encontradas
         Categoria categoria = new Categoria(ID_CATEGORIA, NM_CATEGORIA);
        
         //Adiciona o colaborador na lista
            lista.add(categoria);
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