package org.buyandfly.dao;

import org.buyandfly.model.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDao implements IDao<Order> {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Order getById(final int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Order.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Order> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Order").list();
    }

    @Override
    public void add(final Order order) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(order);
    }

    @Override
    public void edit(final Order order) {
        Session session = sessionFactory.getCurrentSession();
        session.update(order);
    }

    @Override
    public void delete(final Order order) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(order);
    }

}