package model;

import java.util.UUID;

public class Conta {

	private UUID ID_CONTA = UUID.randomUUID();

	private String NM_CONTA;

	private boolean ACTIVE;

	private float SALDO;

	private UUID T_SOF_CLIENTE_ID_CLIENTE;

	public Conta(UUID ID_CONTA, String NM_CONTA, boolean ACTIVE, float SALDO, UUID T_SOF_CLIENTE_ID_CLIENTE) {

		super();
		this.ID_CONTA = ID_CONTA;
		this.NM_CONTA = NM_CONTA;
		this.ACTIVE = ACTIVE;
		this.SALDO = SALDO;
		this.T_SOF_CLIENTE_ID_CLIENTE = T_SOF_CLIENTE_ID_CLIENTE;

	}
	
	public Conta(String NM_CONTA, UUID T_SOF_CLIENTE_ID_CLIENTE) {
		super();
		this.NM_CONTA = NM_CONTA;
		this.ACTIVE = true;
		this.SALDO = 0;
		this.T_SOF_CLIENTE_ID_CLIENTE = T_SOF_CLIENTE_ID_CLIENTE;

	}
	
	public Conta() {
		super();
	}

	public String getID_CONTA() {
		return ID_CONTA.toString();
	}

	public void setID_CONTA(UUID ID_CONTA) {
		this.ID_CONTA = ID_CONTA;
	}

	public String getNM_CONTA() {
		return NM_CONTA;
	}

	public void setNM_CONTA(String NM_CONTA) {
		this.NM_CONTA = NM_CONTA;
	}

	public boolean getACTIVE() {
		return ACTIVE;
	}

	public void setACTIVE(boolean ACTIVE) {
		this.ACTIVE = ACTIVE;
	}

	public float getSALDO() {
		return SALDO;
	}

	public void setSALDO(float val, String type) {
		if (type.equals("Receita")) {
			this.SALDO += val;
		} else if (type.equals("Despesa")) {
			this.SALDO -= val;
		}
	}

	public String getT_SOF_CLIENTE_ID_CLIENTE() {
		return T_SOF_CLIENTE_ID_CLIENTE.toString();
	}

	public void setT_SOF_CLIENTE_ID_CLIENTE(UUID T_SOF_CLIENTE_ID_CLIENTE) {
		this.T_SOF_CLIENTE_ID_CLIENTE = T_SOF_CLIENTE_ID_CLIENTE;
	}

}