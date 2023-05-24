package model;

import java.util.Calendar;

import core.Criptografia;

public class Cliente {
  
    private String ID_CLIENTE;
          
    private String NM_CLIENTE;
        
    private String DS_EMAIL;
    
    private String DS_PASSWORD;
    
    private Calendar DT_NASCIMENTO;
    
    private String NR_TELEFONE;
    
    private Calendar DT_CRIACAO;
    
    private Calendar DT_ATUALIZACAO;
    
    public Cliente(String ID_CLIENTE, String NM_CLIENTE, String DS_EMAIL, String DS_PASSWORD, Calendar DT_NASCIMENTO, String NR_TELEFONE, Calendar DT_CRIACAO, Calendar DT_ATUALIZACAO) {
    	
      super();
      this.ID_CLIENTE = ID_CLIENTE;
      this.NM_CLIENTE = NM_CLIENTE;
      this.DS_EMAIL = DS_EMAIL;
      this.setPASSWORD(DS_PASSWORD);
      this.DT_NASCIMENTO = DT_NASCIMENTO;
      this.NR_TELEFONE = NR_TELEFONE;
      this.DT_CRIACAO = DT_CRIACAO;
      this.DT_ATUALIZACAO = DT_ATUALIZACAO;

    }
    
    public Cliente(String DS_EMAIL, String DS_PASSWORD) {
    	super();
    	this.DS_EMAIL = DS_EMAIL;
    	this.setPASSWORD(DS_PASSWORD);
    }
  
    public Cliente() {
      super();
    }

	public String getID_CLIENTE() {
		return ID_CLIENTE;
	}

	public void setID_CLIENTE(String ID_CLIENTE) {
		this.ID_CLIENTE = ID_CLIENTE;
	}

	public String getNM_CLIENTE() {
		return NM_CLIENTE;
	}

	public void setNM_CLIENTE(String NM_CLIENTE) {
		this.NM_CLIENTE = NM_CLIENTE;
	}

	public String getDS_EMAIL() {
		return DS_EMAIL;
	}

	public void setDS_EMAIL(String DS_EMAIL) {
		this.DS_EMAIL = DS_EMAIL;
	}

	public String getDS_PASSWORD() {
		return DS_PASSWORD;
	}

	public void setPASSWORD(String DS_PASSWORD) {
		try {
			this.DS_PASSWORD = Criptografia.criptografar(DS_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public Calendar getDT_NASCIMENTO() {
		return DT_NASCIMENTO;
	}

	public void setDT_NASCIMENTO(Calendar DT_NASCIMENTO) {
		this.DT_NASCIMENTO = DT_NASCIMENTO;
	}

	public String getNR_TELEFONE() {
		return NR_TELEFONE;
	}

	public void setNR_TELEFONE(String NR_TELEFONE) {
		this.NR_TELEFONE = NR_TELEFONE;
	}

	public Calendar getDT_CRIACAO() {
		return DT_CRIACAO;
	}

	public void setDT_CRIACAO(Calendar DT_CRIACAO) {
		this.DT_CRIACAO = DT_CRIACAO;
	}

	public Calendar getDT_ATUALIZACAO() {
		return DT_ATUALIZACAO;
	}

	public void setDT_ATUALIZACAO(Calendar DT_ATUALIZACAO) {
		this.DT_ATUALIZACAO = DT_ATUALIZACAO;
	}

    
  }