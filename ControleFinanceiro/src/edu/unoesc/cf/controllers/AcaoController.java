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
import edu.unoesc.cf.models.Acao;
import edu.unoesc.cf.models.Conta;
import edu.unoesc.cf.models.Investimento;
import edu.unoesc.cf.models.Movimentacao;
import net.bytebuddy.asm.Advice.This;

@ManagedBean(name="acaoMB")//MovimentacaoDAO
@RequestScoped
public class AcaoController implements Serializable{// é para serializar uma claase
	private Acao acaos = new Acao();
	private List<Acao> listacaos = null;
	
	@ManagedProperty(value="#{AcaoDAO}")
	private AcaoDAO acaoDAO;
	
//	@Column(name = "isdeposito")
//	private boolean isDepsito = false;


	public void save() {

		if (this.acaos.getId() == 0) {//&& (this.acaos.getId() == null)    {
			this.acaoDAO.insertAcao(acaos);
		} else {
			this.acaoDAO.updateAcao(acaos);
		}
		this.listacaos = null;
		
		this.acaos = new Acao();

	}

	public void load(int id) {
		this.acaos = this.acaoDAO.getAcaoById(id);
	}

	public Acao getAcaos() {
		return acaos;
	}

	public void setAcaos(Acao acaos) {
		this.acaos = acaos;
	}

	public List<Acao> getListacaos() {
		if ( this.listacaos == null)
			this.listacaos = this.acaoDAO.getAcaos();
		
		return this.listacaos;
	}

	public void setListacaos(List<Acao> listacaos) {
		this.listacaos = listacaos;
	}

	public AcaoDAO getAcaoDAO() {
		return acaoDAO;
	}

	public void setAcaoDAO(AcaoDAO acaoDAO) {
		this.acaoDAO = acaoDAO;
	}

	

	}
