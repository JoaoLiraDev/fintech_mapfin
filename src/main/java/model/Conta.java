package model;
  
 
  public class Conta {
  
    private String ID_CONTA;
          
    private String NM_CONTA;
        
    private int ACTIVE;
    
    private float SALDO;
    
    private String T_SOF_CLIENTE_ID_CLIENTE;
    
    
    public Conta(String ID_CONTA, String NM_CONTA, int ACTIVE, float SALDO, String T_SOF_CLIENTE_ID_CLIENTE) {
    	
      super();
      this.ID_CONTA = ID_CONTA;
      this.NM_CONTA = NM_CONTA;
      this.ACTIVE = ACTIVE;
      this.SALDO = SALDO;
      this.T_SOF_CLIENTE_ID_CLIENTE = T_SOF_CLIENTE_ID_CLIENTE; 

    }
  
    public Conta() {
      super();
    }

	public String getID_CONTA() {
		return ID_CONTA;
	}

	public void setID_CONTA(String ID_CONTA) {
		this.ID_CONTA = ID_CONTA;
	}

	public String getNM_CONTA() {
		return NM_CONTA;
	}

	public void setNM_CONTA(String NM_CONTA) {
		this.NM_CONTA = NM_CONTA;
	}

	public int getACTIVE() {
		return ACTIVE;
	}

	public void setACTIVE(int ACTIVE) {
		this.ACTIVE = ACTIVE;
	}

	public float getSALDO() {
		return SALDO;
	}

	public void setSALDO(float SALDO) {
		this.SALDO = SALDO;
	}

	public String getT_SOF_CLIENTE_ID_CLIENTE() {
		return T_SOF_CLIENTE_ID_CLIENTE;
	}

	public void setT_SOF_CLIENTE_ID_CLIENTE(String T_SOF_CLIENTE_ID_CLIENTE) {
		this.T_SOF_CLIENTE_ID_CLIENTE = T_SOF_CLIENTE_ID_CLIENTE;
	}

    
  }