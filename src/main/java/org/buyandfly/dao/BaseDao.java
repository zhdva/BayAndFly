package org.buyandfly.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseDao<T> implements IBaseDao<T> {

    protected SessionFactory sessionFactory;
    private final Class<T> type;

    @Autowired
    public void setSessionFactory(final SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    BaseDao(final Class<T> type) {
        this.type = type;
    }

    @Override
    public T getById(final long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(type, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> getAll() {
        Session session = sessionFactory.getCurrentSession();
        String query = "from " + type.getName();
        return session.createQuery(query).list();
    }

    @Override
    public void add(final T t) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(t);
    }

    @Override
    public void edit(final T t) {
        Session session = sessionFactory.getCurrentSession();
        session.update(t);
    }

    @Override
    public void delete(final T t) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(t);
    }

}
