package edu.unoesc.cf.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.unoesc.cf.models.Conta;
import edu.unoesc.cf.models.Movimentacao;

//@Controller
public class MovimentacaoController {

	/*
	 * @RequestMapping(value = "/movimentacoes", method = RequestMethod.GET) public
	 * String contasList(Model m, HttpSession session) {
	 * 
	 * ArrayList<Conta> contas;
	 * 
	 * if (session.getAttribute("listContas") != null ){ contas = (ArrayList<Conta>)
	 * session.getAttribute("listContas");
	 * 
	 * }else { contas = new ArrayList<>(); session.setAttribute("listContas",
	 * contas); }
	 * 
	 * m.addAttribute("listContas", contas); m.addAttribute("movimentacao", new
	 * Movimentacao());
	 * 
	 * return "movimentacois"; }
	 * 
	 * @RequestMapping(value="/movimentacaoSave",method = RequestMethod.POST) public
	 * String save(@ModelAttribute("movimentacao") Movimentacao mov, HttpSession
	 * session){ ArrayList<Movimentacao> contas; if
	 * (session.getAttribute("listContas") != null ){ contas =
	 * (ArrayList<Movimentacao>) session.getAttribute("listMovimentacao");
	 * 
	 * }else { contas = new ArrayList<>(); session.setAttribute("listMovimentacao",
	 * contas); }
	 * 
	 * contas.add(mov); //mov.setId(contas.size());
	 * 
	 * return "redirect:/contas"; }
	 */
	

}
