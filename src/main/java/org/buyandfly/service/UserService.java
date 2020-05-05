package org.buyandfly.service;

import org.buyandfly.dao.IUserDao;
import org.buyandfly.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService implements IUserService {

    private IUserDao userDao;

    @Autowired
    public void setUserDAO(final IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public User getById(final long id) {
        return userDao.getById(id);
    }

    @Override
    public User getByLogin(final String login) {
        return userDao.getByLogin(login);
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
