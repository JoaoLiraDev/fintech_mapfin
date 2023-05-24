package model;

import java.util.Calendar;
  
 
  public class Movimentacoes {
  
    private String ID_MOV;
       
    private String IN_TIPO;
    
    private String DS_DESCRICAO;
    
    private Calendar DT_VIGENCIA;
    
    private float VL_MOVIMENTACAO;
    
    private String T_SOF_CONTA_ID_CONTA;
    
    private String T_SOF_CATEGORIA_ID_CATEG;
      
        
    
    public Movimentacoes(String ID_MOV, String IN_TIPO, String DS_DESCRICAO, Calendar DT_VIGENCIA, float VL_MOVIMENTACAO, String T_SOF_CONTA_ID_CONTA, String T_SOF_CATEGORIA_ID_CATEG) {
    	
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
		return ID_MOV;
	}

	public void setID_MOV(String ID_MOV) {
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

	public Calendar getDT_VIGENCIA() {
		return DT_VIGENCIA;
	}

	public void setDT_VIGENCIA(Calendar DT_VIGENCIA) {
		this.DT_VIGENCIA = DT_VIGENCIA;
	}

	public float getVL_MOVIMENTACAO() {
		return VL_MOVIMENTACAO;
	}

	public void setVL_MOVIMENTACAO(float VL_MOVIMENTACAO) {
		this.VL_MOVIMENTACAO = VL_MOVIMENTACAO;
	}

	public String getT_SOF_CONTA_ID_CONTA() {
		return T_SOF_CONTA_ID_CONTA;
	}

	public void setT_SOF_CONTA_ID_CONTA(String T_SOF_CONTA_ID_CONTA) {
		this.T_SOF_CONTA_ID_CONTA = T_SOF_CONTA_ID_CONTA;
	}

	public String getT_SOF_CATEGORIA_ID_CATEG() {
		return T_SOF_CATEGORIA_ID_CATEG;
	}

	public void setT_SOF_CATEGORIA_ID_CATEGORIA(String T_SOF_CATEGORIA_ID_CATEG) {
		this.T_SOF_CATEGORIA_ID_CATEG = T_SOF_CATEGORIA_ID_CATEG;
	}
    
  }