package edu.unoesc.cf.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "movimentacao")
public class Movimentacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "data")
	private Date data;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "valor")
	private float valor;
	
	@Column(name = "isdeposito")
	private boolean isDepsito ;//= true;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "movimentacao_contas",
	joinColumns = { @JoinColumn(name = "id_movimentacaos") }, 
	inverseJoinColumns = { @JoinColumn(name = "id_Conta") })
	private Set<Conta> conta = new HashSet<Conta>(); //  TALVEZ COLOCAR ID CONTA
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Set<Conta> getConta() {
		return conta;
	}

	public void setContas(Set<Conta> conta) {
		this.conta = conta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conta, data, descricao, id, isDepsito, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movimentacao other = (Movimentacao) obj;
		return Objects.equals(conta, other.conta) && Objects.equals(data, other.data)
				&& Objects.equals(descricao, other.descricao) && id == other.id && isDepsito == other.isDepsito
				&& Float.floatToIntBits(valor) == Float.floatToIntBits(other.valor);
	}
	
	

		
}
