package core;
  
  import java.sql.Connection;
  import java.sql.DriverManager;

  
  public class DBManager {
	private static DBManager instance;
	
	private DBManager(){}
	
	public static DBManager getInstance(){
	    if (instance == null){
	      instance = new DBManager();
	    }
	    return instance;
	  }
	  
    public Connection obterConexao() {
      Connection conexao = null;

      try {
          Class.forName("oracle.jdbc.driver.OracleDriver");
          
          conexao = DriverManager.getConnection(
        		  "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM96368", "240203");
          
      } catch (Exception e) {
        e.printStackTrace();
      }
      return conexao;
    }
  
  }