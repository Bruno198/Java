package edu.unoesc.cf.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.unoesc.cf.dao.AcaoDAO;
import edu.unoesc.cf.dao.ContaDAO;
import edu.unoesc.cf.models.Acao;

//@Controller
public class AcaoController {

	/*
	 * @Autowired AcaoDAO acaoDAO;
	 * 
	 * @Autowired ContaDAO contaDAO;
	 * 
	 * @RequestMapping(value = "/acoes", method = RequestMethod.GET) public String
	 * acoesList(Model m) {
	 * 
	 * ArrayList<Acao> acoes = new ArrayList(acaoDAO.getAcoes());
	 * 
	 * m.addAttribute("listAcoes", acoes); m.addAttribute("listContas", new
	 * ArrayList(contaDAO.getContas())); m.addAttribute("acao", new Acao());
	 * 
	 * return "acao"; }
	 * 
	 * @RequestMapping(value = "/acaoSave", method = RequestMethod.POST) public
	 * String save(@ModelAttribute("acao") Acao acao, HttpSession session) {
	 * 
	 * 
	 * 
	 * 
	 * if (acao.getId() == 0) { acaoDAO.insertAcao(acao); } else {
	 * acaoDAO.updateAcao(acao); }
	 * 
	 * 
	 * return "redirect:/acoes"; }
	 * 
	 * @RequestMapping(value = "/acao/{id}") public String acao(@PathVariable int
	 * id, Model model, HttpSession session) { // session.getAttribute("acoesList");
	 * 
	 * model.addAttribute("listAcoes", new ArrayList(acaoDAO.getAcoes()));
	 * 
	 * model.addAttribute("acao", acaoDAO.getAcaoById(id));
	 * 
	 * return "acao";
	 * 
	 * }
	 */

}
