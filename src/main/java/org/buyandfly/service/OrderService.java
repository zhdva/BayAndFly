package org.buyandfly.service;

import org.buyandfly.dao.OrderDao;
import org.buyandfly.model.Order;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class OrderService implements IService<Order> {

    private OrderDao orderDao;

    @Autowired
    public void setDeviceDAO(final OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    @Transactional
    public Order getById(int id) {
        return orderDao.getById(id);
    }

    @Override
    @Transactional
    public List<Order> getAll() {
        return orderDao.getAll();
    }

    @Override
    @Transactional
    public void add(final Order order) {
        orderDao.add(order);
    }

    @Override
    @Transactional
    public void edit(final Order order) {
        orderDao.edit(order);
    }

    @Override
    @Transactional
    public void delete(final Order order) {
        orderDao.delete(order);
    }

}
