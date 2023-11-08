package edu.unoesc.cf.models;

import java.util.HashSet;
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
import javax.persistence.Table;



@Entity
@Table(name = "acoes")
public class Acao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "cotacao")
	private float cotacao;
	
	@Column(name = "tag")
	private String tag;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "acoes_contas", 
    joinColumns = { @JoinColumn(name = "id_acao") }, 
    inverseJoinColumns = { @JoinColumn(name = "id_conta") })
	private Set<Conta> contas = new HashSet<Conta>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getCotacao() {
		return cotacao;
	}

	public void setCotacao(float cotacao) {
		this.cotacao = cotacao;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Acao other = (Acao) obj;
		if (id != other.id)
			return false;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  tag;
	}

	public Set<Conta> getContas() {
		return contas;
	}

	public void setContas(Set<Conta> contas) {
		this.contas = contas;
	}	
	
	

}
