package edu.unoesc.cf.dao;

import java.util.List;

import edu.unoesc.cf.models.Conta;


public interface ContaDAO {

	Conta getContaById (int id);
	List<Conta> getContas();
	boolean deleteConta(int id);
	boolean insertConta(Conta c);
	boolean updateConta(Conta c);
	
}
