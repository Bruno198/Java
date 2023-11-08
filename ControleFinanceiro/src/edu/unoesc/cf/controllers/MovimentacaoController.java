package edu.unoesc.cf.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.unoesc.cf.dao.*;
import edu.unoesc.cf.models.Conta;
import edu.unoesc.cf.models.Investimento;
import edu.unoesc.cf.models.Movimentacao;
import net.bytebuddy.asm.Advice.This;

@ManagedBean(name="movimentacaoMB")//MovimentacaoDAO
@RequestScoped
public class MovimentacaoController implements Serializable{// é para serializar uma claase
	private Movimentacao mov = new Movimentacao();
	private List<Movimentacao> listMovimentacao = null;
	
	@ManagedProperty(value="#{MovimentacaoDAO}")
	private MovimentacaoDAO movimentacaoDAO;
	
//	@Column(name = "isdeposito")
//	private boolean isDepsito = false;


	public void save() {

		if (this.mov.getId() == 0) {
			this.movimentacaoDAO.insertMovimentacao(mov);
		} else {
			this.movimentacaoDAO.updateMovimentacao(mov);
		}
		this.listMovimentacao = null;
		
		this.mov = new Movimentacao();

	}
	
	public Movimentacao getMov() {
		return mov;
	}

	public void setMov(Movimentacao mov) {
		this.mov = mov;
	}

	public List<Movimentacao> getListMovimentacao() {
		return listMovimentacao;
	}

	public void setListMovimentacao(List<Movimentacao> listMovimentacao) {
		this.listMovimentacao = listMovimentacao;
	}

	public void load(int id) {
		this.mov = this.movimentacaoDAO.getMovimentacaoById(id);
	}
	
	public Movimentacao getMovimentacao() {
		return mov;
	}

	public void setMovimentacao(Movimentacao mov) {
		this.mov = mov;
	}
	
	public List<Movimentacao> getlistMovimentacao() {
		if ( this.listMovimentacao == null)
			this.listMovimentacao = this.movimentacaoDAO.getMovimentacao();
		
		return this.listMovimentacao;
	}
	
	public void setlistMovimentacao(List<Movimentacao> listMovimentacao) {
		this.listMovimentacao = listMovimentacao;
	}
	
	public MovimentacaoDAO getMovimentacaoDAO() {
		return movimentacaoDAO;
	}
	
	public void setMovimentacaoDAO(MovimentacaoDAO MovimentacaoDAO) {
		this.movimentacaoDAO = MovimentacaoDAO;
	}
}
