package edu.unoesc.cf.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.unoesc.cf.models.Acao;


@Service(value="AcaoDAO")
public class AcaoDAOImpl implements AcaoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public Acao getAcaoById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Acao p = (Acao) session.get(Acao.class, new Integer(id));
		
		//System.out.println("nome: " + p.getNome());
		
		return p;
	}

	@Override
	@Transactional
	public List<Acao> getAcoes() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from Acao").list();
	}

	@Override
	@Transactional
	public boolean deleteAcao(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Acao p = (Acao) session.load(Acao.class, new Integer(id));
		if (p!=null) {
			session.delete(p);
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public boolean insertAcao(Acao c) {
		
		this.sessionFactory.getCurrentSession().save(c);
		
		return false;
	}

	@Override
	@Transactional
	public boolean updateAcao(Acao c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		return true;
	}

}
