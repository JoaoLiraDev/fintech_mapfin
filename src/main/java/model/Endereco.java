package model;

import java.util.UUID;

public class Endereco {
  
    private String CEP;
          
    private String CIDADE;
        
    private String ESTADO;
    
    private String BAIRRO;

    private String NUMERO;
    
    private String REFERENCIA;
    
    private String COMPLEMENTO;
    
    private UUID T_SOF_CLIENTE_ID_CLIENTE;
    
    public Endereco(String CEP, String CIDADE, String ESTADO, String BAIRRO, String NUMERO, String REFERENCIA, String COMPLEMENTO, UUID T_SOF_CLIENTE_ID_CLIENTE) {
    	
      super();
      this.CEP = CEP;
      this.CIDADE = CIDADE;
      this.ESTADO = ESTADO;
      this.BAIRRO = BAIRRO;
      this.NUMERO = NUMERO;
      this.REFERENCIA = REFERENCIA;
      this.COMPLEMENTO = COMPLEMENTO;
      this.T_SOF_CLIENTE_ID_CLIENTE = T_SOF_CLIENTE_ID_CLIENTE;
    }
  
    public Endereco() {
      super();
    }

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String CEP) {
		this.CEP = CEP;
	}

	public String getCIDADE() {
		return CIDADE;
	}

	public void setCIDADE(String CIDADE) {
		this.CIDADE = CIDADE;
	}

	public String getESTADO() {
		return ESTADO;
	}

	public void setESTADO(String ESTADO) {
		this.ESTADO = ESTADO;
	}

	public String getBAIRRO() {
		return BAIRRO;
	}

	public void setBAIRRO(String BAIRRO) {
		this.BAIRRO = BAIRRO;
	}

	public String getNUMERO() {
		return NUMERO;
	}

	public void setNUMERO(String NUMERO) {
		this.NUMERO = NUMERO;
	}

	public String getREFERENCIA() {
		return REFERENCIA;
	}

	public void setREFERENCIA(String REFERENCIA) {
		this.REFERENCIA = REFERENCIA;
	}

	public String getCOMPLEMENTO() {
		return COMPLEMENTO;
	}

	public void setCOMPLEMENTO(String COMPLEMENTO) {
		this.COMPLEMENTO = COMPLEMENTO;
	}

	public String getT_SOF_CLIENTE_ID_CLIENTE() {
		return T_SOF_CLIENTE_ID_CLIENTE.toString();
	}

	public void setT_SOF_CLIENTE_ID_CLIENTE(UUID T_SOF_CLIENTE_ID_CLIENTE) {
		this.T_SOF_CLIENTE_ID_CLIENTE = T_SOF_CLIENTE_ID_CLIENTE;
	}

    
  }