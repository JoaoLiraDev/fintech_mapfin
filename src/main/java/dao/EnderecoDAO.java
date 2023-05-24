package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import core.DBManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EnderecoDAO {
    
    private Connection conexao;
  
    public void cadastrar(Endereco endereco) {
      PreparedStatement stmt = null;
  
      try {
    	    	  
        conexao = DBManager.getInstance().obterConexao();
        String sql = "INSERT INTO T_SOF_CLIENTE_ENDERECO(CEP, CIDADE, ESTADO, BAIRRO, NUMERO, REFERENCIA, COMPLEMENTO, T_SOF_CLIENTE_ID_CLIENTE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, endereco.getCEP());
        stmt.setString(2, endereco.getCIDADE());
        stmt.setString(3, endereco.getESTADO());
        stmt.setString(4, endereco.getBAIRRO());
        stmt.setString(5, endereco.getNUMERO());
        stmt.setString(6, endereco.getREFERENCIA());
        stmt.setString(7, endereco.getCOMPLEMENTO());
        stmt.setString(8, endereco.getT_SOF_CLIENTE_ID_CLIENTE());
  
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
    
    public List<Endereco> listar() {
    	
        //Cria uma lista de endereços
        List<Endereco> lista = new ArrayList<Endereco>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
          conexao = DBManager.getInstance().obterConexao();
        stmt = conexao.prepareStatement("SELECT * FROM T_SOF_CLIENTE_ENDERECO");
        rs = stmt.executeQuery();
      
        //Percorre todos os registros encontrados
        while (rs.next()) {
        	      	
        String CEP = rs.getString("CEP");
        String CIDADE = rs.getString("CIDADE");
        String ESTADO = rs.getString("ESTADO");
        String BAIRRO = rs.getString("BAIRRO");
        String NUMERO = rs.getString("NUMERO");
        String REFERENCIA = rs.getString("REFERENCIA");
        String COMPLEMENTO = rs.getString("COMPLEMENTO");
        String T_SOF_CLIENTE_ID_CLIENTE = rs.getString("T_SOF_CLIENTE_ID_CLIENTE");
       
        
            
        //Cria um objeto Colaborador com as informações encontradas
         Endereco endereco = new Endereco(CEP, CIDADE, ESTADO, BAIRRO, NUMERO, REFERENCIA, COMPLEMENTO, T_SOF_CLIENTE_ID_CLIENTE);
        
         //Adiciona o colaborador na lista
            lista.add(endereco);
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