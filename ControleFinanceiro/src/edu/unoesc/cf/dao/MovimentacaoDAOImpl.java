package edu.unoesc.cf.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.unoesc.cf.models.Investimento;
import edu.unoesc.cf.models.Movimentacao;


@Service(value="MovimentacaoDAO")
public class MovimentacaoDAOImpl implements MovimentacaoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public Movimentacao getMovimentacaoById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Movimentacao m = (Movimentacao) session.get(Movimentacao.class, new Integer(id));
		
		//System.out.println("nome: " + p.getNome());
		
		return m;
	}

	@Override
	@Transactional
	public List<Movimentacao> getMovimentacao() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from Movimentacao").list();
	}

	@Override
	@Transactional
	public boolean deleteMovimentacao(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Movimentacao p = (Movimentacao) session.load(Movimentacao.class, new Integer(id));
		if (p!=null) {
			session.delete(p);
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public boolean insertMovimentacao(Movimentacao c) {
		
		Session s = this.sessionFactory.getCurrentSession();
		s.save(c);
		return false;
	}

	@Override
	@Transactional
	public boolean updateMovimentacao(Movimentacao c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		return true;
	}

}
