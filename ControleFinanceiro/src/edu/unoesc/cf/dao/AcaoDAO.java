package edu.unoesc.cf.dao;

import java.util.List;

import edu.unoesc.cf.models.Acao;


public interface AcaoDAO {

	Acao getAcaoById (int id);
	List<Acao> getAcaos();//pode ser que o getacaos n teja certo
	boolean deleteAcao(int id);
	boolean insertAcao(Acao c);
	boolean updateAcao(Acao c);
	
}
