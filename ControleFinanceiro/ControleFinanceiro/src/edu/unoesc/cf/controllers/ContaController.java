package edu.unoesc.cf.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.unoesc.cf.dao.ContaDAO;
import edu.unoesc.cf.models.Conta;

@ManagedBean(name="contaMB")
@RequestScoped
public class ContaController implements Serializable{
	private Conta conta = new Conta();
	private List<Conta> listContas = null;

	@ManagedProperty(value="#{ContaDAO}")
	private ContaDAO contaDAO;

	public void save() {

		if (this.conta.getId() == 0) {
			this.contaDAO.insertConta(conta);
		} else {
			this.contaDAO.updateConta(conta);
		}
		this.listContas = null;
		
		this.conta = new Conta();

	}

	public void load(int id) {		
		conta =  contaDAO.getContaById(id);
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public List<Conta> getListContas() {
		if ( this.listContas == null)
			this.listContas = this.contaDAO.getContas();
		
		return this.listContas;
	}

	public void setListContas(List<Conta> listContas) {
		this.listContas = listContas;
	}

	public ContaDAO getContaDAO() {
		return contaDAO;
	}

	public void setContaDAO(ContaDAO contaDAO) {
		this.contaDAO = contaDAO;
	}

	
	
}
