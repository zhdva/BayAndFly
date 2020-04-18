package org.buyandfly.dao;

import org.buyandfly.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao implements IDao<User> {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User getById(final int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User").list();
    }

    @Override
    public void add(final User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void edit(final User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public void delete(final User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }

}