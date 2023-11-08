package edu.unoesc.cf.controllers;

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
import edu.unoesc.cf.dao.InvestimentoDAO;
import edu.unoesc.cf.models.Investimento;

@ManagedBean(name="investimentoMB")
@RequestScoped
public class InvestimentoController {
	
	private Investimento investimento= new Investimento();
	private List<Investimento> listInvestimentos;
	
	
	@ManagedProperty(value="#{InvestimentoDAO}")
	private InvestimentoDAO investimentoDAO;

	public void save() {
		if (investimento.getId() == 0) {
			this.investimentoDAO.insertInvestimento(investimento);
		}else {
			this.investimentoDAO.updateInvestimento(investimento);
		}
		
		this.investimento = new Investimento();
	}
	
	public void load(int id) {
		this.investimento = this.investimentoDAO.getInvestimentoById(id);
	}
	

	public Investimento getInvestimento() {
		return investimento;
	}


	public void setInvestimento(Investimento investimento) {
		this.investimento = investimento;
	}


	public List<Investimento> getListInvestimentos() {
		
		return this.investimentoDAO.getInvestimentos();
	}


	public void setListInvestimentos(List<Investimento> listInvestimentos) {
		this.listInvestimentos = listInvestimentos;
	}


	public InvestimentoDAO getInvestimentoDAO() {
		return investimentoDAO;
	}


	public void setInvestimentoDAO(InvestimentoDAO investimentoDAO) {
		this.investimentoDAO = investimentoDAO;
	}
	
}
