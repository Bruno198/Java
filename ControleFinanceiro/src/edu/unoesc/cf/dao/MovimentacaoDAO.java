package edu.unoesc.cf.dao;

import java.util.List;

import edu.unoesc.cf.models.Movimentacao;


public interface MovimentacaoDAO {

	Movimentacao   getMovimentacaoById (int id);
	List<Movimentacao> getMovimentacao();
	boolean deleteMovimentacao(int id);
	boolean insertMovimentacao(Movimentacao c);
	boolean updateMovimentacao(Movimentacao c);
	
}
