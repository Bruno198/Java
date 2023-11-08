package edu.unoesc.cf.dao;

import java.util.List;

import edu.unoesc.cf.models.Acao;


public interface AcaoDAO {

	Acao getAcaoById (int id);
	List<Acao> getAcoes();
	boolean deleteAcao(int id);
	boolean insertAcao(Acao c);
	boolean updateAcao(Acao c);
	
}
