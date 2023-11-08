package edu.unoesc.cf.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.unoesc.cf.models.Investimento;


@Service(value="InvestimentoDAO")
public class InvestimentoDAOImpl implements InvestimentoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public Investimento getInvestimentoById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Investimento p = (Investimento) session.get(Investimento.class, new Integer(id));
		
		//System.out.println("nome: " + p.getNome());
		
		return p;
	}

	@Override
	@Transactional
	public List<Investimento> getInvestimentos() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from Investimento").list();
	}

	@Override
	@Transactional
	public boolean deleteInvestimento(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Investimento p = (Investimento) session.load(Investimento.class, new Integer(id));
		if (p!=null) {
			session.delete(p);
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public boolean insertInvestimento(Investimento c) {
		
		this.sessionFactory.getCurrentSession().save(c);
		
		return false;
	}

	@Override
	@Transactional
	public boolean updateInvestimento(Investimento c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		return true;
	}

}
