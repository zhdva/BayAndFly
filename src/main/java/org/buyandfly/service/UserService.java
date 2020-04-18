package org.buyandfly.service;

import org.buyandfly.dao.UserDao;
import org.buyandfly.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class UserService implements IService<User> {

    private UserDao userDao;

    @Autowired
    public void setUserDAO(final UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public User getById(final int id) {
        return userDao.getById(id);
    }

    @Override
    @Transactional
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    @Transactional
    public void add(final User user) {
        userDao.add(user);
    }

    @Override
    @Transactional
    public void edit(final User user) {
        userDao.edit(user);
    }

    @Override
    @Transactional
    public void delete(final User user) {
        userDao.delete(user);
    }
}
