package edu.unoesc.cf.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.unoesc.cf.models.Conta;


@Service(value="ContaDAO")
public class ContaDAOImpl implements ContaDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public Conta getContaById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Conta p = (Conta) session.get(Conta.class, id);
		
		//System.out.println("nome: " + p.getNome());
		
		return p;
	}

	@Override
	@Transactional
	public List<Conta> getContas() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from Conta").list();
	}

	@Override
	@Transactional
	public boolean deleteConta(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Conta p = (Conta) session.load(Conta.class, id);
		if (p!=null) {
			session.delete(p);
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public boolean insertConta(Conta c) {
		Session s = this.sessionFactory.getCurrentSession();
		s.save(c);
		
		return false;
	}

	@Override
	@Transactional
	public boolean updateConta(Conta c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		return true;
	}

}
