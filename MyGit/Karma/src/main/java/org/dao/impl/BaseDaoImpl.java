package org.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.dao.BaseDao;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class BaseDaoImpl<T> implements BaseDao<T> {

	@Resource
	private SessionFactory sf;

	@Override
	public List<T> select(String sql, Object t) {
		Session session = sf.getCurrentSession();
		SQLQuery createSQLQuery = session.createSQLQuery(sql);
		createSQLQuery.addEntity(t.getClass());
		List list = createSQLQuery.list();
		return list;
	}

	@Override
	public void insert(T t) {
		Session session = sf.getCurrentSession();
        session.save(t);
	}

	@Override
	public void update(T t) {
		Session session = sf.getCurrentSession();
        session.saveOrUpdate(t);
	}

	@Override
	public void delete(T t) {
		Session session = sf.getCurrentSession();
        session.delete(t);
	}

}
