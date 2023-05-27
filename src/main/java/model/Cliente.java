package model;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import core.Criptografia;

public class Cliente {
  
    private UUID ID_CLIENTE;
          
    private String NM_CLIENTE;
        
    private String DS_EMAIL;
    
    private String DS_PASSWORD;
    
    private Date DT_NASCIMENTO;
    
    private String NR_TELEFONE;
    
    private Date DT_CRIACAO;
    
    private Date DT_ATUALIZACAO;
    
    public Cliente(UUID ID_CLIENTE, String NM_CLIENTE, String DS_EMAIL, String DS_PASSWORD, Date DT_NASCIMENTO, String NR_TELEFONE, Date DT_CRIACAO, Date DT_ATUALIZACAO) {
    	
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
		return ID_CLIENTE.toString();
	}

	public void setID_CLIENTE(UUID ID_CLIENTE) {
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

	public Date getDT_NASCIMENTO() {
		return DT_NASCIMENTO;
	}

	public void setDT_NASCIMENTO(Date DT_NASCIMENTO) {
		this.DT_NASCIMENTO = DT_NASCIMENTO;
	}

	public String getNR_TELEFONE() {
		return NR_TELEFONE;
	}

	public void setNR_TELEFONE(String NR_TELEFONE) {
		this.NR_TELEFONE = NR_TELEFONE;
	}

	public Date getDT_CRIACAO() {
		return DT_CRIACAO;
	}

	public void setDT_CRIACAO(Date DT_CRIACAO) {
		this.DT_CRIACAO = DT_CRIACAO;
	}

	public Date getDT_ATUALIZACAO() {
		return DT_ATUALIZACAO;
	}

	public void setDT_ATUALIZACAO(Date DT_ATUALIZACAO) {
		this.DT_ATUALIZACAO = DT_ATUALIZACAO;
	}

    
  }