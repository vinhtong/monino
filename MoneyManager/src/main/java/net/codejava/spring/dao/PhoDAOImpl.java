package net.codejava.spring.dao;

import java.sql.Date;
import java.util.List;

import net.codejava.spring.model.view.PhoView;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PhoDAOImpl implements PhoDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public PhoDAOImpl() {
		
	}
	
	public PhoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<PhoView> list() {
		@SuppressWarnings("unchecked")
		List<PhoView> listUser = (List<PhoView>) sessionFactory.getCurrentSession()
				.createCriteria(PhoView.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUser;
	}

	@Override
	@Transactional
	public void saveOrUpdate(PhoView user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	@Transactional
	public void delete(int id) {
		PhoView userToDelete = new PhoView();
		userToDelete.setPhoId(id);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}

	@Override
	@Transactional
	public PhoView get(int id) {
		String hql = "from PhoDTO where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<PhoView> listUser = (List<PhoView>) query.list();
		
		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		
		return null;
	}
	
	@Override
	@Transactional
	public PhoView getPhoByLicenseAndDate(int id, Date date) {
		String hql = "from PhoDTO where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<PhoView> listUser = (List<PhoView>) query.list();
		
		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		
		return null;
	}
}