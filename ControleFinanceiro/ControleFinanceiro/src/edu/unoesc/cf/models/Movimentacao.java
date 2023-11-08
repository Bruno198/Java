package edu.unoesc.cf.models;

import java.util.Date;

public class Movimentacao {
	private Date data;
	private String descricao;
	private float valor;
	private boolean isDepsito;
	
	//para facilitar a vida por enquanto
	private int conta;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public boolean isDepsito() {
		return isDepsito;
	}

	public void setDepsito(boolean isDepsito) {
		this.isDepsito = isDepsito;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}
}
