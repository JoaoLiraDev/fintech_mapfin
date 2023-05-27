package model;

import java.util.Date;
import java.util.UUID;

  public class Movimentacoes {
  
	private UUID ID_MOV = UUID.randomUUID();
       
    private String IN_TIPO;
    
    private String DS_DESCRICAO;
    
    private Date DT_VIGENCIA;
    
    private float VL_MOVIMENTACAO;
    
    private UUID T_SOF_CONTA_ID_CONTA;
    
    private UUID T_SOF_CATEGORIA_ID_CATEG;
      
        
    
    public Movimentacoes(String IN_TIPO, String DS_DESCRICAO, Date DT_VIGENCIA, float VL_MOVIMENTACAO, UUID T_SOF_CONTA_ID_CONTA, UUID T_SOF_CATEGORIA_ID_CATEG) {
    	
      super();
      this.IN_TIPO = IN_TIPO;
      this.DS_DESCRICAO = DS_DESCRICAO;
      this.DT_VIGENCIA = DT_VIGENCIA;
      this.VL_MOVIMENTACAO = VL_MOVIMENTACAO;
      this.T_SOF_CONTA_ID_CONTA = T_SOF_CONTA_ID_CONTA;
      this.T_SOF_CATEGORIA_ID_CATEG = T_SOF_CATEGORIA_ID_CATEG;

    }
    
    public Movimentacoes(UUID ID_MOV, String IN_TIPO, String DS_DESCRICAO, Date DT_VIGENCIA, float VL_MOVIMENTACAO, UUID T_SOF_CONTA_ID_CONTA, UUID T_SOF_CATEGORIA_ID_CATEG) {
    	
        super();
        this.ID_MOV = ID_MOV;
        this.IN_TIPO = IN_TIPO;
        this.DS_DESCRICAO = DS_DESCRICAO;
        this.DT_VIGENCIA = DT_VIGENCIA;
        this.VL_MOVIMENTACAO = VL_MOVIMENTACAO;
        this.T_SOF_CONTA_ID_CONTA = T_SOF_CONTA_ID_CONTA;
        this.T_SOF_CATEGORIA_ID_CATEG = T_SOF_CATEGORIA_ID_CATEG;

      }
  
    public Movimentacoes() {
      super();
    }

	public String getID_MOV() {
		return ID_MOV.toString();
	}

	public void setID_MOV(UUID ID_MOV) {
		this.ID_MOV = ID_MOV;
	}

	public String getIN_TIPO() {
		return IN_TIPO;
	}

	public void setIN_TIPO(String IN_TIPO) {
		this.IN_TIPO = IN_TIPO;
	}

	public String getDS_DESCRICAO() {
		return DS_DESCRICAO;
	}

	public void setDS_DESCRICAO(String DS_DESCRICAO) {
		this.DS_DESCRICAO = DS_DESCRICAO;
	}

	public Date getDT_VIGENCIA() {
		return DT_VIGENCIA;
	}

	public void setDT_VIGENCIA(Date DT_VIGENCIA) {
		this.DT_VIGENCIA = DT_VIGENCIA;
	}

	public float getVL_MOVIMENTACAO() {
		return VL_MOVIMENTACAO;
	}

	public void setVL_MOVIMENTACAO(float VL_MOVIMENTACAO) {
		this.VL_MOVIMENTACAO = VL_MOVIMENTACAO;
	}

	public String getT_SOF_CONTA_ID_CONTA() {
		return T_SOF_CONTA_ID_CONTA.toString();
	}

	public void setT_SOF_CONTA_ID_CONTA(UUID T_SOF_CONTA_ID_CONTA) {
		this.T_SOF_CONTA_ID_CONTA = T_SOF_CONTA_ID_CONTA;
	}

	public String getT_SOF_CATEGORIA_ID_CATEG() {
		return T_SOF_CATEGORIA_ID_CATEG.toString();
	}

	public void setT_SOF_CATEGORIA_ID_CATEGORIA(UUID T_SOF_CATEGORIA_ID_CATEG) {
		this.T_SOF_CATEGORIA_ID_CATEG = T_SOF_CATEGORIA_ID_CATEG;
	}
    
  }