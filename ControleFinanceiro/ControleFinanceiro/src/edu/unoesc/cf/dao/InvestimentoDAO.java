package edu.unoesc.cf.dao;

import java.util.List;

import edu.unoesc.cf.models.Investimento;


public interface InvestimentoDAO {

	Investimento getInvestimentoById (int id);
	List<Investimento> getInvestimentos();
	boolean deleteInvestimento(int id);
	boolean insertInvestimento(Investimento c);
	boolean updateInvestimento(Investimento c);
	
}
