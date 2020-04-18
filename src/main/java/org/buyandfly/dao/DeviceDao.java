package org.buyandfly.dao;

import org.buyandfly.model.Device;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DeviceDao implements IDao<Device> {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Device getById(final int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Device.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Device> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Device").list();
    }

    @Override
    public void add(final Device device) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(device);
    }

    @Override
    public void edit(final Device device) {
        Session session = sessionFactory.getCurrentSession();
        session.update(device);
    }

    @Override
    public void delete(final Device device) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(device);
    }

}