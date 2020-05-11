package org.buyandfly.service;

import org.buyandfly.dao.IUserDao;
import org.buyandfly.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService extends BaseService<User> implements IUserService {

    private IUserDao userDao;

    @Autowired
    public void setUserDAO(final IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public User getByLogin(final String login) {
        return userDao.getByLogin(login);
    }

}
